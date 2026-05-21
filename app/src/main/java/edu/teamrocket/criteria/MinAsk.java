package edu.teamrocket.criteria;

import java.util.List;
import java.util.Optional;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Ask;
import edu.teamrocket.offer.Offer;

public class MinAsk implements Criteria {

    public MinAsk() {

    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> minAsk = item.offers().stream().filter(Ask.class::isInstance).min(Offer::compareTo);

        return minAsk.isPresent() ? List.of(minAsk.get()) : List.of();
    }
}