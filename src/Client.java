/*
 * TODO: add Header
 * */

public class Client implements Runnable {
    private Bread bread = null;

    public Client() {}

    public Client(Bread bread) {
        this.bread = bread;
        Thread t = new Thread(this, "Client");
        t.start();
    }

    //TODO: Modify the method
    public void run() {
        long start;
        long finish;
        long res;
        synchronized (bread){
            while (bread.getBreadId() < 5) {
                bread.eat();
                try {
                    start = System.nanoTime();
                    Thread.sleep(1000);
                    finish = System.nanoTime();
                    res = (finish - start) / 1000000;
                    System.out.println(res);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}