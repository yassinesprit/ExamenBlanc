package tn.esprit.examblanc.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examblanc.Service.IPersonnelService;
import tn.esprit.examblanc.entities.Personnel;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Personnel")

public class PersonnelController {

    IPersonnelService iPersonnelService;

    @GetMapping
    public List<Personnel> retrieveAllPersonnels() {
        return iPersonnelService.retrieveAllPersonnels();
    }

    @PostMapping
    public Personnel addPersonnel(@RequestBody Personnel ce) {
        return iPersonnelService.addPersonnel(ce);
    }

    @PutMapping
    public Personnel updatePersonnel(@RequestBody Personnel ce) {
        return iPersonnelService.updatePersonnel(ce);
    }

    @GetMapping("/{idPersonnel}")
    public Personnel retrievePersonnel(@PathVariable long idPersonnel) {
        return iPersonnelService.retrievePersonnel(idPersonnel);
    }

    @DeleteMapping("/{idPersonnel}")
    public void removePersonnel(@PathVariable long idPersonnel) {
        iPersonnelService.removePersonnel(idPersonnel);
    }

    @PutMapping("affectPerso/{idZone}/{idGardien}/{idDirecteur}")
    @Transactional
    public void affecterPersonnelsAZone(@PathVariable long idZone,@PathVariable Long idGardien,@PathVariable long idDirecteur) {
        iPersonnelService.affecterPersonnelsAZone(idZone,idGardien,idDirecteur);
    }
}
