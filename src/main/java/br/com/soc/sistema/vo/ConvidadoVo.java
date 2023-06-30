package br.com.soc.sistema.vo;

public class ConvidadoVo {
	
	private String rowid;
	private String nome;
	private int qnt_convidados;
	
	public ConvidadoVo() {}
	
	public ConvidadoVo(String rowid, String nome, int qnt_convidados) {
		this.rowid = rowid;
		this.nome = nome;
		this.qnt_convidados = qnt_convidados;
	}
	
	public String getRowid() {
		return rowid;
	}
	
	public void setRowid(String rowid) {
		this.rowid = rowid;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQnt_convidados() {
		return qnt_convidados;
	}
	
	public void setQnt_convidados(int qnt_convidados) {
		this.qnt_convidados = qnt_convidados;
	}

	@Override
	public String toString() {
		return "ConvidadoVo [rowid=" + rowid + ", nome=" + nome + ", qnt_convidados=" + qnt_convidados + "]";
	}
	
}
