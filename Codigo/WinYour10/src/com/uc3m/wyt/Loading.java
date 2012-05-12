package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;


public class Loading extends Activity {

	private Handler mHandler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loadold);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //Bloquear orientacion layout

		//Añadir aqui la llamada al WinYour10Activity despues de 5 segundos
		//Thread pause 5 segundos
		//Activar WinYour10
		mHandler.postDelayed(new Runnable() {
            public void run() {
                doMainActivity();
            }
        }, 3000);
    }

    private void doMainActivity() {
    	startActivity(new Intent(this, WinYour10Activity.class ));
    }

}