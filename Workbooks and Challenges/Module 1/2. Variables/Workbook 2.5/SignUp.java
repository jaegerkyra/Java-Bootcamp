import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("\nWhat is your first name?");
        String name = scan.nextLine();

        //Ask for their last name.
        System.out.println("\nWhat is your last name?");
        String name = scan.nextLine();

        //Ask: how old are you?
        System.out.println("\nHow old are you?");
        String name = scan.nextLine();

        //Ask them to make a username.
        System.out.println("\nWhat username would you like to use?");
        String name = scan.nextLine();

        //Ask what city they live in.
        System.out.println("\nWhat city do you live in?");
        String name = scan.nextLine();
        
        //Ask what country that's from.
        System.out.println("\nWhat country is that?");
        String name = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        


        //close scanner. It's good practice :D ! 
    }
}