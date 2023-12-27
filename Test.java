import java.util.Arrays;

public class Test {
 
    public static void main(String[] args) {
         
         int [] arr={1,3,5,3,66,7};
         for (int i : arr) {
            System.out.println(i);
         }

         arr[3]=88;   //update

         System.out.println(Arrays.toString(arr) +"--");
          int sum=0;
         for (int i : arr) {
            sum=sum+i;  //sum 
         }

         System.out.println(sum);
    }
}
