package DiabetesTracker.DiabetesTrackerAngular.controller;

import DiabetesTracker.DiabetesTrackerAngular.model.Glycemia;
import DiabetesTracker.DiabetesTrackerAngular.service.GlycemiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/glycemia")
public class GlycemiaContoller {

    @Autowired
    private final GlycemiaService service;

    public GlycemiaContoller(GlycemiaService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Glycemia addGlycemiaSubmit(@ModelAttribute Glycemia glycemia) {
        service.addGlycemia(glycemia);
        return glycemia;
    }

    @GetMapping("/showAll")
    public List<Glycemia> showEtudients(){
        return service.showGlycemia();
    }

}
