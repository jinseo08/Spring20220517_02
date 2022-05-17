package com.its.dbex.service;

import com.its.dbex.repository.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateService {

    @Autowired
    private DateRepository dateRepository;

    public void save(String val1, String val2) {
        dateRepository.save(val1,val2);
    }



}
