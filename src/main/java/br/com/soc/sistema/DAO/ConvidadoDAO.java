package br.com.soc.sistema.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.soc.sistema.vo.ConvidadoVo;

public class ConvidadoDAO extends DAO {

	public List<ConvidadoVo> findAllConvidados(){
		StringBuilder query = new StringBuilder("SELECT rowid id, nm_convidado nome, "
				+ "qnt_convidado quantidade FROM convidados");
		try(
			Connection con = getConexao();
			PreparedStatement  ps = con.prepareStatement(query.toString());
			ResultSet rs = ps.executeQuery()){
			
			ConvidadoVo vo =  null;
			List<ConvidadoVo> convidados = new ArrayList<>();
			while (rs.next()) {
				vo = new ConvidadoVo();
				vo.setRowid(rs.getString("id"));
				vo.setNome(rs.getString("nome"));
				vo.setQnt_convidados(rs.getInt("quantidade"));
				
				convidados.add(vo);
			}
			return convidados;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Collections.emptyList();
	}
	
}
