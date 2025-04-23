package worker.gabrielgodoi.hrpayroll.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import worker.gabrielgodoi.hrpayroll.entities.Payment;
import worker.gabrielgodoi.hrpayroll.entities.Worker;
import worker.gabrielgodoi.hrpayroll.errors.NotFoundException;
import worker.gabrielgodoi.hrpayroll.feignClient.WorkerFeignClient;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class PaymentService {
    private final WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = this.workerFeignClient.findById(workerId).getBody();

        if (worker == null)
            throw new NotFoundException("user not found");

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
