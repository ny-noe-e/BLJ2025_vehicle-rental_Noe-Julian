package app;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CLI {
    static Scanner sc = new Scanner(System.in);

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

    protected static int menu(){
        System.out.println("-  [1] Customer");
        System.out.println("-  [2] Vehicles");
        System.out.println("-  [3] Renting");
        System.out.println("-  [0] Exit");
        int input = 0;
        try{
            input = parseInt(sc.nextLine());
        }catch (Exception e){
            System.out.println("Please enter again");
            menu();
        }
        if (input >= 0 && input < 4)return input;
        else{
            System.out.println("Please enter again");
            menu();
        }
        return -1;
    }
}
