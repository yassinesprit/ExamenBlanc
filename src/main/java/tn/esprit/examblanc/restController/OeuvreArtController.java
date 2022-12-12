package tn.esprit.examblanc.restController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examblanc.Service.IOeuvreArtService;
import tn.esprit.examblanc.entities.Direction;
import tn.esprit.examblanc.entities.OeuvreArt;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/OeuvreArt")

public class OeuvreArtController {

    IOeuvreArtService iOeuvreArtService;

    @GetMapping
    public List<OeuvreArt> retrieveAllOeuvreArts() {
        return iOeuvreArtService.retrieveAllOeuvreArts();
    }

    @PostMapping
    public OeuvreArt addOeuvreArt(@RequestBody OeuvreArt ce) {
        return iOeuvreArtService.addOeuvreArt(ce);
    }

    @PutMapping
    public OeuvreArt updateOeuvreArt(@RequestBody OeuvreArt ce) {
        return iOeuvreArtService.updateOeuvreArt(ce);
    }

    @GetMapping("/{idOeuvreArt}")
    public OeuvreArt retrieveOeuvreArt(@PathVariable long idOeuvreArt) {
        return iOeuvreArtService.retrieveOeuvreArt(idOeuvreArt);
    }

    @DeleteMapping("/{idOeuvreArt}")
    public void removeOeuvreArt(@PathVariable long idOeuvreArt) {
        iOeuvreArtService.removeOeuvreArt(idOeuvreArt);
    }


    @PutMapping("affectZone/{idZone}")
    @Transactional
    public OeuvreArt ajouterOeuvreArtEtAffecterAZone(OeuvreArt ce, Long idZone) {
        return iOeuvreArtService.ajouterOeuvreArtEtAffecterAZone(ce,idZone);
    }


    public List<String> titreTableauParMuseeEtDirection(long idMusee, Direction direction) {
        return iOeuvreArtService.titreTableauParMuseeEtDirection(idMusee,direction);
    }
}
