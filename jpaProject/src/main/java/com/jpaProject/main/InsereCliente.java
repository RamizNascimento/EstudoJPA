package com.jpaProject.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaProject.model.Cliente;

public class InsereCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
 
		Cliente cliente = new Cliente();
		cliente.setNome("Armazém Estrela");
     
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
 
		entityManager.close();
		entityManagerFactory.close();
	}

}
