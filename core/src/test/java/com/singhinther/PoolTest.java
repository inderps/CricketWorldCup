package com.singhinther;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class PoolTest {

  @Test
  public void shouldInitializePool(){
    List<Match> matches = new ArrayList<>();
    matches.add(mock(Match.class));
    matches.add(mock(Match.class));

    Pool pool = new Pool("Pool A", matches);

    assertThat(pool.getName(), is("Pool A"));
    assertThat(pool.getMatches(), is(matches));
  }
}