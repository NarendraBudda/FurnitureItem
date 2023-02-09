public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;
    public FurnitureItem(){
        this.furnitureCode=319;
        this.furnitureType="Table";
        this.gradeOfFurniture=1;
        this.color="Blue";
        this.furnitureUsage="Outdoor";
        this.price=5000;
    }
    public double calculatingdiscount(int percentage){

        return price=price-(price * percentage) / 100;

    }
    public void displaydetails(){
        System.out.println("Furniture code "+furnitureCode);
        System.out.println("Furnitre Type "+furnitureType);
        System.out.println("Furnitre Grade "+gradeOfFurniture);
        System.out.println("Furnitre color "+color);
        System.out.println("Furnitre Usage "+furnitureUsage);
        System.out.println("Furnitre price "+price);


    }
}
