* Challenge *
    - Build an application that can be a store front, for any imaginable item for sale.
    - Instead of the Main class we usually create, create a Store class with a main method.

    Store Class:
    manage a LIST OF PRODUCTS FOR SALE, including displaying the product details.
    manage an order, which can just be a LIST OF OrderItem objects.
    have METHODS to:
        add an item to the order
        print the ordered items (like a sales receipt)
    
    ProductForSale Class:
        type, price, description
    
    METHODS:
    get a SalesPrice, a concrete method, which takes a QUANTITY and RETURNS the QUANTITY TIMES THE PRICE.
    print a Priced Line Item, a concrete method, which takes a QUANTITY and should PRINT an itemized line item for an order with QUANTITY & LINE ITEM price.
    show Details, an ABSTRACT method, which represents what might be displayed on a product page: type, description, price, etc.

    OrderItem type:
        quantity, ProductForSale
    
    You should create TWO or THREE classes that Extend ProductForSale class that will be products in the store.


* DESIGN *
    Class Diagram:
        Store Class
            ArrayList<ProductForSale>
            addItemToOrder()
            printOrder()
        
        OrderItem(Record)
            qty: int
            product: ProductForSale
        
        abstract ProductForSale -> Store
            type: String
            price: double
            description: String
            void printPricedItem(int qty)
            double getSalesReceipt(int qty)
            abstract void showDetails()

        Product A, Product B, Product C -> ProductForSale


* Store is main class, ProductForSale is class -> Any product is a child of it.
* Store will declare new ArrayList<ProductForSale> storeProducts. 
* storeProducts can then .add(anyProduct), calling the constructor in each child (subclass).
* OrderItem is a record in the Store class that will hold a quantity and ProductForSale product.
* When addItemToOrder() is called, it will be passed a `var order#` that is a new ArrayList<OrderItem>
* When addItemToOrder recieves its parameters `order#`, `orderIndex`, `qty`
    - It will take order#.add(new OrderItem(qty, storeProducts.get(orderIndex)))
    - This will create a NEW ORDER ITEM in the ArrayList, with the provided quantity and product associated with the index with which is was created.
