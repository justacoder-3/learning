class MyThread extends Thread{
    try{
        System.out.println("Thread is Running");
        thread.sleep(2000);
        System.out.println("Thread has finished execution");
    }
    catch(InterruptedException e){
        System.out.println("Error");
    }
}

public class Threadexample{
    public static void main(String[] args){
        MyThread thread=new MyThread();
        thread.start();
        System.out.println("Is thread alive "+thread.isAlive());
        thread.join();
        System.out.println("Main thread execution completed. Now it resumes ");
        System.out.println("Is thread alive "+thread.isAlive());
    }   
}