package br.com.soc.sistema.vo;

public class EventoVo {
	
	private String rowid;
	private String nome;
	private String data_evento;
	private float preco_ingresso;
	
	public EventoVo() {}

	public EventoVo(String rowid, String nome, String data_evento, float preco_ingresso) {
		this.rowid = rowid;
		this.nome = nome;
		this.data_evento = data_evento;
		this.preco_ingresso = preco_ingresso;
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

	public String getData_evento() {
		return data_evento;
	}

	public void setData_evento(String data_evento) {
		this.data_evento = data_evento;
	}

	public float getPreco_ingresso() {
		return preco_ingresso;
	}

	public void setPreco_ingresso(float preco_ingresso) {
		this.preco_ingresso = preco_ingresso;
	}
	
}
