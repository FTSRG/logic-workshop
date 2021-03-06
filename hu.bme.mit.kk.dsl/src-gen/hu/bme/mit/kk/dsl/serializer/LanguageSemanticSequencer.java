/*
 * generated by Xtext
 */
package hu.bme.mit.kk.dsl.serializer;

import com.google.inject.Inject;
import hu.bme.mit.kk.dsl.language.And;
import hu.bme.mit.kk.dsl.language.Iff;
import hu.bme.mit.kk.dsl.language.KnaveReference;
import hu.bme.mit.kk.dsl.language.KnightReference;
import hu.bme.mit.kk.dsl.language.LanguagePackage;
import hu.bme.mit.kk.dsl.language.Model;
import hu.bme.mit.kk.dsl.language.Negationable;
import hu.bme.mit.kk.dsl.language.Or;
import hu.bme.mit.kk.dsl.language.Person;
import hu.bme.mit.kk.dsl.language.Statement;
import hu.bme.mit.kk.dsl.services.LanguageGrammarAccess;
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

@SuppressWarnings("all")
public class LanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LanguagePackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case LanguagePackage.IFF:
				sequence_Iff(context, (Iff) semanticObject); 
				return; 
			case LanguagePackage.KNAVE_REFERENCE:
				sequence_KnaveReference(context, (KnaveReference) semanticObject); 
				return; 
			case LanguagePackage.KNIGHT_REFERENCE:
				sequence_KnightReference(context, (KnightReference) semanticObject); 
				return; 
			case LanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case LanguagePackage.NEGATIONABLE:
				sequence_Negationable(context, (Negationable) semanticObject); 
				return; 
			case LanguagePackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case LanguagePackage.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			case LanguagePackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     Iff returns And
	 *     Iff.Iff_1_0 returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Negationable returns And
	 *     Primary returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 right=Negationable)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightNegationableParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Iff
	 *     Iff returns Iff
	 *     Iff.Iff_1_0 returns Iff
	 *     Or returns Iff
	 *     Or.Or_1_0 returns Iff
	 *     And returns Iff
	 *     And.And_1_0 returns Iff
	 *     Negationable returns Iff
	 *     Primary returns Iff
	 *
	 * Constraint:
	 *     (left=Iff_Iff_1_0 right=Or)
	 */
	protected void sequence_Iff(ISerializationContext context, Iff semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.IFF__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.IFF__LEFT));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.IFF__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.IFF__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIffAccess().getIffLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getIffAccess().getRightOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns KnaveReference
	 *     Iff returns KnaveReference
	 *     Iff.Iff_1_0 returns KnaveReference
	 *     Or returns KnaveReference
	 *     Or.Or_1_0 returns KnaveReference
	 *     And returns KnaveReference
	 *     And.And_1_0 returns KnaveReference
	 *     Negationable returns KnaveReference
	 *     Primary returns KnaveReference
	 *     KnaveReference returns KnaveReference
	 *
	 * Constraint:
	 *     person=[Person|ID]
	 */
	protected void sequence_KnaveReference(ISerializationContext context, KnaveReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.KNAVE_REFERENCE__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.KNAVE_REFERENCE__PERSON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKnaveReferenceAccess().getPersonPersonIDTerminalRuleCall_1_0_1(), semanticObject.getPerson());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns KnightReference
	 *     Iff returns KnightReference
	 *     Iff.Iff_1_0 returns KnightReference
	 *     Or returns KnightReference
	 *     Or.Or_1_0 returns KnightReference
	 *     And returns KnightReference
	 *     And.And_1_0 returns KnightReference
	 *     Negationable returns KnightReference
	 *     Primary returns KnightReference
	 *     KnightReference returns KnightReference
	 *
	 * Constraint:
	 *     person=[Person|ID]
	 */
	protected void sequence_KnightReference(ISerializationContext context, KnightReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.KNIGHT_REFERENCE__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.KNIGHT_REFERENCE__PERSON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKnightReferenceAccess().getPersonPersonIDTerminalRuleCall_1_0_1(), semanticObject.getPerson());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (people+=Person people+=Person* people+=Person statements+=Statement+)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Negationable
	 *     Iff returns Negationable
	 *     Iff.Iff_1_0 returns Negationable
	 *     Or returns Negationable
	 *     Or.Or_1_0 returns Negationable
	 *     And returns Negationable
	 *     And.And_1_0 returns Negationable
	 *     Negationable returns Negationable
	 *     Primary returns Negationable
	 *
	 * Constraint:
	 *     value=Primary
	 */
	protected void sequence_Negationable(ISerializationContext context, Negationable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.NEGATIONABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.NEGATIONABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegationableAccess().getValuePrimaryParserRuleCall_1_0_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Or
	 *     Iff returns Or
	 *     Iff.Iff_1_0 returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     Negationable returns Or
	 *     Primary returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.PERSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.PERSON__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     (person=[Person|ID] expression=Expression)
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.STATEMENT__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.STATEMENT__PERSON));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.STATEMENT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementAccess().getPersonPersonIDTerminalRuleCall_0_0_1(), semanticObject.getPerson());
		feeder.accept(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
}
