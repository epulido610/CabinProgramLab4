/*
Ethan Pulido 
CS/IS 130
Cabin Program
-----------------------------------------
               cabin
-----------------------------------------
              private
-----------------------------------------
-model:string
-numBeds:int
-lengthCabin:double
-plumbing:bool
-----------------------------------------
               public 
-----------------------------------------
+Cabin()
+Cabin(str:string, dub:double,inty:int, b:bool)
+setModel(str:string):void
+setNumBeds(int:integer):void
+setPlumbing(b:bool):void
+setLengthCabin(dub:double):void
+getModel():String
+getNumBeds():int
+getLengthCabin():double
+getPlumbing():bool
*/



import java.util.Scanner;
import java.text.DecimalFormat;

public class CabinTest{

   public static void main(String args[]){

         
         int userChoice;
         userChoice = 0;
         String nameOfCabin = "Nice and Windy";
         double lengthOfCabin = 25.5;
         double average = 0;
         int bedNumbers = 4;
         boolean plumbChoice = true;
        
         DecimalFormat f = new DecimalFormat("0.0");
         Scanner input = new Scanner(System.in);
         
         Cabin userCabin = new Cabin(); //defualt constructor
         Cabin userCabin2 = new Cabin("Shorty", 17.8,2,false);//overloaded
         
        do{
               System.out.println("Hello, welcome to the Choose your cabin program");
               System.out.println("1. to start the program");
               System.out.println("2. to quit the program");
               userChoice = input.nextInt();
         
         
               switch(userChoice)
                  {
                        case 1:
                              
                              userCabin.setModel(nameOfCabin);
                              userCabin.setNumBeds(bedNumbers);
                              userCabin.setLength(lengthOfCabin);
                              userCabin.setPlumbing(plumbChoice);
                             
                              System.out.println("Cabin's Model  #of beds Length  Indoor Plumbing");
                              System.out.println("-------------  -------- ------  ---------------");
                              System.out.println(userCabin.getModel() + " " + userCabin.getNumBeds() + "        " + userCabin.getLength() + "    " + userCabin.getPlumbing()); //defuault constructor
                             
                              System.out.println(userCabin2.getModel() + "         " + userCabin2.getNumBeds() + "        " + userCabin2.getLength() + "    " + userCabin2.getPlumbing() + "\n");
                              
                              average = (userCabin.getLength() + userCabin2.getLength())/2;
                              
                              System.out.println("Cabin average rated at " + f.format(average) + "\n");
                              
                              
                            break;
               
                            case 2:
                               
                               System.out.println("Bye");
                               System.exit(0);
                     
                            default:
               
                               System.out.println("Integer value only");
                     
                            break;
         
         
                  }
              
       }while(userChoice != 2);  

   }
}