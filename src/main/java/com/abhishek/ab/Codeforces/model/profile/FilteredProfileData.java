package com.abhishek.ab.Codeforces.model.profile;

public class FilteredProfileData {

    private  String handle ;
    private String name ;
    private  String rank ;
    private  String maxrank ;
    private  int rating ;
    private  int maxrating ;
    private  String city ;
    private  String country ;
    private  int friendofcount ;
    private  int contribution ;
    private  String organization ;
    private  String registerd ;
    private String titlephoto ;

    public FilteredProfileData() {
    }

    public FilteredProfileData(String handle, String name, String rank, String maxrank, int maxrating, String city, String country, int rating, int friendofcount, int contribution, String organization, String registerd, String titlephoto) {
        this.handle = handle;
        this.name = name;
        this.rank = rank;
        this.maxrank = maxrank;
        this.rating = rating;
        this.maxrating = maxrating;
        this.city = city;
        this.country = country;
        this.friendofcount = friendofcount;
        this.contribution = contribution;
        this.organization = organization;
        this.registerd = registerd;
        this.titlephoto = titlephoto;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(String maxrank) {
        this.maxrank = maxrank;
    }

    public int getMaxrating() {
        return maxrating;
    }

    public void setMaxrating(int maxrating) {
        this.maxrating = maxrating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getFriendofcount() {
        return friendofcount;
    }

    public void setFriendofcount(int friendofcount) {
        this.friendofcount = friendofcount;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRegisterd() {
        return registerd;
    }

    public void setRegisterd(String registerd) {
        this.registerd = registerd;
    }

    public String getTitlephoto() {
        return titlephoto;
    }

    public void setTitlephoto(String titlephoto) {
        this.titlephoto = titlephoto;
    }

    @Override
    public String toString() {
        return "FilteredProfileData{" +
                "handle='" + handle + '\'' +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", maxrank='" + maxrank + '\'' +
                ", maxrating='" + maxrating + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", rating='" + rating + '\'' +
                ", friendofcount='" + friendofcount + '\'' +
                ", contribution='" + contribution + '\'' +
                ", organization='" + organization + '\'' +
                ", registerd='" + registerd + '\'' +
                ", titlephoto='" + titlephoto + '\'' +
                '}';
    }
}
