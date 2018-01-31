
package mjsxwclanguagebasics;

/**
 *
 * @author Matthew
 */
public class MjsxwcLanguageBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte sample1 = 0x3A;
       byte sample2 = 58;
       if(sample1 == sample2)
       {
          System.out.println("the samples are equal");
          
       }
       else
       {
           System.out.println("the samples are not equal");
       }
       
       short heartRate = 85;
       if(heartRate >= 40 && heartRate <= 80)
       {
           System.out.println("heart Rate is normal");
       }
       else
       {
          System.out.println("Heart Rate is not normal");
       }
       
       long deposits = 135002796;
       if(deposits >= 100000000)
       {
           System.out.println("You are exceedingly wealthy");
       }
       else
       {
           System.out.println("Sorry you are poor");
       }
       
       float acceleration = 9.584f;
       float mass = 14.6f;
       float force = (mass)*(acceleration);
       System.out.printf("force = %f\n",force);
       
       double distance = 129.763001;
       System.out.printf("%f is the distance\n",distance);
       
       boolean lost = true;
       boolean expensive = true;
       if(lost && expensive == true)
       {
           System.out.println("I am Really Sorry!I will get the manager");
       }
       else if(lost == true && expensive == false)
       {
           System.out.println("Here is coupon for 10% off");
       }
       
       int choice = 1;
       switch(choice)
       {
           case 1:
               System.out.println("you chose 1");
               break;
           case 2:
               System.out.println("you chose 2");
               break;
           case 3:
               System.out.println("you chose 3");
               break;
       }
       char integral = '\u222B';
       System.out.printf("%s is an integral\n", integral);
       
       char letter1 = 'a';
       char letter2 = 97;
       
       if(letter1 == letter2)
       {
           System.out.printf("%s and %s are the same\n",letter1,letter2);
       }
       else
       {
           System.out.printf("%s and %s are not the same\n", letter1, letter2);
       }
       
       for(int i=5; i<=10;i++)
       {
           System.out.printf("i = %d\n", i);
       }
       
       int age = 0;
       while(age < 6)
       {
           System.out.printf("age = %d\n", age);
           age++;
       }
       String greeting = "Hello";
       String name = "Karen";
       System.out.printf("%s %s\n",greeting,name);
    }
    
}
