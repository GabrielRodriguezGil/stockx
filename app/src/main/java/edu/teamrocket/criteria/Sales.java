package edu.teamrocket.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Offer;
import edu.teamrocket.offer.Sale;

public class Sales implements Criteria {

    Sales() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(Sale.class::isInstance).collect(Collectors.toList());

    }
}