package com.company.yostane.gaming.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.company.yostane.gaming.model.StockGuitar;
import com.company.yostane.gaming.repository.StockGuitarRepository;

@Stateless
public class StockGuitarBean {

    @Inject
    private StockGuitarRepository stockGuitarRepository;

    public List<StockGuitar> getStockGuitars() {
        return stockGuitarRepository.getAllStockGuitar();
    }

    public void addStockGuitar(StockGuitar stockGuitar) {
        stockGuitarRepository.save(stockGuitar);
    }

    public void deleteStockGuitarByName(String name) {
        stockGuitarRepository.deleteById(name);
    }

    public void update(StockGuitar stockGuitar) {
        stockGuitarRepository.update(stockGuitar);
    }

}
