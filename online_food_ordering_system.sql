Create database online_food_ordering_system;

CREATE TABLE address (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    flatNo VARCHAR(50),
    buildingName VARCHAR(255),
    city VARCHAR(255)
);

CREATE TABLE contact (
    id BIGINT PRIMARY KEY,
    address_id BIGINT,
    emailId VARCHAR(255),
    mobileNo VARCHAR(20),
    FOREIGN KEY (address_id) REFERENCES Address(id)
);

CREATE TABLE customer (
    id BIGINT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    contact_id BIGINT,
    FOREIGN KEY (contact_id) REFERENCES Contact(id)
);


CREATE TABLE delivery_executive (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    vehicleInfo VARCHAR(255),
    available BOOLEAN
);

CREATE TABLE email (
    id BIGINT PRIMARY KEY,
    templateBody TEXT
);

CREATE TABLE entity (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contact_id BIGINT,
    type ENUM('Customer', 'Restaurant', 'DeliveryExecutive') NOT NULL,
    state ENUM('occupied', 'available', 'open', 'close') NOT NULL,
    FOREIGN KEY (contact_id) REFERENCES Contact(id)
);

CREATE TABLE menu (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10,2),
    restaurant_id BIGINT,
    state ENUM('InStock', 'OutOfStock', 'Discontinued') NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES Entity(id)
);

CREATE TABLE kart (
    id BIGINT PRIMARY KEY,
    finalPrice DECIMAL(10,2),
    customer_id BIGINT,
    restaurant_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES Entity(id),
    FOREIGN KEY (restaurant_id) REFERENCES Entity(id)
);

CREATE TABLE `order` (
    id BIGINT PRIMARY KEY,
    kart_id BIGINT,
    status ENUM('RECEIVED', 'IN_PROGRESS', 'OUT_FOR_DELIVERY', 'DELIVERED') NOT NULL,
    FOREIGN KEY (kart_id) REFERENCES Kart(id)
);

CREATE TABLE order_assignment (
    id BIGINT PRIMARY KEY,
    order_id BIGINT,
    delivery_executive_id BIGINT,
    FOREIGN KEY (order_id) REFERENCES `order`(id),
    FOREIGN KEY (delivery_executive_id) REFERENCES delivery_executive(id)
);

CREATE TABLE restaurant (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contact_id BIGINT,
    FOREIGN KEY (contact_id) REFERENCES Contact(id)
);

CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    entity_id BIGINT,
    password VARCHAR(255) NOT NULL,
    FOREIGN KEY (entity_id) REFERENCES Entity(id)
);
