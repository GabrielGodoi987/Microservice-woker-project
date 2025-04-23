package worker.gabrielgodoi.microservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import worker.gabrielgodoi.microservice.entities.Worker;
import worker.gabrielgodoi.microservice.repositories.WorkerRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkerService {
    private final WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return this.workerRepository.findAll();
    }
}
