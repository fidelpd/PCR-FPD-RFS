package com.uc3m.trivial;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

import com.openfeint.api.OpenFeint;
import com.openfeint.api.OpenFeintDelegate;
import com.openfeint.api.OpenFeintSettings;
import com.openfeint.api.resource.Leaderboard;
import com.openfeint.api.resource.Score;

public class Trivial extends Activity {
    /** Called when the activity is first created. */
	
	public Spinner sp1;
	
	private static final String TAG = "MyActivity"; //Variable para logs
	
	//public static List<Achievement> achievements = null;
	//public static List<Leaderboard> leaderboards = null;
	
	static final String gameName = "Trivial";
	static final String gameID = "457992";
	static final String gameKey = "jcH0W4iRUNlZjgnMTXtrCQ";
	static final String gameSecret = "IqniPPyZHZS4Lha22XTUl4geCtMSE3H1PEqn8Xn8";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        OpenFeintSettings settings = new OpenFeintSettings(gameName, gameKey, gameSecret, gameID);
        OpenFeint.initialize(this, settings, new OpenFeintDelegate() { });
        
        setContentView(R.layout.trivial);
        sp1 = (Spinner) findViewById (R.id.spinner1);
        
        sp1.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
					int position, long id) {
        		
        		String resp = parentView.getItemAtPosition(position).toString();
        		
        		Log.v(TAG, "index=" + resp);//Logs 
        		
        		//Comprobación de la respuesta                
        		if (resp.equals("Android")) {
        			long scoreValue = 150;
        			Score s = new Score(scoreValue, null); // Second parameter is null to indicate that custom display text is not used.
        			Leaderboard l = new Leaderboard("1094057"); // cuando crearon la tabla de puntajes, les da un ID
        			s.submitTo(l, new Score.SubmitToCB()
        			{
        			@Override public void onSuccess(boolean newHighScore)
        			{
        				Toast.makeText(Trivial.this, String.format("Respuesta correcta. Ganas 150 puntos"), Toast.LENGTH_SHORT).show();
        			}
        			@Override public void onFailure(String exceptionMessage)
        			{
        			Toast.makeText(Trivial.this, "Error (" + exceptionMessage + ") posting score.", Toast.LENGTH_SHORT).show();
        			}
        			});
        			}
        			
        			//Abriremos el layout con el resultado
        			//Intent myIntent = new Intent(parentView.getContext(), Resultado.class);
                    //startActivityForResult(myIntent, 0);
        			
				//Toast.makeText(parentView.getContext(), "Has seleccionado " +
          	    //      textmida, Toast.LENGTH_LONG).show();
        		//}
        		
        		else if (resp.equals("")){
        			onNothingSelected(parentView);
        		}
        		
        		else if (resp.equals("Apple ios")){
        			
        			long scoreValue = 50;
        			Score s = new Score(scoreValue, null); // Second parameter is null to indicate that custom display text is not used.
        			Leaderboard l = new Leaderboard("1094057"); // cuando crearon la tabla de puntajes, les da un ID
        			s.submitTo(l, new Score.SubmitToCB()
        			{
        			public void onSuccess(boolean newHighScore)
        			{
        				Toast.makeText(Trivial.this, String.format("Respuesta incorrecta. Ganas 50 puntos"), Toast.LENGTH_SHORT).show();
        			}
        			public void onFailure(String exceptionMessage)
        			{
        			Toast.makeText(Trivial.this, "Error (" + exceptionMessage + ") posting score.", Toast.LENGTH_SHORT).show();
        			}
        			});
        		}
        		
        	
        		else if (resp.equals("Windows Phone")){
    			
        			long scoreValue = 50;
        			Score s = new Score(scoreValue, null); // Second parameter is null to indicate that custom display text is not used.
        			Leaderboard l = new Leaderboard("1094057"); // cuando crearon la tabla de puntajes, les da un ID
        			s.submitTo(l, new Score.SubmitToCB()
        			{
        				public void onSuccess(boolean newHighScore)
        				{
        					Toast.makeText(Trivial.this, String.format("Respuesta incorrecta. Ganas 50 puntos"), Toast.LENGTH_SHORT).show();
        				}
        				public void onFailure(String exceptionMessage)
        				{
        					Toast.makeText(Trivial.this, "Error (" + exceptionMessage + ") posting score.", Toast.LENGTH_SHORT).show();
        				}
        			});
    				}
    			
        	
        		else if (resp.equals("RIM")){
    			
        			long scoreValue = 10;
        			Score s = new Score(scoreValue, null); // Second parameter is null to indicate that custom display text is not used.
        			Leaderboard l = new Leaderboard("1094057"); // cuando crearon la tabla de puntajes, les da un ID
        			s.submitTo(l, new Score.SubmitToCB()
        			{
        				public void onSuccess(boolean newHighScore)
        				{
        					Toast.makeText(Trivial.this, String.format("Respuesta incorrecta. Ganas 10 puntos"), Toast.LENGTH_SHORT).show();
        				}
        				public void onFailure(String exceptionMessage)
        				{
        					Toast.makeText(Trivial.this, "Error (" + exceptionMessage + ") posting score.", Toast.LENGTH_SHORT).show();
        				}
        			});
					}
				}
        			
        			
        		
  
			public void onNothingSelected(AdapterView<?> parentView) {
				// TODO Auto-generated method stub
				
			}
			
        });
  }
}