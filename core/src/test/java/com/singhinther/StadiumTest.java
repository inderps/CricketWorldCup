package com.singhinther;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StadiumTest {

  @Test
  public void shouldInitializeStadium(){
    Stadium stadium = new Stadium("Melbourne Cricket Ground, Melbourne");

    assertThat(stadium.getName(), is("Melbourne Cricket Ground, Melbourne"));
  }

  @Test
  public void shouldImplementEquals(){
    Stadium stadium1 = new Stadium("A");
    Stadium stadium2 = new Stadium("A");

    assertTrue(stadium1.equals(stadium2));
  }
}