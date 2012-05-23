package com.uc3m.wyt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProbabilidadTest extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.probabilidad_test);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
    
    public void testfinal(View v){
    	//sumar 5 puntos
    	
    }
    
    public void testopcional(View v){
    	//Popup Material no disponible
    	
        AlertDialog.Builder alertbox = new AlertDialog.Builder(this);

        // Set the message to display
        alertbox.setMessage("Material no disponible");

        // Add a neutral button to the alert box and assign a click listener
        alertbox.setNeutralButton("Volver", new DialogInterface.OnClickListener() {

            // Click listener on the neutral button of alert box
            public void onClick(DialogInterface arg0, int arg1) {

                // The neutral button was clicked
                Toast.makeText(getApplicationContext(), "Elija otra opción", Toast.LENGTH_LONG).show();
            }
        });

         // show the alert box
        alertbox.show();
    	
    }
    
    
}
