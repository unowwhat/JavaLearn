public class RunThreads {
    public static void main(String[] args) {
        System.out.println("Стартуем основной поток программы...");

        MyThread thrd = new MyThread("Внутренний поток");
        //thrd.run();
        Thread mythrd = new Thread(thrd);
        mythrd.start();
        System.out.println("Стартуем основной поток...");
        try {
            for (int count = 0; count <= 10; count++){
                Thread.sleep(100);
                System.out.print(".");
            }
        } catch (InterruptedException exc){
            System.out.println("Основной поток is broken, exception:" + exc);
        }
        System.out.println("Основной поток закончился...");
    }
}
