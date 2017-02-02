package org.jboss.as.quickstarts.singleton;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@HandlerChain(file = "/handlers.xml")
@WebService(serviceName = "AdviceMovimentosService", portName = "AdviceMovimentosServicePort")
public class AdviceMovimentosService {


	@WebMethod
	@WebResult(name = "MOVIMENTOS")
	public String getMovimentos() {
		System.out.println("Executando web service movimentos.");
		return "Retornando web service movimentos.";
	}
}
