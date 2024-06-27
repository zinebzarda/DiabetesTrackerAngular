package DiabetesTracker.DiabetesTrackerAngular.repository;

import DiabetesTracker.DiabetesTrackerAngular.model.Glycemia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlycemiaRepository extends JpaRepository<Glycemia,Integer> {

}