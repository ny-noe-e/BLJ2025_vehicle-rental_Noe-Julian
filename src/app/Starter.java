package app;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args){
        VehicleRentalManager manager = new VehicleRentalManager();
        App app = new App();

        app.PersonPrint();
        app.vehiclePrint();

        manager.addPersonToDenyList(app.getPersonById(6));

        manager.createContract(
                app.getPersonById(3),
                app.getVehicleByLicensePlate("ZH 7043190"),
                LocalDate.of(2008, 03, 06),
                LocalDate.of(2009, 03, 06),
                "new"
        );


    }
}
