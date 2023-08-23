package tests.absoft.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Phone iPhone = new Phone();
                Phone samsung = new Phone();
                Phone huawei = new Phone();

                inputPhoneDetails(iPhone, "iPhone");
                inputPhoneDetails(samsung, "Samsung");
                inputPhoneDetails(huawei, "Huawei");

                displayPhoneDetails(iPhone);
                displayPhoneDetails(samsung);
                displayPhoneDetails(huawei);
            }

            public static void inputPhoneDetails(Phone phone, String phoneName) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter details for " + phoneName);
                System.out.print("Model: ");
                phone.setModel(scanner.nextLine());

                System.out.print("Number: ");
                phone.setNumber(scanner.nextLine());

                System.out.print("Weight: ");
                phone.setWeight(scanner.nextDouble());

                scanner.nextLine();
            }

            public static void displayPhoneDetails(Phone phone) {
                System.out.println();
                System.out.println(phone.getModel() + ":");
                System.out.println("Model is " + phone.getModel());
                System.out.println("Number is " + phone.getNumber());
                System.out.println("Weight is " + phone.getWeight());
                System.out.println();
            }
        }