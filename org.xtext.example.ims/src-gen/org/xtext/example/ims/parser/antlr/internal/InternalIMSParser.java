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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'If'", "'then'", "'for'", "','", "'hour(s)'", "'Field'", "'{'", "'}'", "'section'", "'pump'", "'('", "'forecast'", "'='", "'to'", "'%'", "'.moisture'", "')'", "'.'", "'LOW'", "'MEDIUM'", "'HIGH'", "'AND'", "'OR'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // InternalIMS.g:72:1: ruleIMS returns [EObject current=null] : ( ( (lv_fields_0_0= ruleField ) )* ( (lv_irrigationRules_1_0= ruleIrrigationRule ) )* ( (lv_expressions_2_0= ruleExpression ) )* ) ;
    public final EObject ruleIMS() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_0_0 = null;

        EObject lv_irrigationRules_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:78:2: ( ( ( (lv_fields_0_0= ruleField ) )* ( (lv_irrigationRules_1_0= ruleIrrigationRule ) )* ( (lv_expressions_2_0= ruleExpression ) )* ) )
            // InternalIMS.g:79:2: ( ( (lv_fields_0_0= ruleField ) )* ( (lv_irrigationRules_1_0= ruleIrrigationRule ) )* ( (lv_expressions_2_0= ruleExpression ) )* )
            {
            // InternalIMS.g:79:2: ( ( (lv_fields_0_0= ruleField ) )* ( (lv_irrigationRules_1_0= ruleIrrigationRule ) )* ( (lv_expressions_2_0= ruleExpression ) )* )
            // InternalIMS.g:80:3: ( (lv_fields_0_0= ruleField ) )* ( (lv_irrigationRules_1_0= ruleIrrigationRule ) )* ( (lv_expressions_2_0= ruleExpression ) )*
            {
            // InternalIMS.g:80:3: ( (lv_fields_0_0= ruleField ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIMS.g:81:4: (lv_fields_0_0= ruleField )
            	    {
            	    // InternalIMS.g:81:4: (lv_fields_0_0= ruleField )
            	    // InternalIMS.g:82:5: lv_fields_0_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getIMSAccess().getFieldsFieldParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_fields_0_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_0_0,
            	    						"org.xtext.example.ims.IMS.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIMS.g:99:3: ( (lv_irrigationRules_1_0= ruleIrrigationRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIMS.g:100:4: (lv_irrigationRules_1_0= ruleIrrigationRule )
            	    {
            	    // InternalIMS.g:100:4: (lv_irrigationRules_1_0= ruleIrrigationRule )
            	    // InternalIMS.g:101:5: lv_irrigationRules_1_0= ruleIrrigationRule
            	    {

            	    					newCompositeNode(grammarAccess.getIMSAccess().getIrrigationRulesIrrigationRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_irrigationRules_1_0=ruleIrrigationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"irrigationRules",
            	    						lv_irrigationRules_1_0,
            	    						"org.xtext.example.ims.IMS.IrrigationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalIMS.g:118:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIMS.g:119:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalIMS.g:119:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalIMS.g:120:5: lv_expressions_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getIMSAccess().getExpressionsExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIMSRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_2_0,
            	    						"org.xtext.example.ims.IMS.Expression");
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
    // InternalIMS.g:148:1: ruleIrrigationRule returns [EObject current=null] : (otherlv_0= 'If' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_setting_3_0= ruleWaterSetting ) ) otherlv_4= 'for' ( ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )* )+ otherlv_8= 'for' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= 'hour(s)' ) ;
    public final EObject ruleIrrigationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_duration_9_0=null;
        Token otherlv_10=null;
        EObject lv_expression_1_0 = null;

        Enumerator lv_setting_3_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:154:2: ( (otherlv_0= 'If' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_setting_3_0= ruleWaterSetting ) ) otherlv_4= 'for' ( ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )* )+ otherlv_8= 'for' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= 'hour(s)' ) )
            // InternalIMS.g:155:2: (otherlv_0= 'If' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_setting_3_0= ruleWaterSetting ) ) otherlv_4= 'for' ( ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )* )+ otherlv_8= 'for' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= 'hour(s)' )
            {
            // InternalIMS.g:155:2: (otherlv_0= 'If' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_setting_3_0= ruleWaterSetting ) ) otherlv_4= 'for' ( ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )* )+ otherlv_8= 'for' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= 'hour(s)' )
            // InternalIMS.g:156:3: otherlv_0= 'If' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_setting_3_0= ruleWaterSetting ) ) otherlv_4= 'for' ( ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )* )+ otherlv_8= 'for' ( (lv_duration_9_0= RULE_INT ) ) otherlv_10= 'hour(s)'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIrrigationRuleAccess().getIfKeyword_0());
            		
            // InternalIMS.g:160:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalIMS.g:161:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalIMS.g:161:4: (lv_expression_1_0= ruleExpression )
            // InternalIMS.g:162:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIrrigationRuleAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIrrigationRuleRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.ims.IMS.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getIrrigationRuleAccess().getThenKeyword_2());
            		
            // InternalIMS.g:183:3: ( (lv_setting_3_0= ruleWaterSetting ) )
            // InternalIMS.g:184:4: (lv_setting_3_0= ruleWaterSetting )
            {
            // InternalIMS.g:184:4: (lv_setting_3_0= ruleWaterSetting )
            // InternalIMS.g:185:5: lv_setting_3_0= ruleWaterSetting
            {

            					newCompositeNode(grammarAccess.getIrrigationRuleAccess().getSettingWaterSettingEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_setting_3_0=ruleWaterSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIrrigationRuleRule());
            					}
            					set(
            						current,
            						"setting",
            						lv_setting_3_0,
            						"org.xtext.example.ims.IMS.WaterSetting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIrrigationRuleAccess().getForKeyword_4());
            		
            // InternalIMS.g:206:3: ( ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )* )+
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
            	    // InternalIMS.g:207:4: ( ( ruleNumberedElementFQN ) ) (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )*
            	    {
            	    // InternalIMS.g:207:4: ( ( ruleNumberedElementFQN ) )
            	    // InternalIMS.g:208:5: ( ruleNumberedElementFQN )
            	    {
            	    // InternalIMS.g:208:5: ( ruleNumberedElementFQN )
            	    // InternalIMS.g:209:6: ruleNumberedElementFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIrrigationRuleRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getIrrigationRuleAccess().getPumpsPumpCrossReference_5_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleNumberedElementFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalIMS.g:223:4: (otherlv_6= ',' ( ( ruleNumberedElementFQN ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==14) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalIMS.g:224:5: otherlv_6= ',' ( ( ruleNumberedElementFQN ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getIrrigationRuleAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalIMS.g:228:5: ( ( ruleNumberedElementFQN ) )
            	    	    // InternalIMS.g:229:6: ( ruleNumberedElementFQN )
            	    	    {
            	    	    // InternalIMS.g:229:6: ( ruleNumberedElementFQN )
            	    	    // InternalIMS.g:230:7: ruleNumberedElementFQN
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getIrrigationRuleRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getIrrigationRuleAccess().getPumpsPumpCrossReference_5_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    ruleNumberedElementFQN();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

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

            otherlv_8=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getIrrigationRuleAccess().getForKeyword_6());
            		
            // InternalIMS.g:250:3: ( (lv_duration_9_0= RULE_INT ) )
            // InternalIMS.g:251:4: (lv_duration_9_0= RULE_INT )
            {
            // InternalIMS.g:251:4: (lv_duration_9_0= RULE_INT )
            // InternalIMS.g:252:5: lv_duration_9_0= RULE_INT
            {
            lv_duration_9_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_duration_9_0, grammarAccess.getIrrigationRuleAccess().getDurationINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIrrigationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIrrigationRuleAccess().getHourSKeyword_8());
            		

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
    // InternalIMS.g:276:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalIMS.g:276:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalIMS.g:277:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalIMS.g:283:1: ruleExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        EObject this_CompoundExpression_1 = null;



        	enterRule();

        try {
            // InternalIMS.g:289:2: ( (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression ) )
            // InternalIMS.g:290:2: (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression )
            {
            // InternalIMS.g:290:2: (this_AtomicExpression_0= ruleAtomicExpression | this_CompoundExpression_1= ruleCompoundExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==22) ) {
                    alt6=1;
                }
                else if ( (LA6_1==21) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIMS.g:291:3: this_AtomicExpression_0= ruleAtomicExpression
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
                    // InternalIMS.g:300:3: this_CompoundExpression_1= ruleCompoundExpression
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
    // InternalIMS.g:312:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalIMS.g:312:46: (iv_ruleField= ruleField EOF )
            // InternalIMS.g:313:2: iv_ruleField= ruleField EOF
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
    // InternalIMS.g:319:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* otherlv_4= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:325:2: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* otherlv_4= '}' ) )
            // InternalIMS.g:326:2: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* otherlv_4= '}' )
            {
            // InternalIMS.g:326:2: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* otherlv_4= '}' )
            // InternalIMS.g:327:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSection ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalIMS.g:331:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIMS.g:332:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIMS.g:332:4: (lv_name_1_0= RULE_ID )
            // InternalIMS.g:333:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIMS.g:353:3: ( (lv_sections_3_0= ruleSection ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIMS.g:354:4: (lv_sections_3_0= ruleSection )
            	    {
            	    // InternalIMS.g:354:4: (lv_sections_3_0= ruleSection )
            	    // InternalIMS.g:355:5: lv_sections_3_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getFieldAccess().getSectionsSectionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_sections_3_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_3_0,
            	    						"org.xtext.example.ims.IMS.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalIMS.g:380:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalIMS.g:380:48: (iv_ruleSection= ruleSection EOF )
            // InternalIMS.g:381:2: iv_ruleSection= ruleSection EOF
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
    // InternalIMS.g:387:1: ruleSection returns [EObject current=null] : (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pumps_3_0= rulePump ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pumps_3_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:393:2: ( (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pumps_3_0= rulePump ) )+ otherlv_4= '}' ) )
            // InternalIMS.g:394:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pumps_3_0= rulePump ) )+ otherlv_4= '}' )
            {
            // InternalIMS.g:394:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pumps_3_0= rulePump ) )+ otherlv_4= '}' )
            // InternalIMS.g:395:3: otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pumps_3_0= rulePump ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalIMS.g:399:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIMS.g:400:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIMS.g:400:4: (lv_name_1_0= RULE_ID )
            // InternalIMS.g:401:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIMS.g:421:3: ( (lv_pumps_3_0= rulePump ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIMS.g:422:4: (lv_pumps_3_0= rulePump )
            	    {
            	    // InternalIMS.g:422:4: (lv_pumps_3_0= rulePump )
            	    // InternalIMS.g:423:5: lv_pumps_3_0= rulePump
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getPumpsPumpParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_pumps_3_0=rulePump();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pumps",
            	    						lv_pumps_3_0,
            	    						"org.xtext.example.ims.IMS.Pump");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalIMS.g:448:1: entryRulePump returns [EObject current=null] : iv_rulePump= rulePump EOF ;
    public final EObject entryRulePump() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePump = null;


        try {
            // InternalIMS.g:448:45: (iv_rulePump= rulePump EOF )
            // InternalIMS.g:449:2: iv_rulePump= rulePump EOF
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
    // InternalIMS.g:455:1: rulePump returns [EObject current=null] : (otherlv_0= 'pump' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePump() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIMS.g:461:2: ( (otherlv_0= 'pump' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIMS.g:462:2: (otherlv_0= 'pump' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIMS.g:462:2: (otherlv_0= 'pump' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIMS.g:463:3: otherlv_0= 'pump' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPumpAccess().getPumpKeyword_0());
            		
            // InternalIMS.g:467:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIMS.g:468:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIMS.g:468:4: (lv_name_1_0= RULE_ID )
            // InternalIMS.g:469:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPumpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPumpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // InternalIMS.g:489:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalIMS.g:489:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalIMS.g:490:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalIMS.g:496:1: ruleAtomicExpression returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'forecast' otherlv_2= '=' ( (lv_forecastLowerBound_3_0= RULE_INT ) ) otherlv_4= 'to' ( (lv_forecastUpperBound_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.moisture' otherlv_10= '=' ( (lv_moistureLowerBound_11_0= RULE_INT ) ) otherlv_12= 'to' ( (lv_moistureUpperBound_13_0= RULE_INT ) ) otherlv_14= ')' ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_forecastLowerBound_3_0=null;
        Token otherlv_4=null;
        Token lv_forecastUpperBound_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_moistureLowerBound_11_0=null;
        Token otherlv_12=null;
        Token lv_moistureUpperBound_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalIMS.g:502:2: ( (otherlv_0= '(' otherlv_1= 'forecast' otherlv_2= '=' ( (lv_forecastLowerBound_3_0= RULE_INT ) ) otherlv_4= 'to' ( (lv_forecastUpperBound_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.moisture' otherlv_10= '=' ( (lv_moistureLowerBound_11_0= RULE_INT ) ) otherlv_12= 'to' ( (lv_moistureUpperBound_13_0= RULE_INT ) ) otherlv_14= ')' ) )
            // InternalIMS.g:503:2: (otherlv_0= '(' otherlv_1= 'forecast' otherlv_2= '=' ( (lv_forecastLowerBound_3_0= RULE_INT ) ) otherlv_4= 'to' ( (lv_forecastUpperBound_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.moisture' otherlv_10= '=' ( (lv_moistureLowerBound_11_0= RULE_INT ) ) otherlv_12= 'to' ( (lv_moistureUpperBound_13_0= RULE_INT ) ) otherlv_14= ')' )
            {
            // InternalIMS.g:503:2: (otherlv_0= '(' otherlv_1= 'forecast' otherlv_2= '=' ( (lv_forecastLowerBound_3_0= RULE_INT ) ) otherlv_4= 'to' ( (lv_forecastUpperBound_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.moisture' otherlv_10= '=' ( (lv_moistureLowerBound_11_0= RULE_INT ) ) otherlv_12= 'to' ( (lv_moistureUpperBound_13_0= RULE_INT ) ) otherlv_14= ')' )
            // InternalIMS.g:504:3: otherlv_0= '(' otherlv_1= 'forecast' otherlv_2= '=' ( (lv_forecastLowerBound_3_0= RULE_INT ) ) otherlv_4= 'to' ( (lv_forecastUpperBound_5_0= RULE_INT ) ) otherlv_6= '%' otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.moisture' otherlv_10= '=' ( (lv_moistureLowerBound_11_0= RULE_INT ) ) otherlv_12= 'to' ( (lv_moistureUpperBound_13_0= RULE_INT ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicExpressionAccess().getForecastKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getEqualsSignKeyword_2());
            		
            // InternalIMS.g:516:3: ( (lv_forecastLowerBound_3_0= RULE_INT ) )
            // InternalIMS.g:517:4: (lv_forecastLowerBound_3_0= RULE_INT )
            {
            // InternalIMS.g:517:4: (lv_forecastLowerBound_3_0= RULE_INT )
            // InternalIMS.g:518:5: lv_forecastLowerBound_3_0= RULE_INT
            {
            lv_forecastLowerBound_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_forecastLowerBound_3_0, grammarAccess.getAtomicExpressionAccess().getForecastLowerBoundINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forecastLowerBound",
            						lv_forecastLowerBound_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getToKeyword_4());
            		
            // InternalIMS.g:538:3: ( (lv_forecastUpperBound_5_0= RULE_INT ) )
            // InternalIMS.g:539:4: (lv_forecastUpperBound_5_0= RULE_INT )
            {
            // InternalIMS.g:539:4: (lv_forecastUpperBound_5_0= RULE_INT )
            // InternalIMS.g:540:5: lv_forecastUpperBound_5_0= RULE_INT
            {
            lv_forecastUpperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_forecastUpperBound_5_0, grammarAccess.getAtomicExpressionAccess().getForecastUpperBoundINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forecastUpperBound",
            						lv_forecastUpperBound_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getAtomicExpressionAccess().getPercentSignKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getAtomicExpressionAccess().getCommaKeyword_7());
            		
            // InternalIMS.g:564:3: ( (otherlv_8= RULE_ID ) )
            // InternalIMS.g:565:4: (otherlv_8= RULE_ID )
            {
            // InternalIMS.g:565:4: (otherlv_8= RULE_ID )
            // InternalIMS.g:566:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_8, grammarAccess.getAtomicExpressionAccess().getFieldFieldCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getAtomicExpressionAccess().getMoistureKeyword_9());
            		
            otherlv_10=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getAtomicExpressionAccess().getEqualsSignKeyword_10());
            		
            // InternalIMS.g:585:3: ( (lv_moistureLowerBound_11_0= RULE_INT ) )
            // InternalIMS.g:586:4: (lv_moistureLowerBound_11_0= RULE_INT )
            {
            // InternalIMS.g:586:4: (lv_moistureLowerBound_11_0= RULE_INT )
            // InternalIMS.g:587:5: lv_moistureLowerBound_11_0= RULE_INT
            {
            lv_moistureLowerBound_11_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_moistureLowerBound_11_0, grammarAccess.getAtomicExpressionAccess().getMoistureLowerBoundINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moistureLowerBound",
            						lv_moistureLowerBound_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getAtomicExpressionAccess().getToKeyword_12());
            		
            // InternalIMS.g:607:3: ( (lv_moistureUpperBound_13_0= RULE_INT ) )
            // InternalIMS.g:608:4: (lv_moistureUpperBound_13_0= RULE_INT )
            {
            // InternalIMS.g:608:4: (lv_moistureUpperBound_13_0= RULE_INT )
            // InternalIMS.g:609:5: lv_moistureUpperBound_13_0= RULE_INT
            {
            lv_moistureUpperBound_13_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_moistureUpperBound_13_0, grammarAccess.getAtomicExpressionAccess().getMoistureUpperBoundINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moistureUpperBound",
            						lv_moistureUpperBound_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_14());
            		

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
    // InternalIMS.g:633:1: entryRuleCompoundExpression returns [EObject current=null] : iv_ruleCompoundExpression= ruleCompoundExpression EOF ;
    public final EObject entryRuleCompoundExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundExpression = null;


        try {
            // InternalIMS.g:633:59: (iv_ruleCompoundExpression= ruleCompoundExpression EOF )
            // InternalIMS.g:634:2: iv_ruleCompoundExpression= ruleCompoundExpression EOF
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
    // InternalIMS.g:640:1: ruleCompoundExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleCompoundExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_LHS_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_RHS_3_0 = null;



        	enterRule();

        try {
            // InternalIMS.g:646:2: ( (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalIMS.g:647:2: (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalIMS.g:647:2: (otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalIMS.g:648:3: otherlv_0= '(' ( (lv_LHS_1_0= ruleExpression ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_RHS_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalIMS.g:652:3: ( (lv_LHS_1_0= ruleExpression ) )
            // InternalIMS.g:653:4: (lv_LHS_1_0= ruleExpression )
            {
            // InternalIMS.g:653:4: (lv_LHS_1_0= ruleExpression )
            // InternalIMS.g:654:5: lv_LHS_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCompoundExpressionAccess().getLHSExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalIMS.g:671:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalIMS.g:672:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalIMS.g:672:4: (lv_operator_2_0= ruleOperator )
            // InternalIMS.g:673:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getCompoundExpressionAccess().getOperatorOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalIMS.g:690:3: ( (lv_RHS_3_0= ruleExpression ) )
            // InternalIMS.g:691:4: (lv_RHS_3_0= ruleExpression )
            {
            // InternalIMS.g:691:4: (lv_RHS_3_0= ruleExpression )
            // InternalIMS.g:692:5: lv_RHS_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCompoundExpressionAccess().getRHSExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNumberedElementFQN"
    // InternalIMS.g:717:1: entryRuleNumberedElementFQN returns [String current=null] : iv_ruleNumberedElementFQN= ruleNumberedElementFQN EOF ;
    public final String entryRuleNumberedElementFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberedElementFQN = null;


        try {
            // InternalIMS.g:717:58: (iv_ruleNumberedElementFQN= ruleNumberedElementFQN EOF )
            // InternalIMS.g:718:2: iv_ruleNumberedElementFQN= ruleNumberedElementFQN EOF
            {
             newCompositeNode(grammarAccess.getNumberedElementFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberedElementFQN=ruleNumberedElementFQN();

            state._fsp--;

             current =iv_ruleNumberedElementFQN.getText(); 
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
    // $ANTLR end "entryRuleNumberedElementFQN"


    // $ANTLR start "ruleNumberedElementFQN"
    // InternalIMS.g:724:1: ruleNumberedElementFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNumberedElementFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIMS.g:730:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIMS.g:731:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIMS.g:731:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIMS.g:732:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNumberedElementFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalIMS.g:739:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIMS.g:740:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNumberedElementFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getNumberedElementFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleNumberedElementFQN"


    // $ANTLR start "ruleWaterSetting"
    // InternalIMS.g:757:1: ruleWaterSetting returns [Enumerator current=null] : ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) ) ;
    public final Enumerator ruleWaterSetting() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIMS.g:763:2: ( ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) ) )
            // InternalIMS.g:764:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) )
            {
            // InternalIMS.g:764:2: ( (enumLiteral_0= 'LOW' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'HIGH' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalIMS.g:765:3: (enumLiteral_0= 'LOW' )
                    {
                    // InternalIMS.g:765:3: (enumLiteral_0= 'LOW' )
                    // InternalIMS.g:766:4: enumLiteral_0= 'LOW'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getWaterSettingAccess().getLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWaterSettingAccess().getLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIMS.g:773:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalIMS.g:773:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalIMS.g:774:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getWaterSettingAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWaterSettingAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIMS.g:781:3: (enumLiteral_2= 'HIGH' )
                    {
                    // InternalIMS.g:781:3: (enumLiteral_2= 'HIGH' )
                    // InternalIMS.g:782:4: enumLiteral_2= 'HIGH'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

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
    // InternalIMS.g:792:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIMS.g:798:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalIMS.g:799:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalIMS.g:799:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIMS.g:800:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalIMS.g:800:3: (enumLiteral_0= 'AND' )
                    // InternalIMS.g:801:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIMS.g:808:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalIMS.g:808:3: (enumLiteral_1= 'OR' )
                    // InternalIMS.g:809:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000210802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000002L});

}