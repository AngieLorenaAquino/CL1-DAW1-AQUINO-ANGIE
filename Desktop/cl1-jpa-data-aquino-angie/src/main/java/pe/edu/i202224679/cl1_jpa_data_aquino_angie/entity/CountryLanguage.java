package pe.edu.i202224679.cl1_jpa_data_aquino_angie.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguage {

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Id
    private String language;

    private String isOfficial;
    private double percentage;
}
