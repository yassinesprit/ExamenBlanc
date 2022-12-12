package tn.esprit.examblanc.Service;

import tn.esprit.examblanc.entities.Personnel;

import java.util.List;

public interface IPersonnelService {

    public List<Personnel> retrieveAllPersonnels();
    public Personnel addPersonnel (Personnel ce);
    public Personnel updatePersonnel (Personnel ce);
    public Personnel retrievePersonnel (long idPersonnel);
    public void removePersonnel(long idPersonnel);
    public void affecterPersonnelsAZone(long idZone,Long idGardien,long idDirecteur);

    public  void desaffecterDirecteursZoneInactif();


}
