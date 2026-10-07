/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JulvePreFinalExam;

/**
 *
 * @author User
 */
public class Fruit {
    private String id;
    private String name;
    private double price;

    public Fruit(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getFruitId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5s | Name: %-10s | Price: P%.2f", id, name, price);
    }
}
