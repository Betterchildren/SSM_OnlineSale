package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.MessageMapper;
import com.wyh.po.Message;
import com.wyh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl extends BaseServiceImpl<Message> implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public BaseDao<Message> getBaseDao() {
        return messageMapper;
    }
}
