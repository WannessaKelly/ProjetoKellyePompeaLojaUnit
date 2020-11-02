package com.basica.ProjetoKellyLojaUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="faq")
public class Faq {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFaq;
	@OneToMany
	private Produto produto;
	private String dataHora;
	private String texto;
	
	
	public Produto getIdProduto() {
		return produto;
	}
	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}
	public Integer getIdFaq() {
		return idFaq;
	}
	public void setIdFaq(Integer idFaq) {
		this.idFaq = idFaq;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
