package vin.pojo;

public class Flower {
    private int id;
    private String name;
    private float price;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", location='" + location + '\'' +
                '}';
    }

    public Flower(int id, String name, float price, String location) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public Flower(String name, float price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }
}
