package com.uc3m.wyt;

import com.openfeint.api.resource.Achievement;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;

public class Logros extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logros);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		//Mejor compa–ero
		Achievement a_com = new Achievement("1678262");
		if (a_com.isUnlocked)
			findViewById(R.id.logroazul).setBackgroundDrawable(getResources().getDrawable(R.drawable.logroazul));
		else
			findViewById(R.id.logroazul).setBackgroundDrawable(getResources().getDrawable(R.drawable.logroazuloff));
		
		//M‡s creativo
		Achievement a_cre = new Achievement("1678252");
		if (a_cre.isUnlocked)
			findViewById(R.id.logroverde).setBackgroundDrawable(getResources().getDrawable(R.drawable.logroverde));
		else
			findViewById(R.id.logroverde).setBackgroundDrawable(getResources().getDrawable(R.drawable.logroverdeoff));
		
		//M‡s sabio
		Achievement a_sabio = new Achievement("1678242");
		if (a_sabio.isUnlocked)
			findViewById(R.id.logrogris).setBackgroundDrawable(getResources().getDrawable(R.drawable.logrogris));
		else
			findViewById(R.id.logrogris).setBackgroundDrawable(getResources().getDrawable(R.drawable.logrogrisoff));
		
		//M‡s constante
		Achievement a_cons = new Achievement("1678232");
		if (a_cons.isUnlocked)
			findViewById(R.id.logroama).setBackgroundDrawable(getResources().getDrawable(R.drawable.logroama));
		else
			findViewById(R.id.logroama).setBackgroundDrawable(getResources().getDrawable(R.drawable.logroamaoff));
		
		//M‡s trabajador
		Achievement a_tra = new Achievement("1678222");
		if (a_tra.isUnlocked)
			findViewById(R.id.logrorojo).setBackgroundDrawable(getResources().getDrawable(R.drawable.logrorojo));
		else
			findViewById(R.id.logrorojo).setBackgroundDrawable(getResources().getDrawable(R.drawable.logrorojooff));
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

	@Override
	public boolean onKeyDown(int keycode, KeyEvent event ) {
	 if(keycode == KeyEvent.KEYCODE_MENU){
		 String cadena = null;
		 cadena = ("- Más trabajador: 110 puntos"+"\n"
					+"Los 200 puntos del bloque aplican a este badge."+"\n"
					+"\n"
					+"- Mejor compañero: 50 puntos"+"\n" 
					+"Solamente aplican los elementos foro y multimedia."+"\n"
					+"\n"
					+"- Más sabio: 140 puntos."+"\n" 
					+"Tiene casi todo bien."+"\n"
					+"\n"
					+"- Más creativo. 15 puntos."+"\n" 
					+"Solamente aplican las respuestas del foro."+"\n"
					+"\n"
					+"- Más constante. 125 puntos."+"\n" 
					+"Aplican los todos los puntos."+"\n");
		new AlertDialog.Builder(this).setTitle("Información acerca de los logros").setMessage(cadena).setNeutralButton("Cerrar", null).show();
	 }
	 return super.onKeyDown(keycode,event);  
	}




}
