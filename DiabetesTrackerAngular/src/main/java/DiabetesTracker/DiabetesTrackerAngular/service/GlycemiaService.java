package DiabetesTracker.DiabetesTrackerAngular.service;

import DiabetesTracker.DiabetesTrackerAngular.model.Glycemia;
import DiabetesTracker.DiabetesTrackerAngular.repository.GlycemiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlycemiaService {

    @Autowired

    GlycemiaRepository glycemiaRepository;

    public Glycemia addGlycemia(Glycemia glycemia) {
        return glycemiaRepository.save(glycemia);
    }

    public List<Glycemia> showGlycemia() {
        return glycemiaRepository.findAll();
    }

}
