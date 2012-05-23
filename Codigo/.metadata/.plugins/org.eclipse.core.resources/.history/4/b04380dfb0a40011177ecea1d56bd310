package com.uc3m.wyt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Probabilidad extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.probabilidad);
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
    
    public void material(View v) {
    	startActivity(new Intent(Probabilidad.this, ProbabilidadMaterial.class ));
    }
    
    public void foro(View v) {
    	//Sumar un punto
    	//Accede directamente al foro
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hostedredmine.com/projects/pcr-fpd-rfs/boards")));
    }
    
    public void multimedia(View v) {
    	startActivity(new Intent(Probabilidad.this, ProbabilidadMultimedia.class ));
    }
    
    public void test(View v) {
    	startActivity(new Intent(Probabilidad.this, ProbabilidadTest.class ));
    }
    
    @Override
	public boolean onKeyDown(int keycode, KeyEvent event ) {
	 if(keycode == KeyEvent.KEYCODE_MENU){
		 String cadena = null;
		 cadena = ("- Material (30 puntos):"+"\n"
				  +"Por pulsar el link +2 puntos (total de 6). Puntos generados automaticamente."+"\n"
				  +"Por enviar un feedback de cada link +8 puntos (total de 24 puntos). Puntos creados por el profesor."+"\n"
				  +"\n"
				  +"- Foro (30 puntos):"+"\n"
				  +"Por poner una pregunta en el foro +2 ptos hasta un máximo de 5 preguntas"+"\n"
				  +"Por responder, hasta +5 por pregunta hasta un máximo de 4 respuestas"+"\n"
				  +"\n"
				  +"- Multimedia (40 puntos):"+"\n"
				  +"Por poner una foto +1 pto hasta un máximo de 10 fotos ( 10 puntos)"+"\n"
				  +"Por poner un vídeo +3 ptos, hasta un máximo de 5 videos (15 puntos)"+"\n"
				  +"Por subir material +1 pto, hasta un máximo de 15 (15 puntos)"+"\n"
				  +"\n"
				  +"- Test (100 puntos):"+"\n"
				  +"Test final perfecto 50 puntos. Tendrá 10 preguntas, y cada pregunta correcta 5 puntos, incorrecta -2 puntos"+"\n"
				  +"Test opcionales: Podrá haber hasta 5 test, cada uno valorado con 10 puntos y cada pregunta correcta con 1 punto, 1 incorrecta -0,03 ptos");
		 new AlertDialog.Builder(this).setTitle("Información acerca de la puntuación").setMessage(cadena).setNeutralButton("Cerrar", null).show();
	 }
	 return super.onKeyDown(keycode,event);  
	}
    
    
    
}
