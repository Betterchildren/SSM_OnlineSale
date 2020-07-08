package com.wyh.service.impl;

import com.wyh.base.BaseDao;
import com.wyh.base.BaseServiceImpl;
import com.wyh.mapper.CarMapper;
import com.wyh.po.Car;
import com.wyh.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl extends BaseServiceImpl<Car> implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public BaseDao<Car> getBaseDao() {
        return carMapper;
    }
}
