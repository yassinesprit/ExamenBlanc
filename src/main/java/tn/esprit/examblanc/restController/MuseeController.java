package tn.esprit.examblanc.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examblanc.Service.IMuseeService;
import tn.esprit.examblanc.entities.Musee;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Musee")
public class MuseeController {

    IMuseeService iMuseeService;

    @GetMapping
    public List<Musee> retrieveAllMusees() {
        return iMuseeService.retrieveAllMusees();
    }

    @PostMapping
    public Musee addMusee(@RequestBody Musee ce) {
        return iMuseeService.addMusee(ce);
    }

    @PutMapping
    public Musee updateMusee(@RequestBody Musee ce) {
        return iMuseeService.updateMusee(ce);
    }

    @GetMapping("/{idMusee}")
    public Musee retrieveMusee(@PathVariable long idMusee) {
        return iMuseeService.retrieveMusee(idMusee);
    }

    @DeleteMapping("/{idMusee}")
    public void removeMusee(@PathVariable long idMusee) {
        iMuseeService.removeMusee(idMusee);
    }
}
