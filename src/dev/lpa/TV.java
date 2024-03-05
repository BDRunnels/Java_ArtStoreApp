package dev.lpa;

public class TV extends ProductForSale {

    public TV(String type, double price, String description) {
        super(type, price, description);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("TV type: " + type);
        System.out.println("Description: " + description);
        System.out.printf("Price: $%8.2f%n ",  price);
    }
    
}
