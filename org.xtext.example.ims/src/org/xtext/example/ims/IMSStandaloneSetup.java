/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.ims;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class IMSStandaloneSetup extends IMSStandaloneSetupGenerated {

	public static void doSetup() {
		new IMSStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}