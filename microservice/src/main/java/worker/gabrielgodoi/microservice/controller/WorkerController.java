package worker.gabrielgodoi.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import worker.gabrielgodoi.microservice.entities.Worker;
import worker.gabrielgodoi.microservice.services.WorkerService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workerList = this.workerService.findAll();
        return ResponseEntity.ok().body(workerList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findOne(@PathVariable Long id) {
        Worker worker = this.workerService.findOne(id);
        return ResponseEntity.ok().body(worker);
    }
}
