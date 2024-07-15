import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create sample instances
        Address customerAddress = new Address(1, "Omkar Jadhav", "Apt 123", "Sunrise Towers", "Pune");
        Contact customerContact = new Contact(1, customerAddress, "Omkar@example.com", "123-456-7890");
        Customer customer = new Customer(1, "Omkar Jadhav", "secret_password", customerContact);

        Address restaurantAddress = new Address(2, "Tasty Bites", "Shop 5", "Central Plaza", "Pune");
        Contact restaurantContact = new Contact(2, restaurantAddress, "info@tastybites.com", "987-654-3210");
        Restaurant restaurant = new Restaurant(1, "Tasty Bites", restaurantContact, new ArrayList<>());

        // Create Entity object for restaurant
        Entity restaurantEntity = new Entity(restaurant.getId(), restaurant.getName(), restaurant.getContact(), "Restaurant", "open");

        Menu menu1 = new Menu(101, "Margherita Pizza", "Classic tomato and cheese pizza", 12.99, restaurantEntity, "InStock");
        Menu menu2 = new Menu(102, "Pasta Alfredo", "Creamy fettuccine with Alfredo sauce", 9.99, restaurantEntity, "InStock");

        List<Menu> selectedMenus = new ArrayList<>();
        selectedMenus.add(menu1);
        selectedMenus.add(menu2);

        // Create Kart object with customer and restaurant entities
        Kart cart = new Kart(1, selectedMenus, 22.98, new Entity(customer.getId(), customer.getUsername(), customer.getContact(), "Customer", "open"), restaurantEntity);

        DeliveryExecutive deliveryExecutive = new DeliveryExecutive(1, "Yash", "Bike", true);

        Order order = new Order(1, cart, OrderStatus.RECEIVED);
        OrderAssignment orderAssignment = new OrderAssignment(1, order, deliveryExecutive);

        // Print details
        System.out.println("Customer: " + customer.getUsername());
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Selected Menu Items: " + cart.getSelectedMenus());
        System.out.println("Assigned Delivery Executive: " + orderAssignment.getAssignedExecutive().getName());
        System.out.println("Order Status: " + order.getStatus());
    }
}