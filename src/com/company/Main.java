package com.company;

import RestaurantMenu.MenuItems;
import RestaurantMenu.Menu;

public class Main {

    public static void main(String[] args) {

        Menu fullMenu = new Menu();
        MenuItems burger = new MenuItems(8.99, "The American Traditional, just how you like it", "Main Course");
        fullMenu.addMenuItem(burger);
        System.out.println(fullMenu);


    }
}
