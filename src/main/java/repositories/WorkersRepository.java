package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pcs.car_store.models.Workers;

@Repository
public interface WorkersRepository extends JpaRepository<Workers, Integer> {

}