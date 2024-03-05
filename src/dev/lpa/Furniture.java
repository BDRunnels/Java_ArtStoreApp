package dev.lpa;

public class Furniture extends ProductForSale {

    // calls super(), which calls the constructor on the abstract parent class with the 3 parameters.
    public Furniture(String type, double price, String description) {
        super(type, price, description);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("This " + type + " was manufactured in North Carolina");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
    
}
