public class patterns {

    public static void hollow_rectangle(int rowtot , int columtot){
        for(int i=1 ; i<=rowtot ; i++){
            for(int j=1 ; j<=columtot;j++){
                if(i==1 || i== rowtot || j==1|| j==columtot){
                    System.out.print(" * ");

                }else{
                    System.out.print(" ");
                }
               
            }
               System.out.println();
          
        }
    }
    public static void main(String[] args) {
        
hollow_rectangle(4, 4);
    }
}
