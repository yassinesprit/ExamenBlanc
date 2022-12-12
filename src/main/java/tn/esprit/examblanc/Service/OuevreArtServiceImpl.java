package tn.esprit.examblanc.Service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examblanc.entities.Direction;
import tn.esprit.examblanc.entities.OeuvreArt;
import tn.esprit.examblanc.entities.Zone;
import tn.esprit.examblanc.repository.OeuvreArtRepository;
import tn.esprit.examblanc.repository.ZoneRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OuevreArtServiceImpl implements IOeuvreArtService{

    OeuvreArtRepository oeuvreArtRepository;
    ZoneRepository zoneRepository;

    @Override
    public List<OeuvreArt> retrieveAllOeuvreArts() {
        return oeuvreArtRepository.findAll();
    }

    @Override
    public OeuvreArt addOeuvreArt(OeuvreArt ce) {
        return oeuvreArtRepository.save(ce);
    }

    @Override
    public OeuvreArt updateOeuvreArt(OeuvreArt ce) {
        return oeuvreArtRepository.save(ce);
    }

    @Override
    public OeuvreArt retrieveOeuvreArt(long idOeuvreArt) {
        return oeuvreArtRepository.findById(idOeuvreArt).orElse(null);
    }

    @Override
    public void removeOeuvreArt(long idOeuvreArt) {
        oeuvreArtRepository.deleteById(idOeuvreArt);
    }

    @Override
    public OeuvreArt ajouterOeuvreArtEtAffecterAZone(OeuvreArt ce, Long idZone) {
        OeuvreArt oeuvreArt=oeuvreArtRepository.save(ce);
        Zone zone=zoneRepository.findById(idZone).orElse(null);
        if (zone!=null){
            oeuvreArt.setZone(zone);
        }
        return oeuvreArtRepository.save(oeuvreArt);
    }

    @Override
    public List<String> titreTableauParMuseeEtDirection(long idMusee, Direction direction) {
        List<OeuvreArt> oeuvreArts=oeuvreArtRepository.findByZone(zoneRepository.findByMuseeIdMuseeAndDirection(idMusee, direction));
        List<String> noms=new ArrayList<>();
        for (OeuvreArt o:oeuvreArts) {
            noms.add(o.titreTableau);
        }
        return noms;
    }


}
