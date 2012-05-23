package com.uc3m.wyt;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado_RFS_FPDActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        int resultado = getIntent().getExtras().getInt("respuesta");
        TextView t = (TextView) findViewById(R.id.resultado);
        String respuesta = "";
        if(resultado == 0){
        	respuesta = "Respuesta incorrecta. No has obtenido ningœn punto.";
        	t.setText("Respuesta Incorrecta.");
        	
        }else if (resultado == 3){
        	respuesta = "Respuesta correcta. Has obtenido 30 puntos.";
        	t.setText("Respuesta Correcta.");
        	OperarOpenFeint.anyadir_puntuacion_clasificacion_general(30);
        	OperarOpenFeint.anyadir_puntuacion_mas_trabajador(20);
            OperarOpenFeint.anyadir_puntuacion_mas_sabio(20);
        }else if (resultado == 2){
        	respuesta = "Respuesta parcialmente correcta. Has obtenido 20 puntos.";
        	t.setText("Respuesta parcialmente correcta.");
        	OperarOpenFeint.anyadir_puntuacion_clasificacion_general(20);
        	OperarOpenFeint.anyadir_puntuacion_mas_trabajador(10);
            OperarOpenFeint.anyadir_puntuacion_mas_sabio(10);
        }else{
        	respuesta = "Respuesta parcialmente correcta. Has obtenido 10 puntos.";
        	t.setText("Respuesta parcialmente correcta.");
        	OperarOpenFeint.anyadir_puntuacion_clasificacion_general(10);
        	OperarOpenFeint.anyadir_puntuacion_mas_trabajador(5);
            OperarOpenFeint.anyadir_puntuacion_mas_sabio(5);
        }
        
        	
    }
}

