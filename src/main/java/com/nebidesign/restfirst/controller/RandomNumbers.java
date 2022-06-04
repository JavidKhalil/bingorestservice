package com.nebidesign.restfirst.controller;

import com.nebidesign.restfirst.domain.RandomNumbersDomain;
import com.nebidesign.restfirst.service.RandomNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class RandomNumbers {

    @Autowired
    private RandomNumbersService randomNumbersService;

    @GetMapping("/rest/v1")
    public RandomNumbersDomain listOfIntegers(){
        return randomNumbersService.fillMap();
    }

}
