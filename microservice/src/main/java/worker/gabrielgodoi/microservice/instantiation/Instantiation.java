package worker.gabrielgodoi.microservice.instantiation;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import worker.gabrielgodoi.microservice.entities.Worker;
import worker.gabrielgodoi.microservice.repositories.WorkerRepository;

import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
public class Instantiation implements CommandLineRunner {
    private final WorkerRepository workerRepository;

    @Override
    public void run(String... args) throws Exception {
        Worker w1 = new Worker(null, "John Doe", 1000.0);
        Worker w2 = new Worker(null, "Jane Smith", 1200.0);
        Worker w3 = new Worker(null, "Alice Johnson", 1100.0);
        Worker w4 = new Worker(null, "Bob Brown", 900.0);
        Worker w5 = new Worker(null, "Charlie Davis", 950.0);
        Worker w6 = new Worker(null, "Diana Evans", 1150.0);
        Worker w7 = new Worker(null, "Ethan Foster", 1300.0);
        Worker w8 = new Worker(null, "Fiona Green", 1250.0);
        Worker w9 = new Worker(null, "George Harris", 1050.0);
        Worker w10 = new Worker(null, "Hannah Ives", 980.0);

        workerRepository.saveAll(Arrays.asList(w1, w2, w3, w4, w5, w6, w7, w8, w9, w10));
    }
}
