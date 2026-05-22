package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CLI {
    static Scanner sc = new Scanner(System.in);
    private List<Person> persons;
    private List<Vehicle> vehicles;
    private VehicleRentalManager manager;

    public CLI(VehicleRentalManager manager, List<Vehicle> vehicles, List<Person> persons) {
        this.manager = manager;
        this.vehicles = vehicles;
        this.persons = persons;
    }

    protected static void greetings(){
        System.out.println("              ____----------- _____");
        System.out.println("\\~~~~~~~~~~/~_--~~~------~~~~~     \\");
        System.out.println(" `---`\\  _-~      |                   \\");
        System.out.println("   _-~  <_         |                     \\[]");
        System.out.println(" / ___     ~~--[\"\"] |      ________-------'_");
        System.out.println("> /~` \\    |-.   `\\~~.~~~~~                _ ~ - _");
        System.out.println(" ~|  ||\\%  |       |    ~  ._                ~ _   ~ ._");
        System.out.println("   `_//|_%  \\      |          ~  .              ~-_   /\\");
        System.out.println("          `--__     |    _-____  /\\               ~-_ \\/.");
        System.out.println("               ~--_ /  ,/ -~-_ \\ \\/          _______---~/");
        System.out.println("                   ~~-/._<   \\ \\`~~~~~~~~~~~~~     ##--~/");
        System.out.println("                         \\    ) |`------##---~~~~-~  ) )");
        System.out.println("                          ~-_/_/                  ~~ ~~");
        System.out.println("WELCOME TO OUR GARAGE");
    }
    protected static int validateInput(int min, int max){
        int input = 0;
        try{
            input = parseInt(sc.nextLine());
        }catch (Exception e){
            System.out.println("Please enter again");
            return -1;
        }
        if (input >= 0 && input < 4)return input;
        else{
            System.out.println("Please enter again");
            return -1;
        }
    }

    protected static void menu(){
        System.out.println("-  [1] Customer");
        System.out.println("-  [2] Vehicles");
        System.out.println("-  [3] Renting");
        System.out.println("-  [0] Exit");
        int input = -1;
        do {input = validateInput(0,3);
        } while (input == -1);
        switch (input){
            case 0: return;
            case 1: customerMenu(); break;
            case 2: vehicleMenu(); break;
            case 3: rentingMenu(); break;
        }
    }

    protected static int customerMenu(){
        System.out.println("#----Customer Menu----#");
        System.out.println("- [1] Add Customer");
        System.out.println("- [2] Remove Customer");
        System.out.println("- [3] Edit Customer");
        System.out.println("- [4] Display Customer");
        System.out.println("- [5] Ban Customer");
        System.out.println("- [0] Back");
        int input = -1;
        do {input = validateInput(0,5);
        } while (input == -1);
        switch (input){
            case 0 -> menu();
            case 1 -> ;
            case 2 -> ;
            case 3 -> ;
            case 4 -> ;
            case 5 -> ;
            case 6 -> ;
        }
    }


    protected static int vehicleMenu(){
        System.out.println("#----Vehicle Menu----#");
        System.out.println("- [1] Add Vehicle");
        System.out.println("- [2] Remove Vehicle");
        System.out.println("- [3] Edit Vehicle");
        System.out.println("- [4] Display Vehicle");
        System.out.println("- [0] Back");
        int input = -1;
        do {input = validateInput(0,5);
        } while (input == -1);
        return input;
    }

    protected static int rentingMenu(){
        System.out.println("#----Renting Menu----#");
        System.out.println("- [1] Display Contracts");
        System.out.println("- [2] Make Contract");
        System.out.println("- [3] End Contract");
        System.out.println("- [0] Back");
        int input = -1;
        do {input = validateInput(0,3);
        } while (input == -1);
        return input;
    }

}
