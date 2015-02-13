package com.singhinther;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class WorldCupTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void shouldReturnAllMatches()
  {
    List<Match> expectedMatches = new ArrayList<>();
    expectedMatches.add(mock(Match.class));
    expectedMatches.add(mock(Match.class));

    WorldCup worldCup = new WorldCup(expectedMatches);

    List<Match> actualMatches = worldCup.getAllMatches();

    assertThat(actualMatches, is(expectedMatches));
  }

  @Test
  public void shouldReturnAllMatchesByTeamName()
  {
    List<Match> matches = new ArrayList<>();

//    Match match1 = (mock(Match.class));
////    when(match1.get)
////
////
////
////    expectedMatches.add(mock(Match.class));
////    expectedMatches.add(mock(Match.class));
////
////    WorldCup worldCup = new WorldCup(expectedMatches);
//
//    List<Match> actualMatches = worldCup.getAllMatches();
//
//    assertThat(actualMatches, is(expectedMatches));
  }
}