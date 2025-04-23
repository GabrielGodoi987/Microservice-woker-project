package worker.gabrielgodoi.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import worker.gabrielgodoi.microservice.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
