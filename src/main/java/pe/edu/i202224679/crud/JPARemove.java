package pe.edu.i202224679.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224679.entity.Country;

public class JPARemove {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country country = em.find(Country.class, "ANG");


        em.getTransaction().begin();
        em.remove(country);
        em.getTransaction().commit();
    }
}
