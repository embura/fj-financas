package br.com.caelum.financas.dao.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteListagemConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao dao = new ContaDao(manager);

		List<Conta> contas = dao.lista();

		for (Conta conta : contas) {
			System.out.println(conta.getNumero());
		}

		manager.close();

	}

}
