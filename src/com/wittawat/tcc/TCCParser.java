// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/nook/NetBeansProjects/JTCC/TCC.g 2010-03-06 18:43:22

package com.wittawat.tcc;
import java.util.Vector;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

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
public class TCCParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINES", "EE", "MAITAIKHU", "TON", "SARA_AA", "A", "SARA_II", "YOYAK", "O_ANG", "SARA_I", "THANTHAKHAT", "SARA_UEE", "MAI_HAN_AKAT", "WA", "SARA_U", "AE", "OO", "TCCIGNORE", "DONT_KNOW", "SARA_UU", "SARA_AM", "SARA_UE", "MAIMUAN", "MAIMALAI", "CON", "WS"
    };
    public static final int SARA_II=10;
    public static final int O_ANG=12;
    public static final int SARA_UE=25;
    public static final int YOYAK=11;
    public static final int A=9;
    public static final int MAIMUAN=26;
    public static final int SARA_I=13;
    public static final int DONT_KNOW=22;
    public static final int SARA_AA=8;
    public static final int MAI_HAN_AKAT=16;
    public static final int THANTHAKHAT=14;
    public static final int EOF=-1;
    public static final int MAIMALAI=27;
    public static final int SARA_AM=24;
    public static final int TCCIGNORE=21;
    public static final int SARA_U=18;
    public static final int WS=29;
    public static final int NEWLINES=4;
    public static final int SARA_UEE=15;
    public static final int MAITAIKHU=6;
    public static final int OO=20;
    public static final int CON=28;
    public static final int WA=17;
    public static final int AE=19;
    public static final int SARA_UU=23;
    public static final int EE=5;
    public static final int TON=7;

    // delegates
    // delegators


        public TCCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TCCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TCCParser.tokenNames; }
    public String getGrammarFileName() { return "/home/nook/NetBeansProjects/JTCC/TCC.g"; }

     //Members of Parser
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



    public static class stream_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stream"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:73:1: stream : tcclist ( NEWLINES )? EOF ;
    public final TCCParser.stream_return stream() throws RecognitionException {
        TCCParser.stream_return retval = new TCCParser.stream_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINES2=null;
        Token EOF3=null;
        TCCParser.tcclist_return tcclist1 = null;


        Object NEWLINES2_tree=null;
        Object EOF3_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:73:8: ( tcclist ( NEWLINES )? EOF )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:74:2: tcclist ( NEWLINES )? EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_tcclist_in_stream57);
            tcclist1=tcclist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, tcclist1.getTree());
            // /home/nook/NetBeansProjects/JTCC/TCC.g:75:2: ( NEWLINES )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NEWLINES) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:75:3: NEWLINES
                    {
                    NEWLINES2=(Token)match(input,NEWLINES,FOLLOW_NEWLINES_in_stream61); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINES2_tree = (Object)adaptor.create(NEWLINES2);
                    adaptor.addChild(root_0, NEWLINES2_tree);
                    }
                    if ( state.backtracking==0 ) {

                      		addNewLine((NEWLINES2!=null?NEWLINES2.getText():null));
                      	
                    }

                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_stream69); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stream"

    public static class tcclist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tcclist"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:81:2: tcclist : ( newlines tcc )* ;
    public final TCCParser.tcclist_return tcclist() throws RecognitionException {
        TCCParser.tcclist_return retval = new TCCParser.tcclist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TCCParser.newlines_return newlines4 = null;

        TCCParser.tcc_return tcc5 = null;



        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:81:9: ( ( newlines tcc )* )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:81:11: ( newlines tcc )*
            {
            root_0 = (Object)adaptor.nil();

            // /home/nook/NetBeansProjects/JTCC/TCC.g:81:11: ( newlines tcc )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINES) ) {
                    int LA2_1 = input.LA(2);

                    if ( ((LA2_1>=EE && LA2_1<=CON)) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>=EE && LA2_0<=CON)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/nook/NetBeansProjects/JTCC/TCC.g:82:2: newlines tcc
            	    {
            	    pushFollow(FOLLOW_newlines_in_tcclist85);
            	    newlines4=newlines();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, newlines4.getTree());
            	    pushFollow(FOLLOW_tcc_in_tcclist88);
            	    tcc5=tcc();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tcc5.getTree());
            	    if ( state.backtracking==0 ) {
            	       
            	      		addNewLine((newlines4!=null?input.toString(newlines4.start,newlines4.stop):null)); 
            	      		addNextIndex( (tcc5!=null?input.toString(tcc5.start,tcc5.stop):null)); 
            	      	
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tcclist"

    public static class tcc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tcc"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:87:1: tcc : ( EE con MAITAIKHU con | EE con con ( TON )? SARA_AA A | EE con con SARA_II ( TON )? YOYAK A | ( EE con con SARA_II ( TON )? YOYAK tccfirst )=> EE con con SARA_II ( TON )? YOYAK | EE con con O_ANG A | EE con con MAITAIKHU con | EE con SARA_I con THANTHAKHAT con | EE con SARA_I ( TON )? con | EE con SARA_II ( TON )? YOYAK A | EE con SARA_II O_ANG ( A )? | EE con SARA_UEE TON O_ANG ( A )? | EE con SARA_UEE O_ANG ( A )? | ( EE con vfront ( TON )? YOYAK tccfirst )=> EE con vfront ( TON )? YOYAK | EE con ( TON )? ( SARA_AA )? ( A )? | con MAI_HAN_AKAT ( TON )? WA | con vback ( TON )? con ( SARA_U | SARA_I | A )? | con ( SARA_I | SARA_U )? THANTHAKHAT | con vneedl ( TON )? | con MAITAIKHU | con ( TON )? ( vO1 )? | AE con MAITAIKHU con | AE con con THANTHAKHAT | AE con ( TON )? A | AE con con MAITAIKHU con | AE con con con THANTHAKHAT | OO con ( TON )? A | vO2 con ( TON )? | dont_know );
    public final TCCParser.tcc_return tcc() throws RecognitionException {
        TCCParser.tcc_return retval = new TCCParser.tcc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EE6=null;
        Token MAITAIKHU8=null;
        Token EE10=null;
        Token TON13=null;
        Token SARA_AA14=null;
        Token A15=null;
        Token EE16=null;
        Token SARA_II19=null;
        Token TON20=null;
        Token YOYAK21=null;
        Token A22=null;
        Token EE23=null;
        Token SARA_II26=null;
        Token TON27=null;
        Token YOYAK28=null;
        Token EE29=null;
        Token O_ANG32=null;
        Token A33=null;
        Token EE34=null;
        Token MAITAIKHU37=null;
        Token EE39=null;
        Token SARA_I41=null;
        Token THANTHAKHAT43=null;
        Token EE45=null;
        Token SARA_I47=null;
        Token TON48=null;
        Token EE50=null;
        Token SARA_II52=null;
        Token TON53=null;
        Token YOYAK54=null;
        Token A55=null;
        Token EE56=null;
        Token SARA_II58=null;
        Token O_ANG59=null;
        Token A60=null;
        Token EE61=null;
        Token SARA_UEE63=null;
        Token TON64=null;
        Token O_ANG65=null;
        Token A66=null;
        Token EE67=null;
        Token SARA_UEE69=null;
        Token O_ANG70=null;
        Token A71=null;
        Token EE72=null;
        Token TON75=null;
        Token YOYAK76=null;
        Token EE77=null;
        Token TON79=null;
        Token SARA_AA80=null;
        Token A81=null;
        Token MAI_HAN_AKAT83=null;
        Token TON84=null;
        Token WA85=null;
        Token TON88=null;
        Token set90=null;
        Token set92=null;
        Token THANTHAKHAT93=null;
        Token TON96=null;
        Token MAITAIKHU98=null;
        Token TON100=null;
        Token AE102=null;
        Token MAITAIKHU104=null;
        Token AE106=null;
        Token THANTHAKHAT109=null;
        Token AE110=null;
        Token TON112=null;
        Token A113=null;
        Token AE114=null;
        Token MAITAIKHU117=null;
        Token AE119=null;
        Token THANTHAKHAT123=null;
        Token OO124=null;
        Token TON126=null;
        Token A127=null;
        Token TON130=null;
        TCCParser.con_return con7 = null;

        TCCParser.con_return con9 = null;

        TCCParser.con_return con11 = null;

        TCCParser.con_return con12 = null;

        TCCParser.con_return con17 = null;

        TCCParser.con_return con18 = null;

        TCCParser.con_return con24 = null;

        TCCParser.con_return con25 = null;

        TCCParser.con_return con30 = null;

        TCCParser.con_return con31 = null;

        TCCParser.con_return con35 = null;

        TCCParser.con_return con36 = null;

        TCCParser.con_return con38 = null;

        TCCParser.con_return con40 = null;

        TCCParser.con_return con42 = null;

        TCCParser.con_return con44 = null;

        TCCParser.con_return con46 = null;

        TCCParser.con_return con49 = null;

        TCCParser.con_return con51 = null;

        TCCParser.con_return con57 = null;

        TCCParser.con_return con62 = null;

        TCCParser.con_return con68 = null;

        TCCParser.con_return con73 = null;

        TCCParser.vfront_return vfront74 = null;

        TCCParser.con_return con78 = null;

        TCCParser.con_return con82 = null;

        TCCParser.con_return con86 = null;

        TCCParser.vback_return vback87 = null;

        TCCParser.con_return con89 = null;

        TCCParser.con_return con91 = null;

        TCCParser.con_return con94 = null;

        TCCParser.vneedl_return vneedl95 = null;

        TCCParser.con_return con97 = null;

        TCCParser.con_return con99 = null;

        TCCParser.vO1_return vO1101 = null;

        TCCParser.con_return con103 = null;

        TCCParser.con_return con105 = null;

        TCCParser.con_return con107 = null;

        TCCParser.con_return con108 = null;

        TCCParser.con_return con111 = null;

        TCCParser.con_return con115 = null;

        TCCParser.con_return con116 = null;

        TCCParser.con_return con118 = null;

        TCCParser.con_return con120 = null;

        TCCParser.con_return con121 = null;

        TCCParser.con_return con122 = null;

        TCCParser.con_return con125 = null;

        TCCParser.vO2_return vO2128 = null;

        TCCParser.con_return con129 = null;

        TCCParser.dont_know_return dont_know131 = null;


        Object EE6_tree=null;
        Object MAITAIKHU8_tree=null;
        Object EE10_tree=null;
        Object TON13_tree=null;
        Object SARA_AA14_tree=null;
        Object A15_tree=null;
        Object EE16_tree=null;
        Object SARA_II19_tree=null;
        Object TON20_tree=null;
        Object YOYAK21_tree=null;
        Object A22_tree=null;
        Object EE23_tree=null;
        Object SARA_II26_tree=null;
        Object TON27_tree=null;
        Object YOYAK28_tree=null;
        Object EE29_tree=null;
        Object O_ANG32_tree=null;
        Object A33_tree=null;
        Object EE34_tree=null;
        Object MAITAIKHU37_tree=null;
        Object EE39_tree=null;
        Object SARA_I41_tree=null;
        Object THANTHAKHAT43_tree=null;
        Object EE45_tree=null;
        Object SARA_I47_tree=null;
        Object TON48_tree=null;
        Object EE50_tree=null;
        Object SARA_II52_tree=null;
        Object TON53_tree=null;
        Object YOYAK54_tree=null;
        Object A55_tree=null;
        Object EE56_tree=null;
        Object SARA_II58_tree=null;
        Object O_ANG59_tree=null;
        Object A60_tree=null;
        Object EE61_tree=null;
        Object SARA_UEE63_tree=null;
        Object TON64_tree=null;
        Object O_ANG65_tree=null;
        Object A66_tree=null;
        Object EE67_tree=null;
        Object SARA_UEE69_tree=null;
        Object O_ANG70_tree=null;
        Object A71_tree=null;
        Object EE72_tree=null;
        Object TON75_tree=null;
        Object YOYAK76_tree=null;
        Object EE77_tree=null;
        Object TON79_tree=null;
        Object SARA_AA80_tree=null;
        Object A81_tree=null;
        Object MAI_HAN_AKAT83_tree=null;
        Object TON84_tree=null;
        Object WA85_tree=null;
        Object TON88_tree=null;
        Object set90_tree=null;
        Object set92_tree=null;
        Object THANTHAKHAT93_tree=null;
        Object TON96_tree=null;
        Object MAITAIKHU98_tree=null;
        Object TON100_tree=null;
        Object AE102_tree=null;
        Object MAITAIKHU104_tree=null;
        Object AE106_tree=null;
        Object THANTHAKHAT109_tree=null;
        Object AE110_tree=null;
        Object TON112_tree=null;
        Object A113_tree=null;
        Object AE114_tree=null;
        Object MAITAIKHU117_tree=null;
        Object AE119_tree=null;
        Object THANTHAKHAT123_tree=null;
        Object OO124_tree=null;
        Object TON126_tree=null;
        Object A127_tree=null;
        Object TON130_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:87:5: ( EE con MAITAIKHU con | EE con con ( TON )? SARA_AA A | EE con con SARA_II ( TON )? YOYAK A | ( EE con con SARA_II ( TON )? YOYAK tccfirst )=> EE con con SARA_II ( TON )? YOYAK | EE con con O_ANG A | EE con con MAITAIKHU con | EE con SARA_I con THANTHAKHAT con | EE con SARA_I ( TON )? con | EE con SARA_II ( TON )? YOYAK A | EE con SARA_II O_ANG ( A )? | EE con SARA_UEE TON O_ANG ( A )? | EE con SARA_UEE O_ANG ( A )? | ( EE con vfront ( TON )? YOYAK tccfirst )=> EE con vfront ( TON )? YOYAK | EE con ( TON )? ( SARA_AA )? ( A )? | con MAI_HAN_AKAT ( TON )? WA | con vback ( TON )? con ( SARA_U | SARA_I | A )? | con ( SARA_I | SARA_U )? THANTHAKHAT | con vneedl ( TON )? | con MAITAIKHU | con ( TON )? ( vO1 )? | AE con MAITAIKHU con | AE con con THANTHAKHAT | AE con ( TON )? A | AE con con MAITAIKHU con | AE con con con THANTHAKHAT | OO con ( TON )? A | vO2 con ( TON )? | dont_know )
            int alt25=28;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:88:6: EE con MAITAIKHU con
                    {
                    root_0 = (Object)adaptor.nil();

                    EE6=(Token)match(input,EE,FOLLOW_EE_in_tcc110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE6_tree = (Object)adaptor.create(EE6);
                    adaptor.addChild(root_0, EE6_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc112);
                    con7=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con7.getTree());
                    MAITAIKHU8=(Token)match(input,MAITAIKHU,FOLLOW_MAITAIKHU_in_tcc114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAITAIKHU8_tree = (Object)adaptor.create(MAITAIKHU8);
                    adaptor.addChild(root_0, MAITAIKHU8_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc116);
                    con9=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con9.getTree());

                    }
                    break;
                case 2 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:89:6: EE con con ( TON )? SARA_AA A
                    {
                    root_0 = (Object)adaptor.nil();

                    EE10=(Token)match(input,EE,FOLLOW_EE_in_tcc125); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE10_tree = (Object)adaptor.create(EE10);
                    adaptor.addChild(root_0, EE10_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc127);
                    con11=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con11.getTree());
                    pushFollow(FOLLOW_con_in_tcc129);
                    con12=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con12.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:89:17: ( TON )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==TON) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:89:17: TON
                            {
                            TON13=(Token)match(input,TON,FOLLOW_TON_in_tcc131); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON13_tree = (Object)adaptor.create(TON13);
                            adaptor.addChild(root_0, TON13_tree);
                            }

                            }
                            break;

                    }

                    SARA_AA14=(Token)match(input,SARA_AA,FOLLOW_SARA_AA_in_tcc134); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_AA14_tree = (Object)adaptor.create(SARA_AA14);
                    adaptor.addChild(root_0, SARA_AA14_tree);
                    }
                    A15=(Token)match(input,A,FOLLOW_A_in_tcc136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A15_tree = (Object)adaptor.create(A15);
                    adaptor.addChild(root_0, A15_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:90:6: EE con con SARA_II ( TON )? YOYAK A
                    {
                    root_0 = (Object)adaptor.nil();

                    EE16=(Token)match(input,EE,FOLLOW_EE_in_tcc144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE16_tree = (Object)adaptor.create(EE16);
                    adaptor.addChild(root_0, EE16_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc146);
                    con17=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con17.getTree());
                    pushFollow(FOLLOW_con_in_tcc148);
                    con18=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con18.getTree());
                    SARA_II19=(Token)match(input,SARA_II,FOLLOW_SARA_II_in_tcc150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_II19_tree = (Object)adaptor.create(SARA_II19);
                    adaptor.addChild(root_0, SARA_II19_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:90:25: ( TON )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==TON) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:90:25: TON
                            {
                            TON20=(Token)match(input,TON,FOLLOW_TON_in_tcc152); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON20_tree = (Object)adaptor.create(TON20);
                            adaptor.addChild(root_0, TON20_tree);
                            }

                            }
                            break;

                    }

                    YOYAK21=(Token)match(input,YOYAK,FOLLOW_YOYAK_in_tcc155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YOYAK21_tree = (Object)adaptor.create(YOYAK21);
                    adaptor.addChild(root_0, YOYAK21_tree);
                    }
                    A22=(Token)match(input,A,FOLLOW_A_in_tcc157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A22_tree = (Object)adaptor.create(A22);
                    adaptor.addChild(root_0, A22_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:91:5: ( EE con con SARA_II ( TON )? YOYAK tccfirst )=> EE con con SARA_II ( TON )? YOYAK
                    {
                    root_0 = (Object)adaptor.nil();

                    EE23=(Token)match(input,EE,FOLLOW_EE_in_tcc182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE23_tree = (Object)adaptor.create(EE23);
                    adaptor.addChild(root_0, EE23_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc184);
                    con24=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con24.getTree());
                    pushFollow(FOLLOW_con_in_tcc186);
                    con25=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con25.getTree());
                    SARA_II26=(Token)match(input,SARA_II,FOLLOW_SARA_II_in_tcc188); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_II26_tree = (Object)adaptor.create(SARA_II26);
                    adaptor.addChild(root_0, SARA_II26_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:91:68: ( TON )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==TON) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:91:68: TON
                            {
                            TON27=(Token)match(input,TON,FOLLOW_TON_in_tcc190); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON27_tree = (Object)adaptor.create(TON27);
                            adaptor.addChild(root_0, TON27_tree);
                            }

                            }
                            break;

                    }

                    YOYAK28=(Token)match(input,YOYAK,FOLLOW_YOYAK_in_tcc193); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YOYAK28_tree = (Object)adaptor.create(YOYAK28);
                    adaptor.addChild(root_0, YOYAK28_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:92:6: EE con con O_ANG A
                    {
                    root_0 = (Object)adaptor.nil();

                    EE29=(Token)match(input,EE,FOLLOW_EE_in_tcc200); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE29_tree = (Object)adaptor.create(EE29);
                    adaptor.addChild(root_0, EE29_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc202);
                    con30=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con30.getTree());
                    pushFollow(FOLLOW_con_in_tcc204);
                    con31=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con31.getTree());
                    O_ANG32=(Token)match(input,O_ANG,FOLLOW_O_ANG_in_tcc206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    O_ANG32_tree = (Object)adaptor.create(O_ANG32);
                    adaptor.addChild(root_0, O_ANG32_tree);
                    }
                    A33=(Token)match(input,A,FOLLOW_A_in_tcc208); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A33_tree = (Object)adaptor.create(A33);
                    adaptor.addChild(root_0, A33_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:93:6: EE con con MAITAIKHU con
                    {
                    root_0 = (Object)adaptor.nil();

                    EE34=(Token)match(input,EE,FOLLOW_EE_in_tcc216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE34_tree = (Object)adaptor.create(EE34);
                    adaptor.addChild(root_0, EE34_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc218);
                    con35=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con35.getTree());
                    pushFollow(FOLLOW_con_in_tcc220);
                    con36=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con36.getTree());
                    MAITAIKHU37=(Token)match(input,MAITAIKHU,FOLLOW_MAITAIKHU_in_tcc222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAITAIKHU37_tree = (Object)adaptor.create(MAITAIKHU37);
                    adaptor.addChild(root_0, MAITAIKHU37_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc224);
                    con38=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con38.getTree());

                    }
                    break;
                case 7 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:94:5: EE con SARA_I con THANTHAKHAT con
                    {
                    root_0 = (Object)adaptor.nil();

                    EE39=(Token)match(input,EE,FOLLOW_EE_in_tcc230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE39_tree = (Object)adaptor.create(EE39);
                    adaptor.addChild(root_0, EE39_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc232);
                    con40=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con40.getTree());
                    SARA_I41=(Token)match(input,SARA_I,FOLLOW_SARA_I_in_tcc234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_I41_tree = (Object)adaptor.create(SARA_I41);
                    adaptor.addChild(root_0, SARA_I41_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc236);
                    con42=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con42.getTree());
                    THANTHAKHAT43=(Token)match(input,THANTHAKHAT,FOLLOW_THANTHAKHAT_in_tcc238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THANTHAKHAT43_tree = (Object)adaptor.create(THANTHAKHAT43);
                    adaptor.addChild(root_0, THANTHAKHAT43_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc240);
                    con44=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con44.getTree());

                    }
                    break;
                case 8 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:95:6: EE con SARA_I ( TON )? con
                    {
                    root_0 = (Object)adaptor.nil();

                    EE45=(Token)match(input,EE,FOLLOW_EE_in_tcc251); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE45_tree = (Object)adaptor.create(EE45);
                    adaptor.addChild(root_0, EE45_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc253);
                    con46=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con46.getTree());
                    SARA_I47=(Token)match(input,SARA_I,FOLLOW_SARA_I_in_tcc255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_I47_tree = (Object)adaptor.create(SARA_I47);
                    adaptor.addChild(root_0, SARA_I47_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:95:20: ( TON )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==TON) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:95:20: TON
                            {
                            TON48=(Token)match(input,TON,FOLLOW_TON_in_tcc257); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON48_tree = (Object)adaptor.create(TON48);
                            adaptor.addChild(root_0, TON48_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_con_in_tcc260);
                    con49=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con49.getTree());

                    }
                    break;
                case 9 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:96:5: EE con SARA_II ( TON )? YOYAK A
                    {
                    root_0 = (Object)adaptor.nil();

                    EE50=(Token)match(input,EE,FOLLOW_EE_in_tcc266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE50_tree = (Object)adaptor.create(EE50);
                    adaptor.addChild(root_0, EE50_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc268);
                    con51=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con51.getTree());
                    SARA_II52=(Token)match(input,SARA_II,FOLLOW_SARA_II_in_tcc270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_II52_tree = (Object)adaptor.create(SARA_II52);
                    adaptor.addChild(root_0, SARA_II52_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:96:21: ( TON )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==TON) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:96:21: TON
                            {
                            TON53=(Token)match(input,TON,FOLLOW_TON_in_tcc273); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON53_tree = (Object)adaptor.create(TON53);
                            adaptor.addChild(root_0, TON53_tree);
                            }

                            }
                            break;

                    }

                    YOYAK54=(Token)match(input,YOYAK,FOLLOW_YOYAK_in_tcc276); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YOYAK54_tree = (Object)adaptor.create(YOYAK54);
                    adaptor.addChild(root_0, YOYAK54_tree);
                    }
                    A55=(Token)match(input,A,FOLLOW_A_in_tcc278); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A55_tree = (Object)adaptor.create(A55);
                    adaptor.addChild(root_0, A55_tree);
                    }

                    }
                    break;
                case 10 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:97:5: EE con SARA_II O_ANG ( A )?
                    {
                    root_0 = (Object)adaptor.nil();

                    EE56=(Token)match(input,EE,FOLLOW_EE_in_tcc284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE56_tree = (Object)adaptor.create(EE56);
                    adaptor.addChild(root_0, EE56_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc286);
                    con57=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con57.getTree());
                    SARA_II58=(Token)match(input,SARA_II,FOLLOW_SARA_II_in_tcc288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_II58_tree = (Object)adaptor.create(SARA_II58);
                    adaptor.addChild(root_0, SARA_II58_tree);
                    }
                    O_ANG59=(Token)match(input,O_ANG,FOLLOW_O_ANG_in_tcc290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    O_ANG59_tree = (Object)adaptor.create(O_ANG59);
                    adaptor.addChild(root_0, O_ANG59_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:97:26: ( A )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==A) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:97:26: A
                            {
                            A60=(Token)match(input,A,FOLLOW_A_in_tcc292); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            A60_tree = (Object)adaptor.create(A60);
                            adaptor.addChild(root_0, A60_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 11 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:98:5: EE con SARA_UEE TON O_ANG ( A )?
                    {
                    root_0 = (Object)adaptor.nil();

                    EE61=(Token)match(input,EE,FOLLOW_EE_in_tcc299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE61_tree = (Object)adaptor.create(EE61);
                    adaptor.addChild(root_0, EE61_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc301);
                    con62=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con62.getTree());
                    SARA_UEE63=(Token)match(input,SARA_UEE,FOLLOW_SARA_UEE_in_tcc303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_UEE63_tree = (Object)adaptor.create(SARA_UEE63);
                    adaptor.addChild(root_0, SARA_UEE63_tree);
                    }
                    TON64=(Token)match(input,TON,FOLLOW_TON_in_tcc305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TON64_tree = (Object)adaptor.create(TON64);
                    adaptor.addChild(root_0, TON64_tree);
                    }
                    O_ANG65=(Token)match(input,O_ANG,FOLLOW_O_ANG_in_tcc307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    O_ANG65_tree = (Object)adaptor.create(O_ANG65);
                    adaptor.addChild(root_0, O_ANG65_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:98:31: ( A )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==A) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:98:31: A
                            {
                            A66=(Token)match(input,A,FOLLOW_A_in_tcc309); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            A66_tree = (Object)adaptor.create(A66);
                            adaptor.addChild(root_0, A66_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:99:5: EE con SARA_UEE O_ANG ( A )?
                    {
                    root_0 = (Object)adaptor.nil();

                    EE67=(Token)match(input,EE,FOLLOW_EE_in_tcc316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE67_tree = (Object)adaptor.create(EE67);
                    adaptor.addChild(root_0, EE67_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc318);
                    con68=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con68.getTree());
                    SARA_UEE69=(Token)match(input,SARA_UEE,FOLLOW_SARA_UEE_in_tcc320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_UEE69_tree = (Object)adaptor.create(SARA_UEE69);
                    adaptor.addChild(root_0, SARA_UEE69_tree);
                    }
                    O_ANG70=(Token)match(input,O_ANG,FOLLOW_O_ANG_in_tcc322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    O_ANG70_tree = (Object)adaptor.create(O_ANG70);
                    adaptor.addChild(root_0, O_ANG70_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:99:27: ( A )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==A) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:99:27: A
                            {
                            A71=(Token)match(input,A,FOLLOW_A_in_tcc324); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            A71_tree = (Object)adaptor.create(A71);
                            adaptor.addChild(root_0, A71_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:100:5: ( EE con vfront ( TON )? YOYAK tccfirst )=> EE con vfront ( TON )? YOYAK
                    {
                    root_0 = (Object)adaptor.nil();

                    EE72=(Token)match(input,EE,FOLLOW_EE_in_tcc348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE72_tree = (Object)adaptor.create(EE72);
                    adaptor.addChild(root_0, EE72_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc350);
                    con73=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con73.getTree());
                    pushFollow(FOLLOW_vfront_in_tcc352);
                    vfront74=vfront();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vfront74.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:100:58: ( TON )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==TON) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:100:58: TON
                            {
                            TON75=(Token)match(input,TON,FOLLOW_TON_in_tcc354); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON75_tree = (Object)adaptor.create(TON75);
                            adaptor.addChild(root_0, TON75_tree);
                            }

                            }
                            break;

                    }

                    YOYAK76=(Token)match(input,YOYAK,FOLLOW_YOYAK_in_tcc357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YOYAK76_tree = (Object)adaptor.create(YOYAK76);
                    adaptor.addChild(root_0, YOYAK76_tree);
                    }

                    }
                    break;
                case 14 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:101:4: EE con ( TON )? ( SARA_AA )? ( A )?
                    {
                    root_0 = (Object)adaptor.nil();

                    EE77=(Token)match(input,EE,FOLLOW_EE_in_tcc362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EE77_tree = (Object)adaptor.create(EE77);
                    adaptor.addChild(root_0, EE77_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc364);
                    con78=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con78.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:101:11: ( TON )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==TON) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:101:11: TON
                            {
                            TON79=(Token)match(input,TON,FOLLOW_TON_in_tcc366); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON79_tree = (Object)adaptor.create(TON79);
                            adaptor.addChild(root_0, TON79_tree);
                            }

                            }
                            break;

                    }

                    // /home/nook/NetBeansProjects/JTCC/TCC.g:101:16: ( SARA_AA )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==SARA_AA) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:101:16: SARA_AA
                            {
                            SARA_AA80=(Token)match(input,SARA_AA,FOLLOW_SARA_AA_in_tcc369); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SARA_AA80_tree = (Object)adaptor.create(SARA_AA80);
                            adaptor.addChild(root_0, SARA_AA80_tree);
                            }

                            }
                            break;

                    }

                    // /home/nook/NetBeansProjects/JTCC/TCC.g:101:25: ( A )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==A) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:101:25: A
                            {
                            A81=(Token)match(input,A,FOLLOW_A_in_tcc372); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            A81_tree = (Object)adaptor.create(A81);
                            adaptor.addChild(root_0, A81_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 15 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:102:4: con MAI_HAN_AKAT ( TON )? WA
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tcc378);
                    con82=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con82.getTree());
                    MAI_HAN_AKAT83=(Token)match(input,MAI_HAN_AKAT,FOLLOW_MAI_HAN_AKAT_in_tcc380); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAI_HAN_AKAT83_tree = (Object)adaptor.create(MAI_HAN_AKAT83);
                    adaptor.addChild(root_0, MAI_HAN_AKAT83_tree);
                    }
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:102:21: ( TON )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==TON) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:102:21: TON
                            {
                            TON84=(Token)match(input,TON,FOLLOW_TON_in_tcc382); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON84_tree = (Object)adaptor.create(TON84);
                            adaptor.addChild(root_0, TON84_tree);
                            }

                            }
                            break;

                    }

                    WA85=(Token)match(input,WA,FOLLOW_WA_in_tcc385); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WA85_tree = (Object)adaptor.create(WA85);
                    adaptor.addChild(root_0, WA85_tree);
                    }

                    }
                    break;
                case 16 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:103:5: con vback ( TON )? con ( SARA_U | SARA_I | A )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tcc391);
                    con86=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con86.getTree());
                    pushFollow(FOLLOW_vback_in_tcc393);
                    vback87=vback();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vback87.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:103:15: ( TON )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==TON) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:103:15: TON
                            {
                            TON88=(Token)match(input,TON,FOLLOW_TON_in_tcc395); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON88_tree = (Object)adaptor.create(TON88);
                            adaptor.addChild(root_0, TON88_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_con_in_tcc398);
                    con89=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con89.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:103:24: ( SARA_U | SARA_I | A )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==A||LA17_0==SARA_I||LA17_0==SARA_U) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:
                            {
                            set90=(Token)input.LT(1);
                            if ( input.LA(1)==A||input.LA(1)==SARA_I||input.LA(1)==SARA_U ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set90));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:104:5: con ( SARA_I | SARA_U )? THANTHAKHAT
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tcc417);
                    con91=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con91.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:104:9: ( SARA_I | SARA_U )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==SARA_I||LA18_0==SARA_U) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:
                            {
                            set92=(Token)input.LT(1);
                            if ( input.LA(1)==SARA_I||input.LA(1)==SARA_U ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set92));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    THANTHAKHAT93=(Token)match(input,THANTHAKHAT,FOLLOW_THANTHAKHAT_in_tcc428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THANTHAKHAT93_tree = (Object)adaptor.create(THANTHAKHAT93);
                    adaptor.addChild(root_0, THANTHAKHAT93_tree);
                    }

                    }
                    break;
                case 18 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:105:5: con vneedl ( TON )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tcc434);
                    con94=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con94.getTree());
                    pushFollow(FOLLOW_vneedl_in_tcc436);
                    vneedl95=vneedl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vneedl95.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:105:16: ( TON )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TON) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:105:16: TON
                            {
                            TON96=(Token)match(input,TON,FOLLOW_TON_in_tcc438); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON96_tree = (Object)adaptor.create(TON96);
                            adaptor.addChild(root_0, TON96_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 19 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:106:5: con MAITAIKHU
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tcc445);
                    con97=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con97.getTree());
                    MAITAIKHU98=(Token)match(input,MAITAIKHU,FOLLOW_MAITAIKHU_in_tcc447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAITAIKHU98_tree = (Object)adaptor.create(MAITAIKHU98);
                    adaptor.addChild(root_0, MAITAIKHU98_tree);
                    }

                    }
                    break;
                case 20 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:107:4: con ( TON )? ( vO1 )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tcc453);
                    con99=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con99.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:107:8: ( TON )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TON) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:107:8: TON
                            {
                            TON100=(Token)match(input,TON,FOLLOW_TON_in_tcc455); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON100_tree = (Object)adaptor.create(TON100);
                            adaptor.addChild(root_0, TON100_tree);
                            }

                            }
                            break;

                    }

                    // /home/nook/NetBeansProjects/JTCC/TCC.g:107:13: ( vO1 )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=SARA_AA && LA21_0<=A)||LA21_0==SARA_AM) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:107:13: vO1
                            {
                            pushFollow(FOLLOW_vO1_in_tcc458);
                            vO1101=vO1();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, vO1101.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 21 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:108:5: AE con MAITAIKHU con
                    {
                    root_0 = (Object)adaptor.nil();

                    AE102=(Token)match(input,AE,FOLLOW_AE_in_tcc465); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AE102_tree = (Object)adaptor.create(AE102);
                    adaptor.addChild(root_0, AE102_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc467);
                    con103=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con103.getTree());
                    MAITAIKHU104=(Token)match(input,MAITAIKHU,FOLLOW_MAITAIKHU_in_tcc469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAITAIKHU104_tree = (Object)adaptor.create(MAITAIKHU104);
                    adaptor.addChild(root_0, MAITAIKHU104_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc471);
                    con105=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con105.getTree());

                    }
                    break;
                case 22 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:109:5: AE con con THANTHAKHAT
                    {
                    root_0 = (Object)adaptor.nil();

                    AE106=(Token)match(input,AE,FOLLOW_AE_in_tcc477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AE106_tree = (Object)adaptor.create(AE106);
                    adaptor.addChild(root_0, AE106_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc479);
                    con107=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con107.getTree());
                    pushFollow(FOLLOW_con_in_tcc481);
                    con108=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con108.getTree());
                    THANTHAKHAT109=(Token)match(input,THANTHAKHAT,FOLLOW_THANTHAKHAT_in_tcc483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THANTHAKHAT109_tree = (Object)adaptor.create(THANTHAKHAT109);
                    adaptor.addChild(root_0, THANTHAKHAT109_tree);
                    }

                    }
                    break;
                case 23 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:110:5: AE con ( TON )? A
                    {
                    root_0 = (Object)adaptor.nil();

                    AE110=(Token)match(input,AE,FOLLOW_AE_in_tcc490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AE110_tree = (Object)adaptor.create(AE110);
                    adaptor.addChild(root_0, AE110_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc492);
                    con111=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con111.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:110:12: ( TON )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==TON) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:110:12: TON
                            {
                            TON112=(Token)match(input,TON,FOLLOW_TON_in_tcc494); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON112_tree = (Object)adaptor.create(TON112);
                            adaptor.addChild(root_0, TON112_tree);
                            }

                            }
                            break;

                    }

                    A113=(Token)match(input,A,FOLLOW_A_in_tcc497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A113_tree = (Object)adaptor.create(A113);
                    adaptor.addChild(root_0, A113_tree);
                    }

                    }
                    break;
                case 24 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:111:5: AE con con MAITAIKHU con
                    {
                    root_0 = (Object)adaptor.nil();

                    AE114=(Token)match(input,AE,FOLLOW_AE_in_tcc503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AE114_tree = (Object)adaptor.create(AE114);
                    adaptor.addChild(root_0, AE114_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc505);
                    con115=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con115.getTree());
                    pushFollow(FOLLOW_con_in_tcc507);
                    con116=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con116.getTree());
                    MAITAIKHU117=(Token)match(input,MAITAIKHU,FOLLOW_MAITAIKHU_in_tcc509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAITAIKHU117_tree = (Object)adaptor.create(MAITAIKHU117);
                    adaptor.addChild(root_0, MAITAIKHU117_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc511);
                    con118=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con118.getTree());

                    }
                    break;
                case 25 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:112:5: AE con con con THANTHAKHAT
                    {
                    root_0 = (Object)adaptor.nil();

                    AE119=(Token)match(input,AE,FOLLOW_AE_in_tcc518); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AE119_tree = (Object)adaptor.create(AE119);
                    adaptor.addChild(root_0, AE119_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc520);
                    con120=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con120.getTree());
                    pushFollow(FOLLOW_con_in_tcc522);
                    con121=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con121.getTree());
                    pushFollow(FOLLOW_con_in_tcc524);
                    con122=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con122.getTree());
                    THANTHAKHAT123=(Token)match(input,THANTHAKHAT,FOLLOW_THANTHAKHAT_in_tcc526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THANTHAKHAT123_tree = (Object)adaptor.create(THANTHAKHAT123);
                    adaptor.addChild(root_0, THANTHAKHAT123_tree);
                    }

                    }
                    break;
                case 26 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:113:5: OO con ( TON )? A
                    {
                    root_0 = (Object)adaptor.nil();

                    OO124=(Token)match(input,OO,FOLLOW_OO_in_tcc533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OO124_tree = (Object)adaptor.create(OO124);
                    adaptor.addChild(root_0, OO124_tree);
                    }
                    pushFollow(FOLLOW_con_in_tcc535);
                    con125=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con125.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:113:12: ( TON )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==TON) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:113:12: TON
                            {
                            TON126=(Token)match(input,TON,FOLLOW_TON_in_tcc537); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON126_tree = (Object)adaptor.create(TON126);
                            adaptor.addChild(root_0, TON126_tree);
                            }

                            }
                            break;

                    }

                    A127=(Token)match(input,A,FOLLOW_A_in_tcc540); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A127_tree = (Object)adaptor.create(A127);
                    adaptor.addChild(root_0, A127_tree);
                    }

                    }
                    break;
                case 27 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:114:5: vO2 con ( TON )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vO2_in_tcc546);
                    vO2128=vO2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vO2128.getTree());
                    pushFollow(FOLLOW_con_in_tcc548);
                    con129=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con129.getTree());
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:114:13: ( TON )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==TON) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/nook/NetBeansProjects/JTCC/TCC.g:114:13: TON
                            {
                            TON130=(Token)match(input,TON,FOLLOW_TON_in_tcc550); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TON130_tree = (Object)adaptor.create(TON130);
                            adaptor.addChild(root_0, TON130_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 28 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:115:5: dont_know
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dont_know_in_tcc557);
                    dont_know131=dont_know();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dont_know131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tcc"

    public static class vback_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vback"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:118:1: vback : ( MAI_HAN_AKAT | SARA_UEE );
    public final TCCParser.vback_return vback() throws RecognitionException {
        TCCParser.vback_return retval = new TCCParser.vback_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set132=null;

        Object set132_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:118:7: ( MAI_HAN_AKAT | SARA_UEE )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            root_0 = (Object)adaptor.nil();

            set132=(Token)input.LT(1);
            if ( (input.LA(1)>=SARA_UEE && input.LA(1)<=MAI_HAN_AKAT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set132));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vback"

    public static class tccfirst_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tccfirst"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:1: tccfirst : ( vO2 | con | WA | TCCIGNORE | DONT_KNOW | EOF );
    public final TCCParser.tccfirst_return tccfirst() throws RecognitionException {
        TCCParser.tccfirst_return retval = new TCCParser.tccfirst_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WA135=null;
        Token TCCIGNORE136=null;
        Token DONT_KNOW137=null;
        Token EOF138=null;
        TCCParser.vO2_return vO2133 = null;

        TCCParser.con_return con134 = null;


        Object WA135_tree=null;
        Object TCCIGNORE136_tree=null;
        Object DONT_KNOW137_tree=null;
        Object EOF138_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:121:10: ( vO2 | con | WA | TCCIGNORE | DONT_KNOW | EOF )
            int alt26=6;
            switch ( input.LA(1) ) {
            case EE:
            case AE:
            case OO:
            case MAIMUAN:
            case MAIMALAI:
                {
                alt26=1;
                }
                break;
            case YOYAK:
            case O_ANG:
            case CON:
                {
                alt26=2;
                }
                break;
            case WA:
                {
                alt26=3;
                }
                break;
            case TCCIGNORE:
                {
                alt26=4;
                }
                break;
            case DONT_KNOW:
                {
                alt26=5;
                }
                break;
            case EOF:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:12: vO2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vO2_in_tccfirst581);
                    vO2133=vO2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vO2133.getTree());

                    }
                    break;
                case 2 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:18: con
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_con_in_tccfirst585);
                    con134=con();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, con134.getTree());

                    }
                    break;
                case 3 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:24: WA
                    {
                    root_0 = (Object)adaptor.nil();

                    WA135=(Token)match(input,WA,FOLLOW_WA_in_tccfirst589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WA135_tree = (Object)adaptor.create(WA135);
                    adaptor.addChild(root_0, WA135_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:29: TCCIGNORE
                    {
                    root_0 = (Object)adaptor.nil();

                    TCCIGNORE136=(Token)match(input,TCCIGNORE,FOLLOW_TCCIGNORE_in_tccfirst593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TCCIGNORE136_tree = (Object)adaptor.create(TCCIGNORE136);
                    adaptor.addChild(root_0, TCCIGNORE136_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:41: DONT_KNOW
                    {
                    root_0 = (Object)adaptor.nil();

                    DONT_KNOW137=(Token)match(input,DONT_KNOW,FOLLOW_DONT_KNOW_in_tccfirst597); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DONT_KNOW137_tree = (Object)adaptor.create(DONT_KNOW137);
                    adaptor.addChild(root_0, DONT_KNOW137_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:121:53: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF138=(Token)match(input,EOF,FOLLOW_EOF_in_tccfirst601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EOF138_tree = (Object)adaptor.create(EOF138);
                    adaptor.addChild(root_0, EOF138_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tccfirst"

    public static class vfront_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vfront"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:123:1: vfront : ( SARA_I | SARA_II | SARA_U | SARA_UU );
    public final TCCParser.vfront_return vfront() throws RecognitionException {
        TCCParser.vfront_return retval = new TCCParser.vfront_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set139=null;

        Object set139_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:123:8: ( SARA_I | SARA_II | SARA_U | SARA_UU )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            root_0 = (Object)adaptor.nil();

            set139=(Token)input.LT(1);
            if ( input.LA(1)==SARA_II||input.LA(1)==SARA_I||input.LA(1)==SARA_U||input.LA(1)==SARA_UU ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set139));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vfront"

    public static class vO1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vO1"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:125:1: vO1 : ( A | SARA_AA | SARA_AM );
    public final TCCParser.vO1_return vO1() throws RecognitionException {
        TCCParser.vO1_return retval = new TCCParser.vO1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set140=null;

        Object set140_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:125:5: ( A | SARA_AA | SARA_AM )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            root_0 = (Object)adaptor.nil();

            set140=(Token)input.LT(1);
            if ( (input.LA(1)>=SARA_AA && input.LA(1)<=A)||input.LA(1)==SARA_AM ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set140));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vO1"

    public static class vneedl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vneedl"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:127:1: vneedl : ( vfront | vO1 | SARA_UEE | SARA_UE );
    public final TCCParser.vneedl_return vneedl() throws RecognitionException {
        TCCParser.vneedl_return retval = new TCCParser.vneedl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SARA_UEE143=null;
        Token SARA_UE144=null;
        TCCParser.vfront_return vfront141 = null;

        TCCParser.vO1_return vO1142 = null;


        Object SARA_UEE143_tree=null;
        Object SARA_UE144_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:127:8: ( vfront | vO1 | SARA_UEE | SARA_UE )
            int alt27=4;
            switch ( input.LA(1) ) {
            case SARA_II:
            case SARA_I:
            case SARA_U:
            case SARA_UU:
                {
                alt27=1;
                }
                break;
            case SARA_AA:
            case A:
            case SARA_AM:
                {
                alt27=2;
                }
                break;
            case SARA_UEE:
                {
                alt27=3;
                }
                break;
            case SARA_UE:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:127:10: vfront
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vfront_in_vneedl647);
                    vfront141=vfront();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vfront141.getTree());

                    }
                    break;
                case 2 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:127:18: vO1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vO1_in_vneedl650);
                    vO1142=vO1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vO1142.getTree());

                    }
                    break;
                case 3 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:127:24: SARA_UEE
                    {
                    root_0 = (Object)adaptor.nil();

                    SARA_UEE143=(Token)match(input,SARA_UEE,FOLLOW_SARA_UEE_in_vneedl654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_UEE143_tree = (Object)adaptor.create(SARA_UEE143);
                    adaptor.addChild(root_0, SARA_UEE143_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:127:35: SARA_UE
                    {
                    root_0 = (Object)adaptor.nil();

                    SARA_UE144=(Token)match(input,SARA_UE,FOLLOW_SARA_UE_in_vneedl658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SARA_UE144_tree = (Object)adaptor.create(SARA_UE144);
                    adaptor.addChild(root_0, SARA_UE144_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vneedl"

    public static class needl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "needl"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:129:1: needl : ( vneedl | THANTHAKHAT );
    public final TCCParser.needl_return needl() throws RecognitionException {
        TCCParser.needl_return retval = new TCCParser.needl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THANTHAKHAT146=null;
        TCCParser.vneedl_return vneedl145 = null;


        Object THANTHAKHAT146_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:129:7: ( vneedl | THANTHAKHAT )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=SARA_AA && LA28_0<=SARA_II)||LA28_0==SARA_I||LA28_0==SARA_UEE||LA28_0==SARA_U||(LA28_0>=SARA_UU && LA28_0<=SARA_UE)) ) {
                alt28=1;
            }
            else if ( (LA28_0==THANTHAKHAT) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:129:9: vneedl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vneedl_in_needl667);
                    vneedl145=vneedl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vneedl145.getTree());

                    }
                    break;
                case 2 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:129:18: THANTHAKHAT
                    {
                    root_0 = (Object)adaptor.nil();

                    THANTHAKHAT146=(Token)match(input,THANTHAKHAT,FOLLOW_THANTHAKHAT_in_needl671); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THANTHAKHAT146_tree = (Object)adaptor.create(THANTHAKHAT146);
                    adaptor.addChild(root_0, THANTHAKHAT146_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "needl"

    public static class vO2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vO2"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:131:1: vO2 : ( EE | AE | OO | MAIMUAN | MAIMALAI );
    public final TCCParser.vO2_return vO2() throws RecognitionException {
        TCCParser.vO2_return retval = new TCCParser.vO2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set147=null;

        Object set147_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:131:5: ( EE | AE | OO | MAIMUAN | MAIMALAI )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            root_0 = (Object)adaptor.nil();

            set147=(Token)input.LT(1);
            if ( input.LA(1)==EE||(input.LA(1)>=AE && input.LA(1)<=OO)||(input.LA(1)>=MAIMUAN && input.LA(1)<=MAIMALAI) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set147));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vO2"

    public static class con_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "con"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:133:1: con : ( CON | YOYAK | O_ANG );
    public final TCCParser.con_return con() throws RecognitionException {
        TCCParser.con_return retval = new TCCParser.con_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set148=null;

        Object set148_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:133:6: ( CON | YOYAK | O_ANG )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            root_0 = (Object)adaptor.nil();

            set148=(Token)input.LT(1);
            if ( (input.LA(1)>=YOYAK && input.LA(1)<=O_ANG)||input.LA(1)==CON ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set148));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "con"

    public static class newlines_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newlines"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:135:1: newlines : ( NEWLINES )? ;
    public final TCCParser.newlines_return newlines() throws RecognitionException {
        TCCParser.newlines_return retval = new TCCParser.newlines_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINES149=null;

        Object NEWLINES149_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:135:10: ( ( NEWLINES )? )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:135:12: ( NEWLINES )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/nook/NetBeansProjects/JTCC/TCC.g:135:12: ( NEWLINES )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NEWLINES) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:135:12: NEWLINES
                    {
                    NEWLINES149=(Token)match(input,NEWLINES,FOLLOW_NEWLINES_in_newlines722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINES149_tree = (Object)adaptor.create(NEWLINES149);
                    adaptor.addChild(root_0, NEWLINES149_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newlines"

    public static class dont_know_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dont_know"
    // /home/nook/NetBeansProjects/JTCC/TCC.g:137:1: dont_know : ( WA | EE | AE | OO | MAIMUAN | MAIMALAI | YOYAK | MAITAIKHU | THANTHAKHAT | A | O_ANG | SARA_UE | SARA_UEE | SARA_I | SARA_II | SARA_AA | SARA_AM | MAI_HAN_AKAT | SARA_U | SARA_UU | TON | TCCIGNORE | CON | DONT_KNOW );
    public final TCCParser.dont_know_return dont_know() throws RecognitionException {
        TCCParser.dont_know_return retval = new TCCParser.dont_know_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set150=null;

        Object set150_tree=null;

        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:138:2: ( WA | EE | AE | OO | MAIMUAN | MAIMALAI | YOYAK | MAITAIKHU | THANTHAKHAT | A | O_ANG | SARA_UE | SARA_UEE | SARA_I | SARA_II | SARA_AA | SARA_AM | MAI_HAN_AKAT | SARA_U | SARA_UU | TON | TCCIGNORE | CON | DONT_KNOW )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            root_0 = (Object)adaptor.nil();

            set150=(Token)input.LT(1);
            if ( (input.LA(1)>=EE && input.LA(1)<=CON) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set150));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dont_know"

    // $ANTLR start synpred1_TCC
    public final void synpred1_TCC_fragment() throws RecognitionException {   
        // /home/nook/NetBeansProjects/JTCC/TCC.g:91:5: ( EE con con SARA_II ( TON )? YOYAK tccfirst )
        // /home/nook/NetBeansProjects/JTCC/TCC.g:91:6: EE con con SARA_II ( TON )? YOYAK tccfirst
        {
        match(input,EE,FOLLOW_EE_in_synpred1_TCC164); if (state.failed) return ;
        pushFollow(FOLLOW_con_in_synpred1_TCC166);
        con();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_con_in_synpred1_TCC168);
        con();

        state._fsp--;
        if (state.failed) return ;
        match(input,SARA_II,FOLLOW_SARA_II_in_synpred1_TCC170); if (state.failed) return ;
        // /home/nook/NetBeansProjects/JTCC/TCC.g:91:25: ( TON )?
        int alt30=2;
        int LA30_0 = input.LA(1);

        if ( (LA30_0==TON) ) {
            alt30=1;
        }
        switch (alt30) {
            case 1 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:91:25: TON
                {
                match(input,TON,FOLLOW_TON_in_synpred1_TCC172); if (state.failed) return ;

                }
                break;

        }

        match(input,YOYAK,FOLLOW_YOYAK_in_synpred1_TCC175); if (state.failed) return ;
        pushFollow(FOLLOW_tccfirst_in_synpred1_TCC177);
        tccfirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_TCC

    // $ANTLR start synpred2_TCC
    public final void synpred2_TCC_fragment() throws RecognitionException {   
        // /home/nook/NetBeansProjects/JTCC/TCC.g:100:5: ( EE con vfront ( TON )? YOYAK tccfirst )
        // /home/nook/NetBeansProjects/JTCC/TCC.g:100:6: EE con vfront ( TON )? YOYAK tccfirst
        {
        match(input,EE,FOLLOW_EE_in_synpred2_TCC332); if (state.failed) return ;
        pushFollow(FOLLOW_con_in_synpred2_TCC334);
        con();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_vfront_in_synpred2_TCC336);
        vfront();

        state._fsp--;
        if (state.failed) return ;
        // /home/nook/NetBeansProjects/JTCC/TCC.g:100:20: ( TON )?
        int alt31=2;
        int LA31_0 = input.LA(1);

        if ( (LA31_0==TON) ) {
            alt31=1;
        }
        switch (alt31) {
            case 1 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:100:20: TON
                {
                match(input,TON,FOLLOW_TON_in_synpred2_TCC338); if (state.failed) return ;

                }
                break;

        }

        match(input,YOYAK,FOLLOW_YOYAK_in_synpred2_TCC341); if (state.failed) return ;
        pushFollow(FOLLOW_tccfirst_in_synpred2_TCC343);
        tccfirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_TCC

    // Delegated rules

    public final boolean synpred2_TCC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_TCC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_TCC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_TCC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\115\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\6\1\10\3\6\1\uffff\1\26\1\uffff\1\10\2\20\5\uffff\2\23"+
        "\1\uffff\2\26\1\uffff\4\26\1\10\3\uffff\1\20\2\uffff\3\23\1\uffff"+
        "\1\23\2\uffff\1\26\1\75\1\26\1\100\1\26\2\uffff\6\26\3\uffff\2\23"+
        "\3\uffff\1\100\5\uffff\2\26\7\uffff";
    static final String DFA25_minS =
        "\1\5\5\4\1\uffff\1\4\1\uffff\3\4\5\uffff\2\4\1\uffff\2\4\1\uffff"+
        "\5\4\3\uffff\1\4\2\uffff\3\4\1\uffff\1\4\1\uffff\1\11\5\4\1\uffff"+
        "\1\0\6\4\3\uffff\2\4\3\uffff\1\4\4\uffff\1\11\2\4\7\uffff";
    static final String DFA25_maxS =
        "\6\34\1\uffff\1\34\1\uffff\3\34\5\uffff\2\34\1\uffff\2\34\1\uffff"+
        "\5\34\3\uffff\1\34\2\uffff\3\34\1\uffff\1\34\1\uffff\1\11\5\34\1"+
        "\uffff\1\0\6\34\3\uffff\2\34\3\uffff\1\34\4\uffff\1\11\2\34\7\uffff";
    static final String DFA25_acceptS =
        "\6\uffff\1\34\1\uffff\1\24\3\uffff\1\21\1\23\3\22\2\uffff\1\33\2"+
        "\uffff\1\16\5\uffff\1\20\1\17\1\21\1\uffff\1\20\1\27\3\uffff\1\32"+
        "\1\uffff\1\12\6\uffff\1\14\7\uffff\1\1\1\25\1\26\2\uffff\1\11\1"+
        "\15\1\10\1\uffff\2\10\1\13\1\5\3\uffff\1\2\1\6\1\30\1\31\1\7\1\3"+
        "\1\4";
    static final String DFA25_specialS =
        "\50\uffff\1\0\6\uffff\1\2\23\uffff\1\1\11\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\5\6\2\2\6\6\1\3\1\4\5\6\2\5\1\2",
            "\7\6\2\7\17\6\1\7",
            "\2\10\1\15\1\10\2\17\1\16\2\10\1\12\1\14\1\13\1\11\1\10\1\12"+
            "\4\10\1\16\1\17\1\20\3\10",
            "\7\6\2\21\17\6\1\21",
            "\7\6\2\22\17\6\1\22",
            "\7\6\2\23\17\6\1\23",
            "",
            "\2\26\1\32\3\26\1\24\2\31\1\25\1\26\1\27\2\26\1\30\4\26\1\30"+
            "\4\26\1\31",
            "",
            "\3\10\1\33\3\10\2\34\4\10\1\35\12\10\1\34",
            "\12\20\1\36\16\20",
            "\3\20\1\37\3\20\2\40\17\20\1\40",
            "",
            "",
            "",
            "",
            "",
            "\2\23\1\43\1\42\1\23\1\41\1\23\2\44\17\23\1\44",
            "\3\23\1\46\1\23\1\45\23\23",
            "",
            "\3\26\1\51\3\26\1\50\1\47\20\26",
            "\3\26\1\53\3\26\1\52\1\54\17\26\1\54",
            "",
            "\3\26\1\55\4\26\1\56\20\26",
            "\3\26\1\60\3\26\1\57\21\26",
            "\2\26\1\65\1\63\1\64\1\26\1\62\1\26\1\61\20\26",
            "\7\26\2\66\17\26\1\66",
            "\7\10\2\34\4\10\1\35\12\10\1\34",
            "",
            "",
            "",
            "\7\20\2\40\17\20\1\40",
            "",
            "",
            "\5\23\1\41\23\23",
            "\7\23\2\67\17\23\1\67",
            "\2\23\1\71\4\23\2\72\1\23\1\70\15\23\1\72",
            "",
            "\5\23\1\45\23\23",
            "",
            "\1\73",
            "\7\26\1\50\21\26",
            "\12\75\1\76\16\75",
            "\7\26\1\77\1\100\17\26\1\100",
            "\1\75\11\100\1\76\16\100",
            "\10\26\1\101\20\26",
            "",
            "\1\uffff",
            "\7\26\1\57\21\26",
            "\5\26\1\102\23\26",
            "\3\26\1\104\3\26\1\103\21\26",
            "\4\26\1\105\24\26",
            "\5\26\1\106\23\26",
            "\7\26\2\107\17\26\1\107",
            "",
            "",
            "",
            "\7\23\2\110\17\23\1\110",
            "\12\23\1\111\16\23",
            "",
            "",
            "",
            "\1\75\6\100\2\112\17\100\1\112",
            "",
            "",
            "",
            "",
            "\1\113",
            "\7\26\1\103\21\26",
            "\5\26\1\106\23\26",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "87:1: tcc : ( EE con MAITAIKHU con | EE con con ( TON )? SARA_AA A | EE con con SARA_II ( TON )? YOYAK A | ( EE con con SARA_II ( TON )? YOYAK tccfirst )=> EE con con SARA_II ( TON )? YOYAK | EE con con O_ANG A | EE con con MAITAIKHU con | EE con SARA_I con THANTHAKHAT con | EE con SARA_I ( TON )? con | EE con SARA_II ( TON )? YOYAK A | EE con SARA_II O_ANG ( A )? | EE con SARA_UEE TON O_ANG ( A )? | EE con SARA_UEE O_ANG ( A )? | ( EE con vfront ( TON )? YOYAK tccfirst )=> EE con vfront ( TON )? YOYAK | EE con ( TON )? ( SARA_AA )? ( A )? | con MAI_HAN_AKAT ( TON )? WA | con vback ( TON )? con ( SARA_U | SARA_I | A )? | con ( SARA_I | SARA_U )? THANTHAKHAT | con vneedl ( TON )? | con MAITAIKHU | con ( TON )? ( vO1 )? | AE con MAITAIKHU con | AE con con THANTHAKHAT | AE con ( TON )? A | AE con con MAITAIKHU con | AE con con con THANTHAKHAT | OO con ( TON )? A | vO2 con ( TON )? | dont_know );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_40 = input.LA(1);

                         
                        int index25_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_40==A) ) {s = 59;}

                        else if ( (synpred2_TCC()) ) {s = 60;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index25_40);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_67 = input.LA(1);

                         
                        int index25_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_67==A) ) {s = 75;}

                        else if ( (synpred1_TCC()) ) {s = 76;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index25_67);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_47 = input.LA(1);

                         
                        int index25_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_TCC()) ) {s = 60;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index25_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_tcclist_in_stream57 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINES_in_stream61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_stream69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newlines_in_tcclist85 = new BitSet(new long[]{0x000000001FFFFFE0L});
    public static final BitSet FOLLOW_tcc_in_tcclist88 = new BitSet(new long[]{0x000000001FFFFFF2L});
    public static final BitSet FOLLOW_EE_in_tcc110 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_MAITAIKHU_in_tcc114 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc125 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc127 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc129 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TON_in_tcc131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SARA_AA_in_tcc134 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_A_in_tcc136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc144 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc146 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc148 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SARA_II_in_tcc150 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_TON_in_tcc152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_YOYAK_in_tcc155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_A_in_tcc157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc182 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc184 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc186 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SARA_II_in_tcc188 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_TON_in_tcc190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_YOYAK_in_tcc193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc200 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc202 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc204 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_O_ANG_in_tcc206 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_A_in_tcc208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc216 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc218 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc220 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_MAITAIKHU_in_tcc222 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc230 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SARA_I_in_tcc234 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THANTHAKHAT_in_tcc238 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc251 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc253 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SARA_I_in_tcc255 = new BitSet(new long[]{0x0000000010001880L});
    public static final BitSet FOLLOW_TON_in_tcc257 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc266 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc268 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SARA_II_in_tcc270 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_TON_in_tcc273 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_YOYAK_in_tcc276 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_A_in_tcc278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc284 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc286 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SARA_II_in_tcc288 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_O_ANG_in_tcc290 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_A_in_tcc292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc299 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SARA_UEE_in_tcc303 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TON_in_tcc305 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_O_ANG_in_tcc307 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_A_in_tcc309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc316 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc318 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SARA_UEE_in_tcc320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_O_ANG_in_tcc322 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_A_in_tcc324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc348 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc350 = new BitSet(new long[]{0x0000000000842400L});
    public static final BitSet FOLLOW_vfront_in_tcc352 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_TON_in_tcc354 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_YOYAK_in_tcc357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_tcc362 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc364 = new BitSet(new long[]{0x0000000000000382L});
    public static final BitSet FOLLOW_TON_in_tcc366 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_SARA_AA_in_tcc369 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_A_in_tcc372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tcc378 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MAI_HAN_AKAT_in_tcc380 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_TON_in_tcc382 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_WA_in_tcc385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tcc391 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_vback_in_tcc393 = new BitSet(new long[]{0x0000000010001880L});
    public static final BitSet FOLLOW_TON_in_tcc395 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc398 = new BitSet(new long[]{0x0000000000042202L});
    public static final BitSet FOLLOW_set_in_tcc400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tcc417 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_set_in_tcc419 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THANTHAKHAT_in_tcc428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tcc434 = new BitSet(new long[]{0x000000000384A700L});
    public static final BitSet FOLLOW_vneedl_in_tcc436 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_TON_in_tcc438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tcc445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_MAITAIKHU_in_tcc447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tcc453 = new BitSet(new long[]{0x0000000001000382L});
    public static final BitSet FOLLOW_TON_in_tcc455 = new BitSet(new long[]{0x0000000001000302L});
    public static final BitSet FOLLOW_vO1_in_tcc458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AE_in_tcc465 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_MAITAIKHU_in_tcc469 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AE_in_tcc477 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc479 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc481 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THANTHAKHAT_in_tcc483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AE_in_tcc490 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc492 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_TON_in_tcc494 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_A_in_tcc497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AE_in_tcc503 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc505 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_MAITAIKHU_in_tcc509 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AE_in_tcc518 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc520 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc522 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc524 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THANTHAKHAT_in_tcc526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OO_in_tcc533 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc535 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_TON_in_tcc537 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_A_in_tcc540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vO2_in_tcc546 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_tcc548 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_TON_in_tcc550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dont_know_in_tcc557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_vback0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vO2_in_tccfirst581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_con_in_tccfirst585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WA_in_tccfirst589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TCCIGNORE_in_tccfirst593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DONT_KNOW_in_tccfirst597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_tccfirst601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_vfront0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_vO10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vfront_in_vneedl647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vO1_in_vneedl650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SARA_UEE_in_vneedl654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SARA_UE_in_vneedl658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vneedl_in_needl667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THANTHAKHAT_in_needl671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_vO20 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_con0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINES_in_newlines722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dont_know0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_synpred1_TCC164 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_synpred1_TCC166 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_synpred1_TCC168 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SARA_II_in_synpred1_TCC170 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_TON_in_synpred1_TCC172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_YOYAK_in_synpred1_TCC175 = new BitSet(new long[]{0x000000001C7A1820L});
    public static final BitSet FOLLOW_tccfirst_in_synpred1_TCC177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EE_in_synpred2_TCC332 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_con_in_synpred2_TCC334 = new BitSet(new long[]{0x0000000000842400L});
    public static final BitSet FOLLOW_vfront_in_synpred2_TCC336 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_TON_in_synpred2_TCC338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_YOYAK_in_synpred2_TCC341 = new BitSet(new long[]{0x000000001C7A1820L});
    public static final BitSet FOLLOW_tccfirst_in_synpred2_TCC343 = new BitSet(new long[]{0x0000000000000002L});

}