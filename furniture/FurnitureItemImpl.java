package com.furniture;

public class FurnitureItemImpl {
    public static void main(String args[]){
        FurnitureItem table=new FurnitureItem();
        table.setFurnitureCode(101);
        table.setFurnitureType("table");
        table.setGradeOfFurniture("grade1");
        table.setFurnitureUsage("indoor");
        table.setPrice(20);
        System.out.println("Discounted Price is "+table.calculateDiscount());

    }
}
