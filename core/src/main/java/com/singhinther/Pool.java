package com.singhinther;

import java.util.List;

public class Pool {
  private String name;
  private List<Match> matches;

  public Pool(String name, List<Match> matches) {
    this.name = name;
    this.matches = matches;
  }

  public String getName() {
    return name;
  }

  public List<Match> getMatches() {
    return matches;
  }
}
