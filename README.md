# online-food-ordering-system

# Overview

The "Online Food Ordering System" is a Java-based application designed to streamline the process of ordering food online. This system allows customers to browse menus from various restaurants, place orders, and have them delivered to their doorstep. It also provides functionalities for restaurant management and order tracking.

# Features :

## Customer
<ul>
<li> Registration and Login: Customers can register and log in to the system.</li>
<li> Browse Menu: Customers can view the menus of different restaurants.</li>
<li> Place Order: Customers can select items from the menu and place an order.</li>
<li> Track Order: Customers can track the status of their order in real-time.</li>
<li> Manage Profile: Customers can update their personal information and address.</li>
</ul>

## Restaurant
<ul>
<li>Manage Menu: Restaurants can add, update, and remove items from their menu.</li>
<li>Order Management: Restaurants can view and update the status of orders.</li>
<li>Profile Management: Restaurants can update their contact information and business details.</li>
</ul>

# Delivery Executive

<li>Order Assignment: Delivery executives are assigned orders for delivery.</li>
<li>Update Status: Delivery executives can update the status of the order (e.g., out for delivery, delivered).</li>

# Administrator

<li>User Management: Admins can manage customer and restaurant accounts.</li>
<li>System Monitoring: Admins can monitor system performance and user activities.</li>


# Core Components

# Entities
<li>Customer: Represents a customer with attributes such as ID, username, password, and contact information.</li>

Restaurant: Represents a restaurant with attributes such as ID, name, contact information, and a list of menu items.

Menu: Represents a menu item with attributes such as ID, name, description, price, and availability status.

Order: Represents an order with attributes such as ID, cart, status, and assigned delivery executive.

Delivery Executive: Represents a delivery executive with attributes such as ID, name, vehicle information, and availability status.

Kart: Represents a cart containing selected menu items, the final price, and the associated customer and restaurant.


Exceptions

NotFoundException: Custom exception for scenarios where a resource is not found.

InvalidException: Custom exception for scenarios involving invalid data.

MenuNotInStockException: Custom exception for scenarios where a menu item is out of stock.


Order Status

RECEIVED: The order has been received by the restaurant.

IN_PROGRESS: The order is being prepared by the restaurant.

OUT_FOR_DELIVERY: The order is out for delivery by the delivery executive.

DELIVERED: The order has been delivered to the customer.


Usage

Getting Started

Clone the Repository:
sh
Copy code
git clone https://github.com/yourusername/online-food-ordering-system.git

Build the Project:
I use Java IntelliJ IDEA IDE to import and build the project.

Run the Application:
Run the Main class to start the application.

Example Usage
java
Copy code
public class Main {
public static void main(String[] args) {
// Create sample instances and demonstrate functionalities
// Example: Customer registration, placing an order, etc.
}
}
