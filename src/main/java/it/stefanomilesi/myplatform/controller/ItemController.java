package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Item;
import it.stefanomilesi.myplatform.repository.ItemRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController extends CrudRestController<Item> {

    public ItemController(ItemRepository repository) {
        super(repository);
    }
}
