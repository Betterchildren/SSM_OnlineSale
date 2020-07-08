package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.ItemOrderMapper;
import com.wyh.po.ItemOrder;
import com.wyh.service.ItemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemOrderServiceImpl extends BaseServiceImpl<ItemOrder> implements ItemOrderService {

    @Autowired
    private ItemOrderMapper itemOrderMapper;

    @Override
    public BaseDao<ItemOrder> getBaseDao() {
        return itemOrderMapper;
    }
}
