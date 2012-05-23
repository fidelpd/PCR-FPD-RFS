package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;


public class AccesoCurso extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acceso_curso);
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
    
    public void procesos_estocasticos(View v) {
    	startActivity(new Intent(AccesoCurso.this, ProcesosEstocasticos.class ));
    }
    
    public void variables_aleatorias(View v) {
    	startActivity(new Intent(AccesoCurso.this, VariablesAleatorias.class ));
    }
    
    public void vectores_aleatorios(View v) {
    	startActivity(new Intent(AccesoCurso.this, VectoresAleatorios.class ));
    }
    
    public void probabilidad(View v) {
    	startActivity(new Intent(AccesoCurso.this, Probabilidad.class ));
    }
    
    public void modelos(View v) {
    	startActivity(new Intent(AccesoCurso.this, Modelos.class ));
    }
}
