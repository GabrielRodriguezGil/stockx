package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Offer;

public class Asks implements Criteria {

    Asks() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers();
    }

}