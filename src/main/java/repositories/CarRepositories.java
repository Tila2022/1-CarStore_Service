package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pcs.car_store.models.Car;
import java.util.List;

@Repository
public interface CarRepositories extends JpaRepository<Car, Integer> {
    List<Car> findAllByCarId(int car_id);
}