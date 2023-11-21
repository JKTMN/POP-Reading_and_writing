import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 * FileReading class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class FileReading {

    /** readName1()
     * reads two names from a file and stores concatenates them in a variable and returns them
     *
     * @param fileLocation the file location to read from
     * @return the variable storing the name
     * @throws Exception throws exceptions
     */
    public String readName1(String fileLocation) throws Exception {
        String output;
        Scanner reader = new Scanner(new File (fileLocation));      //scanner to read from the file
        output =  reader.nextLine() + " " + reader.nextLine();      //puts the names to variable after formatting it
        reader.close();     //closes the scanner
        return output;
    }

    /** readName2()
     * reads two names from a file and stores concatenates them in a variable, but catches the IO exception
     * if the file input is incorrect
     *
     * @param fileLocation the file location to read from
     * @return the variable storing the name or the error message
     */
    public String readName2(String fileLocation) {
        String output;
        try {
            Scanner reader = new Scanner(new File (fileLocation));      //scanner to read from the file
            output =  reader.nextLine() + " " + reader.nextLine();      //puts the names to variable after formatting it
            reader.close();     //closes the scanner
        }
        catch (IOException e) {     //catches exception
            output = ( "Invalid filename");    // error message
        }
        return output;
    }

    /** readNames()
     * reads names from a file using a for loop and stores them in an empty array
     *
     * @param fileLocation the file location to read from
     * @return the array storing the names
     * @throws Exception throws exceptions
     */
    public String[] readNames(String fileLocation) throws Exception {
        String[] names = new String[10];        //creates empty array
        Scanner reader = new Scanner(new File (fileLocation));      //scanner reading from the file
        for (int index = 0; index <= 9; index++){       //for loop
            names[index] = reader.nextLine();       //reading the names and storing them in the array
        }
        reader.close();     //closes the scanner
        return names;
    }

    /** readNumbers1()
     * reads numbers from a file using a while loop and stores them in an empty array
     *
     * @param fileLocation file location to read from
     * @return the array storing the numbers
     * @throws Exception throws exceptions
     */
    public int[] readNumbers1(String fileLocation) throws Exception {
        int[] numbers = new int[20];    //creates empty array
        Scanner reader = new Scanner(new File(fileLocation));   //scanner to read the file
        int index = 0;
        while (reader.hasNextLine()){       //while loop that runs while file has next line
            numbers[index] = reader.nextInt();      //puts the number into the array
            index++;
        }
        reader.close();         //closes scanner
        return numbers;
    }

    /** readNumbers2()
     * reads ints from a file using a while loop, filtering anything that isn't an int out
     * and adding it to an empty array
     *
     * @param fileLocation file location to read from
     * @return the array storing the numbers
     * @throws Exception throws exceptions
     */
    public int[] readNumbers2(String fileLocation) throws Exception {
        int[] numbers = new int[20];    //creates empty array
        Scanner reader = new Scanner(new File (fileLocation));  //scanner to read the file
        int index = 0;
        while (reader.hasNext()) {       //while loop that runs while the file has a next value
            if (reader.hasNextInt()) {      //checks if the file has a next number
                numbers[index] = reader.nextInt();      //adds the number to the empty array
                index++;
            } else {
                reader.next();      //if the next value isn't an integer, it skips the value
            }
        }
        reader.close();         //closes scanner
        return numbers;     //returns the numbers array
    }

    /** readAddressBook()
     * reads names and numbers from a file using a while loop, formats the name and numbers with a colon
     * inside a variable and adds it to the empty array
     *
     * @param fileLocation file location to read from
     * @return the array storing the numbers
     * @throws Exception throws exceptions
     */
    public String[] readAddressBook(String fileLocation) throws Exception {
        String[] addressBook = new String[5];       //creates empty array
        Scanner reader = new Scanner(new File (fileLocation));      //scanner to read file
        int index = 0;
        while (reader.hasNext()){      //while loop that runs while file has next value
            String name = reader.nextLine();       //puts nextLine value into a name variable
            String number = reader.nextLine();     //puts nextLine value into a number variable
            String output = name + ":" + " " + number;   //formats the name and number together a variable
            addressBook[index] = output;       //adds the formatted name and number into the empty array
            index++;
        }
        reader.close();        //closes scanner
        return addressBook;     //returns the address book array
    }
}
