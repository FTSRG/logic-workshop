/*
* generated by Xtext
*/
package hu.bme.mit.kk.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LanguageStandaloneSetup extends LanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new LanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

