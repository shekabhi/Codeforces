package com.abhishek.ab.Codeforces.controller;


import com.abhishek.ab.Codeforces.DaoUpComingContest.codeforces.DaoCodeforces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MianController {

    @Autowired
    DaoCodeforces daoCodeforces ;

    @RequestMapping(value = "")
    public String home(ModelMap modelMap){

        System.out.println(daoCodeforces.codeforcesUpcomingcontest());
        modelMap.put("codeforces" , daoCodeforces.codeforcesUpcomingcontest()) ;

        return "home" ;
    }

    @RequestMapping(value = "/profile")
    public String profile(){


        return "profile" ;
    }
}
