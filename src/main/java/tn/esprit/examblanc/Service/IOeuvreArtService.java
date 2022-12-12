package tn.esprit.examblanc.Service;

import tn.esprit.examblanc.entities.Direction;
import tn.esprit.examblanc.entities.OeuvreArt;

import java.util.List;

public interface IOeuvreArtService {

    public List<OeuvreArt> retrieveAllOeuvreArts();
    public OeuvreArt addOeuvreArt (OeuvreArt ce);
    public OeuvreArt updateOeuvreArt (OeuvreArt ce);
    public OeuvreArt retrieveOeuvreArt (long idOeuvreArt);
    public void removeOeuvreArt(long idOeuvreArt);

    public OeuvreArt ajouterOeuvreArtEtAffecterAZone (OeuvreArt ce,Long idZone);
    public List<String> titreTableauParMuseeEtDirection(long idMusee, Direction direction );
}
