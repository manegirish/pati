package pati.number;

import pati.startup.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoActivity extends Activity {
	ImageView apple, two, appleone, one;
	MediaPlayer mediaPlayer;
	Animation blink;
	ImageView three,foure,five,six,seven,eight,nine,appleOne,appleTwo,appleThree,appleFour,appleSix,appleSeven,appleEight,appleNine;
	int length;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.no_activity_layout);

		//To keep screen orientation Landscape only so the screen will not rotate
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
		blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.nl_blink);

		mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.silence);

		one=(ImageView)findViewById(R.id.one);
		one.setVisibility(View.GONE);
		three=(ImageView)findViewById(R.id.three);
		three.setVisibility(View.GONE);
		foure=(ImageView)findViewById(R.id.four);
		foure.setVisibility(View.GONE);
		five=(ImageView)findViewById(R.id.five);
		five.setVisibility(View.GONE);
		six=(ImageView)findViewById(R.id.six);
		six.setVisibility(View.GONE);
		seven=(ImageView)findViewById(R.id.seven);
		seven.setVisibility(View.GONE);
		eight=(ImageView)findViewById(R.id.eight);
		eight.setVisibility(View.GONE);
		nine=(ImageView)findViewById(R.id.nine);
		nine.setVisibility(View.GONE);
		
		appleTwo=(ImageView)findViewById(R.id.apple2);
		appleTwo.setVisibility(View.GONE);
		appleThree=(ImageView)findViewById(R.id.apple3);
		appleThree.setVisibility(View.GONE);
		appleFour=(ImageView)findViewById(R.id.apple4);
		appleFour.setVisibility(View.GONE);
		appleOne=(ImageView)findViewById(R.id.apple1);
		appleOne.setVisibility(View.GONE);
		appleSeven=(ImageView)findViewById(R.id.apple7);
		appleSeven.setVisibility(View.GONE);
		appleEight=(ImageView)findViewById(R.id.apple8);
		appleEight.setVisibility(View.GONE);
		appleNine=(ImageView)findViewById(R.id.apple9);
		appleNine.setVisibility(View.GONE);
		
	
		two=(ImageView)findViewById(R.id.two);
		
		apple = (ImageView) findViewById(R.id.apple5);
		appleone = (ImageView) findViewById(R.id.apple6);
		appleone.setVisibility(View.GONE);
		apple.setVisibility(View.GONE);
		
		
		two.setAnimation(blink);
		two.startAnimation(blink);
		// two visibility only
		mediaPlayer.start();
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

		@Override
		public void onCompletion(MediaPlayer mp) {
			blink.cancel();
			mediaPlayer.stop();
			mediaPlayer.release();
			// banan visibility with two
			apple.setVisibility(View.VISIBLE);
			appleone.setVisibility(View.VISIBLE);
			two.setVisibility(View.VISIBLE);
			two.startAnimation(blink);
			mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.silence);
			mediaPlayer.start();
			mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				// one visiblility
				mediaPlayer.stop();
				mediaPlayer.release();
				blink.cancel();
				
				two.setVisibility(View.GONE);
				one.setVisibility(View.VISIBLE);
				appleone.setVisibility(View.GONE);
				one.startAnimation(blink);
				
				mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.silence);
				mediaPlayer.start();
				mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
					
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				// two visibility
				one.setVisibility(View.GONE);
				blink.cancel();
				mediaPlayer.stop();
				mediaPlayer.release();
				
				
				two.setVisibility(View.VISIBLE);
				
				appleone.setVisibility(View.VISIBLE);
				two.startAnimation(blink);
				
				mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.silence);
				mediaPlayer.start();
				mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				mediaPlayer.stop();
				mediaPlayer.release();
				blink.cancel();
				
				Intent intent=new Intent(getApplicationContext(), ThreeActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();
									}
								});
							}
						});
					}
				});

			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.main, menu);
	    return true;
		   }
	    //after selecting the appropriate  menu item this method will invoked
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

	    	switch (item.getItemId()) {
	    	case R.id.home:
	    	{
	    		if (mediaPlayer.isPlaying()) {
					mediaPlayer.stop();
					mediaPlayer.release();
				}
	    		if (blink.hasStarted()) {
					blink.cancel();
				}
	    	Intent intent1=new Intent(TwoActivity.this,pati.startup.MainMenuActivity.class);
	    	intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    	startActivity(intent1);
	    	finish();
	    	return true;
	    	}
	    	}
	    	return super.onOptionsItemSelected(item);
	    }
	@Override
	public void onBackPressed() {
		 final Dialog dialog = new Dialog(TwoActivity.this,AlertDialog.THEME_HOLO_LIGHT);
	     dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
	  //   dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
	     // Include dialog.xml file
	     dialog.setContentView(R.layout.dialog);
	     int width = getResources().getDimensionPixelSize(R.dimen.popup_width);
	     int height = getResources().getDimensionPixelSize(R.dimen.popup_height);        
	     dialog.getWindow().setLayout(width, height);
	     /***http://stackoverflow.com/questions/15173855/android-alertdialog-with-custom-view-and-rounded-corners***/
	     dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,R.drawable.ic_launcher);
	     // Set dialog title
	     dialog.setTitle("Quit");
	     // set values for custom dialog components - text, image and button
	     TextView text = (TextView) dialog.findViewById(R.id.textDialog);
	     text.setText("Do You Want to Quit???");
	     text.setTypeface(null, Typeface.BOLD);
	     text.setTextColor(Color.WHITE);
	   //  ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
	  //   image.setImageResource(R.drawable.quit);
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
				// TODO Auto-generated method stub
				if (mediaPlayer.isPlaying()) {
					mediaPlayer.stop();
					mediaPlayer.release();
				}
				if (blink.hasStarted()) {
					blink.cancel();
				}
				System.exit(0);
				finish();
				}
	     	});
		} 
	}
