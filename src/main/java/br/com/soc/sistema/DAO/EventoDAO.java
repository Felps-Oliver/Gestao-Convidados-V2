package br.com.soc.sistema.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.soc.sistema.vo.EventoVo;

public class EventoDAO extends DAO {
	
	//Permite retornar os dados no formato de data especificado
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public List<EventoVo> findAllEventos(){
		StringBuilder query = new StringBuilder("SELECT rowid id, nm_evento nome, "
				+ "data_evento data, valor_ingresso valor FROM eventos");
		try(
			Connection con = getConexao();
			PreparedStatement  ps = con.prepareStatement(query.toString());
			ResultSet rs = ps.executeQuery()){
			
			EventoVo vo =  null;
			List<EventoVo> eventos = new ArrayList<>();
			while (rs.next()) {
				vo = new EventoVo();
				vo.setRowid(rs.getString("id"));
				vo.setNome(rs.getString("nome"));
				vo.setData_evento(sdf.format(rs.getDate("data")));
				
				eventos.add(vo);
			}
			return eventos;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}
	
}
