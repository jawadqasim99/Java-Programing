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

    public static void number_pyradim(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - k; j++) {
                System.out.print(j);

            }
            for (int m = 1; m <= k; m++) {
                System.out.print("");
            }
            k++;
            System.out.println();
        }
    }

    // Floyd triangle

    public static void floyd_triangle(int row) {
        int counter = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    // 0-1 triangle patterns
    public static void zero_one(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);

                } else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }

    }

    // Butterfly patterns

    public static void Butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Solid rhambous

    public static void solid_Rhambous(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    // Hollow rhambous

    public static void hollow_Rhambous(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    // daimand patterns

 public static void daimand(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

  public static void main(String[] args) {

        // hollow_rectangle(4, 4);
        // half_pyradim(10);

        // number_pyradim(5);
        // floyd_triangle(5);
        // zero_one(5);
        // Butterfly(4);
        // solid_Rhambous(10);
        // hollow_Rhambous(10);
        daimand(4);

    }
}
