package com.company.yostane.gaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockGuitar {

  @Id
  @Column(name="name")
  private String name;

  @Column(name="color")
  private String color;

  // Constructeur par défaut
  public StockGuitar() {
  }

  // Constructeur avec arguments
  public StockGuitar(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getcolor() {
    return color;
  }

  public void setcolor(String color) {
    this.color = color;
  }

}