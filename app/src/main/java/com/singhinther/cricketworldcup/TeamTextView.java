package com.singhinther.cricketworldcup;

import android.content.Context;
import android.widget.TextView;

import com.singhinther.Team;

public class TeamTextView extends TextView {
  private Team team;

  public TeamTextView(Context context) {
    super(context);
  }

  public void setText(Team team){
    this.team = team;
    setText(team.getName());
  }

  public Team getTeam() {
    return team;
  }
}
