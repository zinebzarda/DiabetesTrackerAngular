package DiabetesTracker.DiabetesTrackerAngular.service;

import DiabetesTracker.DiabetesTrackerAngular.model.Glycemia;
import DiabetesTracker.DiabetesTrackerAngular.repository.GlycemiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class GlycemiaService {

    @Autowired

    GlycemiaRepository glycemiaRepository;

    public Glycemia addGlycemia( Glycemia glycemia) {
        return glycemiaRepository.save(glycemia);
    }

    public List<Glycemia> showGlycemia() {
        return glycemiaRepository.findAll();
    }


    public void DeleteGlycemia(int id) {
        glycemiaRepository.deleteById(id);
    }

//    public void updateGlycemia(int id, Glycemia updatedReading) {
//        Glycemia existingReading = glycemiaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Glycemia", "id", id));
//        existingReading.setLevel(updatedReading.getLevel());
//        existingReading.setDate(updatedReading.getDate());
//        glycemiaRepository.save(existingReading);
//    }
}
