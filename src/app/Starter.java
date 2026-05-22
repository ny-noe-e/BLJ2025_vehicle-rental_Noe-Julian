package app;

import exceptions.*;
import java.time.LocalDate;

public class Starter {
    public static void main(String[] args){
        VehicleRentalManager manager = new VehicleRentalManager();
        App app = new App();
        CLI cli = new CLI(manager, app.getVehicles(), app.getPersons(), app);

        for (Person p : app.getPersons()) {
            manager.addCustomer(p);
        }
        for (Vehicle v : app.getVehicles()) {
            manager.addVehicle(v.getLicensePlate(), v.getBrand(), v.getModel(), v.getPricePerDay());
        }
        cli.greetings();
        System.out.println("-----------initialised garage-----------");
        app.PersonPrint();
        app.vehiclePrint();
        System.out.println("----------------------------------------\n");
        cli.menu();




        /*
        manager.addPersonToDenyList(app.getPersonById(6));


        Person minorPerson = new Person(99, LocalDate.of(2012, 5, 20), "Frischling", "Fritz", "Jugendweg 4");
        manager.addCustomer( LocalDate.of(2012,5,20), "Minor", "Mouse",  "Washedstreet 99", 99);





        System.out.println("### CASE 1: Valid Contract (should work) ###");
        createContractTest(
                manager,
                app.getPersonById(1),
                app.getVehicleByLicensePlate("ZH 7043190"),
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                "Perfect condition"
        );


        System.out.println("\n### CASE 2: test invalid date ###");
        createContractTest(
                manager,
                app.getPersonById(2),
                app.getVehicleByLicensePlate("ZH 3249191"),
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(5),
                "Normal"
        );


        System.out.println("\n### CASE 3: test denied-list person 6 ###");
        createContractTest(
                manager,
                app.getPersonById(6),
                app.getVehicleByLicensePlate("ZH 3249191"),
                LocalDate.now(),
                LocalDate.now().plusDays(3),
                "Normal"
        );


        System.out.println("\n### CASE 4: test minor (u18) ###");
        createContractTest(
                manager,
                minorPerson,
                app.getVehicleByLicensePlate("ZH 3249191"),
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                "Normal"
        );


        System.out.println("\n### CASE 5: Test LeaseLengthCollision ###");
        createContractTest(
                manager,
                app.getPersonById(3),
                app.getVehicleByLicensePlate("ZH 7043190"),
                LocalDate.now().plusDays(2),
                LocalDate.now().plusDays(4),
                "Kollisionstest"
        );

    }
    private static void createContractTest
            (VehicleRentalManager manager, Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate, String condition){
        try {
            Contract c = manager.createContract(
                    person,
                    vehicle,
                    startDate,
                    endDate,
                    condition
            );
            System.out.println("-> Contract successfully generated!");
            System.out.println("----------------------------------------");
            System.out.print(c.writeToFile(c));

        } catch (DenylistedPersonException e){
            System.out.println("-> Person got successfully denied");
            System.out.println("Abgefangen: " + e.getMessage() + "\n----------------------------------------");
        } catch (IllegalArgumentException e){
            System.out.println("-> Invalid Date got successfully detected");
            System.out.println("Abgefangen: " + e.getMessage() + "\n----------------------------------------");
        } catch (LeaseLengthCollisionException e){
            System.out.println("-> Already rent vehicle detected");
            System.out.println("Abgefangen: " + e.getMessage() + "\n----------------------------------------");
        } catch (MinorAgeException e) {
            System.out.println("-> Minor age successfully detected");
            System.out.println("Abgefangen: " + e.getMessage() + "\n----------------------------------------");
        } catch (Exception e){
            System.out.println("-> Unexpected Exception happened");
            System.out.println("Abgefangen: " + e + "\n----------------------------------------");
        }
    */
    }

}
