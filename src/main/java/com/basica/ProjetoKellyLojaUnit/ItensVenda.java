package com.basica.ProjetoKellyLojaUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="itensVenda")
public class ItensVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Vendas idVenda;
	@OneToMany
	private Produto produto;
	private Integer qtd;
	private Double valorUnitario;
	
	public Vendas getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Vendas idVenda) {
		this.idVenda = idVenda;
	}
	public Produto getIdProduto() {
		return produto;
	}
	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	

}
