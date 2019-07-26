package com.abhishek.ab.Codeforces.model;

import java.util.List;

public class UpcomingSecuenceContest {

    private List<Upcomingfilterdata> upcomingfilterdataaa ;

    public UpcomingSecuenceContest() {
    }

    public UpcomingSecuenceContest(List<Upcomingfilterdata> upcomingfilterdataaa) {
        this.upcomingfilterdataaa = upcomingfilterdataaa;
    }

    public List<Upcomingfilterdata> getUpcomingfilterdataaa() {
        return upcomingfilterdataaa;
    }

    public void setUpcomingfilterdataaa(List<Upcomingfilterdata> upcomingfilterdataaa) {
        this.upcomingfilterdataaa = upcomingfilterdataaa;
    }

    @Override
    public String toString() {
        return "UpcomingSecuenceContest{" +
                "upcomingfilterdataaa=" + upcomingfilterdataaa +
                '}';
    }
}
