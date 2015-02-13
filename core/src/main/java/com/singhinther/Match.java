package com.singhinther;

import java.util.Date;

public class Match implements Comparable<Match>  {
  private Team team1;
  private Team team2;
  private Stadium stadium;
  private Date date;
  private MatchType type;

  public Match(Team team1, Team team2, Stadium stadium, Date date, MatchType type) {
    this.team1 = team1;
    this.team2 = team2;
    this.stadium = stadium;
    this.date = date;
    this.type = type;
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

  public MatchType getType() {
    return type;
  }

  @Override
  public int compareTo(Match another) {
    return getDate().compareTo(another.getDate());
  }
}

