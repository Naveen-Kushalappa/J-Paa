package com.portea.paa.controller;

import com.portea.paa.service.PaaRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/jpaa")
public class RestController {

    @Autowired
    private final PaaRestService paaRestService;

    public RestController(@Qualifier("PaaRestServiceImpl")PaaRestService paaRestService ){
        this.paaRestService = paaRestService;
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String testMe(){

        return "Testing success";

    }

} 
