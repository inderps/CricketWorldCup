package com.singhinther.cricketworldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.singhinther.Match;

import java.util.List;

public class MatchesListAdapter  extends BaseAdapter {

  private final Context context;
  private final List<Match> matches;
  private LayoutInflater inflater;

  public MatchesListAdapter(Context context, List<Match> matches) {
    this.context = context;
    this.matches = matches;
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
    return convertView;
  }
}
