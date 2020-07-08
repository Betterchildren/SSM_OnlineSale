package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.ItemCategoryMapper;
import com.wyh.po.ItemCategory;
import com.wyh.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryServiceImpl extends BaseServiceImpl<ItemCategory> implements ItemCategoryService {
    @Autowired
    ItemCategoryMapper itemCategoryMapper;

    @Override
    public BaseDao<ItemCategory> getBaseDao() {
        return itemCategoryMapper;
    }
}
