package com.singhinther;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatchTest {

  @Test
  public void shouldInitializeMatch(){
      Team team1 = new Team("team 1");
      Team team2 = new Team("team 2");
      Stadium stadium = new Stadium("stadium");
      Date date = new Date();

      Match match = new Match(team1, team2, stadium, date);

      assertThat(match.getTeam1(), is(team1));
      assertThat(match.getTeam2(), is(team2));
      assertThat(match.getStadium(), is(stadium));
      assertThat(match.getDate(), is(date));
  }
}