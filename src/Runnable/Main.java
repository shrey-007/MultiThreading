package Runnable;

class Mythread1 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i am "+Thread.currentThread().getName()+" thread");
        }
    }
}

class Mythread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i am "+Thread.currentThread().getName()+" thread");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mythread1 mythread1=new Mythread1();
        Mythread2 mythread2=new Mythread2();

        Thread thread1=new Thread(mythread1);
        Thread thread2=new Thread(mythread2);

        thread1.start();
        thread2.start();
    }

}
