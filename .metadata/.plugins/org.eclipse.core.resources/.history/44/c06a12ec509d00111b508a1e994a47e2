package com.uc3m.wyt;

import java.io.UnsupportedEncodingException;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.openfeint.api.OpenFeint;
import com.openfeint.api.OpenFeintDelegate;
import com.openfeint.api.OpenFeintSettings;
import com.openfeint.api.resource.Score;
import com.openfeint.api.ui.Dashboard;
import com.openfeint.internal.OpenFeintInternal;

@SuppressWarnings("unused")
public class WinYour10Activity extends ListActivity {
	
	static final String gameName = "Win Your 10!";
	static final String gameID = "494443";
	static final String gameKey = "SbAlSEB8pUnzMuZgst5TTA";
	static final String gameSecret = "9Q3ICWKhLnARkAGnyF7lVJ8BFB0JfkzTSgmitjXQVE";

	protected interface Entry {
		public String toString();
		public void run(); 
	}

	protected Entry[] getEntries() {
		return new Entry[] {/*
				new Entry() {
					@Override public String toString() { return "Abrir Dashboard"; }
					@Override public void run()        { Dashboard.open(); }
				},
				new Entry() {
					@Override public String toString() { return "Abrir Leaderboards"; }
					@Override public void run()        { Dashboard.openLeaderboards(); }
				},
				new Entry() {
					@Override public String toString() { return "Probando"; }
					@Override public void run()        { startActivity(new Intent(WinYour10Activity.this, Loading.class)); }
				},*/
				new Entry() {
					@Override public String toString() { return "Datos usuario"; }
					@Override public void run()        { startActivity(new Intent(WinYour10Activity.this, AboutUs.class)); }
				},/*
				new Entry() {
					@Override public String toString() { return "Salir de Feint"; }
					@Override public void run()        { OpenFeintInternal.getInstance().logoutUser(null);
														 Toast.makeText(WinYour10Activity.this, String.format("Desconectado"), Toast.LENGTH_SHORT).show(); }
				},
				new Entry() {
                    @Override public String toString() { return "Opciones Gamefeed"; }
                    @Override public void run() 	   { startActivity(new Intent(WinYour10Activity.this, GameFeedSettings.class));}
                }*/
				
		};
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		OpenFeintSettings settings = new OpenFeintSettings(gameName, gameKey, gameSecret, gameID);
        OpenFeint.initialize(this, settings, new OpenFeintDelegate() { });
        
		

		Score.setBlobDownloadedDelegate(new Score.BlobDownloadedDelegate() {
			@Override public void blobDownloadedForScore(Score score) {
				Dashboard.close();
				String str = "decode error";
				try {
					str = new String(score.blob, "UTF-8");
				} catch (UnsupportedEncodingException e) {
				}
				Toast.makeText(WinYour10Activity.this, str, Toast.LENGTH_SHORT).show();
			}
		});

		final Entry[] entries = getEntries();
		setListAdapter(new ArrayAdapter<Entry>(this, R.layout.main, entries));
		
		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				entries[position].run();
			}
		});
	}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        OpenFeint.onExit();
    };

    @Override
    protected void onResume() {
        super.onResume();
        OpenFeint.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        OpenFeint.onPause();
    }
}
