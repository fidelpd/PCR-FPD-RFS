package com.uc3m.wyt;

import java.util.List;

import com.openfeint.api.resource.Leaderboard;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Estado extends Activity {
	
	public static List<Leaderboard> leaderboards = null;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.estado);
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
    
    public void nota_actual(View v) {
    	startActivity(new Intent(Estado.this, NotaActual.class ));
    }
    
    public void clasificacion(View v) {
    	startActivity(new Intent(Estado.this, Clasificacion.class ));
    }
    
    public void logros(View v) {
    	startActivity(new Intent(Estado.this, Logros.class ));
    }
    
    public void actualizar_nota(View v) {
    	startActivity(new Intent(Estado.this, ActualizarNota.class ));
    }
    
    @Override
	public boolean onKeyDown(int keycode, KeyEvent event ) {
	 if(keycode == KeyEvent.KEYCODE_MENU){
		 String cadena = null;
		 cadena = ("El profesor pondr� en un tabl�n la"+"\n"
					+"puntuaci�n de cada alumno"+"\n"
					+"correspondiente a cada badget"+"\n"
					+"del curso"+"\n"
					+"\n"
					+"El alumno a trav�s del bot�n"+"\n"
					+"subir nota deber� actualizar "+"\n"
					+"su puntuaci�n."+"\n"
					+"\n"
					+"El profesor revisar� semanalmente"+"\n"
					+"el ledearboard para verificar"+"\n"
					+"que los puntos se subieron seg�n"+"\n"
					+"el tabl�n. Si el profesor detecta"+"\n"
					+"alguna trampa por parte del alumno"+"\n"
					+"se le descontaran 100 puntos de su"+"\n"
					+"cuenta");
		new AlertDialog.Builder(this).setTitle("Informaci�n acerca de los logros").setMessage(cadena).setNeutralButton("Cerrar", null).show();
	 }
	 return super.onKeyDown(keycode,event);  
	}
}
