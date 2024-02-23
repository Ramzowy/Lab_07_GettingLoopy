public class GettingLoopy {
    public static void main(String[] args) {

      int i;
      int m;
        for (i=0; i >= 0 && i<=30; i++) {
                System.out.print(i);

            System.out.println();



    }

        for (i=30; i >= 0 && i<=30; i--) {
                System.out.print(i);

               System.out.println();
           }

            for (i=0; i >= 0 && i<=18; i+=3) {
                for (m = 1; m <= i; m++) {
                    System.out.print(i);

                    System.out.println();
                }


            }
        for (i=10; i >= 0 && i<=10; i-=2) {
                    System.out.print(i);

                    System.out.println();
                }

            for (i=0; i >= 0 && i<=18; i+=3) {
                for (m = 1; m <= i; m++) {
                    System.out.print(i);

                    System.out.println();
                }
            }

        for (i=0; i >= 0 && i<=5; i++) {
                for ( m=1; m<= i; m++) {
                    System.out.print("*");
                }
                    System.out.println();
                }

        for (i=5; i >= 0 && i<=5; i--) {
            for ( m=1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=1; i >= 0 && i<=5; i++) {
            for ( m=1; m <= 5; m++) {
                System.out.print("*");
            }
            System.out.println();
        }


     }
}