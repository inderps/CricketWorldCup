package com.singhinther;

public class Stadium {
  private String name;

  public Stadium(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Stadium stadium = (Stadium) o;

    if (!name.equals(stadium.name)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }
}
