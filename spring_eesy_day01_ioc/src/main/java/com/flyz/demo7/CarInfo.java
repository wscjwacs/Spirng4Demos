package com.flyz.demo7;

public class CarInfo {
    private String name ;

    public Double getPrice() {
        return 50000d;
    }

    private Double price;


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "CarInfo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
