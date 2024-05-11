package Runnable;

class Mythread11 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i am "+Thread.currentThread().getName()+" thread");
        }
    }
}


public class Main2 {
    public static void main(String[] args) {
        Mythread11 mythread1=new Mythread11();

        Thread thread1=new Thread(mythread1);
        Thread thread2=new Thread(mythread1);

        thread1.start();
        thread2.start();
    }

}
