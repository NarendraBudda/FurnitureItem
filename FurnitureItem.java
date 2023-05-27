public class FurnitureItem {
    //colour , Grde of quality, types of furnitures are attributes
    String Colour;
    int Grade;
    String Furnitures;
    String Furnituretype="Outdoor";
    int furnitureprice;

// calculating Bill after discount given to customers on order of any type of outdoor furniture
    public int calculatingBillAfterDiscount(int discountPerentage){
              if(Furnituretype.equals("Outdoor")) {

                return furnitureprice = furnitureprice - (furnitureprice * discountPerentage / 100);
              }
        return furnitureprice ;
    }
    public static void main(String args[]){

        int discountPerentage=5;
        int totalbill=500;
        FurnitureItem furnitureItem =new FurnitureItem();
        System.out.println(furnitureItem.calculatingBillAfterDiscount(discountPerentage));

    }
}
