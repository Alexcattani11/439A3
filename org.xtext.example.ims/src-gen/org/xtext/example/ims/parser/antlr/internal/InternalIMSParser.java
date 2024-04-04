package org.xtext.example.ims.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.ims.services.IMSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIMSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'If'", "'('", "')'", "'then'", "'for'", "','", "'hour'", "'F'", "'P'", "'forecast'", "'='", "'to'", "'%'", "'.moisture'", "'LOW'", "'MEDIUM'", "'HIGH'", "'AND'", "'OR'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIMSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIMSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIMSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIMS.g"; }



     	private IMSGrammarAccess grammarAccess;

        public InternalIMSParser(TokenStream input, IMSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IMS";
       	}

       	@Override
       	protected IMSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIMS"
    // InternalIMS.g:65:1: entryRuleIMS returns [EObject current=null] : iv_ruleIMS= ruleIMS EOF ;
    public final EObject entryRuleIMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMS = null;


        try {
            // InternalIMS.g:65:44: (iv_ruleIMS= ruleIMS EOF )
            // InternalIMS.g:66:2: iv_ruleIMS= ruleIMS EOF
            {
             newCompositeNode(grammarAccess.getIMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMS=ruleIMS();

            state._fsp--;

             current =iv_ruleIMS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMS"


    // $ANTLR start "ruleIMS"
    // InternalIMS.g:72:1: ruleIMS returns [EObject current=null] : ( ( (lv_irrigationRules_0_0= ruleIrrigationRule ) )* ( (lv_expressions_1_0= ruleExpression ) )* ( (lv_fields_2_0= ruleField ) )* ) ;
    public final EObject ruleIMS() throws RecognitionException {
        EObject current = null;

        EObject lv_irrigationRules_0_0 = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:78:2: ( ( ( (lv_irrigationRules_0_0= ruleIrrigationRule ) )* ( (lv_expressions_1_0= ruleExpression ) )* ( (lv_fields_2_0= ruleField ) )* ) )
            // InternalIMS.g:79:2: ( ( (lv_irrigationRules_0_0= ruleIrrigationRule ) )* ( (lv_expressions_1_0= ruleExpression ) )* ( (lv_fields_2_0= ruleField ) )* )
            {
            // InternalIMS.g:79:2: ( ( (lv_irrigationRules_0_0= ruleIrrigationRule ) )* ( (lv_expressions_1_0= ruleExpression ) )* ( (lv_fields_2_0= ruleField ) )* )
            // InternalIMS.g:80:3: ( (lv_irrigationRules_0_0= ruleIrrigationRule ) )* ( (lv_expressions_1_0= ruleExpression ) )* ( (lv_fields_2_0= ruleField ) )*
            {
            // InternalIMS.g:80:3: ( (lv_irrigationRules_0_0= ruleIrrigationRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIMS.g:81:4: (lv_irrigationRules_0_0= ruleIrrigationRule )
            	    {
            	    // InternalIMS.g:81:4: (lv_irrigationRules_0_0= ruleIrrigationRule )
            	    // InternalIMS.g:82:5: lv_irrigationRules_0_0= ruleIrrigationRule
            	    {

            	    					newCompositeNode(grammarAccess.getIMSAccess().getIrrigationRulesIrrigationRuleParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_irrigationRules_0_0=ruleIrrigationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"irrigationRules",
            	    						lv_irrigationRules_0_0,
            	    						"org.xtext.example.ims.IMS.IrrigationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIMS.g:99:3: ( (lv_expressions_1_0= ruleExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIMS.g:100:4: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalIMS.g:100:4: (lv_expressions_1_0= ruleExpression )
            	    // InternalIMS.g:101:5: lv_expressions_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getIMSAccess().getExpressionsExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_expressions_1_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_1_0,
            	    						"org.xtext.example.ims.IMS.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalIMS.g:118:3: ( (lv_fields_2_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIMS.g:119:4: (lv_fields_2_0= ruleField )
            	    {
            	    // InternalIMS.g:119:4: (lv_fields_2_0= ruleField )
            	    // InternalIMS.g:120:5: lv_fields_2_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getIMSAccess().getFieldsFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_fields_2_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_2_0,
            	    						"org.xtext.example.ims.IMS.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMS"


    // $ANTLR start "entryRuleIrrigationRule"
    // InternalIMS.g:141:1: entryRuleIrrigationRule returns [EObject current=null] : iv_ruleIrrigationRule= ruleIrrigationRule EOF ;
    public final EObject entryRuleIrrigationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIrrigationRule = null;


        try {
            // InternalIMS.g:141:55: (iv_ruleIrrigationRule= ruleIrrigationRule EOF )
            // InternalIMS.g:142:2: iv_ruleIrrigationRule= ruleIrrigationRule EOF
            {
             newCompositeNode(grammarAccess.getIrrigationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIrrigationRule=ruleIrrigationRule();

            state._fsp--;

             current =iv_ruleIrrigationRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIrrigationRule"


    // $ANTLR start "ruleIrrigationRule"
    // InternalIMS.g:148:1: ruleIrrigationRule returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_setting_5_0= ruleWaterSetting ) ) otherlv_6= 'for' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )+ otherlv_10= 'for' ( (lv_duration_11_0= RULE_INT ) ) otherlv_12= 'hour' ) ;
    public final EObject ruleIrrigationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_duration_11_0=null;
        Token otherlv_12=null;
        EObject lv_expression_2_0 = null;

        Enumerator lv_setting_5_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:154:2: ( (otherlv_0= 'If' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_setting_5_0= ruleWaterSetting ) ) otherlv_6= 'for' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )+ otherlv_10= 'for' ( (lv_duration_11_0= RULE_INT ) ) otherlv_12= 'hour' ) )
            // InternalIMS.g:155:2: (otherlv_0= 'If' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_setting_5_0= ruleWaterSetting ) ) otherlv_6= 'for' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )+ otherlv_10= 'for' ( (lv_duration_11_0= RULE_INT ) ) otherlv_12= 'hour' )
            {
            // InternalIMS.g:155:2: (otherlv_0= 'If' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_setting_5_0= ruleWaterSetting ) ) otherlv_6= 'for' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )+ otherlv_10= 'for' ( (lv_duration_11_0= RULE_INT ) ) otherlv_12= 'hour' )
            // InternalIMS.g:156:3: otherlv_0= 'If' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_setting_5_0= ruleWaterSetting ) ) otherlv_6= 'for' ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )+ otherlv_10= 'for' ( (lv_duration_11_0= RULE_INT ) ) otherlv_12= 'hour'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIrrigationRuleAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getIrrigationRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIMS.g:164:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalIMS.g:165:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalIMS.g:165:4: (lv_expression_2_0= ruleExpression )
            // InternalIMS.g:166:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIrrigationRuleAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIrrigationRuleRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.ims.IMS.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIrrigationRuleAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIrrigationRuleAccess().getThenKeyword_4());
            		
            // InternalIMS.g:191:3: ( (lv_setting_5_0= ruleWaterSetting ) )
            // InternalIMS.g:192:4: (lv_setting_5_0= ruleWaterSetting )
            {
            // InternalIMS.g:192:4: (lv_setting_5_0= ruleWaterSetting )
            // InternalIMS.g:193:5: lv_setting_5_0= ruleWaterSetting
            {

            					newCompositeNode(grammarAccess.getIrrigationRuleAccess().getSettingWaterSettingEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_setting_5_0=ruleWaterSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIrrigationRuleRule());
            					}
            					set(
            						current,
            						"setting",
            						lv_setting_5_0,
            						"org.xtext.example.ims.IMS.WaterSetting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getIrrigationRuleAccess().getForKeyword_6());
            		
            // InternalIMS.g:214:3: ( ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIMS.g:215:4: ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            	    {
            	    // InternalIMS.g:215:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalIMS.g:216:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalIMS.g:216:5: (otherlv_7= RULE_ID )
            	    // InternalIMS.g:217:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIrrigationRuleRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_7, grammarAccess.getIrrigationRuleAccess().getPumpsPumpCrossReference_7_0_0());
            	    					

            	    }


            	    }

            	    // InternalIMS.g:228:4: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==16) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalIMS.g:229:5: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,16,FOLLOW_12); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getIrrigationRuleAccess().getCommaKeyword_7_1_0());
            	    	    				
            	    	    // InternalIMS.g:233:5: ( (otherlv_9= RULE_ID ) )
            	    	    // InternalIMS.g:234:6: (otherlv_9= RULE_ID )
            	    	    {
            	    	    // InternalIMS.g:234:6: (otherlv_9= RULE_ID )
            	    	    // InternalIMS.g:235:7: otherlv_9= RULE_ID
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getIrrigationRuleRule());
            	    	    							}
            	    	    						
            	    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    	    							newLeafNode(otherlv_9, grammarAccess.getIrrigationRuleAccess().getPumpsPumpCrossReference_7_1_1_0());
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


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

            otherlv_10=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getIrrigationRuleAccess().getForKeyword_8());
            		
            // InternalIMS.g:252:3: ( (lv_duration_11_0= RULE_INT ) )
            // InternalIMS.g:253:4: (lv_duration_11_0= RULE_INT )
            {
            // InternalIMS.g:253:4: (lv_duration_11_0= RULE_INT )
            // InternalIMS.g:254:5: lv_duration_11_0= RULE_INT
            {
            lv_duration_11_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_duration_11_0, grammarAccess.getIrrigationRuleAccess().getDurationINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIrrigationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getIrrigationRuleAccess().getHourKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIrrigationRule"


    // $ANTLR start "entryRuleExpression"
    // InternalIMS.g:278:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIMS.g:278:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIMS.g:279:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalIMS.g:285:1: ruleExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        EObject this_CompoundExpression_1 = null;



        	enterRule();

        try {
            // InternalIMS.g:291:2: ( (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression ) )
            // InternalIMS.g:292:2: (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression )
            {
            // InternalIMS.g:292:2: (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIMS.g:293:3: this_AtomicExpression_0= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAtomicExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_0=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIMS.g:302:3: this_CompoundExpression_1= ruleCompoundExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCompoundExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundExpression_1=ruleCompoundExpression();

                    state._fsp--;


                    			current = this_CompoundExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleField"
    // InternalIMS.g:314:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalIMS.g:314:46: (iv_ruleField= ruleField EOF )
            // InternalIMS.g:315:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalIMS.g:321:1: ruleField returns [EObject current=null] : (otherlv_0= 'F' ( (lv_assetNumber_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_assetNumber_1_0=null;
        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:327:2: ( (otherlv_0= 'F' ( (lv_assetNumber_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* ) )
            // InternalIMS.g:328:2: (otherlv_0= 'F' ( (lv_assetNumber_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* )
            {
            // InternalIMS.g:328:2: (otherlv_0= 'F' ( (lv_assetNumber_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* )
            // InternalIMS.g:329:3: otherlv_0= 'F' ( (lv_assetNumber_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFKeyword_0());
            		
            // InternalIMS.g:333:3: ( (lv_assetNumber_1_0= RULE_ID ) )
            // InternalIMS.g:334:4: (lv_assetNumber_1_0= RULE_ID )
            {
            // InternalIMS.g:334:4: (lv_assetNumber_1_0= RULE_ID )
            // InternalIMS.g:335:5: lv_assetNumber_1_0= RULE_ID
            {
            lv_assetNumber_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_assetNumber_1_0, grammarAccess.getFieldAccess().getAssetNumberIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assetNumber",
            						lv_assetNumber_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIMS.g:351:3: ( (lv_sections_2_0= ruleSection ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIMS.g:352:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalIMS.g:352:4: (lv_sections_2_0= ruleSection )
            	    // InternalIMS.g:353:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getFieldAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"org.xtext.example.ims.IMS.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleSection"
    // InternalIMS.g:374:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalIMS.g:374:48: (iv_ruleSection= ruleSection EOF )
            // InternalIMS.g:375:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalIMS.g:381:1: ruleSection returns [EObject current=null] : ( ( (lv_assetNumber_0_0= RULE_ID ) ) ( (lv_pumps_1_0= rulePump ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_assetNumber_0_0=null;
        EObject lv_pumps_1_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:387:2: ( ( ( (lv_assetNumber_0_0= RULE_ID ) ) ( (lv_pumps_1_0= rulePump ) )* ) )
            // InternalIMS.g:388:2: ( ( (lv_assetNumber_0_0= RULE_ID ) ) ( (lv_pumps_1_0= rulePump ) )* )
            {
            // InternalIMS.g:388:2: ( ( (lv_assetNumber_0_0= RULE_ID ) ) ( (lv_pumps_1_0= rulePump ) )* )
            // InternalIMS.g:389:3: ( (lv_assetNumber_0_0= RULE_ID ) ) ( (lv_pumps_1_0= rulePump ) )*
            {
            // InternalIMS.g:389:3: ( (lv_assetNumber_0_0= RULE_ID ) )
            // InternalIMS.g:390:4: (lv_assetNumber_0_0= RULE_ID )
            {
            // InternalIMS.g:390:4: (lv_assetNumber_0_0= RULE_ID )
            // InternalIMS.g:391:5: lv_assetNumber_0_0= RULE_ID
            {
            lv_assetNumber_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_assetNumber_0_0, grammarAccess.getSectionAccess().getAssetNumberIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assetNumber",
            						lv_assetNumber_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIMS.g:407:3: ( (lv_pumps_1_0= rulePump ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIMS.g:408:4: (lv_pumps_1_0= rulePump )
            	    {
            	    // InternalIMS.g:408:4: (lv_pumps_1_0= rulePump )
            	    // InternalIMS.g:409:5: lv_pumps_1_0= rulePump
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getPumpsPumpParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_pumps_1_0=rulePump();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pumps",
            	    						lv_pumps_1_0,
            	    						"org.xtext.example.ims.IMS.Pump");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRulePump"
    // InternalIMS.g:430:1: entryRulePump returns [EObject current=null] : iv_rulePump= rulePump EOF ;
    public final EObject entryRulePump() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePump = null;


        try {
            // InternalIMS.g:430:45: (iv_rulePump= rulePump EOF )
            // InternalIMS.g:431:2: iv_rulePump= rulePump EOF
            {
             newCompositeNode(grammarAccess.getPumpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePump=rulePump();

            state._fsp--;

             current =iv_rulePump; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePump"


    // $ANTLR start "rulePump"
    // InternalIMS.g:437:1: rulePump returns [EObject current=null] : (otherlv_0= 'P' ( (lv_assetNumber_1_0= RULE_ID ) ) ) ;
    public final EObject rulePump() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_assetNumber_1_0=null;


        	enterRule();

        try {
            // InternalIMS.g:443:2: ( (otherlv_0= 'P' ( (lv_assetNumber_1_0= RULE_ID ) ) ) )
            // InternalIMS.g:444:2: (otherlv_0= 'P' ( (lv_assetNumber_1_0= RULE_ID ) ) )
            {
            // InternalIMS.g:444:2: (otherlv_0= 'P' ( (lv_assetNumber_1_0= RULE_ID ) ) )
            // InternalIMS.g:445:3: otherlv_0= 'P' ( (lv_assetNumber_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPumpAccess().getPKeyword_0());
            		
            // InternalIMS.g:449:3: ( (lv_assetNumber_1_0= RULE_ID ) )
            // InternalIMS.g:450:4: (lv_assetNumber_1_0= RULE_ID )
            {
            // InternalIMS.g:450:4: (lv_assetNumber_1_0= RULE_ID )
            // InternalIMS.g:451:5: lv_assetNumber_1_0= RULE_ID
            {
            lv_assetNumber_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_assetNumber_1_0, grammarAccess.getPumpAccess().getAssetNumberIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPumpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assetNumber",
            						lv_assetNumber_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePump"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalIMS.g:471:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalIMS.g:471:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalIMS.g:472:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalIMS.g:478:1: ruleAtomicExpression returns [EObject current=null] : (otherlv_0= 'forecast' otherlv_1= '=' ( (lv_forecastLowerBound_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_forecastUpperBound_4_0= RULE_INT ) ) otherlv_5= '%' otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.moisture' otherlv_9= '=' ( (lv_moistureLowerBound_10_0= RULE_INT ) ) otherlv_11= 'to' ( (lv_moistureUpperBound_12_0= RULE_INT ) ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_forecastLowerBound_2_0=null;
        Token otherlv_3=null;
        Token lv_forecastUpperBound_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_moistureLowerBound_10_0=null;
        Token otherlv_11=null;
        Token lv_moistureUpperBound_12_0=null;


        	enterRule();

        try {
            // InternalIMS.g:484:2: ( (otherlv_0= 'forecast' otherlv_1= '=' ( (lv_forecastLowerBound_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_forecastUpperBound_4_0= RULE_INT ) ) otherlv_5= '%' otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.moisture' otherlv_9= '=' ( (lv_moistureLowerBound_10_0= RULE_INT ) ) otherlv_11= 'to' ( (lv_moistureUpperBound_12_0= RULE_INT ) ) ) )
            // InternalIMS.g:485:2: (otherlv_0= 'forecast' otherlv_1= '=' ( (lv_forecastLowerBound_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_forecastUpperBound_4_0= RULE_INT ) ) otherlv_5= '%' otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.moisture' otherlv_9= '=' ( (lv_moistureLowerBound_10_0= RULE_INT ) ) otherlv_11= 'to' ( (lv_moistureUpperBound_12_0= RULE_INT ) ) )
            {
            // InternalIMS.g:485:2: (otherlv_0= 'forecast' otherlv_1= '=' ( (lv_forecastLowerBound_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_forecastUpperBound_4_0= RULE_INT ) ) otherlv_5= '%' otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.moisture' otherlv_9= '=' ( (lv_moistureLowerBound_10_0= RULE_INT ) ) otherlv_11= 'to' ( (lv_moistureUpperBound_12_0= RULE_INT ) ) )
            // InternalIMS.g:486:3: otherlv_0= 'forecast' otherlv_1= '=' ( (lv_forecastLowerBound_2_0= RULE_INT ) ) otherlv_3= 'to' ( (lv_forecastUpperBound_4_0= RULE_INT ) ) otherlv_5= '%' otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.moisture' otherlv_9= '=' ( (lv_moistureLowerBound_10_0= RULE_INT ) ) otherlv_11= 'to' ( (lv_moistureUpperBound_12_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicExpressionAccess().getForecastKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicExpressionAccess().getEqualsSignKeyword_1());
            		
            // InternalIMS.g:494:3: ( (lv_forecastLowerBound_2_0= RULE_INT ) )
            // InternalIMS.g:495:4: (lv_forecastLowerBound_2_0= RULE_INT )
            {
            // InternalIMS.g:495:4: (lv_forecastLowerBound_2_0= RULE_INT )
            // InternalIMS.g:496:5: lv_forecastLowerBound_2_0= RULE_INT
            {
            lv_forecastLowerBound_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_forecastLowerBound_2_0, grammarAccess.getAtomicExpressionAccess().getForecastLowerBoundINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forecastLowerBound",
            						lv_forecastLowerBound_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicExpressionAccess().getToKeyword_3());
            		
            // InternalIMS.g:516:3: ( (lv_forecastUpperBound_4_0= RULE_INT ) )
            // InternalIMS.g:517:4: (lv_forecastUpperBound_4_0= RULE_INT )
            {
            // InternalIMS.g:517:4: (lv_forecastUpperBound_4_0= RULE_INT )
            // InternalIMS.g:518:5: lv_forecastUpperBound_4_0= RULE_INT
            {
            lv_forecastUpperBound_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_forecastUpperBound_4_0, grammarAccess.getAtomicExpressionAccess().getForecastUpperBoundINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forecastUpperBound",
            						lv_forecastUpperBound_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getAtomicExpressionAccess().getPercentSignKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getAtomicExpressionAccess().getCommaKeyword_6());
            		
            // InternalIMS.g:542:3: ( (otherlv_7= RULE_ID ) )
            // InternalIMS.g:543:4: (otherlv_7= RULE_ID )
            {
            // InternalIMS.g:543:4: (otherlv_7= RULE_ID )
            // InternalIMS.g:544:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_7, grammarAccess.getAtomicExpressionAccess().getFieldFieldCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getAtomicExpressionAccess().getMoistureKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getAtomicExpressionAccess().getEqualsSignKeyword_9());
            		
            // InternalIMS.g:563:3: ( (lv_moistureLowerBound_10_0= RULE_INT ) )
            // InternalIMS.g:564:4: (lv_moistureLowerBound_10_0= RULE_INT )
            {
            // InternalIMS.g:564:4: (lv_moistureLowerBound_10_0= RULE_INT )
            // InternalIMS.g:565:5: lv_moistureLowerBound_10_0= RULE_INT
            {
            lv_moistureLowerBound_10_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_moistureLowerBound_10_0, grammarAccess.getAtomicExpressionAccess().getMoistureLowerBoundINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moistureLowerBound",
            						lv_moistureLowerBound_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getAtomicExpressionAccess().getToKeyword_11());
            		
            // InternalIMS.g:585:3: ( (lv_moistureUpperBound_12_0= RULE_INT ) )
            // InternalIMS.g:586:4: (lv_moistureUpperBound_12_0= RULE_INT )
            {
            // InternalIMS.g:586:4: (lv_moistureUpperBound_12_0= RULE_INT )
            // InternalIMS.g:587:5: lv_moistureUpperBound_12_0= RULE_INT
            {
            lv_moistureUpperBound_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_moistureUpperBound_12_0, grammarAccess.getAtomicExpressionAccess().getMoistureUpperBoundINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moistureUpperBound",
            						lv_moistureUpperBound_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleCompoundExpression"
    // InternalIMS.g:607:1: entryRuleCompoundExpression returns [EObject current=null] : iv_ruleCompoundExpression= ruleCompoundExpression EOF ;
    public final EObject entryRuleCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundExpression = null;


        try {
            // InternalIMS.g:607:59: (iv_ruleCompoundExpression= ruleCompoundExpression EOF )
            // InternalIMS.g:608:2: iv_ruleCompoundExpression= ruleCompoundExpression EOF
            {
             newCompositeNode(grammarAccess.getCompoundExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundExpression=ruleCompoundExpression();

            state._fsp--;

             current =iv_ruleCompoundExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundExpression"


    // $ANTLR start "ruleCompoundExpression"
    // InternalIMS.g:614:1: ruleCompoundExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleCompoundExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_LHS_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_RHS_3_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:620:2: ( (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalIMS.g:621:2: (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalIMS.g:621:2: (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalIMS.g:622:3: otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalIMS.g:626:3: ( (lv_LHS_1_0= ruleExpression ) )
            // InternalIMS.g:627:4: (lv_LHS_1_0= ruleExpression )
            {
            // InternalIMS.g:627:4: (lv_LHS_1_0= ruleExpression )
            // InternalIMS.g:628:5: lv_LHS_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCompoundExpressionAccess().getLHSExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_LHS_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpressionRule());
            					}
            					set(
            						current,
            						"LHS",
            						lv_LHS_1_0,
            						"org.xtext.example.ims.IMS.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIMS.g:645:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalIMS.g:646:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalIMS.g:646:4: (lv_operator_2_0= ruleOperator )
            // InternalIMS.g:647:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getCompoundExpressionAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.ims.IMS.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIMS.g:664:3: ( (lv_RHS_3_0= ruleExpression ) )
            // InternalIMS.g:665:4: (lv_RHS_3_0= ruleExpression )
            {
            // InternalIMS.g:665:4: (lv_RHS_3_0= ruleExpression )
            // InternalIMS.g:666:5: lv_RHS_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCompoundExpressionAccess().getRHSExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_RHS_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundExpressionRule());
            					}
            					set(
            						current,
            						"RHS",
            						lv_RHS_3_0,
            						"org.xtext.example.ims.IMS.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCompoundExpressionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundExpression"


    // $ANTLR start "ruleWaterSetting"
    // InternalIMS.g:691:1: ruleWaterSetting returns [Enumerator current=null] : ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) ) ;
    public final Enumerator ruleWaterSetting() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIMS.g:697:2: ( ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) ) )
            // InternalIMS.g:698:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) )
            {
            // InternalIMS.g:698:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalIMS.g:699:3: (enumLiteral_0= 'LOW' )
                    {
                    // InternalIMS.g:699:3: (enumLiteral_0= 'LOW' )
                    // InternalIMS.g:700:4: enumLiteral_0= 'LOW'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWaterSettingAccess().getLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWaterSettingAccess().getLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIMS.g:707:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalIMS.g:707:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalIMS.g:708:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWaterSettingAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWaterSettingAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIMS.g:715:3: (enumLiteral_2= 'HIGH' )
                    {
                    // InternalIMS.g:715:3: (enumLiteral_2= 'HIGH' )
                    // InternalIMS.g:716:4: enumLiteral_2= 'HIGH'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWaterSettingAccess().getHIGHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWaterSettingAccess().getHIGHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaterSetting"


    // $ANTLR start "ruleOperator"
    // InternalIMS.g:726:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIMS.g:732:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalIMS.g:733:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalIMS.g:733:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIMS.g:734:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalIMS.g:734:3: (enumLiteral_0= 'AND' )
                    // InternalIMS.g:735:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIMS.g:742:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalIMS.g:742:3: (enumLiteral_1= 'OR' )
                    // InternalIMS.g:743:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000141802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000141002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030000000L});

}