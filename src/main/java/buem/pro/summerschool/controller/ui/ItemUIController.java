package buem.pro.summerschool.controller.ui;
/*
  @author   george
  @project   summerschool
  @class  ItemUIController
  @version  1.0.0 
  @since 09.08.22 - 11.02
*/

import buem.pro.summerschool.model.Item;
import buem.pro.summerschool.service.item.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/ui/v1/items/")
@Controller
public class ItemUIController {

    @Autowired
    ItemServiceImpl service;

    @GetMapping("")
    public String showAll(){

        return "items";
    }

}
