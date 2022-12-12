package tn.esprit.examblanc.Service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examblanc.entities.Musee;
import tn.esprit.examblanc.repository.MuseeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MuseeServiceImpl implements IMuseeService{

    MuseeRepository museeRepository;

    @Override
    public List<Musee> retrieveAllMusees() {
        return museeRepository.findAll();
    }

    @Override
    public Musee addMusee(Musee ce) {
        return museeRepository.save(ce);
    }

    @Override
    public Musee updateMusee(Musee ce) {
        return museeRepository.save(ce);
    }

    @Override
    public Musee retrieveMusee(long idMusee) {
        return museeRepository.findById(idMusee).orElse(null);
    }

    @Override
    public void removeMusee(long idMusee) {
        museeRepository.deleteById(idMusee);
    }
}
