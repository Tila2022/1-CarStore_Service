package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pcs.car_store.models.Specifications;
import java.util.List;

@Repository
public interface SpecificationsRepositories extends JpaRepository<Specifications, Integer> {
    List<Specifications> findByIndicatorNumbers(Integer car_id);
}