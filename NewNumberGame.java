/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newnumbergame; 
import java.util.*; 
 
/** 
* 
* @author Cameron.Sutton 
*/ 
public class NewNumberGame 
{ 
  
 
/** 
* @param args the command line arguments 
*/ 
public static boolean compareNums(int num1, int num2) 
{ 
    if (num1 == num2) 
    { 
        return true;
    } 
    else 
    { 
        return false; 
    } 
} 
  




public static void main(String[] args) 
{ 
    int count = 0;
    boolean finish = false;
    
    Scanner input = new Scanner(System.in); 
    Random rn = new Random(); 
    int answer = rn.nextInt(999); 
    while(finish == false)
    {
        System.out.println("Enter your guess."); 
        int userGuess = input.nextInt(); 
        count ++;
        
        //System.out.println("The computer generated: " + answer);
     
            
            if (compareNums(answer, userGuess)) 
            { 
                System.out.println("Well done. You guessed correctly."); 
                finish = true;
                System.out.println ("It took you count tries");
            } 
            else 
            { 
                System.out.println("Sorry, you guessed incorrectly. Try again");
                System.out.println("");
                if (userGuess < answer)
                {
                     System.out.println("Your guess is too low");
                     System.out.println("");
                }
                else
                {
                    System.out.println("Your guess is too high");
                    System.out.println("");
                }
                
            } 


    }





} 
  
}
