package week5coding;

public class AsteriskLogger implements Logger{  // implement Logger interface

  @Override                                     //this will override
  public void Log(String log) {                 // takes the string it receives
   System.out.println("***" + log + "***");   //prints out the word between 3 asterisks
  } 

  @Override
  public void Error(String error) {
    
      String out = "***" + "Error: " + error + "***"; //Used the string with Error as a guide to make the 
                                                     //above and below lines with asterisks
      
      

      String stars = "";
      for (int i=0; i < out.length(); i++) stars += "*";  // for loop to make asterisks according to the length of the string with Error

      System.out.println( stars + "\n" + out + "\n" + stars);  //asterisks new line then string with the Error and new line w/ asterisks
               
  }

}
