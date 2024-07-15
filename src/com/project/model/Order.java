class Order {
    private long id;
    private Kart kart;
    private OrderStatus status;

    public Order(long id, Kart kart, OrderStatus status) {
        this.id = id;
        this.kart = kart;
        this.status = status;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public Kart getKart() { return kart; }
    public void setKart(Kart kart) { this.kart = kart; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
}