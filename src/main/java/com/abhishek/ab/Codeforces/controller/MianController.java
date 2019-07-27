package com.abhishek.ab.Codeforces.controller;


import com.abhishek.ab.Codeforces.DaoUpComingContest.codeforces.DaoCodeforces;
import com.abhishek.ab.Codeforces.DaoUpComingContest.codeforces.DaoCodeforcesProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MianController {

    @Autowired
    DaoCodeforces daoCodeforces ;

    @Autowired
    DaoCodeforcesProfile daoCodeforcesProfile ;

    @RequestMapping(value = "")
    public String home(ModelMap modelMap){

        //System.out.println(daoCodeforces.codeforcesUpcomingcontest());
        modelMap.put("codeforces" , daoCodeforces.codeforcesUpcomingcontest()) ;

        return "home" ;
    }

    @RequestMapping(value = "/profile")
    public String profile(@RequestParam("id")  String id  , ModelMap modelMap){


        //System.out.println(daoCodeforcesProfile.userCodeforcesprofile(id));

        modelMap.put("profiles" , daoCodeforcesProfile.userCodeforcesprofile(id)) ;
        return "profile" ;
    }
}
