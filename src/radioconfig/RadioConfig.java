
package radioconfig;

import java.util.Scanner;
public class RadioConfig {

   
    public static void main(String[] args) {
    
   Scanner input=new Scanner(System.in);
   radio rad=new radio();
   int choice;
   String state=null;
   do{
       System.out.println("1-turning on/off"); 
       System.out.println("2-Changing channel"); 
       System.out.println("3-Adjusting volume");
       System.out.println("Please Enter your choise");
       choice = input.nextInt();
       switch(choice) {
       
           case 1: {
              
               System.out.println("Turn Radio ON or OFF");
               state=input.next();
                if(state=="off")
               return;
                else
               rad.change_state(state);
                System.out.println("Radio is turned ON");
               }break;
        
           case 2:  {
               System.out.println("what channel you want");
               int cha=input.nextInt();
               rad.change_ch(cha);
               System.out.println("Your current channel is "+cha);
             }    break;       
           case 3: {
           System.out.println("what volume you want");
               int vol=input.nextInt();
               rad.change_vol(vol);
               System.out.println("Your current volume is "+vol);
               } break;
           default :
               System.out.println("Invalid input");
               break;
       }
       if(state=="off")
           break;
           
   }while(true);   
    }
    
}
