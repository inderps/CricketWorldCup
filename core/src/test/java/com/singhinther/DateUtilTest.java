package com.singhinther;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DateUtilTest {

  @Test
  public void shouldConvertToDate(){

    Date date = DateUtil.convertToDate("01-01-2005");

    assertTrue(date.toString().contains("Sat Jan 01"));
  }

  @Test
  public void shouldConvertToFormattedDate(){
    Date date = DateUtil.convertToDate("01-01-2005");

    assertThat(DateUtil.formattedDate(date), is("January 1, 2005"));
  }
}