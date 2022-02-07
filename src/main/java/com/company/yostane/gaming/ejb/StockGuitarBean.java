package com.company.yostane.gaming.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.company.yostane.gaming.model.StockGuitar;

@Stateless
public class StockGuitarBean {

    private static List<StockGuitar> guitars = new ArrayList<>();

    public List<StockGuitar> getStockGuitars() {
        return guitars;
    }

    public void addStockGuitar(StockGuitar stockGuitar) {
        guitars.add(stockGuitar);
    }

    public void deleteStockGuitarByName(String name) {
        List<StockGuitar> tempList = new ArrayList<>();
        for (var stockGuitar : guitars) {
            if (!stockGuitar.getName().equals(name)) {
                tempList.add(stockGuitar);
            }
        }
        guitars.clear();
        guitars.addAll(tempList);
    }

}
