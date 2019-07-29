package com.example.farminweather2.Common;

import android.location.Location;

import com.google.android.gms.location.LocationResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID="62de31e2ff0b0887c1361e077a1cf43e";

    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {

        Date date=new Date(dt*1000L);
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm EEE MM YYYY");
        String formatted=sdf.format(date);
        return formatted;

    }

    public static String convertUnixToHour(long dt)
    {
        Date date=new Date(dt*1000L);
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        String formatted=sdf.format(date);
        return formatted;

    }
}
