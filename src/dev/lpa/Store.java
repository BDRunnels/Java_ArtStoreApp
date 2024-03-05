package dev.lpa;

import java.util.ArrayList;

// Used to create an line item, record is a `type` which can then be passed to an ArrayList<OrderItem>, in this example, to create an order.
record OrderItem(int quantity, ProductForSale product) {}

public class Store {

    // declaring it outside the main method so it is visible to other methods in the class.
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        
        // TV samsung = new TV("Samsung", 100.0, "4k Ultra HD");
        // samsung.printItem(1);
        // samsung.showDetails();
        // samsung.getSalesPrice(5);
        // samsung.printItem(5);.
        storeProducts.add(new Art("Oil Painting", 1350, "Impressionist work painted in 2010")); // Index 0 in ArrayList<ProductForSale>
        storeProducts.add(new Art("Sculpture", 2000, "Bronze work in 1950")); // Index 1 in ArrayList<ProductForSale>
        storeProducts.add(new Furniture("Desk", 500, "Mahogany")); // Index 2 in ArrayList<ProductForSale>
        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp")); // Index 3 in ArrayList<ProductForSale>
        storeProducts.add(new TV("Samsung", 150, "4k Ultra HD")); // Index 4 in ArrayList<ProductForSale>
        listProducts();

        // Print out it is order 1.
        System.out.println("\nOrder 1");
        // Create a new ArrayList of record,  OrderItem. This ArrayList represents the specific order being made.
        // var order1 = new ArrayList<OrderItem>();
        ArrayList<OrderItem> order1 = new ArrayList<>();
        // passing order1 to addItemToOrder, which is then instantating a new OrderItem record with the provided quantity and orderIndex, which FETCHES (.get) the product from the storeProducts ArrayList, added above.
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        // Create a new ArrayList of record,  OrderItem.
        var order2 = new ArrayList<OrderItem>();
        // passing order2 to addItemToOrder, which is then instantating a new OrderItem record with the provided quantity and orderIndex, which FETCHES (.get) the product from the storeProducts ArrayList, added above.
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        addItemToOrder(order2, 4, 4);
        printOrder(order2);

        System.out.println("\nOrder 3");
        var order3 = new ArrayList<OrderItem>();
        addItemToOrder(order3, 1, 5);
        addItemToOrder(order3, 4, 1);
        addItemToOrder(order3, 0, 10);
        printOrder(order3);
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void listProducts() {
        // var used to be general, Java will infer type.
        // Printing out details of each individual item in the store that has been added --> storeProducts.add(new Type)...here, type can be Art, Furniture, TV.
        System.out.println("\nAVAILABLE PRODUCTS FOR SALE:");
        for (var itemInList : storeProducts) {
            System.out.println("-".repeat(30));
            itemInList.showDetails();
        }
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;

        // local double variable salesTotal to keep track of this order.
        // get individual `item` from the order, get the `product` (ProductForSale) and `printItem()` from the ProductForSale class passing in order `item` quantity.
        for (var itemInOrder : order) {
            itemInOrder.product().printItem(itemInOrder.quantity());
            salesTotal += itemInOrder.product().getSalesPrice(itemInOrder.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }



}
