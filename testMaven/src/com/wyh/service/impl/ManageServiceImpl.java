package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.ManageMapper;
import com.wyh.po.Manage;
import com.wyh.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl extends BaseServiceImpl<Manage> implements ManageService {
    @Autowired
    ManageMapper manageMapper;

    @Override
    public BaseDao<Manage> getBaseDao() {
        return manageMapper;
    }
}
