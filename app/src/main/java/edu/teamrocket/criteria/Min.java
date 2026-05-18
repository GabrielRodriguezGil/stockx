package edu.teamrocket.criteria;

import java.util.List;
import java.util.Optional;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Offer;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    Min(Criteria cr1, Criteria cr2) {
        this.criteria = cr1;
        this.otherCriteria = cr2;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(item)
                .stream()
                .min(Offer::compareTo);
        return offer.isPresent() ? List.of(offer.get()) : List.of();
    }
}