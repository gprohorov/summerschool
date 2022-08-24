package buem.pro.summerschool.service.item.impls;
/*
  @author   george
  @project   summerschool
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 22.07.22 - 12.53
*/

import buem.pro.summerschool.model.Item;
import buem.pro.summerschool.model.ItemType;
import buem.pro.summerschool.repository.item.ItemFakeRepository;
import buem.pro.summerschool.repository.item.ItemMongoRepository;
import buem.pro.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Item> items = new ArrayList<>(
            Arrays.asList(
                    new Item("1","item1", ItemType.LOW," desc1", now, now),
                    new Item("2","item2",ItemType.HIGH," desc2", now, now),
                    new Item("3","item3",ItemType.MIDDLE," desc3", now, now),
                    new Item("4","item4",ItemType.LOW," desc4", now, now)
            ));

    @Autowired
    ItemMongoRepository repository;

   @PostConstruct
    void init(){
     repository.saveAll(items);
    }

    @Override
    public Item create(Item item) {
        item.setCreatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public Item update(Item item) {
        item.setUpdatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public Item get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() {



        return repository.findAll();  }

    public List<Item> saveAll(List<Item> items) {
       return repository.saveAll(items);
    }
}
