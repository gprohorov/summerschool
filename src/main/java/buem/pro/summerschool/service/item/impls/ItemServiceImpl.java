package buem.pro.summerschool.service.item.impls;
/*
  @author   george
  @project   summerschool
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 22.07.22 - 12.53
*/

import buem.pro.summerschool.model.Item;
import buem.pro.summerschool.service.item.interfaces.IItemService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements IItemService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = List.of(
           new Item("1","item1"," desc1", now, now),
           new Item("2","item2"," desc2", now, now),
           new Item("3","item3"," desc3", now, now),
           new Item("4","item4"," desc4", now, now)
    );

    @Override
    public Item create(Item item) {
        item.setId(UUID.randomUUID().toString());
        item.setCreatedAt(LocalDateTime.now());
        items.add(item);
        return item;
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public Item get(String id) {
        return items.stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null)
                ;
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public List<Item> getAll() {
        return this.items;
    }
}
