package br.com.caelum.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("controlefinancas");

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
