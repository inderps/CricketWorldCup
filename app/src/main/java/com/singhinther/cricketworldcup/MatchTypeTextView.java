package com.singhinther.cricketworldcup;

import android.content.Context;
import android.widget.TextView;

import com.singhinther.MatchType;
import com.singhinther.Stadium;

public class MatchTypeTextView extends TextView {
  private MatchType type;

  public MatchTypeTextView(Context context) {
    super(context);
  }

  public void setText(MatchType type){
    this.type = type;

    String typeName = null;

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

    setText(typeName);
  }

  public MatchType getType() {
    return type;
  }
}
