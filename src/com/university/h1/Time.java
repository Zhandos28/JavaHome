package com.university.h1;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        Calendar now = Calendar.getInstance();
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
    }

    public Time(long milliSeconds){
        second = (int) (milliSeconds/1000%60);
        minute = (int) (milliSeconds/60000%60);
        hour = (int) (milliSeconds/3600000%24);
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setTime(long elapseTime){
        second = (int) (elapseTime/1000%60);
        minute = (int) (elapseTime/60000%60);
        hour = (int) (elapseTime/3600000%24);
    }
}

class Main{
    public static void main(String[] args) {
        Time time = new Time(555550000);
//        time.setTime();
        System.out.println(time.getHour() +" " + time.getMinute() + " " + time.getSecond());
    }
}

