package com.singhinther;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TeamTest {

  @Test
  public void shouldInitializeTeam(){
    Team team = new Team("Australia");

    assertThat(team.getName(), is("Australia"));
  }
}