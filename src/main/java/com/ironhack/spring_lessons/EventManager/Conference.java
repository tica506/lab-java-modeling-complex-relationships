package com.ironhack.spring_lessons.EventManager;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Timer;
//Testing
@Entity
@PrimaryKeyJoinColumn(name = "title")
public class Conference extends Event {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "conference_title")
    private List<Speaker>  speaker;

    public Conference(){}

    public Conference(Date date, long duration, String location, String title, List<Guest> list, List<Speaker> speaker) {
        super(date, duration, location, title, list);
        this.speaker = speaker;
    }

    public List<Speaker> getSpeaker() {
        return speaker;
    }

    public void setSpeaker(List<Speaker> speaker) {
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "speaker=" + speaker +
                '}';
    }
}