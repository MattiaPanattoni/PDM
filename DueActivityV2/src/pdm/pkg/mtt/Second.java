package pdm.pkg.mtt;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        TextView label = (TextView) findViewById(R.id.textView1);
        String iltestoricevuto = getIntent().getExtras().getString("iltestonelbox");
        label.setText(iltestoricevuto);
	}
	public void onStart() {
		super.onStart();
		String str = "Metodo OnStart";
		Log.d("Metodo", str);
	}
	public void onReStart() {
		super.onRestart();
		String str = "Metodo OnRestart";
		Log.d("Metodo", str);
		
	}
	public void onResume() {
		super.onResume();
		String str = "Metodo OnResume";
		Log.d("Metodo", str);
		
	}
	public void onPause() {
		super.onPause();
		String str = "Metodo OnPause";
		Log.d("Metodo", str);
		
	}
	public void onStop() {
		super.onStop();
		String str = "Metodo OnStop";
		Log.d("Metodo", str);
	
	}
	public void onDestroy() {
		super.onDestroy();
		String str = "Metodo OnDestroy";
		Log.d("Metodo", str);
	
	}

}
