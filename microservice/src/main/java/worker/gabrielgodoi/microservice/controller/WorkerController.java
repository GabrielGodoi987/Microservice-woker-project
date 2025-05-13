package worker.gabrielgodoi.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
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
    private static final Logger logger = LoggerFactory.getLogger(WorkerController.class);
    private final WorkerService workerService;
    private final Environment env;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workerList = this.workerService.findAll();
        return ResponseEntity.ok().body(workerList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findOne(@PathVariable Long id) {
        logger.info("PORT = " + this.env.getProperty("local.server.port"));
        Worker worker = this.workerService.findOne(id);
        return ResponseEntity.ok().body(worker);
    }
}
