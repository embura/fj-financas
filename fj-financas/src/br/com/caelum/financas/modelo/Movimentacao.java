package br.com.caelum.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.caelum.financas.modelo.EnumTipoMovimentacao.TipoMovimetacao;

public class Movimentacao {

	@Id
	@GeneratedValue
	public Integer id;
	public String descricao;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	private BigDecimal valor;
	@ManyToOne
	private Conta conta;
	@Enumerated(EnumType.STRING)
	private TipoMovimetacao tipoMovimentacao ;

	public TipoMovimetacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimetacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Calendar getData() {
		return data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Conta getConta() {
		return conta;
	}

}
