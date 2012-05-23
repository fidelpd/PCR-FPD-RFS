package com.uc3m.wyt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Testfinal extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testfinal);
    }
    
    public void comprobar(View view){
    	Intent intent = new Intent(Testfinal.this, Resultado_RFS_FPDActivity.class);
    	int resultado = resp_correcta(); 
    	intent.putExtra("respuesta", resultado);
    	startActivity(intent);
    }
    
    private int resp_correcta(){
    	RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
    	RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
    	RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
    	if(rb1.isChecked())
    		return 3;
    	else if(rb2.isChecked())
    		return 0;
    	else if(rb3.isChecked())
    		return 2;
    	else
    		return 1;
    			
    }
    
    
}