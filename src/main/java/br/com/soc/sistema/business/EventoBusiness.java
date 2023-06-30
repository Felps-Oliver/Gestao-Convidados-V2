package br.com.soc.sistema.business;

import java.util.List;

import br.com.soc.sistema.DAO.EventoDAO;
import br.com.soc.sistema.vo.EventoVo;

public class EventoBusiness {

	private EventoDAO dao;
	
	public EventoBusiness() {
		this.dao = new EventoDAO();
	}
	
	public List<EventoVo> trazerTodosOsEventos(){
		return dao.findAllEventos();
	}
	
}
