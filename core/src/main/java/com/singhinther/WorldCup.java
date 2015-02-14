package com.singhinther;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class WorldCup {
  private List<Match> matches;

  public WorldCup(List<Match> matches) {
    this.matches = matches;
    Collections.sort(this.matches);
  }

  public List<Match> getAllMatches() {
    return matches;
  }

  public List<Match> getAllMatchesByTeam(Team team) {
    List<Match> filteredMatches = new ArrayList<Match>();
    for(Match match: matches){
      if(match.getTeam1().equals(team) || match.getTeam2().equals(team)){
        filteredMatches.add(match);
      }
    }
    return filteredMatches;
  }

  public List<Match> getAllMatchesByStadium(Stadium stadium) {
    List<Match> filteredMatches = new ArrayList<Match>();
    for(Match match: matches){
      if(match.getStadium().equals(stadium)){
        filteredMatches.add(match);
      }
    }
    return filteredMatches;
  }

  public List<Match> getAllMatchesByMatchType(MatchType matchType) {
    List<Match> filteredMatches = new ArrayList<Match>();
    for(Match match: matches){
      if(match.getType().equals(matchType)){
        filteredMatches.add(match);
      }
    }
    return filteredMatches;
  }

  public List<Match> getAllMatchesByDate(Date date) {
    List<Match> filteredMatches = new ArrayList<Match>();
    for(Match match: matches){
      if(match.getDate().equals(date)){
        filteredMatches.add(match);
      }
    }
    return filteredMatches;
  }
}
