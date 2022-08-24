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
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/api/v1/items/")
@RestController
@CrossOrigin
public class ItemRestController {

    @Autowired
    ItemServiceImpl service;

    @GetMapping("")
    @ApiOperation(value = "Get list of all items")
    @ApiResponse(code = 200, message = "success")
    public List<Item> showAll(){
        return service.getAll();
    }

    @PostMapping("/all")
    public List<Item> saveAll(@RequestBody List<Item> items){
        return service.saveAll(items);
    }

    @ApiOperation(value = "Get item by id item")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 404, message = "No item with such id")
    })
    @GetMapping("/{id}")
    public Item showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    @ApiOperation(value = "Create a new item")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success"),
            @ApiResponse(code = 400, message = "Bad request")
    })
    public Item insertOne(@RequestBody Item item){
        return service.create(item);
    }
    @PutMapping()
    public Item updateOne(@RequestBody Item item){
        return service.update(item);
    }





}
