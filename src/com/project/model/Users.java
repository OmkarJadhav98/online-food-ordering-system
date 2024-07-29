package com.project.model;
class User { // Changed from Users to User
    private long id;
    private String username;
    private Entity entity;
    private String password;

    public User(long id, String username, Entity entity, String password) {
        this.id = id;
        this.username = username;
        this.entity = entity;
        this.password = password;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public Entity getEntity() { return entity; }
    public void setEntity(Entity entity) { this.entity = entity; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}