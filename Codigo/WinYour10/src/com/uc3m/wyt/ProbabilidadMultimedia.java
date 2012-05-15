package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ProbabilidadMultimedia extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.probabilidad_multimedia);
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
    
    public void teorema_bayes(View v){
    	//sumar 5 puntos
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es/url?sa=t&rct=j&q=youtube%20teorema%20vayes&source=web&cd=1&ved=0CDQQtwIwAA&url=http%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3Dz5qK8baN7sI&ei=h4-xT7OCApKAhQfz8MCCAg&usg=AFQjCNHJ0kPzZpM_K__oSxd7UO7pVgnWBw")));
    }
    
    public void funcion_densidad(View v){
    	//sumar 5 puntos
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es/url?sa=t&rct=j&q=youtube%20funcion%20densidad&source=web&cd=3&ved=0CEYQtwIwAg&url=http%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DJs0ZTr4t018&ei=x4-xT5DOIMSAhQf-5MnnCA&usg=AFQjCNHSO1jqFQHdbpnmFEatM7W_gfAB_A")));
    }
}
