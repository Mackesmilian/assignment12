
/*
 * TODO: add Header
 */


public class BakeryShop {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Baker baker = new Baker(bread);
        Client client = new Client(bread);
    }
}
