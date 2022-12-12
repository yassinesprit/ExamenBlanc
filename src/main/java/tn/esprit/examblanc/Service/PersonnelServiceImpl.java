package tn.esprit.examblanc.Service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examblanc.entities.Personnel;
import tn.esprit.examblanc.entities.Zone;
import tn.esprit.examblanc.repository.PersonnelRepository;
import tn.esprit.examblanc.repository.ZoneRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PersonnelServiceImpl implements IPersonnelService{

    PersonnelRepository personnelRepository;
    ZoneRepository zoneRepository;

    @Override
    public List<Personnel> retrieveAllPersonnels() {
        return personnelRepository.findAll();
    }

    @Override
    public Personnel addPersonnel(Personnel ce) {
        return personnelRepository.save(ce);
    }

    @Override
    public Personnel updatePersonnel(Personnel ce) {
        return personnelRepository.save(ce);
    }

    @Override
    public Personnel retrievePersonnel(long idPersonnel) {
        return personnelRepository.findById(idPersonnel).orElse(null);
    }

    @Override
    public void removePersonnel(long idPersonnel) {
        personnelRepository.deleteById(idPersonnel);
    }

    @Override
    public void affecterPersonnelsAZone(long idZone, Long idGardien, long idDirecteur) {

        Zone zone = zoneRepository.findById(idZone).orElse(null);
        Personnel Gardien= personnelRepository.findById(idGardien).orElse(null);
        Personnel Directeur=personnelRepository.findById(idDirecteur).orElse(null);
        if (Directeur!=null && Gardien==null){
            Directeur.setZone1(zone);
            personnelRepository.save(Directeur);

        } else if (Directeur==null && Gardien!=null) {
            Gardien.setZone2(zone);
            personnelRepository.save(Gardien);

        }
    }

    @Override
    @Scheduled(fixedDelay = 600)
    public void desaffecterDirecteursZoneInactif() {
log.info("hello");    }
}
