// THIS PROGRAMME IS MADE BY ANSHDEEP
// P NO - 19


//Java program to find the square root of a number

//Simple Program (With inbuilt function)

//Importing Scanner Class of util package
import java.util.Scanner;
//Importing Math Class of lang package
import java.lang.Math;

//Main Class of the program
public class Main
{
    //Main method of the program
    public static void main(String[] args) {
        //Giving hint to the user for, What to enter
        System.out.print("Please enter the number : ");
        //Creating the object of Scanner Class
        Scanner input = new Scanner(System.in);
        //Taking input from user
        float number_1 = input.nextFloat();
        //Printing the output
        System.out.println("Square root of "+ number_1+ " is: "+Math.sqrt(number_1));
    }
}
