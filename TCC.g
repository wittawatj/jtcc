/**
 * A TCC (Thai Character Cluster) grammar for ANTLR (http://www.antlr.org).
 * This a Java port of TCC originally written in C.
 * 
 * The grammar comes from grammorph.BCon TCC version 1.7.1 developed by by Mr.Jakkrit TeCho.
 *
 * Note that ANTLR can also generates code for lexer, and parser 
 * in other languages as well using this same file (not only Java).
 *
 * @author Wittawat Jitkrittum
 * Dec 13, 2009
 */
 
grammar TCC;



/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
options {
 output = AST;  
 //backtrack=true;
 //k=10;
} 

@lexer::header{
package com.wittawat.tcc;
}

@header{
package com.wittawat.tcc;
import java.util.Vector;
}
@members{ //Members of Parser
	private String delimiter = "|";
	private int curIndex =0;
	private Vector<Integer> endIndexes = new Vector<Integer>();
	private StringBuilder delimitedOutput = new StringBuilder();
	public Vector<Integer> getEndIndexes(){
		return endIndexes;
	}
	public String getDelimiter(){
		return delimiter;
	}
	public void setDelimiter(String delimiter){
		this.delimiter = delimiter;
	}
    	
    	public String getDelimitedOutput(){
 	
     		return delimitedOutput.toString();
    	}
    	
    	private void addNextIndex(String word){
    		if(word !=null && !word.equals("")){
	    		int wordLength = word.length();
	    		curIndex += wordLength;
	    		endIndexes.add(curIndex);
	    		
	    		delimitedOutput.append(word).append(delimiter);
    		}
    	}
    	private void addNewLine(String newLine){
    		if(newLine != null){
    			curIndex += newLine.length();
  	  		delimitedOutput.append(newLine);
    		}
	}

}

stream : 
	tcclist
	(NEWLINES {
		addNewLine($NEWLINES.text);
	} )?
	EOF!
; // stream is the start symbol here. 
 
 tcclist: ( 
	newlines  tcc { 
		addNewLine($newlines.text); 
		addNextIndex( $tcc.text); 
	} )* 	;
 
tcc : 
   	 EE con MAITAIKHU con  
 	 | EE con con TON? SARA_AA A	
 	 | EE con con SARA_II TON? YOYAK A
	 | (EE con con SARA_II TON? YOYAK tccfirst) => EE con con SARA_II TON? YOYAK
 	 | EE con con O_ANG A	
 	 | EE con con MAITAIKHU con
	 | EE con SARA_I con THANTHAKHAT con			 
 	 | EE con SARA_I TON? con
	 | EE con SARA_II  TON? YOYAK A
	 | EE con SARA_II O_ANG A?
	 | EE con SARA_UEE TON O_ANG A?
	 | EE con SARA_UEE O_ANG A?
	 | (EE con vfront TON? YOYAK tccfirst) => EE con vfront TON? YOYAK
	| EE con TON? SARA_AA? A?
	| con MAI_HAN_AKAT TON? WA
	 | con vback TON? con (SARA_U | SARA_I | A)?
	 | con (SARA_I | SARA_U)? THANTHAKHAT
 	| con vneedl TON?
 	| con MAITAIKHU 
	| con TON? vO1?
	|  AE con MAITAIKHU con
	|  AE con con THANTHAKHAT 
	|  AE con TON? A
	|  AE con con MAITAIKHU con	
	|  AE con con con THANTHAKHAT	
 |  OO con TON? A
 |  vO2 con TON?
 |  dont_know
; // end TCC head

vback : MAI_HAN_AKAT | SARA_UEE ;
//| SARA_UE ;

tccfirst	: vO2 | con | WA | TCCIGNORE | DONT_KNOW | EOF;

vfront :  SARA_I | SARA_II | SARA_U | SARA_UU;

vO1 : A | SARA_AA | SARA_AM ;

vneedl	:	vfront| vO1 | SARA_UEE | SARA_UE ;

needl	:	vneedl | THANTHAKHAT;

vO2 : EE | AE | OO | MAIMUAN | MAIMALAI ;

con 	:	CON | YOYAK | O_ANG ;

newlines	:	NEWLINES?;

dont_know
	:	 WA | EE |AE| OO | MAIMUAN | MAIMALAI | YOYAK
	| MAITAIKHU | THANTHAKHAT | A | O_ANG | SARA_UE | SARA_UEE 
	| SARA_I | SARA_II | SARA_AA | SARA_AM | MAI_HAN_AKAT | SARA_U 
	| SARA_UU | TON | TCCIGNORE | CON | DONT_KNOW ;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/


// Rules follow the CONvention of ANTLR. 
// All capitals for lexer rules.
// All small cases for parser rules.

/*
KO_KAI	:	'\u0E01';
KHO_KHAI:	'\u0E02';
KHO_KHUAT
	:	'\u0E03';
KHO_KHWAI
	:	'\u0E04';
KHO_KHON:	'\u0E05';
KHO_RAKHANG
	:	'\u0E06';
*/

WA : '\u0E27\u0E30'; 
EE : '\u0E40'; 
AE : '\u0E41'; 
OO : '\u0E42'; 
MAIMUAN :	'\u0E43';
MAIMALAI :'\u0E44';	
YOYAK : '\u0E22'; 
MAITAIKHU : '\u0E47'; 
THANTHAKHAT : '\u0E4C' ;
A : '\u0E30' ; 
O_ANG : '\u0E2D' ; 
SARA_UE : '\u0E36' ;
SARA_UEE : '\u0E37' ;
SARA_I : '\u0E34' ;   
SARA_II : '\u0E35' ; 
SARA_AA : '\u0E32' ;  
SARA_AM : '\u0E33';
MAI_HAN_AKAT : '\u0E31'; 
SARA_U : '\u0E38';
SARA_UU : '\u0E39';
CON : '\u0E01'..'\u0E2E';
TON : '\u0E48' | '\u0E49' | '\u0E4A' | '\u0E4B' ;

TCCIGNORE
	:	'<TCCIGNORE>' (options{greedy=false;} : . )* '</TCCIGNORE>';	// Text within <TCCIGNORE>....</TCCIGNORE> will not be tokenized.

//HIDDEN	:	('\r'|'\n')+ { $channel = HIDDEN; } ;
NEWLINES		:	('\r'|'\n')+ ;
	
DONT_KNOW 
	:	( WS | ('0'..'9')+ | ('a'..'z'|'A'..'Z')+  | ( '\u0E50'..'\u0E59')+ | .) ; //ALso detect consecutive Thai numbers.


fragment WS
	:	( ' ' | '\t' | '\n' | '\r' )+;

