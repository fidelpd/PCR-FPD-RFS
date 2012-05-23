package com.uc3m.wyt;

import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.openfeint.api.resource.Leaderboard;
import com.openfeint.api.resource.Score;

public class Clasificacion extends ListActivity {
	
	private abstract class Adapter {
		abstract public String toString();
	};
	
	private class ScoreAdapter extends Adapter {
		public Score mScore;
		public ScoreAdapter(Score score) {
			mScore = score;
		}
		public String toString() {
			String scoreText;
			if (mScore.displayText != null && mScore.displayText.length() > 0) {
				scoreText = mScore.displayText;
			} else {
				scoreText = new Long(mScore.score).toString();
			}
			if (mScore.hasBlob()) scoreText += " *";
			String userText = "unknown";
			if (mScore.user != null && mScore.user.name != null) userText = mScore.user.name;
			return userText + " - " + scoreText;
		}
	}
	    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        downloadScores();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
    };

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    
    @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    	super.onActivityResult(requestCode, resultCode, data);
    	if (resultCode != Activity.RESULT_CANCELED) {
    		downloadScores();
    	}
    }
    
    public void downloadScores()
    {
        setListAdapter(new ArrayAdapter<String>(this, R.layout.simple_list, R.id.text1, new String[] { "Loading..." }));

        final Leaderboard.GetScoresCB cb = new Leaderboard.GetScoresCB() {
			@Override
			public void onSuccess(final List<Score> scores) {
				scoresDownloaded(scores);
			}
			
			private void scoresDownloaded(final List<Score> scores) {

				final Adapter adapted[] = new Adapter[(scores != null ? scores.size() : 0)];
				int idx = 0;
				
				if (scores != null) {
					for (Score s : scores) {
						adapted[idx++] = new ScoreAdapter(s);
					}
				}
				
		        if(scores.size()>0)
		        	setListAdapter(new ArrayAdapter<Adapter>(Clasificacion.this, R.layout.clasificacion, R.id.text1, adapted));
		        else
		        	setListAdapter(new ArrayAdapter<String>(Clasificacion.this, R.layout.simple_list, R.id.text1, new String[] { "No hay ningœn usuario en esta lista."}));

			}
			
			@Override public void onFailure(String exceptionMessage) {
				Toast.makeText(Clasificacion.this, "Error (" + exceptionMessage + ").", Toast.LENGTH_SHORT).show();
				setListAdapter(new ArrayAdapter<String>(Clasificacion.this, R.layout.simple_list, R.id.text1, new String[] { ""}));
			}
        };
        
		final Leaderboard lb = new Leaderboard("1175527");
		lb.getScores(cb);
    }
}
