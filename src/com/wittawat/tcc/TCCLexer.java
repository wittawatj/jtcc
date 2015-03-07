// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/nook/NetBeansProjects/JTCC/TCC.g 2010-03-06 18:43:23

package com.wittawat.tcc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TCCLexer extends Lexer {
    public static final int O_ANG=12;
    public static final int SARA_II=10;
    public static final int YOYAK=11;
    public static final int SARA_UE=25;
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

    public TCCLexer() {;} 
    public TCCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TCCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/nook/NetBeansProjects/JTCC/TCC.g"; }

    // $ANTLR start "WA"
    public final void mWA() throws RecognitionException {
        try {
            int _type = WA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:163:4: ( '\\u0E27\\u0E30' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:163:6: '\\u0E27\\u0E30'
            {
            match("\u0E27\u0E30"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WA"

    // $ANTLR start "EE"
    public final void mEE() throws RecognitionException {
        try {
            int _type = EE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:164:4: ( '\\u0E40' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:164:6: '\\u0E40'
            {
            match('\u0E40'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EE"

    // $ANTLR start "AE"
    public final void mAE() throws RecognitionException {
        try {
            int _type = AE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:165:4: ( '\\u0E41' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:165:6: '\\u0E41'
            {
            match('\u0E41'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AE"

    // $ANTLR start "OO"
    public final void mOO() throws RecognitionException {
        try {
            int _type = OO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:166:4: ( '\\u0E42' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:166:6: '\\u0E42'
            {
            match('\u0E42'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OO"

    // $ANTLR start "MAIMUAN"
    public final void mMAIMUAN() throws RecognitionException {
        try {
            int _type = MAIMUAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:167:9: ( '\\u0E43' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:167:11: '\\u0E43'
            {
            match('\u0E43'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAIMUAN"

    // $ANTLR start "MAIMALAI"
    public final void mMAIMALAI() throws RecognitionException {
        try {
            int _type = MAIMALAI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:168:10: ( '\\u0E44' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:168:11: '\\u0E44'
            {
            match('\u0E44'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAIMALAI"

    // $ANTLR start "YOYAK"
    public final void mYOYAK() throws RecognitionException {
        try {
            int _type = YOYAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:169:7: ( '\\u0E22' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:169:9: '\\u0E22'
            {
            match('\u0E22'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YOYAK"

    // $ANTLR start "MAITAIKHU"
    public final void mMAITAIKHU() throws RecognitionException {
        try {
            int _type = MAITAIKHU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:170:11: ( '\\u0E47' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:170:13: '\\u0E47'
            {
            match('\u0E47'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAITAIKHU"

    // $ANTLR start "THANTHAKHAT"
    public final void mTHANTHAKHAT() throws RecognitionException {
        try {
            int _type = THANTHAKHAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:171:13: ( '\\u0E4C' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:171:15: '\\u0E4C'
            {
            match('\u0E4C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THANTHAKHAT"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:172:3: ( '\\u0E30' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:172:5: '\\u0E30'
            {
            match('\u0E30'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "O_ANG"
    public final void mO_ANG() throws RecognitionException {
        try {
            int _type = O_ANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:173:7: ( '\\u0E2D' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:173:9: '\\u0E2D'
            {
            match('\u0E2D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "O_ANG"

    // $ANTLR start "SARA_UE"
    public final void mSARA_UE() throws RecognitionException {
        try {
            int _type = SARA_UE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:174:9: ( '\\u0E36' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:174:11: '\\u0E36'
            {
            match('\u0E36'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_UE"

    // $ANTLR start "SARA_UEE"
    public final void mSARA_UEE() throws RecognitionException {
        try {
            int _type = SARA_UEE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:175:10: ( '\\u0E37' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:175:12: '\\u0E37'
            {
            match('\u0E37'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_UEE"

    // $ANTLR start "SARA_I"
    public final void mSARA_I() throws RecognitionException {
        try {
            int _type = SARA_I;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:176:8: ( '\\u0E34' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:176:10: '\\u0E34'
            {
            match('\u0E34'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_I"

    // $ANTLR start "SARA_II"
    public final void mSARA_II() throws RecognitionException {
        try {
            int _type = SARA_II;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:177:9: ( '\\u0E35' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:177:11: '\\u0E35'
            {
            match('\u0E35'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_II"

    // $ANTLR start "SARA_AA"
    public final void mSARA_AA() throws RecognitionException {
        try {
            int _type = SARA_AA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:178:9: ( '\\u0E32' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:178:11: '\\u0E32'
            {
            match('\u0E32'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_AA"

    // $ANTLR start "SARA_AM"
    public final void mSARA_AM() throws RecognitionException {
        try {
            int _type = SARA_AM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:179:9: ( '\\u0E33' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:179:11: '\\u0E33'
            {
            match('\u0E33'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_AM"

    // $ANTLR start "MAI_HAN_AKAT"
    public final void mMAI_HAN_AKAT() throws RecognitionException {
        try {
            int _type = MAI_HAN_AKAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:180:14: ( '\\u0E31' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:180:16: '\\u0E31'
            {
            match('\u0E31'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAI_HAN_AKAT"

    // $ANTLR start "SARA_U"
    public final void mSARA_U() throws RecognitionException {
        try {
            int _type = SARA_U;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:181:8: ( '\\u0E38' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:181:10: '\\u0E38'
            {
            match('\u0E38'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_U"

    // $ANTLR start "SARA_UU"
    public final void mSARA_UU() throws RecognitionException {
        try {
            int _type = SARA_UU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:182:9: ( '\\u0E39' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:182:11: '\\u0E39'
            {
            match('\u0E39'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SARA_UU"

    // $ANTLR start "CON"
    public final void mCON() throws RecognitionException {
        try {
            int _type = CON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:183:5: ( '\\u0E01' .. '\\u0E2E' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:183:7: '\\u0E01' .. '\\u0E2E'
            {
            matchRange('\u0E01','\u0E2E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CON"

    // $ANTLR start "TON"
    public final void mTON() throws RecognitionException {
        try {
            int _type = TON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:184:5: ( '\\u0E48' | '\\u0E49' | '\\u0E4A' | '\\u0E4B' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:
            {
            if ( (input.LA(1)>='\u0E48' && input.LA(1)<='\u0E4B') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TON"

    // $ANTLR start "TCCIGNORE"
    public final void mTCCIGNORE() throws RecognitionException {
        try {
            int _type = TCCIGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:187:2: ( '<TCCIGNORE>' ( options {greedy=false; } : . )* '</TCCIGNORE>' )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:187:4: '<TCCIGNORE>' ( options {greedy=false; } : . )* '</TCCIGNORE>'
            {
            match("<TCCIGNORE>"); 

            // /home/nook/NetBeansProjects/JTCC/TCC.g:187:18: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /home/nook/NetBeansProjects/JTCC/TCC.g:187:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("</TCCIGNORE>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TCCIGNORE"

    // $ANTLR start "NEWLINES"
    public final void mNEWLINES() throws RecognitionException {
        try {
            int _type = NEWLINES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:190:11: ( ( '\\r' | '\\n' )+ )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:190:13: ( '\\r' | '\\n' )+
            {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:190:13: ( '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/nook/NetBeansProjects/JTCC/TCC.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINES"

    // $ANTLR start "DONT_KNOW"
    public final void mDONT_KNOW() throws RecognitionException {
        try {
            int _type = DONT_KNOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/nook/NetBeansProjects/JTCC/TCC.g:193:2: ( ( WS | ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' )+ | ( '\\u0E50' .. '\\u0E59' )+ | . ) )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:193:4: ( WS | ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' )+ | ( '\\u0E50' .. '\\u0E59' )+ | . )
            {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:193:4: ( WS | ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' )+ | ( '\\u0E50' .. '\\u0E59' )+ | . )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=2;
            }
            else if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                alt6=3;
            }
            else if ( ((LA6_0>='\u0E50' && LA6_0<='\u0E59')) ) {
                alt6=4;
            }
            else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='!' && LA6_0<='/')||(LA6_0>=':' && LA6_0<='@')||(LA6_0>='[' && LA6_0<='`')||(LA6_0>='{' && LA6_0<='\u0E4F')||(LA6_0>='\u0E5A' && LA6_0<='\uFFFF')) ) {
                alt6=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:6: WS
                    {
                    mWS(); 

                    }
                    break;
                case 2 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:11: ( '0' .. '9' )+
                    {
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:11: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:12: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:25: ( 'a' .. 'z' | 'A' .. 'Z' )+
                    {
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:25: ( 'a' .. 'z' | 'A' .. 'Z' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/nook/NetBeansProjects/JTCC/TCC.g:
                    	    {
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:49: ( '\\u0E50' .. '\\u0E59' )+
                    {
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:49: ( '\\u0E50' .. '\\u0E59' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0E50' && LA5_0<='\u0E59')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:51: '\\u0E50' .. '\\u0E59'
                    	    {
                    	    matchRange('\u0E50','\u0E59'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // /home/nook/NetBeansProjects/JTCC/TCC.g:193:74: .
                    {
                    matchAny(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DONT_KNOW"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:197:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /home/nook/NetBeansProjects/JTCC/TCC.g:197:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /home/nook/NetBeansProjects/JTCC/TCC.g:197:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/nook/NetBeansProjects/JTCC/TCC.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/nook/NetBeansProjects/JTCC/TCC.g:1:8: ( WA | EE | AE | OO | MAIMUAN | MAIMALAI | YOYAK | MAITAIKHU | THANTHAKHAT | A | O_ANG | SARA_UE | SARA_UEE | SARA_I | SARA_II | SARA_AA | SARA_AM | MAI_HAN_AKAT | SARA_U | SARA_UU | CON | TON | TCCIGNORE | NEWLINES | DONT_KNOW )
        int alt8=25;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:10: WA
                {
                mWA(); 

                }
                break;
            case 2 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:13: EE
                {
                mEE(); 

                }
                break;
            case 3 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:16: AE
                {
                mAE(); 

                }
                break;
            case 4 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:19: OO
                {
                mOO(); 

                }
                break;
            case 5 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:22: MAIMUAN
                {
                mMAIMUAN(); 

                }
                break;
            case 6 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:30: MAIMALAI
                {
                mMAIMALAI(); 

                }
                break;
            case 7 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:39: YOYAK
                {
                mYOYAK(); 

                }
                break;
            case 8 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:45: MAITAIKHU
                {
                mMAITAIKHU(); 

                }
                break;
            case 9 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:55: THANTHAKHAT
                {
                mTHANTHAKHAT(); 

                }
                break;
            case 10 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:67: A
                {
                mA(); 

                }
                break;
            case 11 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:69: O_ANG
                {
                mO_ANG(); 

                }
                break;
            case 12 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:75: SARA_UE
                {
                mSARA_UE(); 

                }
                break;
            case 13 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:83: SARA_UEE
                {
                mSARA_UEE(); 

                }
                break;
            case 14 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:92: SARA_I
                {
                mSARA_I(); 

                }
                break;
            case 15 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:99: SARA_II
                {
                mSARA_II(); 

                }
                break;
            case 16 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:107: SARA_AA
                {
                mSARA_AA(); 

                }
                break;
            case 17 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:115: SARA_AM
                {
                mSARA_AM(); 

                }
                break;
            case 18 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:123: MAI_HAN_AKAT
                {
                mMAI_HAN_AKAT(); 

                }
                break;
            case 19 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:136: SARA_U
                {
                mSARA_U(); 

                }
                break;
            case 20 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:143: SARA_UU
                {
                mSARA_UU(); 

                }
                break;
            case 21 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:151: CON
                {
                mCON(); 

                }
                break;
            case 22 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:155: TON
                {
                mTON(); 

                }
                break;
            case 23 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:159: TCCIGNORE
                {
                mTCCIGNORE(); 

                }
                break;
            case 24 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:169: NEWLINES
                {
                mNEWLINES(); 

                }
                break;
            case 25 :
                // /home/nook/NetBeansProjects/JTCC/TCC.g:1:178: DONT_KNOW
                {
                mDONT_KNOW(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\2\0\1\uffff\12\0\1\uffff";
    static final String DFA1_maxS =
        "\2\uffff\1\uffff\12\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\12\uffff\1\2";
    static final String DFA1_specialS =
        "\1\1\1\2\1\uffff\1\0\1\12\1\13\1\10\1\11\1\6\1\7\1\4\1\5\1\3\1\uffff}>";
    static final String[] DFA1_transitionS = {
            "\74\2\1\1\uffc3\2",
            "\57\2\1\3\uffd0\2",
            "",
            "\124\2\1\4\uffab\2",
            "\103\2\1\5\uffbc\2",
            "\103\2\1\6\uffbc\2",
            "\111\2\1\7\uffb6\2",
            "\107\2\1\10\uffb8\2",
            "\116\2\1\11\uffb1\2",
            "\117\2\1\12\uffb0\2",
            "\122\2\1\13\uffad\2",
            "\105\2\1\14\uffba\2",
            "\76\2\1\15\uffc1\2",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 187:18: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_3 = input.LA(1);

                        s = -1;
                        if ( (LA1_3=='T') ) {s = 4;}

                        else if ( ((LA1_3>='\u0000' && LA1_3<='S')||(LA1_3>='U' && LA1_3<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='<') ) {s = 1;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_1 = input.LA(1);

                        s = -1;
                        if ( (LA1_1=='/') ) {s = 3;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_12 = input.LA(1);

                        s = -1;
                        if ( (LA1_12=='>') ) {s = 13;}

                        else if ( ((LA1_12>='\u0000' && LA1_12<='=')||(LA1_12>='?' && LA1_12<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_10 = input.LA(1);

                        s = -1;
                        if ( (LA1_10=='R') ) {s = 11;}

                        else if ( ((LA1_10>='\u0000' && LA1_10<='Q')||(LA1_10>='S' && LA1_10<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_11 = input.LA(1);

                        s = -1;
                        if ( (LA1_11=='E') ) {s = 12;}

                        else if ( ((LA1_11>='\u0000' && LA1_11<='D')||(LA1_11>='F' && LA1_11<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_8 = input.LA(1);

                        s = -1;
                        if ( (LA1_8=='N') ) {s = 9;}

                        else if ( ((LA1_8>='\u0000' && LA1_8<='M')||(LA1_8>='O' && LA1_8<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_9 = input.LA(1);

                        s = -1;
                        if ( (LA1_9=='O') ) {s = 10;}

                        else if ( ((LA1_9>='\u0000' && LA1_9<='N')||(LA1_9>='P' && LA1_9<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_6 = input.LA(1);

                        s = -1;
                        if ( (LA1_6=='I') ) {s = 7;}

                        else if ( ((LA1_6>='\u0000' && LA1_6<='H')||(LA1_6>='J' && LA1_6<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_7 = input.LA(1);

                        s = -1;
                        if ( (LA1_7=='G') ) {s = 8;}

                        else if ( ((LA1_7>='\u0000' && LA1_7<='F')||(LA1_7>='H' && LA1_7<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_4 = input.LA(1);

                        s = -1;
                        if ( (LA1_4=='C') ) {s = 5;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='B')||(LA1_4>='D' && LA1_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_5 = input.LA(1);

                        s = -1;
                        if ( (LA1_5=='C') ) {s = 6;}

                        else if ( ((LA1_5>='\u0000' && LA1_5<='B')||(LA1_5>='D' && LA1_5<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\1\uffff\1\33\25\uffff\1\31\1\61\31\uffff\1\61";
    static final String DFA8_eofS =
        "\63\uffff";
    static final String DFA8_minS =
        "\1\0\1\u0e30\25\uffff\1\124\1\11\31\uffff\1\11";
    static final String DFA8_maxS =
        "\1\uffff\1\u0e30\25\uffff\1\124\1\40\31\uffff\1\40";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\2\uffff\1\31\1\1\1\25"+
        "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
        "\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\uffff";
    static final String DFA8_specialS =
        "\1\0\62\uffff}>";
    static final String[] DFA8_transitionS = {
            "\12\31\1\30\2\31\1\30\56\31\1\27\u0dc4\31\41\25\1\7\4\25\1\1"+
            "\5\25\1\13\1\25\1\31\1\12\1\22\1\20\1\21\1\16\1\17\1\14\1\15"+
            "\1\23\1\24\6\31\1\2\1\3\1\4\1\5\1\6\2\31\1\10\4\26\1\11\uf1b3"+
            "\31",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\31\1\62\2\uffff\1\62\22\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\62\2\uffff\1\62\22\uffff\1\31"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WA | EE | AE | OO | MAIMUAN | MAIMALAI | YOYAK | MAITAIKHU | THANTHAKHAT | A | O_ANG | SARA_UE | SARA_UEE | SARA_I | SARA_II | SARA_AA | SARA_AM | MAI_HAN_AKAT | SARA_U | SARA_UU | CON | TON | TCCIGNORE | NEWLINES | DONT_KNOW );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='\u0E27') ) {s = 1;}

                        else if ( (LA8_0=='\u0E40') ) {s = 2;}

                        else if ( (LA8_0=='\u0E41') ) {s = 3;}

                        else if ( (LA8_0=='\u0E42') ) {s = 4;}

                        else if ( (LA8_0=='\u0E43') ) {s = 5;}

                        else if ( (LA8_0=='\u0E44') ) {s = 6;}

                        else if ( (LA8_0=='\u0E22') ) {s = 7;}

                        else if ( (LA8_0=='\u0E47') ) {s = 8;}

                        else if ( (LA8_0=='\u0E4C') ) {s = 9;}

                        else if ( (LA8_0=='\u0E30') ) {s = 10;}

                        else if ( (LA8_0=='\u0E2D') ) {s = 11;}

                        else if ( (LA8_0=='\u0E36') ) {s = 12;}

                        else if ( (LA8_0=='\u0E37') ) {s = 13;}

                        else if ( (LA8_0=='\u0E34') ) {s = 14;}

                        else if ( (LA8_0=='\u0E35') ) {s = 15;}

                        else if ( (LA8_0=='\u0E32') ) {s = 16;}

                        else if ( (LA8_0=='\u0E33') ) {s = 17;}

                        else if ( (LA8_0=='\u0E31') ) {s = 18;}

                        else if ( (LA8_0=='\u0E38') ) {s = 19;}

                        else if ( (LA8_0=='\u0E39') ) {s = 20;}

                        else if ( ((LA8_0>='\u0E01' && LA8_0<='\u0E21')||(LA8_0>='\u0E23' && LA8_0<='\u0E26')||(LA8_0>='\u0E28' && LA8_0<='\u0E2C')||LA8_0=='\u0E2E') ) {s = 21;}

                        else if ( ((LA8_0>='\u0E48' && LA8_0<='\u0E4B')) ) {s = 22;}

                        else if ( (LA8_0=='<') ) {s = 23;}

                        else if ( (LA8_0=='\n'||LA8_0=='\r') ) {s = 24;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<=';')||(LA8_0>='=' && LA8_0<='\u0E00')||LA8_0=='\u0E2F'||(LA8_0>='\u0E3A' && LA8_0<='\u0E3F')||(LA8_0>='\u0E45' && LA8_0<='\u0E46')||(LA8_0>='\u0E4D' && LA8_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}