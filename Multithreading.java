public class Multithreading extends Thread {

    @Override
    public void run() {

        System.out.println("Jay Shree Ram");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {
        Multithreading m = new Multithreading();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        
            t1.start();
            t2.start();
            t3.start();
         

    }

}
