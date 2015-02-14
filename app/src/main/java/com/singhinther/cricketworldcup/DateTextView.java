package com.singhinther.cricketworldcup;

import android.content.Context;
import android.widget.TextView;

import com.singhinther.DateUtil;
import com.singhinther.Stadium;

import java.text.DateFormat;
import java.util.Date;

public class DateTextView extends TextView {
  private Date date;

  public DateTextView(Context context) {
    super(context);
  }

  public void setText(Date date){
    this.date = date;
    setText(DateUtil.formattedDate(date));
  }

  public Date getDate() {
    return date;
  }
}
