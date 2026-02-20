class MyRunnable implements Runnable {
    @Override 
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.print(i+ " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
    }
}
