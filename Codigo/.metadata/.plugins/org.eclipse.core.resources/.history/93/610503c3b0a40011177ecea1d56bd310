package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ProbabilidadForo  extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.probabilidad_foro);
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
    
    public void acceder_foro(View v) {
    	//Sumar un punto
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hostedredmine.com/projects/pcr-fpd-rfs/boards")));
    }

}
