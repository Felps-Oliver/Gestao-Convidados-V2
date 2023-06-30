package br.com.soc.sistema.business;

import java.util.List;

import br.com.soc.sistema.DAO.ConvidadoDAO;
import br.com.soc.sistema.vo.ConvidadoVo;

public class ConvidadoBusiness {

	private ConvidadoDAO dao;
	
	public ConvidadoBusiness() {
		this.dao = new ConvidadoDAO();
	}
	
	public List<ConvidadoVo> trazerTodosOsConvidados(){
		return dao.findAllConvidados();
	}
	
}
