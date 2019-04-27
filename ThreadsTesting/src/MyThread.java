public class MyThread implements Runnable {
    Thread thrd;
    volatile boolean suspended;
    volatile boolean stopped;


    MyThread(String name){
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd + " starting...");
        try {
            for (int i = 0; i < 1000; i++){
                System.out.print(i + " ");
                if ((i%10)==0){
                    System.out.println();
                    thrd.sleep(250);
                }
                synchronized (this){
                    while(suspended){
                        wait();
                    }
                }
            }
        } catch (InterruptedException exc){
            System.out.println(thrd + " is broken, exception:" + exc);
        }
        System.out.println(thrd + " finished...");
    }

}
