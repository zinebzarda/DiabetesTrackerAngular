package DiabetesTracker.DiabetesTrackerAngular.controller;

import DiabetesTracker.DiabetesTrackerAngular.model.Glycemia;
import DiabetesTracker.DiabetesTrackerAngular.service.GlycemiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/glycemia")
@CrossOrigin(origins = "http://localhost:4200/")
public class GlycemiaContoller {

    @Autowired
    private final GlycemiaService service;

    public GlycemiaContoller(GlycemiaService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Glycemia addGlycemiaSubmit(@RequestBody Glycemia glycemia) {
        service.addGlycemia(glycemia);
        return glycemia;
    }

    @GetMapping("/showAll")
    public List<Glycemia> showEtudients(){
        return service.showGlycemia();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGlycemia(@PathVariable int id) {
        service.DeleteGlycemia(id);
    }

    @PutMapping("/edit/{id}")
    public void editGlycemia(@PathVariable int id, @RequestBody Glycemia glycemia) {
//        service.updateGlycemia(id, glycemia);
    }
}
