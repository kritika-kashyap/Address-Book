import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do{
            System.out.println("Enter 1 to create contact"); 
            int input = sc.nextInt();

            switch(input) {
                case 1 -> createContact(a1);
                default -> System.out.println("Wrong input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        }while(i != 0);

        System.out.println("Thankyou for using address book");
        sc.close();
    }

    static void createContact(AddressBook a1) {
        Scanner sc = new Scanner(System.in);
        
    }
}