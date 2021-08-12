/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Arrays;

/**
 *
 * @author Hasitha_08884
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello welcome to ShopApp!");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        int measurement = 3;
        c1.setSize(measurement);

        Clothing[] items = {new Standard("S", 500.0), new Standard("M", 750.0)};
        
        System.out.println("Customer: " + c1.getName() + " has size: " + c1.getSize() + " and bought: " + Arrays.toString(items));
        
        ItemList itemList = new ItemList(items);
        Configuration.createWebService(itemList);
    }

}
