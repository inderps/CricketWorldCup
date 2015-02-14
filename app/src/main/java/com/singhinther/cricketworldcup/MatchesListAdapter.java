package com.singhinther.cricketworldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.singhinther.DateUtil;
import com.singhinther.Match;
import com.singhinther.MatchType;
import com.singhinther.WorldCup;

import java.util.List;

public class MatchesListAdapter  extends BaseAdapter {

  private final Context context;
  private WorldCup worldCup;
  private List<Match> matches;
  private LayoutInflater inflater;

  public MatchesListAdapter(Context context, WorldCup worldCup) {
    this.context = context;
    this.worldCup = worldCup;
    this.matches = worldCup.getAllMatches();
  }

  @Override
  public int getCount() {
    return matches.size();
  }

  @Override
  public Object getItem(int position) {
    return matches.get(position);
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    if (inflater == null)
      inflater = (LayoutInflater) context
          .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    if (convertView == null)
      convertView = inflater.inflate(R.layout.match_row, null);

    final Match match = matches.get(position);

    renderTeam1(convertView, match);
    renderTeam2(convertView, match);
    renderDate(convertView, match);
    renderMatchType(convertView, match);
    renderStadium(convertView, match);

    return convertView;
  }

  private void renderTeam1(View convertView, final Match match) {
    final TextView team1 = (TextView)convertView.findViewById(R.id.team1);
    team1.setText(match.getTeam1().getName());
    team1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        matches = worldCup.getAllMatchesByTeam(match.getTeam1());
        notifyDataSetChanged();
        setTitle(match.getTeam1().getName());
      }
    });
  }

  private void renderTeam2(View convertView, final Match match) {
    final TextView team2 = (TextView)convertView.findViewById(R.id.team2);
    team2.setText(match.getTeam2().getName());
    team2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        matches = worldCup.getAllMatchesByTeam(match.getTeam2());
        notifyDataSetChanged();
        setTitle(match.getTeam2().getName());
      }
    });
  }

  private void renderDate(View convertView, final Match match) {
    final TextView date = (TextView)convertView.findViewById(R.id.date);
    date.setText(DateUtil.formattedDate(match.getDate()));
    date.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        matches = worldCup.getAllMatchesByDate(match.getDate());
        notifyDataSetChanged();
        setTitle(DateUtil.formattedDate(match.getDate()));
      }
    });
  }

  private void renderStadium(View convertView, final Match match) {
    final TextView stadium = (TextView)convertView.findViewById(R.id.stadium);
    stadium.setText(match.getStadium().getName());
    stadium.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        matches = worldCup.getAllMatchesByStadium(match.getStadium());
        notifyDataSetChanged();
        setTitle(match.getStadium().getName().substring(0, 8) + "...");
      }
    });
  }

  private void renderMatchType(View convertView, final Match match) {
    final TextView matchType = (TextView)convertView.findViewById(R.id.match_type);
    String typeName = null;
    MatchType type = match.getType();

    if(type.equals(MatchType.POOL_A))
      typeName = "Pool A";
    else if(type.equals(MatchType.POOL_B))
      typeName = "Pool B";
    else if(type.equals(MatchType.POOL_B))
      typeName = "Quarter Final";
    else if(type.equals(MatchType.SEMI_FINAL))
      typeName = "Semi Final";
    else if(type.equals(MatchType.FINAL))
      typeName = "Final";

    matchType.setText(typeName);
    final String finalTypeName = typeName;
    matchType.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        matches = worldCup.getAllMatchesByMatchType(match.getType());
        notifyDataSetChanged();
        setTitle(finalTypeName);
      }
    });
  }

  private void setTitle(String title){
    ((MainActivity)context).setTitle(title);
  }
}
