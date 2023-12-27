public class FibSerise {
    public static void main(String[] args) {
        int n1=0,n2=1, n3;
        for(int i=0;i<5;i++) {
         Thread   t=new Thread();
          
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
         
    }
}
