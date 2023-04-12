package week5coding;

public class SpacedLogger implements Logger{   // Implement Logger interface

  @Override
  public void Log(String log) {             //the Log method
     
      for(int x = 0; x < log.length(); x++){  //for loop to go through the word 
        char curr = log.charAt(x);            //and select the current character
        System.out.print(curr + " ");          //print out the current character adds a space 
      }
      System.out.println();                     
  }

  @Override                             
  public void Error(String error) {         //the Error method
    System.out.print("Error: ");           //prints out Error:
    for(int x = 0; x < error.length(); x++){   //loop to go through the word 
      char curr = error.charAt(x);          //current character in the loop
      System.out.print(curr + " ");       // print out current character adds a space

    
  }
  }
}
