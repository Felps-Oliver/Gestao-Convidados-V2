package br.com.soc.sistema.action;

import java.util.ArrayList;
import java.util.List;

import br.com.soc.sistema.business.ConvidadoBusiness;
import br.com.soc.sistema.infra.Action;
import br.com.soc.sistema.vo.ConvidadoVo;

@SuppressWarnings("serial")
public class ConvidadoAction extends Action {
	
	private List<ConvidadoVo> convidados = new ArrayList<>();
	private ConvidadoBusiness business = new ConvidadoBusiness();
	private ConvidadoVo convidadoVo = new ConvidadoVo();

	public String execute() {
		return SUCCESS;
	}
	
	public String consultar() {
		
		convidados.addAll(business.trazerTodosOsConvidados());
		
		return CONSULTA;
	}
	
	public String incluir() {
		return FORM;
	}

	public List<ConvidadoVo> getConvidados() {
		return convidados;
	}

	public void setConvidados(List<ConvidadoVo> convidados) {
		this.convidados = convidados;
	}

	public ConvidadoVo getConvidadoVo() {
		return convidadoVo;
	}

	public void setConvidadoVo(ConvidadoVo convidadoVo) {
		this.convidadoVo = convidadoVo;
	}
}
