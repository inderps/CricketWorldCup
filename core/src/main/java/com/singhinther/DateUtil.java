package com.singhinther;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

  public static Date convertToDate(String date) {
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    try {
      return dateFormat.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String formattedDate(Date date) {
    DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
    return dateFormat.format(date);
  }
}
