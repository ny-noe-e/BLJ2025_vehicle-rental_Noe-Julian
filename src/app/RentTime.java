package app;

import java.time.LocalDate;

public class RentTime {
    protected LocalDate startRent;
    protected LocalDate endRent;

    public RentTime(LocalDate startRent, LocalDate endRent){
        this.startRent = startRent;
        this.endRent = endRent;
    }

}
