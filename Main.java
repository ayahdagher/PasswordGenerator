import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{

    // making the initial 5 files, populating with 1000 ints in each

    //__________________________________________________________________//
    
    File Lower = new File("Lower.txt");
    PrintWriter outFileLower = new PrintWriter(Lower); 

    for (int loop = 1; loop <= 1000; loop++) 
    {
      outFileLower.print((int) ((Math.random() * (122 - 97)) + 97) + ", "); // generating the ints for lowercase
    }
    outFileLower.close();

    //__________________________________________________________________//

    File Upper = new File("Upper.txt");
    PrintWriter outFileUpper = new PrintWriter(Upper); 

    for (int loop = 1; loop <= 1000; loop++) 
    {
      outFileUpper.print((int) ((Math.random() * (90 - 65)) + 65) + ", "); // generating the ints for uppercase
    }
    outFileUpper.close();

    //__________________________________________________________________// 

    File Mixed_letters = new File("Mixed_letters.txt"); 
    PrintWriter outFileMixLet = new PrintWriter(Mixed_letters); 

    for (int loop = 1; loop <= 500; loop++) 
    {
      outFileMixLet.print((int) ((Math.random() * (122 - 97)) + 97) + ", "); // generating a int for lowercase
      outFileMixLet.print((int) ((Math.random() * (90 - 65)) + 65) + ", "); // generating a int for uppercase
    }
    outFileMixLet.close();

    //__________________________________________________________________//

    File Mixed_letters_numbers = new File("Mixed_letters_numbers.txt");
    PrintWriter outFileMixLetNum = new PrintWriter(Mixed_letters_numbers); 

    for (int loop = 1; loop <= 333; loop++) 
    {
      outFileMixLetNum.print((int) ((Math.random() * (122 - 97)) + 97) + ", "); // generating a int for lowercase
      outFileMixLetNum.print((int) ((Math.random() * (90 - 65)) + 65) + ", "); // generating a int for uppercase
      outFileMixLetNum.print((int) ((Math.random() * (57 - 48)) + 48) + ", "); // generating a int for number

    }
    outFileMixLetNum.print((int) ((Math.random() * (122 - 97)) + 97) + ", "); // generating a int for lowercase; the stuff above generate 999 ints, this is the 1000th

    outFileMixLetNum.close();

    //__________________________________________________________________// 

    File Mixed_chars = new File("Mixed_chars.txt");
    PrintWriter outFileMixChars = new PrintWriter(Mixed_chars); 

    for (int loop = 1; loop <= 250; loop++) 
    {
      outFileMixChars.print((int) ((Math.random() * (122 - 97)) + 97) + ", "); // generating a int for lowercase
      outFileMixChars.print((int) ((Math.random() * (90 - 65)) + 65) + ", "); // generating a int for uppercase
      outFileMixChars.print((int) ((Math.random() * (57 - 48)) + 48) + ", "); // generating a int for number
      
      // need to alternate between the different sets of characters

      if(loop % 4 == 1)
      {
       outFileMixChars.print((int) ((Math.random() * (47 - 33)) + 33) + ", "); // generating a int for character set 1
      }

      if(loop % 4 == 2)
      {
       outFileMixChars.print((int) ((Math.random() * (64 - 58)) + 58) + ", "); // generating a int for character set 2
      }

      if(loop % 4 == 3)
      {
       outFileMixChars.print((int) ((Math.random() * (96 - 91)) + 91) + ", "); // generating a int for character set 3
      }

      if(loop % 4 == 0)
      {
       outFileMixChars.print((int) ((Math.random() * (126 - 123)) + 123) + ", "); // generating a int for character set 4
      }
    }
 
    outFileMixChars.close();

    //__________________________________________________________________//

    // making the int arrays 

    int[] upperInts = new int[1000];
    int[] lowerInts = new int[1000];
    int[] mixedLetInts = new int[1000];
    int[] mixedLetNumInts = new int[1000];
    int[] allCharsInts = new int[1000];

    // populating the int arrays by reading data from an input file
    
    Scanner scanningUpper = new Scanner(Upper).useDelimiter(", ");
    int index1 = 0;

    while (scanningUpper.hasNext()) 
    {
      upperInts[index1] = scanningUpper.nextInt();
      index1++;
    }
    scanningUpper.close();

     //__________________________________________________________________//

    Scanner scanningLower = new Scanner(Lower).useDelimiter(", ");
    int index2 = 0;

    while (scanningLower.hasNext()) 
    {
      lowerInts[index2] = scanningLower.nextInt();
      index2++;
    }
    scanningLower.close();

    //__________________________________________________________________//

    Scanner scanningMixedLetInts = new Scanner(Mixed_letters).useDelimiter(", ");
    int index3 = 0;

    while (scanningMixedLetInts.hasNext()) 
    {
      mixedLetInts[index3] = scanningMixedLetInts.nextInt();
      index3++;
    }
    scanningMixedLetInts.close();

    //__________________________________________________________________//

    Scanner scanningMixedLetNumInts = new Scanner(Mixed_letters_numbers).useDelimiter(", ");
    int index4 = 0;

    while (scanningMixedLetNumInts.hasNext()) 
    {
      mixedLetNumInts[index4] = scanningMixedLetNumInts.nextInt();
      index4++;
    }
    scanningMixedLetNumInts.close();

//__________________________________________________________________//

    Scanner scanningAllCharsInts = new Scanner(Mixed_chars).useDelimiter(", ");
    int index5 = 0;

    while (scanningAllCharsInts.hasNext()) 
    {
      allCharsInts[index5] = scanningAllCharsInts.nextInt();
      index5++;
    }
    scanningAllCharsInts.close();

    // making the string arrays

    String[] upper = new String[1000];
    String[] lower = new String[1000];
    String[] mixed = new String[1000];
    String[] mixedNum = new String[1000];
    String[] allChars = new String[1000];

    // populating string array with appropriate int array values. converting 

    for(int k = 0 ; k < upper.length ; k ++)
    {
      upper[k] = Character.toString((char)upperInts[k]); // converting the int to a char, and the char to a string
    }
    
    for(int k = 0 ; k < lower.length ; k ++)
    {
      lower[k] = Character.toString((char)lowerInts[k]);; 
    }

    for(int k = 0 ; k < mixed.length ; k ++)
    {
      mixed[k] = Character.toString((char)mixedLetInts[k]);
    }

    for(int k = 0 ; k < mixedNum.length ; k ++)
    {
      mixedNum[k] = Character.toString((char)mixedLetNumInts[k]);
    }

    for(int k = 0 ; k < allChars.length ; k ++)
    {
      allChars[k] = Character.toString((char)allCharsInts[k]);
    }

    // menu for generating passwords

    System.out.println("Welcome to the password generator! Here, you can generate thousands of passwords safely stored in a txt file. Please select which type of password you would like to generate! \n \n 1. Lowercase letters \n 2. Uppercase letters \n 3. Uppercase and Lowercase letters \n 4. Uppercase, Lowercase, and Numbers \n 5. Uppercase, Lowercase, Numbers and Symbols \n 0. Exit \n \n Enter Selection by typing numbers 1, 2 ,3 ,4, 5 or 0 to Exit:");
  
    Scanner scan = new Scanner(System.in); 

    int input = scan.nextInt(); 

    if(input == 0)
    {
        System.out.println("Program ended. Have a nice day!")
    }

  
  
  
  
  
  }
} 