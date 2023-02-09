package com.toy.toy_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.toy_springboot.dao.AttachFileDao;


@Service
public class AttachFileService {

    @Autowired
    AttachFileDao attachFileDao;
    
    public Object insertMulti(Object dataMap){
        String sqlId = "AttachFile.insertMulti";
        Object result = attachFileDao.insert(sqlId, dataMap);
        return result;
    }
}