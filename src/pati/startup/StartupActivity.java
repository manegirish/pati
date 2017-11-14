package pati.startup;

import java.io.IOException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class StartupActivity extends Activity {
 Button mainactivity_btn;
 MediaPlayer mediaPlayer;
 int length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startupactivity_layout);
      //screen set to landscape  
       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    
    Uri path=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.goodmorning);
    mediaPlayer=MediaPlayer.create(StartupActivity.this, path) ;
    mediaPlayer.start();
    mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
	@Override
	public void onCompletion(MediaPlayer mp) {
		// stop media player and release it
		mediaPlayer.stop();
		//mediaPlayer.release();
		//call next activity
		
		//wait for 6 second and then call next activity
		new CountDownTimer(3000, 3000) {
			public void onTick(long millisUntilFinished) { 
			}
			public void onFinish() {
				Intent move=new Intent(StartupActivity.this,MainMenuActivity.class);
				move.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(move);
				finish();
				}
			}.start();
		
	}
});
    mainactivity_btn=(Button)findViewById(R.id.mainactivity_btn);
    mainactivity_btn.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View v) {
		if (mediaPlayer.isPlaying()) {
			mediaPlayer.stop();
			}
		Intent move=new Intent(StartupActivity.this,MainMenuActivity.class);
		move.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(move);
		finish();
	
	}
});
}
    public void onStop() {
		super.onStop();
		//tToast("onStop.");
		mediaPlayer.pause();
		length=mediaPlayer.getCurrentPosition();
	}
    
	public void onResume() {
		super.onResume();
	//	tToast("onResume");
		mediaPlayer.seekTo(length);
		try {
			mediaPlayer.prepare();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		mediaPlayer.start();
	}
	/*private void tToast(String s) {
	    Context context = getApplicationContext();
	    int duration = Toast.LENGTH_SHORT;
	    Toast toast = Toast.makeText(context, s, duration);
	    toast.show();
	}
	*/
	@SuppressLint("InlinedApi")
	@Override
	public void onBackPressed() {
		 final Dialog dialog = new Dialog(StartupActivity.this,AlertDialog.THEME_HOLO_LIGHT);
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
				if (mediaPlayer.isPlaying()) {
					mediaPlayer.stop();
					mediaPlayer.release();
				}
				finish();
				System.exit(0);
				}
	     	});
		} 
}
