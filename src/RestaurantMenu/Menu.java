package RestaurantMenu;

import java.util.ArrayList;

public class Menu {
    //variables
    private MenuItems item;
    public ArrayList<MenuItems> menu;

    //constructors
    public Menu(MenuItems item) {
        this.item = item;
    }

    public Menu() {

    }

    //getters and setters
    public void setItem(){
        this.item = item;
    }
    public MenuItems getItem(){
        return item;
    }

    //methods
    public void addMenuItem(MenuItems item){
        menu.add(item);
    }

}
