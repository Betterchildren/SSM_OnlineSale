package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.ItemMapper;
import com.wyh.po.Item;
import com.wyh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public BaseDao<Item> getBaseDao() {
        return itemMapper;
    }
}
