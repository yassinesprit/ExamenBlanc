package tn.esprit.examblanc.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examblanc.entities.Musee;
import tn.esprit.examblanc.entities.Zone;
import tn.esprit.examblanc.repository.MuseeRepository;
import tn.esprit.examblanc.repository.ZoneRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ZoneServiceImpl implements IZoneService {

    ZoneRepository zoneRepository;
    MuseeRepository museeRepository;

    @Override
    public List<Zone> retrieveAllZones() {
        return zoneRepository.findAll();
    }

    @Override
    public Zone addZone(Zone ce) {
        return zoneRepository.save(ce);
    }

    @Override
    public Zone updateZone(Zone ce) {
        return zoneRepository.save(ce);
    }

    @Override
    public Zone retrieveZone(long idZone) {
        return zoneRepository.findById(idZone).orElse(null);
    }

    @Override
    public void removeZone(long idZone) {
        zoneRepository.deleteById(idZone);
    }

    @Override
    public Zone ajouterZoneEtAffecterAMusee(Zone ce, Long idMusee) {
        Zone zone = zoneRepository.save(ce);
        Musee musee =museeRepository.findById(idMusee).orElse(null);
        if (musee!=null){
            zone.setMusee(musee);
        }
        return zoneRepository.save(zone);
    }
}
