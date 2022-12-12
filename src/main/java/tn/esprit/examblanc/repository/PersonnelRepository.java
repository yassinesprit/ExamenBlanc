package tn.esprit.examblanc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examblanc.entities.Personnel;
import tn.esprit.examblanc.entities.TypePersonnel;

import java.util.List;


public interface PersonnelRepository extends JpaRepository<Personnel,Long> {
   // List<Personnel> findByTypePersonnelAndZone1I(TypePersonnel typePersonnel);
}
