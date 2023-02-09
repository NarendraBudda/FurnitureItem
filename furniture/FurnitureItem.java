package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;
    static final int DISCOUNT=5;

    public FurnitureItem(){
        int furnitureCode=521;
        String furnitureType="Table";
        String gradeOfFurniture="grade2";
        String color="Blue";
        String furnitureUsage="Indoor";
        float price=5000;
    }
    public void setFurnitureCode(int furnitureCode) {

        this.furnitureCode = furnitureCode;
    }
    public int getFurnitureCode(){

        return furnitureCode;
    }
    public void setFurnitureType(String furnitureType) {

        this.furnitureType = furnitureType;
    }
    public String getFurnitureType(){

        return furnitureType;
    }
    public void setGradeOfFurniture(String gradeOfFurniture) {

        this.gradeOfFurniture = gradeOfFurniture;
    }
    public String getGradeOfFurniture(){

        return gradeOfFurniture;
    }
    public void setColor(String color) {

        this.color = color;
    }
    public String getColor(){

        return color;
    }
    public void setFurnitureUsage(String furnitureUsage) {

        this.furnitureUsage = furnitureUsage;
    }
    public String getFurnitureUsage(){

        return furnitureUsage;
    }
    public void setPrice(float price) {

        this.price = price;
    }
    public float getPrice(){

        return price;
    }
    public float calculateDiscount(){
        if(getGradeOfFurniture().equals("grade1")&&getFurnitureUsage().equals("outdoor")){
            return getPrice()-(getPrice()*DISCOUNT)/100;
        }
        return getPrice();
    }


}
