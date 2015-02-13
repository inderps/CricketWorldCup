package com.singhinther.cricketworldcup;

import android.content.Context;
import android.widget.TextView;

import com.singhinther.Stadium;
import com.singhinther.Team;

public class StadiumTextView extends TextView {
  private Stadium stadium;

  public StadiumTextView(Context context) {
    super(context);
  }

  public void setText(Stadium stadium){
    this.stadium = stadium;
    setText(stadium.getName());
  }

  public Stadium getStadium() {
    return stadium;
  }
}
