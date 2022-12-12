package tn.esprit.examblanc.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examblanc.Service.IZoneService;
import tn.esprit.examblanc.entities.Zone;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Zone")

public class ZoneController {

    IZoneService iZoneService;


    @GetMapping
    public List<Zone> retrieveAllZones() {
        return iZoneService.retrieveAllZones();
    }

    @PostMapping
    public Zone addZone(@RequestBody Zone ce) {
        return iZoneService.addZone(ce);
    }

    @PutMapping
    public Zone updateZone(@RequestBody Zone ce) {
        return iZoneService.updateZone(ce);
    }

    @GetMapping("/{idZone}")
    public Zone retrieveZone(@PathVariable long idZone) {
        return iZoneService.retrieveZone(idZone);
    }

    @DeleteMapping("/{idZone}")
    public void removeZone(@PathVariable long idZone) {
        iZoneService.removeZone(idZone);
    }

    @PutMapping("affectMusee/{idMusee}")
    @Transactional
    public Zone ajouterZoneEtAffecterAMusee(@RequestBody Zone ce,@PathVariable Long idMusee) {
        return iZoneService.ajouterZoneEtAffecterAMusee(ce,idMusee);
    }
}
