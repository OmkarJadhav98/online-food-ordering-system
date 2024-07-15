import java.util.List;

class Kart {
    private long id;
    private List<Menu> selectedMenus;
    private double finalPrice;
    private Entity customer;
    private Entity restaurant;

    public Kart(long id, List<Menu> selectedMenus, double finalPrice, Entity customer, Entity restaurant) {
        this.id = id;
        this.selectedMenus = selectedMenus;
        this.finalPrice = finalPrice;
        this.customer = customer;
        this.restaurant = restaurant;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public List<Menu> getSelectedMenus() { return selectedMenus; }
    public void setSelectedMenus(List<Menu> selectedMenus) { this.selectedMenus = selectedMenus; }
    public double getFinalPrice() { return finalPrice; }
    public void setFinalPrice(double finalPrice) { this.finalPrice = finalPrice; }
    public Entity getCustomer() { return customer; }
    public void setCustomer(Entity customer) { this.customer = customer; }
    public Entity getRestaurant() { return restaurant; }
    public void setRestaurant(Entity restaurant) { this.restaurant = restaurant; }
}