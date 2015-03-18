package br.com.caelum.financas.dao.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.EnumTipoMovimentacao.TipoMovimetacao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteMovimentacao {

	public static void main(String[] args) {

		
		EntityManager manager = new  JPAUtil().getEntityManager();

		Conta conta = new Conta();

		conta.setTitulo("José Roberto");
		conta.setBanco("Banco do Brasil");
		conta.setNumero("123456-6");
		conta.setAgencia("0999");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("conta de luz - abril/2014");
		movimentacao.setValor(new BigDecimal("54"));
		movimentacao.setTipoMovimentacao(TipoMovimetacao.SAIDA);
		
		/*manager.getTransaction().commit();
		manager.close();*/

	}

}
