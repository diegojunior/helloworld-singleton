package org.jboss.as.quickstarts.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class LogConfiguratorStartup {


	@Inject
	private Stricker stricker;

	@PostConstruct
	void startup() {
		System.out.println("Executando post construtor: LogConfiguratorStartup.class");
		stricker.print();
	}
}
