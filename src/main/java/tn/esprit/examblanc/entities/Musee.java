package tn.esprit.examblanc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Musee implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idMusee;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    public Date dateInauguration;
    public String destination;
    public String adresse;
    @OneToMany(mappedBy = "musee")
    public List<Zone> zones;
}
