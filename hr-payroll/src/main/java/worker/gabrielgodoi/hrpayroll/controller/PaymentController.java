package worker.gabrielgodoi.hrpayroll.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import worker.gabrielgodoi.hrpayroll.entities.Payment;
import worker.gabrielgodoi.hrpayroll.services.PaymentService;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = this.paymentService.getPayment(workerId, days);
        return ResponseEntity.ok().body(payment);
    }
}
