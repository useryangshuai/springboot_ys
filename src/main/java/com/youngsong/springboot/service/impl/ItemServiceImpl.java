package com.youngsong.springboot.service.impl;

import com.youngsong.springboot.mapper.ItemMapper;
import com.youngsong.springboot.pojo.Item;
import com.youngsong.springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> getItemAll() {
        return itemMapper.selectByExample(null);
    }
}
