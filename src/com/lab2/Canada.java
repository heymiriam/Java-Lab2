package com.lab2;

import static com.lab2.Province.getDetails;

public class Canada {
    //Instance variable
    private static Province[] provinces;
    private static com.lab2.Province[] Province;

    //Constructor
    public Canada(){
        String provinces[]={"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon"};
    }

    //Methods
    public static void displayAllProvinces(){
        provinces= Province[]
        for(Province[] : provinces){
            System.out.println(getDetails());
        }
    }

    public static com.lab2.Province[] getNumOfProvincesBetween(int min, int max){
//        this.min=min;
//        this.max=max;
        int min=30000;
        int max=15000,000;

        for(int population){
            if(population>min && population<max){
            return provinces;//String[]
            }
        }
    }


}
