package com.singhinther;

import java.util.Date;

public class Match {
  private Team team1;
  private Team team2;
  private Stadium stadium;
  private Date date;

  public Match(Team team1, Team team2, Stadium stadium, Date date) {
    this.team1 = team1;
    this.team2 = team2;
    this.stadium = stadium;
    this.date = date;
  }

  public Team getTeam1() {
    return team1;
  }

  public Team getTeam2() {
    return team2;
  }

  public Stadium getStadium() {
    return stadium;
  }

  public Date getDate() {
    return date;
  }
}
