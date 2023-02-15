package com.stocks;
import java.util.ArrayList;
import java.util.Scanner;
/*Stock Account Management Program*/
public class Stock {
    public Scanner scannerObject = new Scanner(System.in);
    public void addDetails(StockPortfolio portfolio){                       //Method to add stock details
        ArrayList <String> stock_name = new ArrayList<>();                 //Array list of stock name
        ArrayList <Double> stock_numbers = new ArrayList<>();
        ArrayList <Double> stock_price = new ArrayList<>();
        System.out.print("Enter the number stock to add: ");
        int numberOfStock = scannerObject.nextInt();
        for (int i = 0; i < numberOfStock; i++){
            System.out.print("Enter the name of the stock: ");
            String share_name = scannerObject.next();
            stock_name.add(share_name);
            portfolio.setStock_name(stock_name);

            System.out.print("Enter the number of share of the same stock: ");
            double no_of_shares = scannerObject.nextInt();
            stock_numbers.add(no_of_shares);
            portfolio.setStock_numbers(stock_numbers);

            System.out.print("Enter the price of the share: ");
            double share_price = scannerObject.nextInt();
            stock_price.add(share_price);
            portfolio.setStock_price(stock_price);
            System.out.println();
        }
    }
    public void stockDisplay(StockPortfolio stockPortfolio){                //Method to display the total stock value
        addDetails(stockPortfolio);
        double stockTotalValue = 0;
        System.out.println("The stock report:");
        System.out.println("Stock    Shares     Price     Value");
        System.out.println("-----------------------------------");
        for (int i = 0; i<stockPortfolio.getStock_price().size(); i++){                   //Fetching details of each stock
            double share_num =(double) stockPortfolio.getStock_numbers().get(i);
            double share_price = (double) stockPortfolio.getStock_price().get(i);
            String share_name = (String) stockPortfolio.getStock_name().get(i);

            stockTotalValue += share_num*share_price;
            System.out.println(share_name + "       " + share_num +"       "+ share_price+"       "+share_num*share_price);
        }
        System.out.println("\nThe total value of all the stocks = "+ stockTotalValue);
    }
    public static void main(String []args){
        StockPortfolio stockPortfolio = new StockPortfolio();           //Creating an instance of StockPortfolio class
        Stock stock = new Stock();                                      //Creating an instance of same class
        stock.stockDisplay(stockPortfolio);                             //Calling the other class from object of same class
    }
}
