import java.util.Arrays;

public class Find2ndHighest {
    public static void main(String[] args) {
        int arr[] ={1,6,5,2,5,2,8,9,12,90};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));

    }
}
