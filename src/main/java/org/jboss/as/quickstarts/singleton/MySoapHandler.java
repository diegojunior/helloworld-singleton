package org.jboss.as.quickstarts.singleton;

import java.util.Collections;
import java.util.Set;

import javax.inject.Inject;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class MySoapHandler implements SOAPHandler<SOAPMessageContext> {

	@Inject
	private Counter counter;
	
	private void executar() {
		counter.incrementA();
		counter.incrementB();
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		executar();
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		return Collections.emptySet();
	}

	

}
