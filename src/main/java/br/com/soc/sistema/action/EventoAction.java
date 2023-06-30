package br.com.soc.sistema.action;

import java.util.ArrayList;
import java.util.List;

import br.com.soc.sistema.business.EventoBusiness;
import br.com.soc.sistema.infra.Action;
import br.com.soc.sistema.vo.EventoVo;

@SuppressWarnings("serial")
public class EventoAction extends Action {
	
	private List<EventoVo> eventos = new ArrayList<>();
	private EventoBusiness business = new EventoBusiness();
	private EventoVo eventoVo = new EventoVo();

	public String consultar() {
		eventos.addAll(business.trazerTodosOsEventos());
		
		return CONSULTA;
	}
	
	public String incluir() {
		return FORM;
	}

	public List<EventoVo> getEventos() {
		return eventos;
	}

	public void setEventos(List<EventoVo> eventos) {
		this.eventos = eventos;
	}

	public EventoVo getEventoVo() {
		return eventoVo;
	}

	public void setEventoVo(EventoVo eventoVo) {
		this.eventoVo = eventoVo;
	}
	
}
