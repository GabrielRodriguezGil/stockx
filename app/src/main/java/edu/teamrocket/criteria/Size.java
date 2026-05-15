package edu.teamrocket.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Offer;

public class Size implements Criteria {
    private String size = "";

    Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(o -> o.size().equals(size)).collect(Collectors.toList());
    }
}