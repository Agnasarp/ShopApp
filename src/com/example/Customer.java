/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Hasitha_08884
 */
public class Customer {

    String name;
    String size;
    int measurement;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Name can't be empty.");
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!size.equals("")) {
            this.size = size;
        } else {
            System.out.println("Size can't emty");
        }
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
