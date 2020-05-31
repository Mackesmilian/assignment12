/*
 * TODO: add Header
 */

class Bread {
    private int breadId = -1;

    public Bread() {}

    public Bread(int breadId) {
        this.breadId = breadId;
    }

    //TODO: Modify the method
    public synchronized void bake(int breadId) {
        System.out.println("[READY TO CONSUME] Bread Nr:"+breadId);
        this.breadId = breadId;
    }

    //TODO: Modify the method
    public synchronized void eat() {
        System.out.println("[ALREADY CONSUMED] Bread Nr:"+breadId);
    }
}