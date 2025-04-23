package worker.gabrielgodoi.hrpayroll.controller.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StandardError implements Serializable {
    private String message;
    private Integer status;
    private String path;
    private LocalDateTime timestamp;
}
