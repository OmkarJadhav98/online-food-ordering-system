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

## Delivery Executive
<ul>
<li>Order Assignment: Delivery executives are assigned orders for delivery.</li>
<li>Update Status: Delivery executives can update the status of the order (e.g., out for delivery, delivered).</li>
</ul>

## Administrator
<ul>
<li>User Management: Admins can manage customer and restaurant accounts.</li>
<li>System Monitoring: Admins can monitor system performance and user activities.</li>
</ul>

# Core Components
## Entities
<ul>
<li>Customer: Represents a customer with attributes such as ID, username, password, and contact information.</li>

<li>Restaurant: Represents a restaurant with attributes such as ID, name, contact information, and a list of menu items.</li>

<li>Menu: Represents a menu item with attributes such as ID, name, description, price, and availability status.</li>

<li>Order: Represents an order with attributes such as ID, cart, status, and assigned delivery executive.</li>

<li>Delivery Executive: Represents a delivery executive with attributes such as ID, name, vehicle information, and availability status.</li>

<li>Kart: Represents a cart containing selected menu items, the final price, and the associated customer and restaurant.</li>
</ul>

## Exceptions
<ul>
<li>NotFoundException: Custom exception for scenarios where a resource is not found.</li>

<li>InvalidException: Custom exception for scenarios involving invalid data.</li>

<li>MenuNotInStockException: Custom exception for scenarios where a menu item is out of stock.</li>
</ul>

## Order Status
<ul>
<li>RECEIVED: The order has been received by the restaurant.</li>

<li>IN_PROGRESS: The order is being prepared by the restaurant.</li>

<li>OUT_FOR_DELIVERY: The order is out for delivery by the delivery executive.</li>

<li>DELIVERED: The order has been delivered to the customer.</li>
</ul>

## Usage
<ul>
<li>Getting Started</li>

<li>Build the Project:
I use Java IntelliJ IDEA IDE to import and build the project.</li>

<li>Run the Application:
Run the Main class to start the application.</li>
</ul>
