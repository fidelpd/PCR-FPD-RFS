package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ProbabilidadMaterial extends Activity {
	protected static long result = 0;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.probabilidad_material); 
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
    
    public void acceder_apuntes(View v){
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.est.uc3m.es/esp/nueva_docencia/leganes/ing_telecomunicacion/estadistica/doc_grupo1/archivosnew/Probabilidad.pdf")));
        OperarOpenFeint.anyadir_puntuacion_clasificacion_general(2);
    	OperarOpenFeint.anyadir_puntuacion_mas_trabajador(2);
        OperarOpenFeint.anyadir_puntuacion_mas_sabio(2);
    }
    
    public void acceder_ejercicios_leton(View v){
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.est.uc3m.es/esp/nueva_docencia/leganes/ing_telecomunicacion/estadistica/doc_grupo1/archivosnew/Ej_Probabilidad_ELv8.pdf")));
        OperarOpenFeint.anyadir_puntuacion_clasificacion_general(2);
        OperarOpenFeint.anyadir_puntuacion_mas_trabajador(2);
        OperarOpenFeint.anyadir_puntuacion_mas_sabio(2);
    }
    
    public void acceder_ejercicios_durban(View v){
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.est.uc3m.es/esp/nueva_docencia/comp_col_leg/ing_info/estadistica/Documentacion/Temario/Probabilidad/Prob_probabilidad.pdf")));
        OperarOpenFeint.anyadir_puntuacion_clasificacion_general(2);
        OperarOpenFeint.anyadir_puntuacion_mas_trabajador(2);
        OperarOpenFeint.anyadir_puntuacion_mas_sabio(2);
    }
}
