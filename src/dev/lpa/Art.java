package dev.lpa;

public class Art extends ProductForSale {

    // calls super(), which calls the constructor on the abstract parent class with the 3 parameters.
    public Art(String type, double price, String description) {
        super(type, price, description);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("This " + type + " is a beautiful piece");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
    
}
