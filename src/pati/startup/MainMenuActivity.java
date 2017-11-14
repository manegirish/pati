package pati.startup;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuActivity extends Activity implements OnClickListener{
	Button preparation,story,number,alphabets,slate;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity_layout);
        //screen set to landscape  
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        
        slate=(Button)findViewById(R.id.mainactivity_slate);
        slate.setOnClickListener(this);   
        
        number=(Button)findViewById(R.id.mainactivity_numbr);
        number.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.mainactivity_slate:
			Intent slate = new Intent(MainMenuActivity.this, pati.slate.DrawingActivity.class);
			slate.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(slate);
			finish();
			break;
			
		case R.id.mainactivity_numbr:
			Intent number = new Intent(MainMenuActivity.this, pati.number.NL_Main_Activity.class);
			number.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(number);
			finish();
			break;
			
		default:
			break;
		}
	} 
	
	@SuppressLint("InlinedApi")
	@Override
	public void onBackPressed() {
		 final Dialog dialog = new Dialog(MainMenuActivity.this,AlertDialog.THEME_HOLO_LIGHT);
	     dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
	  
	     // Include dialog.xml file
	     dialog.setContentView(R.layout.dialog);
	     int width = getResources().getDimensionPixelSize(R.dimen.popup_width);
	     int height = getResources().getDimensionPixelSize(R.dimen.popup_height);        
	     dialog.getWindow().setLayout(width, height);
	     
	     dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,R.drawable.ic_launcher);
	     // Set dialog title
	     dialog.setTitle("Quit");
	     
	     // set values for custom dialog components - text, image and button
	     TextView text = (TextView) dialog.findViewById(R.id.textDialog);
	     text.setText("Do You Want to Quit???");
	     text.setTypeface(null, Typeface.BOLD);
	     text.setTextColor(Color.WHITE);
	     dialog.show();
	   
	     Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
	     // if decline button is clicked, close the custom dialog
	     declineButton.setOnClickListener(new OnClickListener() {
	     @Override
	     public void onClick(View v) {
	     // Close dialog
	     dialog.dismiss();
	         }
	     });
	     Button acceptButton = (Button)dialog.findViewById(R.id.acceptButton);
	     acceptButton.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				/*if (mediaPlayer.isPlaying()) {
					mediaPlayer.stop();
					mediaPlayer.release();
				}*/
				finish();
				System.exit(0);
				}
	     	});
		}
}
