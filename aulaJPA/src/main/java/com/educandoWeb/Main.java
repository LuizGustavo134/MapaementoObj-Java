package com.educandoWeb;

import model.aluno;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Alunos: ");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        aluno p1 = new aluno(null,"marcos","marcos134@gmail.com",7.00,10.00,9.00);
        em.getTransaction().begin(); // obrigatório em qualquer operação do banco de dados
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        emf.close();



    }
}