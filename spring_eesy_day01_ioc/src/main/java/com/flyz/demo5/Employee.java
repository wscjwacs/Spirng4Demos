package com.flyz.demo5;

import com.flyz.demo4.Car;
import com.flyz.demo4.Car2;

public class Employee {
    private String name;
    private Car2 car2 ;



    public void setName(String name) {
        this.name = name;
    }



    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", car2=" + car2 +
                '}';
    }
}
