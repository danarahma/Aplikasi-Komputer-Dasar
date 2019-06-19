package khandana.com.kp;



import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashActivity extends Activity {
    Animation anim;
    AnimationDrawable animationDrawable;
    LinearLayout relativeLayout;
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_1010102);
    }
    /** Called when the activity is first created. */
    Thread splashTread;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        StartAnimations();

        relativeLayout = (LinearLayout)findViewById(R.id.lin_lay);
        animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(1000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning())
            animationDrawable.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning())
            animationDrawable.stop();
    }
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        ImageView iv = (ImageView) findViewById(R.id.splash);
        iv.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.roll);
        TextView tv = (TextView) findViewById(R.id.roll);
        tv.startAnimation(anim);


        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 6000) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(SplashActivity.this,
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    SplashActivity.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    SplashActivity.this.finish();
                }

            }
        };
        splashTread.start();


    }

}

