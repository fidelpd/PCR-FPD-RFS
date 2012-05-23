package com.uc3m.wyt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;

import com.openfeint.api.OpenFeint;
import com.openfeint.api.OpenFeintDelegate;
import com.openfeint.api.OpenFeintSettings;
import com.openfeint.api.resource.Score;
import com.openfeint.api.ui.Dashboard;



public class WinYour10Activity extends Activity {

	
	/** Called when the activity is first created. */
	
	static final String gameName = "Win Your 10!";
	static final String gameID = "494443";
	static final String gameKey = "SbAlSEB8pUnzMuZgst5TTA";
	static final String gameSecret = "9Q3ICWKhLnARkAGnyF7lVJ8BFB0JfkzTSgmitjXQVE";
	
	
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    	this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
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
    		
    	       
    }
    
    public void ClickAcceso(View v) {
    	startActivity(new Intent(WinYour10Activity.this, AccesoCurso.class ));
    }
    public void ClickEstado(View v) {
    	startActivity(new Intent(WinYour10Activity.this, Estado.class ));
    }
    public void ClickAjustes(View v) {
    	startActivity(new Intent(this, Ajustes.class ));
    }
    public void ClickAyuda(View v) {

    	
        AlertDialog.Builder alertbox = new AlertDialog.Builder(this);

        // Set the message to display
        alertbox.setMessage("Bienvenido al curso de estad�stica."+"\n"
        		+"\n"
        		+"Este curso est� en fase beta y son los alumnos los que deberan mejorarlo."+"\n"
        		+"\n"
        		+"La novededad de este curso es que s�lo por matricularte tienes un 10."+"\n" 
        		+"\n"
        		+"Para mantener ese 10 hasta final del curso deberas superar los retos que se ir�n desbloqueando seg�n avance el curso.");

        // Add a neutral button to the alert box and assign a click listener
        alertbox.setNeutralButton("Volver", new DialogInterface.OnClickListener() {

            // Click listener on the neutral button of alert box
            public void onClick(DialogInterface arg0, int arg1) {

                // The neutral button was clicked
                Toast.makeText(getApplicationContext(), "Reta a tus compa�eros y GANA TU 10!!!", Toast.LENGTH_LONG).show();
            }
        });

         // show the alert box
        alertbox.show();
    }
    
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == 0) {
            finish();
        }
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
    
    
    	


