package buem.pro.summerschool.repository;
/*
  @author   george
  @project   summerschool
  @class  ItemFakeRepository
  @version  1.0.0 
  @since 29.07.22 - 11.05
*/

import buem.pro.summerschool.model.Item;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class ItemFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = List.of(
            new Item("1","item1"," desc1", now, now),
            new Item("2","item2"," desc2", now, now),
            new Item("3","item3"," desc3", now, now),
            new Item("4","item4"," desc4", now, now)
    );

    public List<Item> findAll(){
        return this.items;
    }


    public Item findById(String id) {
        return null;
    }

    public Item update(Item item) {
        return  null;
    }

    public void deleteById(String id) {

    }

    public Item save(Item item) {
        item.setId(UUID.randomUUID().toString());
        item.setCreatedAt(LocalDateTime.now());
        this.items.add(item);
        return null;
    }
}
