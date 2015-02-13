package com.singhinther.cricketworldcup;

import com.singhinther.Match;
import com.singhinther.MatchType;
import com.singhinther.Stadium;
import com.singhinther.Team;
import com.singhinther.WorldCup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorldCupData {

  public static WorldCup setup(){
    List<Match> matches = new ArrayList<>();

    Stadium hagley_oval = new Stadium("Hagley Oval, Christchurch");
    Stadium mcg_melbourne = new Stadium("Melbourne Cricket Ground, Melbourne");
    Stadium seddon_park = new Stadium("Seddon Park, Hamilton");

    Team australia = new Team("Australia");
    Team india = new Team("India");
    Team england = new Team("England");
    Team new_zealand = new Team("New Zealand");

    matches.add(new Match(australia, india, hagley_oval, new Date(), MatchType.POOL_A));
    matches.add(new Match(australia, england, hagley_oval, new Date(), MatchType.POOL_A));
    matches.add(new Match(australia, new_zealand, mcg_melbourne, new Date(), MatchType.POOL_B));
    matches.add(new Match(india, england, mcg_melbourne, new Date(), MatchType.POOL_B));
    matches.add(new Match(india, new_zealand, seddon_park, new Date(), MatchType.SEMI_FINAL));
    matches.add(new Match(england, new_zealand, seddon_park, new Date(), MatchType.FINAL));

    return new WorldCup(matches);
  }
}
