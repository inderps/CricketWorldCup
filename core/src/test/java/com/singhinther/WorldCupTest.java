package com.singhinther;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class WorldCupTest {
  Date now = new Date();

  @Test
  public void shouldReturnAllMatchesOrderByDate()
  {
    Match expectedMatch1 = stubMatch("12-01-2015");
    Match expectedMatch2 = stubMatch("07-01-2015");
    Match expectedMatch3 = stubMatch("08-01-2015");

    List<Match> expectedMatches = new ArrayList<Match>();
    expectedMatches.add(expectedMatch1);
    expectedMatches.add(expectedMatch2);
    expectedMatches.add(expectedMatch3);

    WorldCup worldCup = new WorldCup(expectedMatches);

    List<Match> actualMatches = worldCup.getAllMatches();

    assertThat(actualMatches.get(0), is(expectedMatch2));
    assertThat(actualMatches.get(1), is(expectedMatch3));
    assertThat(actualMatches.get(2), is(expectedMatch1));
  }

  @Test
  public void shouldReturnAllMatchesByTeamName()
  {
    Match match1 = new Match(new Team("Australia"), new Team("India"), mock(Stadium.class), now, MatchType.POOL_A);
    Match match2 = new Match(new Team("West Indies"), new Team("England"), mock(Stadium.class), now, MatchType.POOL_A);
    Match match3 = new Match(new Team("West Indies"), new Team("Australia"), mock(Stadium.class), now, MatchType.POOL_A);

    List<Match> matches = new ArrayList<Match>();
    matches.add(match1);
    matches.add(match2);
    matches.add(match3);

    WorldCup worldCup = new WorldCup(matches);

    List<Match> actualMatches = worldCup.getAllMatchesByTeam(new Team("Australia"));

    assertThat(actualMatches.size(), is(2));
    assertThat(actualMatches.get(0), is(match1));
    assertThat(actualMatches.get(1), is(match3));
  }


  @Test
  public void shouldReturnAllMatchesByStadiumName()
  {
    Match match1 = new Match(mock(Team.class), mock(Team.class), new Stadium("A"), now, MatchType.SEMI_FINAL);
    Match match2 = new Match(mock(Team.class), mock(Team.class), new Stadium("B"), now, MatchType.SEMI_FINAL);
    Match match3 = new Match(mock(Team.class), mock(Team.class), new Stadium("A"), now, MatchType.SEMI_FINAL);

    List<Match> matches = new ArrayList<Match>();
    matches.add(match1);
    matches.add(match2);
    matches.add(match3);

    WorldCup worldCup = new WorldCup(matches);

    List<Match> actualMatches = worldCup.getAllMatchesByStadium(new Stadium("A"));

    assertThat(actualMatches.size(), is(2));
    assertThat(actualMatches.get(0), is(match1));
    assertThat(actualMatches.get(1), is(match3));
  }

  @Test
  public void shouldReturnAllMatchesByMatchType()
  {
    Match match1 = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), now, MatchType.SEMI_FINAL);
    Match match2 = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), now, MatchType.FINAL);
    Match match3 = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), now, MatchType.SEMI_FINAL);

    List<Match> matches = new ArrayList<Match>();
    matches.add(match1);
    matches.add(match2);
    matches.add(match3);

    WorldCup worldCup = new WorldCup(matches);

    List<Match> actualMatches = worldCup.getAllMatchesByMatchType(MatchType.SEMI_FINAL);

    assertThat(actualMatches.size(), is(2));
    assertThat(actualMatches.get(0), is(match1));
    assertThat(actualMatches.get(1), is(match3));
  }


  @Test
  public void shouldReturnAllMatchesBySameDate()
  {
    Match match1 = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), DateUtil.convertToDate("12-01-2015"), MatchType.SEMI_FINAL);
    Match match2 = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), DateUtil.convertToDate("08-01-2015"), MatchType.SEMI_FINAL);
    Match match3 = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), DateUtil.convertToDate("12-01-2015"), MatchType.SEMI_FINAL);

    List<Match> matches = new ArrayList<Match>();
    matches.add(match1);
    matches.add(match2);
    matches.add(match3);

    WorldCup worldCup = new WorldCup(matches);

    List<Match> actualMatches = worldCup.getAllMatchesByDate(DateUtil.convertToDate("12-01-2015"));

    assertThat(actualMatches.size(), is(2));
    assertThat(actualMatches.get(0), is(match1));
    assertThat(actualMatches.get(1), is(match3));
  }

  private Match stubMatch(String date){
    Match match = new Match(mock(Team.class), mock(Team.class), mock(Stadium.class), DateUtil.convertToDate(date), MatchType.FINAL);
    return match;
  }
}