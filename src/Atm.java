import java.util.Scanner;
/*
Course: PROG10082, Section 10082-63753
Student:  Sarthak Sharma
Summary:  ATM class with all the methods that perform all ATM actions
*/

  public final class Atm {
  // Use Attributes below:
  //create an array of 10 private accounts 
  private Account[] accounts = new Account[10];
  Scanner input = new Scanner (System.in);
  //private static java.util.Scanner input = new java.util.Scanner(System.in);
  int id;

  // Do NOT change anything in the main class. It's calling Atm() Constructor.
  //main class 
  public static void main(String[] args) {
      Atm atm = new Atm();
  }

  // Modify the code below!! Do not create any other methods!
  //main atm class
  public Atm() {
     //Creates an ID for every Account and Sets balance to $100 for All Accountss
        for (int i = 0; i < accounts.length; i++) {
            //add 100$ in each account
            accounts[i] = new Account(i, 100.00);
        }
        
        do {
            //Prompt for ID
            System.out.println("Please enter an ID: ");
            int id = input.nextInt();
            while(id < 0 || id > 9) 
            {
                System.out.println("No such account");
                System.out.println("Please enter an ID: ");
                id = input.nextInt();
            }//End of error correcting while loop
            
            boolean access = true;
            //Loop for ID, if valid ID breaks loop
            while (access) {
                System.out.println();
                System.out.println("*****************");
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt(); 
            switch (choice)
            {
            case 1: System.out.println("The balance is $"  + accounts[id].getBalance()); break;
                    
            case 2:     
                System.out.println("Enter an ammount to withdraw ");
                double withdraw = input.nextDouble();
                accounts[id].withdraw(withdraw);
                break;
                    
            case 3:     
                System.out.println("Enter an amount to deposit ");
                double deposit = input.nextDouble();
                accounts[id].deposit(deposit);
                break;
            case 4: access=false; break;
            
            default: System.out.println("Invalid Choice");
            }
            }
        }
        while (true);
  }


}