package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class WinYour10Activity extends Activity {

	
	/** Called when the activity is first created. */
    @Override
	public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    		
    	       
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
    	startActivity(new Intent(this, Ayuda.class ));
    }
    
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == 0) {
            finish();
        }
    }
    
}
    
    
    	


