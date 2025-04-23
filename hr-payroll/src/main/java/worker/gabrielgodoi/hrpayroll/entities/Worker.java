package worker.gabrielgodoi.hrpayroll.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Worker {
    private String id;
    private String name;
    private Double dailyIncome;
}
