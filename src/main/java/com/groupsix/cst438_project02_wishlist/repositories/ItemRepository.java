package com.groupsix.cst438_project02_wishlist.repositories;


import com.groupsix.cst438_project02_wishlist.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
