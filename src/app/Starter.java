package app;

public class Starter {
    public static void main(String[] args){
        App app = new App();
        app.PersonPrint();
        app.VehicleCreate();

        VehicleRentalManager manager = new VehicleRentalManager();
        manager.addPersonToDenyList(app.getPersonById(6));
    }
}
