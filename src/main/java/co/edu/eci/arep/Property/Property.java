package co.edu.eci.arep.Property;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private double price;

    private int size;

    private String description;

    public Property(){

    }

    public Property(String address, double price, int size, String description){
        this.address = address;
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public String getAddress(){
        return address;
    }

    public double getPrice(){
        return price;
    }

    public int getSize(){
        return size;
    }
    public Long getId(){ return id; }

    public String getDescription(){
        return description;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setDescription(String description){
        this.description =description;
    }

}
