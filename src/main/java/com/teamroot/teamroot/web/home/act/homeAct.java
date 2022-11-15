package com.teamroot.teamroot.web.home.act;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeAct {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
