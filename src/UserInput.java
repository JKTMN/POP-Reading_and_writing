import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * UserInput class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class UserInput {

    /** sayHello()
     * asks the user for their name, allowing them to use the keyboard and returns a hello message using their name
     *
     * @return hello plus the name
     */
	public String sayHello() {
        Scanner keyboard = new Scanner(System.in);      //creates keyboard scanner
        System.out.print("What is your name?: ");       //asks for the user input
        String name = keyboard.next();      //puts the input into a variable
        keyboard.close();      //closes keyboard scanner
        return "hello" + " " + name;        //returns the message
	}

    /** readTenNumbers()
     * asks the user to input 10 numbers using a while loop to keep it going until it reaches the desired amount
     * and stores them in an empty array
     *
     * @return the array storing the numbers
     */
    public int[] readTenNumbers() {
        int[] numbers = new int[10];        //empty array
        int index = 0;
        Scanner keyboard = new Scanner(System.in);      //creates a keyboard scanner
        do {
            System.out.print("Enter a number: ");       //asks the user for the numbers
            numbers[index] = Integer.parseInt(keyboard.next());     //puts the input into the array
            index++;
        } while (index <= 9);

        keyboard.close();       //closes the array
        return numbers;
    }

    /** readTenNames()
     * asks the user for 10 names using a while loop, until it reaches the 10 names
     * and stores them in an array
     *
     * @return the array storing the names
     */
	 public String[] readTenNames() {
        String[] names = new String[10];        //creates empty array
        int index = 0;
        Scanner keyboard = new Scanner(System.in);      //creates the keyboard scanner
        do {
            System.out.print("Enter a name: ");     //asks the user for the names
            names[index] = keyboard.next();     //stores the names in the array
            index++;
        } while (index <= 9);

        keyboard.close();       //closes the scanner
		return names;
	}
}
