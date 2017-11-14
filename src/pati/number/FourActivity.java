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

public class FourActivity extends Activity {
	ImageView one,two,three,four,appleone,appletwo,applethree,applefour;
	MediaPlayer mediaPlayer;
	Animation blink;
	ImageView five,six,seven,eight,nine,appleSix,appleSeven,appleEight,appleNine;
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
		one=(ImageView)findViewById(R.id.one);
		one.setVisibility(View.GONE);
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
		
		appleone=(ImageView)findViewById(R.id.apple1);
		appleone.setVisibility(View.GONE);
		applefour=(ImageView)findViewById(R.id.apple4);
		applefour.setVisibility(View.GONE);
		appleSeven=(ImageView)findViewById(R.id.apple7);
		appleSeven.setVisibility(View.GONE);
		appleEight=(ImageView)findViewById(R.id.apple8);
		appleEight.setVisibility(View.GONE);
		appleNine=(ImageView)findViewById(R.id.apple9);
		appleNine.setVisibility(View.GONE);
		
		
		
		four=(ImageView)findViewById(R.id.four);
		
		appleone=(ImageView)findViewById(R.id.apple2);
		appletwo=(ImageView)findViewById(R.id.apple3);
		applethree=(ImageView)findViewById(R.id.apple6);
		applefour=(ImageView)findViewById(R.id.apple5);
		
		
		blink=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nl_blink);
		four.setAnimation(blink);
		
		
		//gone the visibility of all the imageviews and only four is visible
		appleone.setVisibility(View.GONE);
		appletwo.setVisibility(View.GONE);
		applethree.setVisibility(View.GONE);
		applefour.setVisibility(View.GONE);
		
		mediaPlayer=MediaPlayer.create(FourActivity.this, R.raw.silence);
		mediaPlayer.start();
		four.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		mediaPlayer.stop();
		mediaPlayer.release();
		blink.cancel();
		
		//four with four apple visible	
		appleone.setVisibility(View.VISIBLE);
		appletwo.setVisibility(View.VISIBLE);
		applethree.setVisibility(View.VISIBLE);
		applefour.setVisibility(View.VISIBLE);
		

		mediaPlayer=MediaPlayer.create(FourActivity.this, R.raw.silence);
		mediaPlayer.start();
		four.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		mediaPlayer.stop();
		mediaPlayer.release();
		blink.cancel();
		
		appletwo.setVisibility(View.GONE);
		applethree.setVisibility(View.GONE);
		applefour.setVisibility(View.GONE);
		four.setVisibility(View.GONE);
		
		//one visibility
		one.setVisibility(View.VISIBLE);
		appleone.setVisibility(View.VISIBLE);
			
		mediaPlayer=MediaPlayer.create(FourActivity.this, R.raw.silence);
		mediaPlayer.start();
		one.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		mediaPlayer.stop();
		mediaPlayer.release();
		blink.cancel();
	
		one.setVisibility(View.GONE);
		
		//two visible
		two.setVisibility(View.VISIBLE);
		appletwo.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(FourActivity.this, R.raw.silence);
		mediaPlayer.start();
		two.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		mediaPlayer.stop();
		mediaPlayer.release();
		blink.cancel();
	
		two.setVisibility(View.GONE);
		
		//three visible
		three.setVisibility(View.VISIBLE);
		applethree.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(FourActivity.this, R.raw.silence);
		mediaPlayer.start();
		three.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		mediaPlayer.stop();
		mediaPlayer.release();
		blink.cancel();
	
		three.setVisibility(View.GONE);
		
		//four visible
		four.setVisibility(View.VISIBLE);
		applefour.setVisibility(View.VISIBLE);
		mediaPlayer=MediaPlayer.create(FourActivity.this, R.raw.silence);
		mediaPlayer.start();
		four.startAnimation(blink);
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
		@Override
		public void onCompletion(MediaPlayer mp) {
		mediaPlayer.stop();
		mediaPlayer.release();
		blink.cancel();
	
		Intent intent=new Intent(FourActivity.this,FiveActivity.class);
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
					mediaPlayer.stop();
					mediaPlayer.release();
					
	    		if (blink.hasStarted()) {
					blink.cancel();
				}
	    	//if home button is clicked then it will switch to home screen that is in our case eslate_preparation_MainActivity
	    	Intent intent1=new Intent(FourActivity.this,pati.startup.MainMenuActivity.class);
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
		 final Dialog dialog = new Dialog(FourActivity.this,AlertDialog.THEME_HOLO_LIGHT);
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
