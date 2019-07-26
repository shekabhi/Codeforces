package com.abhishek.ab.Codeforces.DaoUpComingContest.codeforces;

import com.abhishek.ab.Codeforces.model.Result;
import com.abhishek.ab.Codeforces.model.UpcomingContestInfo;
import com.abhishek.ab.Codeforces.model.UpcomingSecuenceContest;
import com.abhishek.ab.Codeforces.model.Upcomingfilterdata;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DaoCodeforces {


    public static List<Upcomingfilterdata> codeforcesUpcomingcontest() {

        RestTemplate restTemplate = new RestTemplate();
        UpcomingContestInfo upcomingContestInfo = restTemplate.getForObject("https://codeforces.com/api/contest.list", UpcomingContestInfo.class);


        UpcomingSecuenceContest upcomingSecuenceContest= new UpcomingSecuenceContest() ;

        int n =  6 ;
        List<Upcomingfilterdata> upcomingfilterdata = new ArrayList<>(5) ;

        for(int i=0  ;i<6 ; i++){

            Upcomingfilterdata upcomingfilterdata1 = new Upcomingfilterdata() ;

                upcomingfilterdata1.setId(upcomingContestInfo.getResult().get(i).getId());
                upcomingfilterdata1.setName(upcomingContestInfo.getResult().get(i).getName());
                upcomingfilterdata1.setType(upcomingContestInfo.getResult().get(i).getType());
                upcomingfilterdata1.setPhase(upcomingContestInfo.getResult().get(i).getPhase());

                upcomingfilterdata1.setDuration(formatSeconds(upcomingContestInfo.getResult().get(i).getDurationSeconds()));

                long unixSeconds = upcomingContestInfo.getResult().get(i).getStartTimeSeconds();
                Date date = new java.util.Date(unixSeconds * 1000L);
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
                sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                String formattedDate = sdf.format(date);
                System.out.println(formattedDate);

                upcomingfilterdata1.setDate(formattedDate);

                upcomingfilterdata.add(i, upcomingfilterdata1);

        }

        return upcomingfilterdata ;

    }

    public static String formatSeconds(int timeInSeconds){
        int secondsLeft = timeInSeconds % 3600 % 60;
        int minutes =(int) Math.floor(timeInSeconds % 3600 / 60);
        int hours =(int) Math.floor(timeInSeconds / 3600);

        String HH = hours < 10 ? "0" + hours : hours+"";
        String MM = minutes < 10 ? "0" + minutes : minutes+"";
        String SS = secondsLeft < 10 ? "0" + secondsLeft : secondsLeft+"";

        return HH + ":" + MM + ":" + SS;
    }
}
