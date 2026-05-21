package edu.teamrocket.criteria;

import edu.teamrocket.offer.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import edu.teamrocket.items.*;

public class LastSaleTest {

    @Test
    public void last_sale_test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Sale sale = new Sale("10", 356);
        sneaker.add(sale);
        sneaker.add(new Sale("9", 352));
        sneaker.add(new Sale("10", 404));
        sneaker.add(new Sale("8", 372));

        Criteria lastSale = new LastSale();
        List<Offer> actualSale = lastSale.checkCriteria(sneaker);
        assertEquals(372, actualSale.get(0).value());
    }

    @Test
    public void last_sale_null_test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");

        Criteria lastSale = new LastSale();
        List<Offer> actualSale = lastSale.checkCriteria(sneaker);
        assertTrue(actualSale.isEmpty());
    }
}
