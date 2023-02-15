package com.stocks;
import java.util.ArrayList;
public class StockPortfolio {
    private ArrayList <String> stock_name = new ArrayList<>();
    private ArrayList <Double> stock_numbers = new ArrayList<>();
    private ArrayList <Double> stock_price = new ArrayList<>();
    public ArrayList getStock_name(){                                      // Getter and setter
        return stock_name;
    }
    public void setStock_name(ArrayList stock_name){
        this.stock_name = stock_name;
    }
    public ArrayList getStock_numbers(){
        return stock_numbers;
    }
    public void setStock_numbers(ArrayList stock_numbers){
        this.stock_numbers = stock_numbers;
    }
    public ArrayList getStock_price(){
        return stock_price;
    }
    public void setStock_price(ArrayList stock_price){
        this.stock_price = stock_price;
    }
}