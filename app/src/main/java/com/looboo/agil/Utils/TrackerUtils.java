package com.looboo.agil.Utils;

import java.util.Calendar;

public class TrackerUtils {

    int m;
    int h;

    public void getAdequateTrackerTime(){
        Calendar cal = Calendar.getInstance();
        int minute = cal.get(Calendar.MINUTE);
        int hourofday = cal.get(Calendar.HOUR_OF_DAY);

        this.h=hourofday;
        this.m=minute-(minute%5);
    }
}
