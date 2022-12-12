package tn.esprit.examblanc.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personnel implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idPersonnel;
    public String nom;
    public String prenom;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    public Date dateDerniereAffectation;
    @Enumerated(EnumType.STRING)
    public TypePersonnel typePersonnel;
    @OneToOne
    public Zone zone1;
    @ManyToOne
    @JsonIgnore
    public Zone zone2;

}
