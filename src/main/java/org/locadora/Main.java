package org.locadora;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.locadora.entities.Endereco;
import org.locadora.entities.Modelo;

public class Main {
    public static void main(String[] args) {
    //criaçao da base

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Locadora");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Modelo modelo = entityManager.find(Modelo.class, 2);
        System.out.println("Modelo: " + modelo.getModelo());

        entityManager.close();
        entityManagerFactory.close();

    }
}