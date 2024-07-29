package com.project.model;
class OrderAssignment {
    private long id;
    private Order order;
    private DeliveryExecutive assignedExecutive;

    public OrderAssignment(long id, Order order, DeliveryExecutive assignedExecutive) {
        this.id = id;
        this.order = order;
        this.assignedExecutive = assignedExecutive;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public DeliveryExecutive getAssignedExecutive() { return assignedExecutive; }
    public void setAssignedExecutive(DeliveryExecutive assignedExecutive) { this.assignedExecutive = assignedExecutive; }
}