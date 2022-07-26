package buem.pro.summerschool.controller.api;
/*
  @author   george
  @project   summerschool
  @class  ItemRestController
  @version  1.0.0 
  @since 22.07.22 - 12.16
*/

import buem.pro.summerschool.model.Item;
import buem.pro.summerschool.service.item.impls.ItemServiceImpl;
import buem.pro.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1/items/")
@RestController
public class ItemRestController {

    @Autowired
    ItemServiceImpl service;


    @RequestMapping("")
    public List<Item> showAll(){
        return service.getAll();
    }
    @RequestMapping("{id}")
    public void del(@PathVariable String id){
    }




}
