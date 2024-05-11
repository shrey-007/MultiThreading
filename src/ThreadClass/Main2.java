package ThreadClass;

//Jitni threads banani hai utni classes banao
class Mythread11 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i am "+Thread.currentThread().getName()+" thread");
        }
    }
}



public class Main2 {
    public static void main(String[] args) {
        Mythread11 mythread1=new Mythread11();
        Mythread11 mythread2=new Mythread11();
        mythread1.start();
        mythread2.start();
    }

}


