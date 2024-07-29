package com.project.model;
class Menu {
    private long id;
    private String name;
    private String description;
    private double price;
    private Entity restaurant;
    private String state; // InStock, OutOfStock, Discontinued

    public Menu(long id, String name, String description, double price, Entity restaurant, String state) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.restaurant = restaurant;
        this.state = state;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Entity getRestaurant() { return restaurant; }
    public void setRestaurant(Entity restaurant) { this.restaurant = restaurant; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}