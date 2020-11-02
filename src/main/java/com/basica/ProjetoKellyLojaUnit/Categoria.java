package com.basica.ProjetoKellyLojaUnit;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="categoria")
public class Categoria {
	
	@OneToMany
	private Produto produto;
	private String NmeCategroia;
	private boolean ativo;
	
	
	public Produto getIdProduto() {
		return produto;
	}
	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}
	public String getNmeCategroia() {
		return NmeCategroia;
	}
	public void setNmeCategroia(String nmeCategroia) {
		NmeCategroia = nmeCategroia;
	}
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
