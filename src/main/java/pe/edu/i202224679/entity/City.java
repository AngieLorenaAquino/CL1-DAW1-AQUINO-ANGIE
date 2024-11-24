package pe.edu.i202224679.entity;
import jakarta.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;
    private String district;
    private int population;

    public City() {
    }

    public City(String name, Country country, String district, int population) {
        this.name = name;
        this.country = country;
        this.district = district;
        this.population = population;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + (country != null ? country.getName() : "No Country") +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }
}
