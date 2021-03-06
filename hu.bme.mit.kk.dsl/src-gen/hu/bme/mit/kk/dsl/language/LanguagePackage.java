/**
 */
package hu.bme.mit.kk.dsl.language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.kk.dsl.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "language";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/kk/dsl/Language";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "language";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguagePackage eINSTANCE = hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.ModelImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>People</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PEOPLE = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.PersonImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.StatementImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__PERSON = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.ExpressionImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.IffImpl <em>Iff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.IffImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getIff()
   * @generated
   */
  int IFF = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFF__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFF__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Iff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.OrImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getOr()
   * @generated
   */
  int OR = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.AndImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getAnd()
   * @generated
   */
  int AND = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.NegationableImpl <em>Negationable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.NegationableImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getNegationable()
   * @generated
   */
  int NEGATIONABLE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIONABLE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Negationable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIONABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.KnightReferenceImpl <em>Knight Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.KnightReferenceImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getKnightReference()
   * @generated
   */
  int KNIGHT_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIGHT_REFERENCE__PERSON = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Knight Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNIGHT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.kk.dsl.language.impl.KnaveReferenceImpl <em>Knave Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.kk.dsl.language.impl.KnaveReferenceImpl
   * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getKnaveReference()
   * @generated
   */
  int KNAVE_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNAVE_REFERENCE__PERSON = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Knave Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KNAVE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see hu.bme.mit.kk.dsl.language.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.kk.dsl.language.Model#getPeople <em>People</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>People</em>'.
   * @see hu.bme.mit.kk.dsl.language.Model#getPeople()
   * @see #getModel()
   * @generated
   */
  EReference getModel_People();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.kk.dsl.language.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see hu.bme.mit.kk.dsl.language.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see hu.bme.mit.kk.dsl.language.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.kk.dsl.language.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.kk.dsl.language.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see hu.bme.mit.kk.dsl.language.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.kk.dsl.language.Statement#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see hu.bme.mit.kk.dsl.language.Statement#getPerson()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Person();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.mit.kk.dsl.language.Statement#getExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Expression();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see hu.bme.mit.kk.dsl.language.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Iff <em>Iff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iff</em>'.
   * @see hu.bme.mit.kk.dsl.language.Iff
   * @generated
   */
  EClass getIff();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.Iff#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.mit.kk.dsl.language.Iff#getLeft()
   * @see #getIff()
   * @generated
   */
  EReference getIff_Left();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.Iff#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.mit.kk.dsl.language.Iff#getRight()
   * @see #getIff()
   * @generated
   */
  EReference getIff_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see hu.bme.mit.kk.dsl.language.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.mit.kk.dsl.language.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.mit.kk.dsl.language.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see hu.bme.mit.kk.dsl.language.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.mit.kk.dsl.language.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.mit.kk.dsl.language.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.Negationable <em>Negationable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negationable</em>'.
   * @see hu.bme.mit.kk.dsl.language.Negationable
   * @generated
   */
  EClass getNegationable();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.kk.dsl.language.Negationable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.kk.dsl.language.Negationable#getValue()
   * @see #getNegationable()
   * @generated
   */
  EReference getNegationable_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.KnightReference <em>Knight Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knight Reference</em>'.
   * @see hu.bme.mit.kk.dsl.language.KnightReference
   * @generated
   */
  EClass getKnightReference();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.kk.dsl.language.KnightReference#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see hu.bme.mit.kk.dsl.language.KnightReference#getPerson()
   * @see #getKnightReference()
   * @generated
   */
  EReference getKnightReference_Person();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.kk.dsl.language.KnaveReference <em>Knave Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knave Reference</em>'.
   * @see hu.bme.mit.kk.dsl.language.KnaveReference
   * @generated
   */
  EClass getKnaveReference();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.kk.dsl.language.KnaveReference#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see hu.bme.mit.kk.dsl.language.KnaveReference#getPerson()
   * @see #getKnaveReference()
   * @generated
   */
  EReference getKnaveReference_Person();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LanguageFactory getLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.ModelImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PEOPLE = eINSTANCE.getModel_People();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.PersonImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.StatementImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__PERSON = eINSTANCE.getStatement_Person();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSION = eINSTANCE.getStatement_Expression();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.ExpressionImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.IffImpl <em>Iff</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.IffImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getIff()
     * @generated
     */
    EClass IFF = eINSTANCE.getIff();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFF__LEFT = eINSTANCE.getIff_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFF__RIGHT = eINSTANCE.getIff_Right();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.OrImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.AndImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.NegationableImpl <em>Negationable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.NegationableImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getNegationable()
     * @generated
     */
    EClass NEGATIONABLE = eINSTANCE.getNegationable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIONABLE__VALUE = eINSTANCE.getNegationable_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.KnightReferenceImpl <em>Knight Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.KnightReferenceImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getKnightReference()
     * @generated
     */
    EClass KNIGHT_REFERENCE = eINSTANCE.getKnightReference();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNIGHT_REFERENCE__PERSON = eINSTANCE.getKnightReference_Person();

    /**
     * The meta object literal for the '{@link hu.bme.mit.kk.dsl.language.impl.KnaveReferenceImpl <em>Knave Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.kk.dsl.language.impl.KnaveReferenceImpl
     * @see hu.bme.mit.kk.dsl.language.impl.LanguagePackageImpl#getKnaveReference()
     * @generated
     */
    EClass KNAVE_REFERENCE = eINSTANCE.getKnaveReference();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KNAVE_REFERENCE__PERSON = eINSTANCE.getKnaveReference_Person();

  }

} //LanguagePackage
