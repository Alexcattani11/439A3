/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.ims.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.ims.iMS.AtomicExpression;
import org.xtext.example.ims.iMS.CompoundExpression;
import org.xtext.example.ims.iMS.Field;
import org.xtext.example.ims.iMS.IMS;
import org.xtext.example.ims.iMS.IMSPackage;
import org.xtext.example.ims.iMS.IrrigationRule;
import org.xtext.example.ims.iMS.Pump;
import org.xtext.example.ims.iMS.Section;
import org.xtext.example.ims.services.IMSGrammarAccess;

@SuppressWarnings("all")
public class IMSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IMSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IMSPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IMSPackage.ATOMIC_EXPRESSION:
				sequence_AtomicExpression(context, (AtomicExpression) semanticObject); 
				return; 
			case IMSPackage.COMPOUND_EXPRESSION:
				sequence_CompoundExpression(context, (CompoundExpression) semanticObject); 
				return; 
			case IMSPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case IMSPackage.IMS:
				sequence_IMS(context, (IMS) semanticObject); 
				return; 
			case IMSPackage.IRRIGATION_RULE:
				sequence_IrrigationRule(context, (IrrigationRule) semanticObject); 
				return; 
			case IMSPackage.PUMP:
				sequence_Pump(context, (Pump) semanticObject); 
				return; 
			case IMSPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns AtomicExpression
	 *     AtomicExpression returns AtomicExpression
	 *
	 * Constraint:
	 *     (forecastLowerBound=INT forecastUpperBound=INT field=[Field|ID] moistureLowerBound=INT moistureUpperBound=INT)
	 * </pre>
	 */
	protected void sequence_AtomicExpression(ISerializationContext context, AtomicExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__FORECAST_LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__FORECAST_LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__FORECAST_UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__FORECAST_UPPER_BOUND));
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__FIELD));
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__MOISTURE_LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__MOISTURE_LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__MOISTURE_UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.ATOMIC_EXPRESSION__MOISTURE_UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExpressionAccess().getForecastLowerBoundINTTerminalRuleCall_2_0(), semanticObject.getForecastLowerBound());
		feeder.accept(grammarAccess.getAtomicExpressionAccess().getForecastUpperBoundINTTerminalRuleCall_4_0(), semanticObject.getForecastUpperBound());
		feeder.accept(grammarAccess.getAtomicExpressionAccess().getFieldFieldIDTerminalRuleCall_7_0_1(), semanticObject.eGet(IMSPackage.Literals.ATOMIC_EXPRESSION__FIELD, false));
		feeder.accept(grammarAccess.getAtomicExpressionAccess().getMoistureLowerBoundINTTerminalRuleCall_10_0(), semanticObject.getMoistureLowerBound());
		feeder.accept(grammarAccess.getAtomicExpressionAccess().getMoistureUpperBoundINTTerminalRuleCall_12_0(), semanticObject.getMoistureUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns CompoundExpression
	 *     CompoundExpression returns CompoundExpression
	 *
	 * Constraint:
	 *     (LHS=Expression operator=Operator RHS=Expression)
	 * </pre>
	 */
	protected void sequence_CompoundExpression(ISerializationContext context, CompoundExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.COMPOUND_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.COMPOUND_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.COMPOUND_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.COMPOUND_EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.COMPOUND_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.COMPOUND_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompoundExpressionAccess().getLHSExpressionParserRuleCall_1_0(), semanticObject.getLHS());
		feeder.accept(grammarAccess.getCompoundExpressionAccess().getOperatorOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getCompoundExpressionAccess().getRHSExpressionParserRuleCall_3_0(), semanticObject.getRHS());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Field returns Field
	 *     NumberedElement returns Field
	 *
	 * Constraint:
	 *     (assetNumber=ID sections+=Section*)
	 * </pre>
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IMS returns IMS
	 *
	 * Constraint:
	 *     ((irrigationRules+=IrrigationRule* expressions+=Expression+ fields+=Field+) | (irrigationRules+=IrrigationRule* fields+=Field+) | fields+=Field+)?
	 * </pre>
	 */
	protected void sequence_IMS(ISerializationContext context, IMS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IrrigationRule returns IrrigationRule
	 *
	 * Constraint:
	 *     (expression=Expression setting=WaterSetting (pumps+=[Pump|ID] pumps+=[Pump|ID]*)+ duration=INT)
	 * </pre>
	 */
	protected void sequence_IrrigationRule(ISerializationContext context, IrrigationRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NumberedElement returns Pump
	 *     Pump returns Pump
	 *
	 * Constraint:
	 *     assetNumber=ID
	 * </pre>
	 */
	protected void sequence_Pump(ISerializationContext context, Pump semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IMSPackage.Literals.NUMBERED_ELEMENT__ASSET_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IMSPackage.Literals.NUMBERED_ELEMENT__ASSET_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPumpAccess().getAssetNumberIDTerminalRuleCall_1_0(), semanticObject.getAssetNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NumberedElement returns Section
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (assetNumber=ID pumps+=Pump*)
	 * </pre>
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
