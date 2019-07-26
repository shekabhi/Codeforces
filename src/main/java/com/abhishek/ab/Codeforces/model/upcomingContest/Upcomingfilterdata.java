package com.abhishek.ab.Codeforces.model.upcomingContest;


public class Upcomingfilterdata {

    private int id ;
    private String name ;
    private String type ;
    private String phase ;
    private String duration ;
    private String date ;

    public Upcomingfilterdata() {
    }

    public Upcomingfilterdata(int id, String name, String type, String phase, String duration, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.phase = phase;
        this.duration = duration;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Upcomingfilterdata{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", phase='" + phase + '\'' +
                ", duration=" + duration +
                ", date='" + date + '\'' +
                '}';
    }
}
