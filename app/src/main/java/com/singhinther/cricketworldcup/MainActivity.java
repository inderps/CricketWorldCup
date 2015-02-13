package com.singhinther.cricketworldcup;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.singhinther.Match;
import com.singhinther.WorldCup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {
  private WorldCup worldCup;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    worldCup = new WorldCup();
    createListOfMatches(worldCup.getAllMatches());
  }

  private void createListOfMatches(List<Match> matches) {
    ListView listView = (ListView) findViewById(R.id.list);
    MatchesListAdapter adapter = new MatchesListAdapter(this, matches);
    listView.setAdapter(adapter);
  }
}
