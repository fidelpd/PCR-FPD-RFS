package com.uc3m.wyt;
 
import com.openfeint.internal.OpenFeintInternal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;

import com.openfeint.api.OpenFeint;
import com.openfeint.api.OpenFeintDelegate;
import com.openfeint.api.OpenFeintSettings;
import com.openfeint.api.resource.Score;
import com.openfeint.api.ui.Dashboard;

public class Ajustes extends Activity {
	/** Called when the activity is first created. */
	
	static final String gameName = "Win Your 10!";
	static final String gameID = "494443";
	static final String gameKey = "SbAlSEB8pUnzMuZgst5TTA";
	static final String gameSecret = "9Q3ICWKhLnARkAGnyF7lVJ8BFB0JfkzTSgmitjXQVE";
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.ajustes);
	
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
				Toast.makeText(Ajustes.this, str, Toast.LENGTH_SHORT).show();
			}
		});
	
	
	
	}

	public void ClickConectar(View v) {
		startActivity(new Intent(this, Conectar.class ));
	}

	public void ClickDesconectar(View v) { 
		OpenFeintInternal.getInstance().logoutUser(null);
		Toast.makeText(Ajustes.this, String.format("Desconectado"), Toast.LENGTH_SHORT).show(); 
	}

	public void ClickOpciones(View v) {
		startActivity(new Intent(this, UserExplorer.class ));
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