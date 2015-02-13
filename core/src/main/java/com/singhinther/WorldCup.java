package com.singhinther;

import java.util.List;

public class WorldCup {
  private List<Match> matches;

  public WorldCup(List<Match> matches) {
    this.matches = matches;
  }

  public List<Match> getAllMatches() {
    return matches;
  }
}
