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

public class SixActivity extends Activity {
	ImageView one,two,three,four,five,six,appleOne,appleTwo,appleThree,appleFour,appleFive,appleSix;
	MediaPlayer mediaPlayer;
	Animation blink;
	ImageView seven,eight,nine,appleSeven,appleEight,appleNine;
	int length;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.no_activity_layout);
		
		//To keep screen orientation Landscape only so the screen will not rotate
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
		two=(ImageView)findViewById(R.id.two);
		two.setVisibility(View.GONE);
		three=(ImageView)findViewById(R.id.three);
		three.setVisibility(View.GONE);
		four=(ImageView)findViewById(R.id.four);
		four.setVisibility(View.GONE);
		five=(ImageView)findViewById(R.id.five);
		five.setVisibility(View.GONE);
		one=(ImageView)findViewById(R.id.one);
		one.setVisibility(View.GONE);
		seven=(ImageView)findViewById(R.id.seven);
		seven.setVisibility(View.GONE);
		eight=(ImageView)findViewById(R.id.eight);
		eight.setVisibility(View.GONE);
		nine=(ImageView)findViewById(R.id.nine);
		nine.setVisibility(View.GONE);
		
		appleFour=(ImageView)findViewById(R.id.apple4);
		appleFour.setVisibility(View.GONE);
		appleOne=(ImageView)findViewById(R.id.apple1);
		appleOne.setVisibility(View.GONE);
		appleSeven=(ImageView)findViewById(R.id.apple7);
		appleSeven.setVisibility(View.GONE);
		
		
		six=(ImageView)findViewById(R.id.six);
		
		appleOne=(ImageView)findViewById(R.id.apple2);
		appleTwo=(ImageView)findViewById(R.id.apple3);
		appleThree=(ImageView)findViewById(R.id.apple5);
		appleFour=(ImageView)findViewById(R.id.apple6);
		appleFive=(ImageView)findViewById(R.id.apple8);
		appleSix=(ImageView)findViewById(R.id.apple9);
		
		//pnly six is visible
		appleOne.setVisibility(View.GONE);
		appleTwo.setVisibility(View.GONE);
		appleThree.setVisibility(View.GONE);
		appleFour.setVisibility(View.GONE);
		appleFive.setVisibility(View.GONE);
		appleSix.setVisibility(View.GONE);
		
		blink=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nl_blink);
		six.setAnimation(blink);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		six.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
		//six apple get visible
		appleOne.setVisibility(View.VISIBLE);
		appleTwo.setVisibility(View.VISIBLE);
		appleThree.setVisibility(View.VISIBLE);
		appleFour.setVisibility(View.VISIBLE);
		appleFive.setVisibility(View.VISIBLE);
		appleSix.setVisibility(View.VISIBLE);
		
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		six.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
		six.setVisibility(View.GONE);
	    appleTwo.setVisibility(View.GONE);
		appleThree.setVisibility(View.GONE);
		appleFour.setVisibility(View.GONE);
		appleFive.setVisibility(View.GONE);
		appleSix.setVisibility(View.GONE);
		//one visible
		one.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		one.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
	    one.setVisibility(View.GONE);
		//two visible
		two.setVisibility(View.VISIBLE);
		appleTwo.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		two.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
	    two.setVisibility(View.GONE);
		//three visible
		three.setVisibility(View.VISIBLE);
		appleThree.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		three.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
	    three.setVisibility(View.GONE);
		//four visible
		four.setVisibility(View.VISIBLE);
		appleFour.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		four.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
	    four.setVisibility(View.GONE);
		//five visible
		five.setVisibility(View.VISIBLE);
		appleFive.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		five.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
		
	    five.setVisibility(View.GONE);
		//six visible
		six.setVisibility(View.VISIBLE);
		appleSix.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.silence);
		mediaPlayer.start();
		six.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		blink.cancel();
		mediaPlayer.stop();
		mediaPlayer.release();
	    
		Intent intent=new Intent(SixActivity.this,SevenActivity.class);
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
	    	Intent intent1=new Intent(SixActivity.this,pati.startup.MainMenuActivity.class);
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
		 final Dialog dialog = new Dialog(SixActivity.this,AlertDialog.THEME_HOLO_LIGHT);
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
