package tn.esprit.examblanc.Service;

import lombok.AllArgsConstructor;
import tn.esprit.examblanc.entities.Musee;

import java.util.List;

public interface IMuseeService {

    public List<Musee> retrieveAllMusees();
    public Musee addMusee (Musee ce);
    public Musee updateMusee (Musee ce);
    public Musee retrieveMusee (long idMusee);
    public void removeMusee(long idMusee);

}
