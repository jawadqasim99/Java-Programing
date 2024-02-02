import java.util.*;

public class array{


    public static int array(int numbers[], int key){

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==key){
                return 1;
                }
            }

            return -1;
    }
public static int binary_search(int numbers[] , int key){
    int start=0 , end=numbers.length-1;

    while (start<=end) {
        int mid=(start+end)/2;
         if(numbers[mid]==key){
           return key;
        }

        if(numbers[mid] < key){
            start=mid+1;
        }else{
            end=mid-1;
        }
       

    }
    return -1;
}

    public static void main(String[] args) {
        
        int numbers[]={1,2,3,4,5,6,7,8,9,18};
        int key=12;

System.out.println(numbers.length);
        // int result=array(numbers, key);
        // if (result==1) {
        //     System.out.print("Number exist");
        // }else{
        //     System.out.println("number doesnot exist");
        // }
    }

}