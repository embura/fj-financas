package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	@GeneratedValue	
	private Integer id;
	
	private String titular;
	private String agencia;
	private String numero;

	private String banco;

	public String getTitulo() {
		return titular;
	}

	public void setTitulo(String titulo) {
		this.titular = titulo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
