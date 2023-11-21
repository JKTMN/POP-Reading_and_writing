import java.io.*;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
/**
 * FileWriting class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class FileWriting {

    /** writeYourName()
     * takes a name input and stores it on separate lines inside of a file, runs on a while loop that works while
     * the input has a next value
     *
     * @param name the name to store in a file
     * @return the file name
     * @throws Exception throws exceptions
     */
    public String writeYourName(String name) throws Exception {
        String fileName = "writeYourName.txt";      //file location
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName));      //writer to write to the file
        Scanner scanner = new Scanner(name);    //scanner that detects the input
        while (scanner.hasNext()){  //while loop that runs while input has next value
            bWriter.write(scanner.next());      //writes the value to the file
            bWriter.newLine();      //puts the writer to the next line

        }
        scanner.close();        //closes scanner and writer
        bWriter.close();

        return fileName;
   }

    /** writeRandomNumbers()
     * takes a number as an input and creates that many random numbers within 1000 and 9999,
     * it generates between 0 and 8999 and adds 1000 so its within the correct range and writes them
     * to a file using a for loop that runs until it reaches the input bound
     *
     * @param amountOfNumbers the amount of numbers to be generated
     * @return the file name
     * @throws Exception throws exceptions
     */
	public String writeRandomNumbers(int amountOfNumbers) throws Exception{
        String fileName = "writeRandomNumbers.txt";     //file location
        PrintWriter pWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));  //writer to write to the file
        Random randomNumberGenerator = new Random();    //creates random number generator
        int[] numbers = new int[amountOfNumbers];       //creates empty array to temporarily store the numbers in

        for (int index = 0; index < amountOfNumbers; index++){      //for loop that runs for the input bound
            numbers[index] = randomNumberGenerator.nextInt(9000) + 1000;        //adding the random number to
            //the empty array, random gen generates number between 0-8999 then adds 1000
            pWriter.write(" " + numbers[index]);        //writes array index storing the random number to the file
        }
        pWriter.close();        //closes the scanner
        return fileName;    //returns the file name
    }
}
