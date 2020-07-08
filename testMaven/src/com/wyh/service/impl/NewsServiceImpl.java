package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.NewsMapper;
import com.wyh.po.News;
import com.wyh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public BaseDao<News> getBaseDao() {
        return newsMapper;
    }
}
