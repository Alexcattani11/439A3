/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.ims.iMS.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.ims.iMS.IMSPackage;
import org.xtext.example.ims.iMS.NumberedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numbered Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ims.iMS.impl.NumberedElementImpl#getAssetNumber <em>Asset Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberedElementImpl extends MinimalEObjectImpl.Container implements NumberedElement
{
  /**
   * The default value of the '{@link #getAssetNumber() <em>Asset Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssetNumber()
   * @generated
   * @ordered
   */
  protected static final String ASSET_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssetNumber() <em>Asset Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssetNumber()
   * @generated
   * @ordered
   */
  protected String assetNumber = ASSET_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberedElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IMSPackage.Literals.NUMBERED_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAssetNumber()
  {
    return assetNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssetNumber(String newAssetNumber)
  {
    String oldAssetNumber = assetNumber;
    assetNumber = newAssetNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IMSPackage.NUMBERED_ELEMENT__ASSET_NUMBER, oldAssetNumber, assetNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IMSPackage.NUMBERED_ELEMENT__ASSET_NUMBER:
        return getAssetNumber();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IMSPackage.NUMBERED_ELEMENT__ASSET_NUMBER:
        setAssetNumber((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IMSPackage.NUMBERED_ELEMENT__ASSET_NUMBER:
        setAssetNumber(ASSET_NUMBER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IMSPackage.NUMBERED_ELEMENT__ASSET_NUMBER:
        return ASSET_NUMBER_EDEFAULT == null ? assetNumber != null : !ASSET_NUMBER_EDEFAULT.equals(assetNumber);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (assetNumber: ");
    result.append(assetNumber);
    result.append(')');
    return result.toString();
  }

} //NumberedElementImpl
