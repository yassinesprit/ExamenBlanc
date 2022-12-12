package tn.esprit.examblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idZone;
    public String code;
    public String libelle;
    @Enumerated(EnumType.STRING)
    public Direction direction;
    public boolean actif;
    @ManyToOne
    @JsonIgnore
    public Musee musee;
    @OneToMany(mappedBy = "zone")
    public List<OeuvreArt> oeuvreArts;
    @OneToOne
    @JsonIgnore
    public Personnel personnel;
    @OneToMany(mappedBy = "zone2")
    public List<Personnel> personnels;

}
