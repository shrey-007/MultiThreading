package ThreadClass;

//Jitni threads banani hai utni classes banao
class Mythread1 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i am "+Thread.currentThread().getName()+" thread");
        }
    }
}



class Mythread2 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i am "+Thread.currentThread().getName()+" thread");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Mythread1 mythread1=new Mythread1();
        Mythread2 mythread2=new Mythread2();
        mythread1.start();
        mythread2.start();
    }

}

