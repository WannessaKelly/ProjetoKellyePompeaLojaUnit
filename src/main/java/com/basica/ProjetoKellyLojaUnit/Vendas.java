package com.basica.ProjetoKellyLojaUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="venda")
public class Vendas {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idVenda;
	@OneToOne
	private Cliente cliente;
	private Integer idFormaDePagamento;
	private String dataHora;
	private Double valorTotal;
	
	
	public Cliente getIdCliente() {
		return cliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.cliente = idCliente;
	}
	public Integer getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}
	public Integer getIdFormaDePagamento() {
		return idFormaDePagamento;
	}
	public void setIdFormaDePagamento(Integer idFormaDePagamento) {
		this.idFormaDePagamento = idFormaDePagamento;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	

}
