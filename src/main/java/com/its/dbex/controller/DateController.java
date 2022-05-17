package com.its.dbex.controller;

import com.its.dbex.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DateController {

    @Autowired
    private DateService dateService;

    @GetMapping("/save-form")
    public String save_form(){
        return "save-form";
    }

    @PostMapping("/save")
    public String save(@RequestParam("val1") String val1, @RequestParam("val2") String val2){
        dateService.save(val1,val2);
        return null;
    }





}
