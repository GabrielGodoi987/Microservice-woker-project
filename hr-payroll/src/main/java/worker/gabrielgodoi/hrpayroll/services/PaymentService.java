package worker.gabrielgodoi.hrpayroll.services;

import org.springframework.stereotype.Service;
import worker.gabrielgodoi.hrpayroll.entities.Payment;

@Service
public class PaymentService {
    public Payment getPayment(Long workerId, int days){
        return new Payment("bob", 200.00, days);
    }
}
