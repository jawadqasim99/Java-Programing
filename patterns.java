public class patterns {

    // Hollow rectanglle challange

    public static void hollow_rectangle(int rowtot, int columtot) {
        for (int i = 1; i <= rowtot; i++) {
            for (int j = 1; j <= columtot; j++) {
                if (i == 1 || i == rowtot || j == 1 || j == columtot) {
                    System.out.print("*");

                } else {
                    System.out.print("");
                }

            }
            System.out.println();

        }
    }

    // Rotate and half pyradim

    public static void half_pyradim(int totrow) {
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totrow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

     // Rotate and half pyradim using number

     public static void number_pyradim(int n){
        int k=0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-k; j++) {
                System.out.print(j);
                
            }
            for(int m=1 ; m<=k ; m++){
                System.out.print("");
            }
            k++;
            System.out.println();
        }
     }
    public static void main(String[] args) {

        // hollow_rectangle(4, 4);
        // half_pyradim(10);

        number_pyradim(5);
    }
}
