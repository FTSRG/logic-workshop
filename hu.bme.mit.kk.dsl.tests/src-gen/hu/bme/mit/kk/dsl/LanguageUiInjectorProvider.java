/*
* generated by Xtext
*/
package hu.bme.mit.kk.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return hu.bme.mit.kk.dsl.ui.internal.LanguageActivator.getInstance().getInjector("hu.bme.mit.kk.dsl.Language");
	}
	
}
