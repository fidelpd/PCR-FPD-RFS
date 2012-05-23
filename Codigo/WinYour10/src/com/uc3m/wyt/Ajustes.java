package com.uc3m.wyt;
 
import com.openfeint.internal.OpenFeintInternal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Ajustes extends Activity {
	/** Called when the activity is first created. */
	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.ajustes);
	this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
	
	
	
	}

	public void ClickConectar(View v) {
		startActivity(new Intent(this, Conectar.class ));
	}

	public void ClickDesconectar(View v) { 
		OpenFeintInternal.getInstance().logoutUser(null);
		Toast.makeText(Ajustes.this, String.format("Desconectado"), Toast.LENGTH_SHORT).show(); 
	}

	public void ClickSalir(View v) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("¿Desea salir de la aplicación?")
		        .setTitle("Advertencia")
		        .setCancelable(false)
		        .setNegativeButton("Cancelar",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                })
		        .setPositiveButton("Aceptar",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                    	Intent intent = new Intent(Intent.ACTION_MAIN);
		                    	intent.addCategory(Intent.CATEGORY_HOME);
		                    	intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		                    	startActivity(intent);
		                    	finish();
		                    	
		                    }
		                });
		AlertDialog alert = builder.create();
		alert.show();
	}

	

}