import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame {
    public static void main ( String [] args)
    {
        Random r=new Random();                        // r is the object of Random class
        int x=r.nextInt(100)+1;                      //x is a variable to store random numbers generated by cpu
        System.out.println("Guess your Number(1-100) = ");
        Scanner sc = new Scanner(System.in);
        int ug;
        do {
            ug = sc.nextInt();                          // ug is user guess no.
            if (ug == x)                                   //comparing guess no with random number ,i.e,x
            {
                System.out.println("Correct");
            } else if (x > ug) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }

        } while(ug!=x);


    }

}
