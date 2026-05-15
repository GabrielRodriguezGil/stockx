package edu.teamrocket.criteria;

import java.util.List;
import java.util.Optional;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Bid;
import edu.teamrocket.offer.Offer;

public class MaxBid implements Criteria {

    MaxBid() {

    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> maxBid = item.offers().stream().filter(Bid.class::isInstance).max(Offer::compareTo);

        return maxBid.isPresent() ? List.of(maxBid.get()) : List.of();
    }
}