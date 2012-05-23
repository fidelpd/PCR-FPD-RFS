package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

public class ActualizarNota extends Activity {
	private Handler mHandler = new Handler();
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actualizar_nota);
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
    
    public void enviar(View v) {
    	long total = 0;
    	EditText et = (EditText)findViewById(R.id.mas_trabajador);
    	total += Long.parseLong(et.getText().toString());
    	OperarOpenFeint.anyadir_puntuacion_mas_trabajador(Long.parseLong(et.getText().toString()));
    	EditText et1 = (EditText)findViewById(R.id.mas_sabio);
    	total += Long.parseLong(et1.getText().toString());
    	OperarOpenFeint.anyadir_puntuacion_mas_sabio(Long.parseLong(et1.getText().toString()));
    	EditText et2 = (EditText)findViewById(R.id.mas_constante);
    	total += Long.parseLong(et2.getText().toString());
    	OperarOpenFeint.anyadir_puntuacion_mas_constante(Long.parseLong(et2.getText().toString()));
    	EditText et3 = (EditText)findViewById(R.id.mejor_compa);
    	total += Long.parseLong(et3.getText().toString());
    	OperarOpenFeint.anyadir_puntuacion_mejor_companyero(Long.parseLong(et3.getText().toString()));
    	EditText et4 = (EditText)findViewById(R.id.espiritu_creativo);
    	total += Long.parseLong(et4.getText().toString());
    	OperarOpenFeint.anyadir_puntuacion_mas_creativo(Long.parseLong(et4.getText().toString()));
    	OperarOpenFeint.anyadir_puntuacion_clasificacion_general(total);
    	mHandler.postDelayed(new Runnable() {
            public void run() {
            	startActivity(new Intent(ActualizarNota.this, Clasificacion.class ));
            }
        }, 3000);
    }
}
