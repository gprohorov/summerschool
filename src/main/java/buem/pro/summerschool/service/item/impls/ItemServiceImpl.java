package buem.pro.summerschool.service.item.impls;
/*
  @author   george
  @project   summerschool
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 22.07.22 - 12.53
*/

import buem.pro.summerschool.model.Item;
import buem.pro.summerschool.repository.ItemFakeRepository;
import buem.pro.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    ItemFakeRepository repository;

    @Override
    public Item create(Item item) {
        return repository.save(item);
    }

    @Override
    public Item update(Item item) {
        return repository.update(item);
    }

    @Override
    public Item get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() {
        return repository.findAll();
    }
}
