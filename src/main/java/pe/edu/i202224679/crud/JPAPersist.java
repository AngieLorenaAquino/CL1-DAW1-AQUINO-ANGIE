package pe.edu.i202224679.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224679.entity.City;
import pe.edu.i202224679.entity.Country;
import pe.edu.i202224679.entity.CountryLanguage;
import java.util.Arrays;


public class JPAPersist {
    public static void main(String[] args) {

        // Crear el EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        Country country = new Country("ANG", "ANGIE", "Europe", "Angie", 1000000,
                (short) 2024, 5000000, 75.0, 10.00, 50.00, "ANGIE",
                "ANGIE", "ANGIE", 1234, "AN", null, null
        );

        City city1 = new City("Ciudad1", country, "Distrito1", 1000000);
        City city2 = new City("Ciudad2", country, "Distrito2", 800000);
        City city3 = new City("Ciudad3", country, "Distrito3", 900000);
        country.setCities(Arrays.asList(city1, city2, city3));


        CountryLanguage lang1 = new CountryLanguage(country, "Lenguaje1", "T", 90.0);
        CountryLanguage lang2 = new CountryLanguage(country, "Lenguaje2", "F", 10.0);
        country.setCountryLanguages(Arrays.asList(lang1, lang2));

        em.persist(country);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }


}