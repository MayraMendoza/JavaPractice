package com.hackerrankalgorithms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class JavaDateAndTime
{

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");

        Date date = new GregorianCalendar(year, month -1, day).getTime();
        String dayText = simpleDateFormat.format(date);

        return dayText.toUpperCase();

    }

}
