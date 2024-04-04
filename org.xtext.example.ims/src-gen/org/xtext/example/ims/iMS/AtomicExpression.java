/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.ims.iMS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ims.iMS.AtomicExpression#getForecastLowerBound <em>Forecast Lower Bound</em>}</li>
 *   <li>{@link org.xtext.example.ims.iMS.AtomicExpression#getForecastUpperBound <em>Forecast Upper Bound</em>}</li>
 *   <li>{@link org.xtext.example.ims.iMS.AtomicExpression#getField <em>Field</em>}</li>
 *   <li>{@link org.xtext.example.ims.iMS.AtomicExpression#getMoistureLowerBound <em>Moisture Lower Bound</em>}</li>
 *   <li>{@link org.xtext.example.ims.iMS.AtomicExpression#getMoistureUpperBound <em>Moisture Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ims.iMS.IMSPackage#getAtomicExpression()
 * @model
 * @generated
 */
public interface AtomicExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Forecast Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forecast Lower Bound</em>' attribute.
   * @see #setForecastLowerBound(int)
   * @see org.xtext.example.ims.iMS.IMSPackage#getAtomicExpression_ForecastLowerBound()
   * @model
   * @generated
   */
  int getForecastLowerBound();

  /**
   * Sets the value of the '{@link org.xtext.example.ims.iMS.AtomicExpression#getForecastLowerBound <em>Forecast Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forecast Lower Bound</em>' attribute.
   * @see #getForecastLowerBound()
   * @generated
   */
  void setForecastLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Forecast Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forecast Upper Bound</em>' attribute.
   * @see #setForecastUpperBound(int)
   * @see org.xtext.example.ims.iMS.IMSPackage#getAtomicExpression_ForecastUpperBound()
   * @model
   * @generated
   */
  int getForecastUpperBound();

  /**
   * Sets the value of the '{@link org.xtext.example.ims.iMS.AtomicExpression#getForecastUpperBound <em>Forecast Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forecast Upper Bound</em>' attribute.
   * @see #getForecastUpperBound()
   * @generated
   */
  void setForecastUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(Field)
   * @see org.xtext.example.ims.iMS.IMSPackage#getAtomicExpression_Field()
   * @model
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link org.xtext.example.ims.iMS.AtomicExpression#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>Moisture Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moisture Lower Bound</em>' attribute.
   * @see #setMoistureLowerBound(int)
   * @see org.xtext.example.ims.iMS.IMSPackage#getAtomicExpression_MoistureLowerBound()
   * @model
   * @generated
   */
  int getMoistureLowerBound();

  /**
   * Sets the value of the '{@link org.xtext.example.ims.iMS.AtomicExpression#getMoistureLowerBound <em>Moisture Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moisture Lower Bound</em>' attribute.
   * @see #getMoistureLowerBound()
   * @generated
   */
  void setMoistureLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Moisture Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moisture Upper Bound</em>' attribute.
   * @see #setMoistureUpperBound(int)
   * @see org.xtext.example.ims.iMS.IMSPackage#getAtomicExpression_MoistureUpperBound()
   * @model
   * @generated
   */
  int getMoistureUpperBound();

  /**
   * Sets the value of the '{@link org.xtext.example.ims.iMS.AtomicExpression#getMoistureUpperBound <em>Moisture Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moisture Upper Bound</em>' attribute.
   * @see #getMoistureUpperBound()
   * @generated
   */
  void setMoistureUpperBound(int value);

} // AtomicExpression