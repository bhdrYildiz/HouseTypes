package Service;

import Business.SquareMetres;
import Entity.Home;
import Entity.House;
import Entity.SummerHouse;
import Entity.Villa;

import java.util.ArrayList;
import java.util.List;


public class HomeService {
    public double getTotalPriceofHouse(List<House> houseList){


         double totalPrice = 0;
         for (House h : houseList){
             totalPrice = totalPrice + h.getPrice();
         }
         return totalPrice;
     }
     public double getTotalPriceofVilla(List<Villa> villa){
         double villasPrice = 0 ;
         for(Villa v : villa){
             villasPrice  = villasPrice + v.getPrice();
         }
         return villasPrice;
     }
     public double getTotalPriceofSummerHouse(List<SummerHouse> summerHouseList){
         double summerHousePrice = 0;
         for (SummerHouse s : summerHouseList){
             summerHousePrice += s.getPrice();
         }
         return summerHousePrice;
     }

     public double getTotalPriceofHomes(List<Home> homeList){
         double homePrice = 0;
         for (Home h : homeList){
             homePrice += h.getPrice();
         }
         return homePrice;
     }
     
     public double getTotalPriceforType(List<Home> homeList,Class<Home> type){

         double homePrice = 0 ;
         for (Home h : homeList){
             if (h.getClass().equals(type)){
                 homePrice += h.getPrice();
             }
         }
         return homePrice;
     }

     public int getSquareMetresHome(List<Home> homeList){
        int totalMetres = 0;
        for (Home h : homeList){
            totalMetres += h.getSquare();
        }
        return totalMetres;
     }

    public int getSquareMetresVilla(List<Villa> villaList){
        int totalMetres = 0;
        for (Villa villa : villaList){
            totalMetres += villa.getSquare();
        }
        return totalMetres;
    }

    public int getSquareMetresSummerHouse(List<SummerHouse> summerHouseList){
        int totalMetres = 0;
        for (SummerHouse summerHouse : summerHouseList){
            totalMetres += summerHouse.getSquare();
        }
        return totalMetres;
    }

    public int getSquareMetresAllHouse(List<House> houseList){
        int totalMetres = 0;
        for (House house : houseList){
            totalMetres += house.getSquare();
        }
        return totalMetres;
    }

    //Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot

    public List<House> filteredHouse(House house,int minRoom, int minHalls){
        List<House> filteredHouse = new ArrayList<>();

        if (house.getRooms() >= minRoom && house.getNumberOfHalls() >= minHalls){
            filteredHouse.add(house);
        }
        return filteredHouse;
    }















}
