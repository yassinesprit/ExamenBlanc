package tn.esprit.examblanc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examblanc.entities.Musee;

public interface MuseeRepository extends JpaRepository<Musee,Long> {
}
