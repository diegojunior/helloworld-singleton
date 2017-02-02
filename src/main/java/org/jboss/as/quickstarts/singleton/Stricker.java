package org.jboss.as.quickstarts.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class Stricker {

	@PostConstruct
	public void post() {
		System.out.println("Executando post construtor: Stricker.class");
	}
	
	public void print() {
		System.out.println("Imprimindo Stricker");
	}
	
}
