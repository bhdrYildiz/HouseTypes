import Business.SquareMetres;
import Entity.Home;
import Entity.House;
import Entity.SummerHouse;
import Entity.Villa;
import Service.HomeService;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        House house1 = new House(320.000,120,3,1);
        House house2 = new House(166.500,90,2,1);
        House house3 = new House(500.000,150,3,2);

        SummerHouse summerHouse1 = new SummerHouse(700.000,170,4,1);
        SummerHouse summerHouse2 = new SummerHouse(560.000,150,3,1);
        SummerHouse summerHouse3 = new SummerHouse(850.000,220,4,2);

        Villa villa1 = new  Villa(900.000,250,4,3);
        Villa villa2 = new  Villa(800.000,230,4,2);
        Villa villa3 = new  Villa(1500.000,350,6,3);

        HomeService service = new HomeService();

        List<Villa> villas = Arrays.asList(villa1,villa2,villa3);
        List<House> houses = Arrays.asList(house1,house2,house3);
        List<SummerHouse> summerHouses = Arrays.asList(summerHouse1,summerHouse2,summerHouse3);
        List<Home> homes = Arrays.asList(villa1,villa2,villa3,house1,house2,house3,summerHouse1,summerHouse2,summerHouse3);


        System.out.println("Total price of Villas : " +service.getTotalPriceofVilla(villas));
        System.out.println("Total price of Houses : " +service.getTotalPriceofHouse(houses));
        System.out.println("Total price of SummerHouses : " +service.getTotalPriceofSummerHouse(summerHouses));
        System.out.println("Total price of all Homes : " +service.getTotalPriceofHomes(homes));









    }
}