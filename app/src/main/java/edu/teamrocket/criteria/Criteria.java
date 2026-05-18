package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.items.Item;
import edu.teamrocket.offer.*;

public interface Criteria {

    List<Offer> checkCriteria(Item item);
}