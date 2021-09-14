package RestaurantMenu;

public class MenuItems {

    private double price;
    private String description;
    private String category;

    public MenuItems(double price, String description, String category){
        this.price = price;
        this.description = description;
        this. category = category;
    }
        public void setPrice(){
        this.price = price;
        }
        public void setDescription(){
        this.description = description;
        }
        public void setCategory(){
        this.category = category;
        }

        public double getPrice(double price){
        return this.price;
        }
        public String getDescription(String description){
        return this.description;
        }
        public String getCategory(String category){
        return this.category;
        }


        public String isNew(boolean n){
        return "New Item";
    };


}
