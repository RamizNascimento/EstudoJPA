package com.jpaProject.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaProject.model.Cliente;

public class AtualizaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
 
		Cliente cliente = entityManager.find(Cliente.class, 1);
		     
		entityManager.getTransaction().begin();
		cliente.setNome("Autopeças Ramiz");
		entityManager.getTransaction().commit();
 
		entityManager.close();
		entityManagerFactory.close();
	}

}
