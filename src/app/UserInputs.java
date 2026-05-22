package app;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInputs {

    private static Scanner sc = new Scanner(System.in);

    protected Person createPersonCLI(){
        int id;
        LocalDate birthYear;
        String name;
        String firstName;
        String address;
        try {
            System.out.println("Enter customer ID: ");
            id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter name: ");
            name = sc.nextLine();
            if (name == null || name.length() < 2) throw new
                    IllegalArgumentException("Name is not longer than 2 letters, enter again");
            System.out.println("Enter first name: ");
            firstName = sc.nextLine();
            if (firstName == null || firstName.length() < 2) throw new
                    IllegalArgumentException("First Name is not longer than 2 letters, enter again");
            System.out.println("Enter address: ");
            address = sc.nextLine();
            if (address == null || address.length() < 4) throw new
                    IllegalArgumentException("Address is not longer than 4 letters, enter again");
            System.out.println("Enter birthdate (yyyy-MM-dd): ");
            birthYear = LocalDate.parse(sc.nextLine());
            return new Person(id, birthYear, name, firstName, address);

        }catch (NumberFormatException e) {
            System.out.println("Error: ID must be a valid number!");
            return null;
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Error: Invalid date format! Please use yyyy-MM-dd (e.g., 2004-08-09).");
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
