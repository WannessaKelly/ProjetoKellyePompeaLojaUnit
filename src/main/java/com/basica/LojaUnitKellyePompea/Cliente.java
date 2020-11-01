package com.basica.LojaUnitKellyePompea;


@Entity
@Table (name="Clientes")

public class Cliente {
	
	@id
	@GeneratedatedValue(strategy = GenerationType.AUTO)
	
	private Integer idCliente;
	private String nome;
	private String nomeSocial;
	private String apelido;
	private String dataNasci;
	private String sexo;
	private String cpf;
	private String email;
	private String telefone;
	
	
	
	

}
