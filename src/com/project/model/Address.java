class Address {
    private long id;
    private String name;
    private String flatNo;
    private String buildingName;
    private String city;

    public Address(long id, String name, String flatNo, String buildingName, String city) {
        this.id = id;
        this.name = name;
        this.flatNo = flatNo;
        this.buildingName = buildingName;
        this.city = city;
    }

    // Getters and setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFlatNo() { return flatNo; }
    public void setFlatNo(String flatNo) { this.flatNo = flatNo; }
    public String getBuildingName() { return buildingName; }
    public void setBuildingName(String buildingName) { this.buildingName = buildingName; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}