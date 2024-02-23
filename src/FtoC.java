import java.util.Scanner;

public class FtoC {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        double Ctemp = 0;
        double Ftemp = 0;
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Fahrenheits: ");
            if (in.hasNextDouble())
            {
                Ctemp = in.nextDouble();
                in.nextLine();

                Ftemp = (Ctemp -32) * 5.0/9.0;
                done = true;
            }
            else
            {
                System.out.println("Please enter a Valid input !");
               in.nextLine();

            }


        }
        while (!done);
        System.out.printf("The temperature in Celcius is %2.2f " , Ftemp);



    }
}
