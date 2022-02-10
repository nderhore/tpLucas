package com.company.yostane.gaming.repository;

import com.company.yostane.gaming.model.StockGuitar;
import com.company.yostane.gaming.resources.GuitarResource;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class StockGuitarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<StockGuitar> getAllStockGuitar(){
        return new ArrayList<>(entityManager.createQuery("select r from StockGuitar r",StockGuitar.class).getResultList());
    }

    public StockGuitar getStockGuitarById(String name){
        StockGuitar guitar = entityManager.find(StockGuitar.class, name);
        if (guitar == null) {
            throw new NotFoundException();
        }
        return guitar;
    }

    public StockGuitar save(StockGuitar stockGuitar) {
        if(stockGuitar != null) {
            entityManager.persist(stockGuitar);
        }
        return stockGuitar;
    }

    public StockGuitar update(StockGuitar stockGuitar) {
        return entityManager.merge(stockGuitar);
    }

    public void deleteById(String name) {
        StockGuitar task = this.getStockGuitarById(name);
        entityManager.remove(task);
    }
}
