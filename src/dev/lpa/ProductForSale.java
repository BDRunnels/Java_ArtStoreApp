package dev.lpa;

public abstract class ProductForSale {

    // protected so subclasses (child) can access and modify this as well. Overridden methods will need access.
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printItem(int quantity) {
        // System.out.println("Quantity: " + quantity + " Item Price: " + price);
        // %2d means an integer will get printed with 2 digits.
        // %8.2f means a float/double will get printed with a width of 8 and 2 places after the decimal.
        // %-15s means a String, '-' means left justify with a max length of 15.
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }

    public abstract void showDetails();
}
