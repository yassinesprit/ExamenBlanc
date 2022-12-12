package tn.esprit.examblanc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examblanc.entities.OeuvreArt;
import tn.esprit.examblanc.entities.Zone;

import java.util.List;


public interface OeuvreArtRepository extends JpaRepository<OeuvreArt,Long> {
    public List<OeuvreArt> findByZone(Zone z);
}
