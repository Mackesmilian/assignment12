/*
 * UE12
 * BakeryShop.java
 * Main class which creates objects for the program to work.
 * Author: Maximilian Wolf
 * Last Change: 03.06.2020
 */
public class BakeryShop {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Baker baker = new Baker(bread);
        Client client = new Client(bread);
    }
}
