package pe.edu.i202224679.entity;
import jakarta.persistence.*;

@Entity
public class CountryLanguage {
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;
    @Id
    private String language;
    private String isOfficial;
    private double percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(Country country, String language, String isOfficial, double percentage) {
        this.country = country;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}