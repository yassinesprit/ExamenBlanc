package tn.esprit.examblanc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examblanc.entities.Direction;
import tn.esprit.examblanc.entities.Zone;

public interface ZoneRepository extends JpaRepository<Zone,Long> {
    public Zone findByMuseeIdMuseeAndDirection(long idMusee, Direction direction);
}
