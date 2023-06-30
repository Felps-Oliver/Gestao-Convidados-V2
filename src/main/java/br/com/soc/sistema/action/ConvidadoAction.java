package br.com.soc.sistema.action;

import br.com.soc.sistema.infra.Action;

@SuppressWarnings("serial")
public class ConvidadoAction extends Action {

	public String execute() {
		return SUCCESS;
	}
	
	public String consultar() {
		return CONSULTA;
	}
	
	public String incluir() {
		return FORM;
	}
}
