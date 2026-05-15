package edu.teamrocket.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Ask;
import edu.teamrocket.offer.Offer;

public class Asks implements Criteria {

    Asks() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(Ask.class::isInstance).collect(Collectors.toList());
    }

}