package com.company.yostane.gaming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import com.company.yostane.gaming.ejb.StockGuitarBean;
import com.company.yostane.gaming.model.StockGuitar;

public class SampleTest {

	StockGuitarBean stockGuitarBean = new StockGuitarBean();

	@Test
	public void simpleJUnit5Test() {
		String result = "duke";
		assertEquals("duke", result);
	}

	@Test
	public void testAdd() {
		StockGuitar stockguitar = new StockGuitar("alextérieur", "55");
		stockGuitarBean.addStockGuitar(stockguitar);
		assertEquals(1, stockGuitarBean.getStockGuitars().size());
	}
}
