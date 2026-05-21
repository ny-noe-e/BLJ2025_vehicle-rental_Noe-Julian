package app;

import java.time.LocalDate;
import java.util.UUID;

public class RentTime {
    LocalDate startRent;
    LocalDate endRent;
    UUID id;

    public RentTime(LocalDate startRent, LocalDate endRent){
        this.startRent = startRent;
        this.endRent = endRent;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
