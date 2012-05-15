package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Estado extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.estado);
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
    
    public void nota_actual(View v) {
    	startActivity(new Intent(Estado.this, NotaActual.class ));
    }
    
    public void clasificacion(View v) {
    	startActivity(new Intent(Estado.this, Clasificacion.class ));
    }
    
    public void logros(View v) {
    	startActivity(new Intent(Estado.this, Logros.class ));
    }
}
