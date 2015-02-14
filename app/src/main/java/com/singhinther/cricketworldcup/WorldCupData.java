package com.singhinther.cricketworldcup;

import com.singhinther.DateUtil;
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
    List<Match> matches = new ArrayList<Match>();

    Stadium hagley = new Stadium("Hagley Oval, Christchurch");
    Stadium mcg = new Stadium("Melbourne Cricket Ground, Melbourne");
    Stadium seddon = new Stadium("Seddon Park, Hamilton");
    Stadium adelaide = new Stadium("Adeliade Oval, Adeliade");
    Stadium saxton = new Stadium("Saxton Oval, Nelson");
    Stadium dunedin = new Stadium("University Oval, Dunedin");
    Stadium manuka = new Stadium("Manuka Oval, Canberra");
    Stadium westpac = new Stadium("Westpac Stadium, Wellington");
    Stadium brisbane = new Stadium("Brisbane Cricket Ground, Brisbane");
    Stadium scg = new Stadium("Sydney Cricket Ground");
    Stadium eden = new Stadium("Eden Park, Auckland");
    Stadium perth = new Stadium("WACA Ground, Perth");
    Stadium mclean = new Stadium("McLean Park, Napier");
    Stadium hobart = new Stadium("Bellerive Oval, Hobart");

    Team australia = new Team("Australia");
    Team india = new Team("India");
    Team england = new Team("England");
    Team new_zealand = new Team("New Zealand");
    Team sri_lanka = new Team("Sri Lanka");
    Team south_africa = new Team("South Africa");
    Team zimbabwe = new Team("Zimbabwe");
    Team pakistan = new Team("Pakistan");
    Team ireland = new Team("Ireland");
    Team west_indies = new Team("West Indies");
    Team scotland = new Team("Scotland");
    Team afghanistan = new Team("Afghanistan");
    Team bangladesh = new Team("Bangladesh");
    Team uae = new Team("United Arab Emirates");
    Team tbc = new Team("TBC");

    matches.add(new Match(new_zealand, sri_lanka, hagley, DateUtil.convertToDate("14-02-2015"), MatchType.POOL_A));
    matches.add(new Match(australia, england, mcg, DateUtil.convertToDate("14-02-2015"), MatchType.POOL_A));
    matches.add(new Match(south_africa, zimbabwe, seddon, DateUtil.convertToDate("15-02-2015"), MatchType.POOL_B));
    matches.add(new Match(india, pakistan, adelaide, DateUtil.convertToDate("15-02-2015"), MatchType.POOL_B));
    matches.add(new Match(ireland, west_indies, saxton, DateUtil.convertToDate("16-02-2015"), MatchType.POOL_B));
    matches.add(new Match(new_zealand, scotland, dunedin, DateUtil.convertToDate("17-02-2015"), MatchType.POOL_A));
    matches.add(new Match(afghanistan, bangladesh, manuka, DateUtil.convertToDate("18-02-2015"), MatchType.POOL_A));
    matches.add(new Match(uae, zimbabwe, saxton, DateUtil.convertToDate("19-02-2015"), MatchType.POOL_B));
    matches.add(new Match(new_zealand, england, westpac, DateUtil.convertToDate("20-02-2015"), MatchType.POOL_A));
    matches.add(new Match(pakistan, west_indies, hagley, DateUtil.convertToDate("21-02-2015"), MatchType.POOL_B));
    matches.add(new Match(australia, bangladesh, brisbane, DateUtil.convertToDate("21-02-2015"), MatchType.POOL_A));
    matches.add(new Match(afghanistan, sri_lanka, dunedin, DateUtil.convertToDate("22-02-2015"), MatchType.POOL_A));
    matches.add(new Match(india, south_africa, mcg, DateUtil.convertToDate("22-02-2015"), MatchType.POOL_B));
    matches.add(new Match(england, scotland, hagley, DateUtil.convertToDate("23-02-2015"), MatchType.POOL_A));
    matches.add(new Match(west_indies, zimbabwe, manuka, DateUtil.convertToDate("24-02-2015"), MatchType.POOL_B));
    matches.add(new Match(ireland, uae, brisbane, DateUtil.convertToDate("25-02-2015"), MatchType.POOL_B));
    matches.add(new Match(afghanistan, scotland, dunedin, DateUtil.convertToDate("26-02-2015"), MatchType.POOL_A));
    matches.add(new Match(bangladesh, sri_lanka, mcg, DateUtil.convertToDate("26-02-2015"), MatchType.POOL_A));
    matches.add(new Match(south_africa, west_indies, scg, DateUtil.convertToDate("27-02-2015"), MatchType.POOL_B));
    matches.add(new Match(new_zealand, australia, eden, DateUtil.convertToDate("28-02-2015"), MatchType.POOL_A));
    matches.add(new Match(india, uae, perth, DateUtil.convertToDate("28-02-2015"), MatchType.POOL_B));
    matches.add(new Match(england, sri_lanka, westpac, DateUtil.convertToDate("01-03-2015"), MatchType.POOL_A));
    matches.add(new Match(pakistan, zimbabwe, brisbane, DateUtil.convertToDate("01-03-2015"), MatchType.POOL_B));
    matches.add(new Match(ireland, south_africa, manuka, DateUtil.convertToDate("03-03-2015"), MatchType.POOL_B));
    matches.add(new Match(pakistan, uae, mclean, DateUtil.convertToDate("04-03-2015"), MatchType.POOL_B));
    matches.add(new Match(australia, afghanistan, perth, DateUtil.convertToDate("04-03-2015"), MatchType.POOL_A));
    matches.add(new Match(bangladesh, scotland, saxton, DateUtil.convertToDate("05-03-2015"), MatchType.POOL_A));
    matches.add(new Match(india, west_indies, perth, DateUtil.convertToDate("06-03-2015"), MatchType.POOL_B));
    matches.add(new Match(pakistan, south_africa, eden, DateUtil.convertToDate("07-03-2015"), MatchType.POOL_B));
    matches.add(new Match(ireland, zimbabwe, hobart, DateUtil.convertToDate("07-03-2015"), MatchType.POOL_B));
    matches.add(new Match(new_zealand, afghanistan, mclean, DateUtil.convertToDate("08-03-2015"), MatchType.POOL_A));
    matches.add(new Match(australia, sri_lanka, scg, DateUtil.convertToDate("08-03-2015"), MatchType.POOL_A));
    matches.add(new Match(england, bangladesh, adelaide, DateUtil.convertToDate("09-03-2015"), MatchType.POOL_A));
    matches.add(new Match(india, ireland, seddon, DateUtil.convertToDate("10-03-2015"), MatchType.POOL_B));
    matches.add(new Match(scotland, sri_lanka, hobart, DateUtil.convertToDate("11-03-2015"), MatchType.POOL_A));
    matches.add(new Match(south_africa, uae, westpac, DateUtil.convertToDate("12-03-2015"), MatchType.POOL_B));
    matches.add(new Match(new_zealand, bangladesh, seddon, DateUtil.convertToDate("13-03-2015"), MatchType.POOL_A));
    matches.add(new Match(afghanistan, england, scg, DateUtil.convertToDate("13-03-2015"), MatchType.POOL_A));
    matches.add(new Match(india, zimbabwe, eden, DateUtil.convertToDate("14-03-2015"), MatchType.POOL_B));
    matches.add(new Match(australia, scotland, hobart, DateUtil.convertToDate("14-03-2015"), MatchType.POOL_A));
    matches.add(new Match(uae, west_indies, mclean, DateUtil.convertToDate("15-03-2015"), MatchType.POOL_B));
    matches.add(new Match(ireland, pakistan, adelaide, DateUtil.convertToDate("15-03-2015"), MatchType.POOL_B));
    matches.add(new Match(tbc, tbc, scg, DateUtil.convertToDate("18-03-2015"), MatchType.QUARTER_FINAL));
    matches.add(new Match(tbc, tbc, mcg, DateUtil.convertToDate("19-03-2015"), MatchType.QUARTER_FINAL));
    matches.add(new Match(tbc, tbc, adelaide, DateUtil.convertToDate("20-03-2015"), MatchType.QUARTER_FINAL));
    matches.add(new Match(tbc, tbc, westpac, DateUtil.convertToDate("21-03-2015"), MatchType.QUARTER_FINAL));
    matches.add(new Match(tbc, tbc, eden, DateUtil.convertToDate("24-03-2015"), MatchType.SEMI_FINAL));
    matches.add(new Match(tbc, tbc, scg, DateUtil.convertToDate("26-03-2015"), MatchType.SEMI_FINAL));
    matches.add(new Match(tbc, tbc, mcg, DateUtil.convertToDate("29-03-2015"), MatchType.FINAL));

    return new WorldCup(matches);
  }
}
