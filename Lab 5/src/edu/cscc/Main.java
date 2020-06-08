package edu.cscc;
//Michael Heironimus, 2.18.2020, The purpose of this program is to simulate a holding tank

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HoldingTank tank=new HoldingTank(600, 1000);
        tank.print();
        tank.add(300);
        tank.drain(50);
        tank.print();
        tank.add(500);
        tank.drain(250);
        tank.print();
        tank.drain(1200);
        tank.add(200);
        tank.drain(25);
        tank.print();

        //EXTRA USER INPUT OPTION
        //this will allow the user to create their own holding tank
        String choice;
        int userInput, userInput2;
        while(true){
            //this will loop until the user says they don't wish to create another holding tank
            System.out.println("Would you like to create another holding tank?");
            choice= input.nextLine();
            while (!("yes".equalsIgnoreCase(choice) || "y".equalsIgnoreCase(choice) || "no".equalsIgnoreCase(choice) || "n".equalsIgnoreCase(choice))){
                System.out.println("Would you like to create another holding tank? (enter 'yes' or 'no')");
                choice=input.nextLine();
            }
            if ("yes".equalsIgnoreCase(choice) || "y".equalsIgnoreCase(choice)){
                System.out.println("What is the max capacity?");
                userInput=Integer.parseInt(input.nextLine());
                while(userInput<0){
                    System.out.println("The max capacity cannot be less then 0, please enter a max capacity greater than 0:");
                    userInput=Integer.parseInt(input.nextLine());
                }
                System.out.println("What is the current capacity?");
                userInput2=Integer.parseInt(input.nextLine());
                while (userInput2>userInput || userInput2<0){
                    System.out.println("The current capacity cannot be greater than the max capacity or less than 0");
                    System.out.println("please enter a number less than or equal to the max capacity and greater than or equal to 0.");
                    userInput2=Integer.parseInt(input.nextLine());
                }
                tank=new HoldingTank(userInput2, userInput);
                while (!("quit".equalsIgnoreCase(choice))){
                    // this will loop until the user is done with the current holding tank
                    System.out.println("Would you like to add to the current capacity, drain from the current capacity, print the current capacity or quit?");
                    System.out.println("Please enter 'add', 'drain' 'print' or 'quit'");
                    choice=input.nextLine();
                    while (!("add".equalsIgnoreCase(choice) || "drain".equalsIgnoreCase(choice) || "print".equalsIgnoreCase(choice) || "quit".equalsIgnoreCase(choice))){
                        System.out.println("Would you like to add to the current capacity, drain from the current capacity, print the current capacity or quit?");
                        System.out.println("Please enter 'add', 'drain' 'print' or 'quit'");
                        choice=input.nextLine();
                    }
                    //this next bunch of if else ifs will conduct the add, drain or print function on the tank
                    if ("add".equalsIgnoreCase(choice)){
                        System.out.println("How much would you like to add to the tank?");
                        userInput=Integer.parseInt(input.nextLine());
                        while (userInput<0){
                            System.out.println("Cannot add a negative number to the tank. Please enter a non negative number.");
                            userInput=Integer.parseInt(input.nextLine());
                        }
                        tank.add(userInput);
                    } else if ("drain".equalsIgnoreCase(choice)){
                        System.out.println("How much would you like to drain from the tank?");
                        userInput=Integer.parseInt(input.nextLine());
                        while (userInput<0){
                            System.out.println("Cannot drain a negative number from the tank. Please enter a non negative number.");
                            userInput=Integer.parseInt(input.nextLine());
                        }
                        tank.drain(userInput);
                    } else if ("print".equalsIgnoreCase (choice)){
                        tank.print();
                    }
                    }
                }
                if ("no".equalsIgnoreCase(choice)||("yes".equalsIgnoreCase(choice))){
                    break;
            }
        }
    }
}
