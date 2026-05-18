package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.Offer;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    AndCriteria(Criteria crt1, Criteria crt2) {
        this.criteria = crt1;
        this.otherCriteria = crt2;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return criteria.checkCriteria(item).stream()
                .filter(x -> otherCriteria.checkCriteria(item).contains(x))
                .toList();
    }
}