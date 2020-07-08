package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.ScMapper;
import com.wyh.po.Sc;
import com.wyh.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScServiceImpl extends BaseServiceImpl<Sc> implements ScService {

    @Autowired
    private ScMapper scMapper;

    @Override
    public BaseDao<Sc> getBaseDao() {
        return scMapper;
    }
}
