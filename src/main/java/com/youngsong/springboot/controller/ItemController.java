package com.youngsong.springboot.controller;

import com.youngsong.springboot.pojo.Item;
import com.youngsong.springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/itemList")
    public List<Item> itemList(){

        return itemService.getItemAll();
    }
}
