package tn.esprit.examblanc.Service;

import tn.esprit.examblanc.entities.Zone;

import java.util.List;

public interface IZoneService {

    public List<Zone> retrieveAllZones();
    public Zone addZone (Zone ce);
    public Zone updateZone (Zone ce);
    public Zone retrieveZone (long idZone);
    public void removeZone(long idZone);
    public Zone ajouterZoneEtAffecterAMusee (Zone ce,Long idMusee);

}
