package com.sgs.learningspring.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// import java.util.regex.Pattern;

public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date createDateFromDateString(String dateString){
        Date date = null;
        if(dateString != null){
            try{
                date = DATE_FORMAT.parse(dateString);

            }catch(ParseException pe){
                date = new Date();
            }
        }else{
            date = new Date();
        }
        return date;
    }
}
