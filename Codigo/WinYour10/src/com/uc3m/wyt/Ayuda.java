package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ayuda extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.ayuda);
	
	
	} 
	
	public void nota_actual(View v) {
    	startActivity(new Intent(Ayuda.this, NotaActual.class ));
    }
    	

}