package com.singhinther;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StadiumTest {

  @Test
  public void shouldInitializeStadium(){
    Stadium stadium = new Stadium("Melbourne Cricket Ground, Melbourne");

    assertThat(stadium.getName(), is("Melbourne Cricket Ground, Melbourne"));
  }

}