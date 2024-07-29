package com.project.model;
import java.util.List;

class Restaurant {
    private long id;
    private String name;
    private Contact contact;
    private List<Menu> menuItems;

    public Restaurant(long id, String name, Contact contact, List<Menu> menuItems) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.menuItems = menuItems;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }
    public List<Menu> getMenuItems() { return menuItems; }
    public void setMenuItems(List<Menu> menuItems) { this.menuItems = menuItems; }
}