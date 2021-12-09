package com.jpaProject.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaProject.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("Clientes-PU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
 
    // C�digo CRUD aqui
    Cliente cliente = entityManager.find(Cliente.class, 1);
    System.out.println(cliente.getNome());
    
    entityManager.close();
    entityManagerFactory.close();

	}

}
