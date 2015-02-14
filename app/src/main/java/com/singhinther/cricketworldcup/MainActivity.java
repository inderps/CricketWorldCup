package com.singhinther.cricketworldcup;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.singhinther.Match;
import com.singhinther.Team;
import com.singhinther.WorldCup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {
  private WorldCup worldCup;
  private ListView listView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    worldCup = WorldCupData.setup();
    listView = (ListView) findViewById(R.id.list);
    MatchesListAdapter adapter = new MatchesListAdapter(this, worldCup);
    listView.setAdapter(adapter);
    final Activity activity = this;

    findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        MatchesListAdapter adapter = new MatchesListAdapter(activity, worldCup);
        listView.setAdapter(adapter);
        setTitle(activity.getString(R.string.all));
      }
    });
  }

  public void setTitle(String title){
    TextView titleTextView = (TextView)findViewById(R.id.title);
    titleTextView.setText(title);
  }
}
