package com.abhishek.ab.Codeforces.DaoUpComingContest.codeforces;


import com.abhishek.ab.Codeforces.model.profile.CodeforcesProfile;
import com.abhishek.ab.Codeforces.model.profile.FilteredProfileData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DaoCodeforcesProfile {

    public static FilteredProfileData userCodeforcesprofile(String id){

        RestTemplate restTemplate = new RestTemplate();
        CodeforcesProfile codeforcesProfile = restTemplate.getForObject("http://codeforces.com/api/user.info?handles=" + id , CodeforcesProfile.class);


        FilteredProfileData filteredProfileData = new FilteredProfileData() ;

        filteredProfileData.setHandle(codeforcesProfile.getResult().get(0).getHandle());

        String name = codeforcesProfile.getResult().get(0).getFirstName()+ " " + codeforcesProfile.getResult().get(0).getLastName() ;

        filteredProfileData.setName(name);
        filteredProfileData.setRank(codeforcesProfile.getResult().get(0).getRank());
        filteredProfileData.setMaxrank(codeforcesProfile.getResult().get(0).getMaxRank());
        filteredProfileData.setRating(codeforcesProfile.getResult().get(0).getRating());
        filteredProfileData.setMaxrating(codeforcesProfile.getResult().get(0).getMaxRating());
        filteredProfileData.setCity(codeforcesProfile.getResult().get(0).getCity());
        filteredProfileData.setCountry(codeforcesProfile.getResult().get(0).getCountry());
        filteredProfileData.setFriendofcount(codeforcesProfile.getResult().get(0).getFriendOfCount());
        filteredProfileData.setContribution(codeforcesProfile.getResult().get(0).getContribution());
        filteredProfileData.setOrganization(codeforcesProfile.getResult().get(0).getOrganization());

        long unixSeconds = codeforcesProfile.getResult().get(0).getRegistrationTimeSeconds() ;
        Date date = new java.util.Date(unixSeconds * 1000L);
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        String formattedDate = sdf.format(date);
       // System.out.println(formattedDate);

        filteredProfileData.setRegisterd(formattedDate);

        String titleUrl = "https:" + codeforcesProfile.getResult().get(0).getTitlePhoto() ;
        filteredProfileData.setTitlephoto(titleUrl);


        return filteredProfileData ;

    }
}
