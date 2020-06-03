/*
 * TODO: add Header
 * */

public class Baker implements Runnable {
    private Bread bread;

    public Baker() {}

    public Baker(Bread bread) {
        this.bread = bread;
        Thread t = new Thread(this, "Baker");
        t.start();
    }

    //TODO: Modify the method
    public void run() {
        long start;
        long finish;
        long res;
        int breadNr = 0;
        synchronized (bread){
            while (bread.getBreadId() < 5) {
                bread.bake(breadNr++);
                try {
                    start = System.nanoTime();
                    Thread.sleep(2000);
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
