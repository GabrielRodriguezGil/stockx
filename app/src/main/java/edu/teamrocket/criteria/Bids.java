package edu.teamrocket.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Bid;
import edu.teamrocket.offer.Offer;

public class Bids implements Criteria {

    Bids() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(Bid.class::isInstance).collect(Collectors.toList());
    }
}