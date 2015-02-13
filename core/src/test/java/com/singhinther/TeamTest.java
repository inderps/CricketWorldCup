package com.singhinther;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TeamTest {

  @Test
  public void shouldInitializeTeam(){
    Team team = new Team("Australia");

    assertThat(team.getName(), is("Australia"));
  }

  @Test
  public void shouldImplementEquals(){
    Team team1 = new Team("A");
    Team team2 = new Team("A");

    assertTrue(team1.equals(team2));
  }
}