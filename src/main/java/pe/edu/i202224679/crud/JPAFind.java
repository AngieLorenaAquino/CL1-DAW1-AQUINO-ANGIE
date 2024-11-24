package pe.edu.i202224679.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224679.entity.Country;
import java.util.Optional;

public class JPAFind {
    public static void main(String[] args) {

        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();


        Country peru = em.find(Country.class, "PER");

        Optional.ofNullable(peru)
                .map(Country::getCities)
                .ifPresentOrElse(
                        cities -> cities.stream()
                                .filter(city -> city.getPopulation() > 700_000)
                                .forEach(city -> System.out.println(city.getName())),
                        () -> System.out.println("No se encontraron ciudades")
                );

        // Cerrar el EntityManager
        em.close();
        emf.close();
    }
}
