package buem.pro.summerschool.repository.item;
/*
  @author   george
  @project   summerschool
  @class  ItemMongoRepository
  @version  1.0.0 
  @since 02.08.22 - 12.09
*/

import buem.pro.summerschool.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ItemMongoRepository extends MongoRepository<Item, String> {

    List<Item> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
