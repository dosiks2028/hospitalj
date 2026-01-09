import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> hospitalList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- HOSPITAL SYSTEM ---");
            System.out.println("1. Add Person");
            System.out.println("2. Add Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. View All Objects");
            System.out.println("5. Demonstrate Polymorphism");
            System.out.println("6. Specific Child Methods (instanceof)");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    hospitalList.add(new Person(1, "Staff Member", "B+", "Office"));
                    System.out.println("Added Person.");
                    break;
                case 2:
                    hospitalList.add(new Patient(10, "Alice", "O-", "555-01", "Flu", 101));
                    System.out.println("Added Patient.");
                    break;
                case 3:
                    hospitalList.add(new Doctor(20, "Dr. House", "A+", "555-99", "Diagnostic"));
                    System.out.println("Added Doctor.");
                    break;
                case 4:
                    for (Person p : hospitalList) { p.displayBasicInfo(); }
                    break;
                case 5:
                    for (Person p : hospitalList) {
                        p.performAction();
                        p.checkStatus();
                    }
                    break;
                case 6:
                    for (Person p : hospitalList) {
                        if (p instanceof Patient) {
                            ((Patient) p).takeMedication();
                        } else if (p instanceof Doctor) {
                            ((Doctor) p).writePrescription();
                        }
                    }
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}