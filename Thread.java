// class Mythread extends Thread {
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }

// public class thread{
//     public static void main(String[] args){
//         Mythread thread=new Mythread();
//         thread.start();
//     }
// }


class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class ThreadExample{
    public static void main(String[] args){
        MyThread thread=new MyThread();
        thread.start();
    }
}

class MyThread implements Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class ThreadExample{
    public static void main(String[] args){
        MyThread runnable=new runnable();
        Thread thread=new Thread(runnable);
        Thread.start();
    }
}