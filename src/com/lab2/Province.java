package com.lab2;

import javax.management.ValueExp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Province {
    private  static String name;         // e.g. “British Columbia”
    private  static String capital;  // e.g. “Victoria”
    private  static long population; // e.g. 2264823

    public static final int DEFAULT_POPULATION= 4648055 ;
    public static final String DEFAULT_PROVINCE="British Columbia";
    public static final String DEFAULT_CAPITAL="Victoria";


   private static String province;
//    private static String isValidPopulation;



    public Province (String name, String capital, long population){

        if ( isValidPopulation((int) population) && isValidProvince(province) && isValidCapitalCity(capital)){
            this.province = province;
            this.capital = capital;
            this.population = population;
        }else{
            // if there is any error; create the default data, shown below
            this.population = DEFAULT_POPULATION; // 4,648,055
            this.province = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
        setIsValidProvince(province);
        setIsValidPopulation(population);
        setIsValidCapitalCity(capital);
    }

    //Methods

    private static boolean isValidProvince(String province){
        String provinces[];
        provinces= new String[13];
        String provinces[]={"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon"};
        for(String province : provinces){
            if(!provinces.equals(province)){
                return true;
            }else{
                System.out.println(DEFAULT_PROVINCE);
            }

        }
    }


    private static boolean isValidCapitalCity(String capital){
        String capitals[];
        capitals= new String[13];
        String[] capitals={"Edmonton", "Victoria", "Winnipeg", "Fredericton", "St. John's", "Yellowknife", "Halifax", "Iqaluit", "Toronto", "Charlottetown", "Quebec City", "Regina", "Whitehorse"};
        for(String capital : capitals){
            if(!capitals.equals(capital)){
                return true;
            }else{
                System.out.println(DEFAULT_CAPITAL);
            }

        }
    }


    private static boolean isValidPopulation(int population){
        if(population>30000 && population<15000000){
            return true;
        }else{
            System.out.println(DEFAULT_POPULATION);
        }
    }

    //Getters
    public static final String getIsValidProvince(){
        return province;
    }

    public static final String getIsValidCapitalCity(){
        return capital;
    }

    public static final int getIsValidPopulation(){
        return (int) population;
    }

    //Setters
    public static final void setIsValidProvince(String provinces){
        List<String> list = Collections.singletonList(provinces);
        if(list.contains(provinces)){
            this.province=provinces;
        }else{
            this.province=DEFAULT_PROVINCE;
        }
    }

    public static final void setIsValidCapitalCity(String capitals){
        List<String> list= Collections.singletonList(capitals);
        if(list.contains(capitals)){
            this.capital=capitals;
        }else{
            this.capital=DEFAULT_CAPITAL;
        }
    }

    public static final void setIsValidPopulation(int population){
        if((population>=30000) && (population<=15000000)){
            this.population=population;
        }else{
            this.population=DEFAULT_POPULATION;
        }
    }

    //Method which returns a String in the format

    public static String getDetails(){
        //System.out.println("The capital of " + DEFAULT_PROVINCE + " (population. " + DEFAULT_POPULATION +  " )is " + DEFAULT_PROVINCE + ".");
        System.out.println("The capital of " + getIsValidProvince() + " (population. " + getIsValidPopulation() + " )is " + getIsValidCapitalCity() +".");
        //System.out.println("The capital of " + setIsValidProvince() + " (population. " + setIsValidPopulation() + " )is " + setIsValidCapitalCity() +".");
    }

}
