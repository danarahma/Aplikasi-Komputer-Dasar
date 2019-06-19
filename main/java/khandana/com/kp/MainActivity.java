package khandana.com.kp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import khandana.com.kp.multiplechoicequiz.QuizActivity;

public class MainActivity extends AppCompatActivity {
    Button cardview1,cardview2,cardview3,cardview4,cardview5,cardview6;
    Animation alpha, up;
    private CardView cardView;
    private MediaPlayer player;
    AnimationDrawable animationDrawable;
    RelativeLayout relativeLayout;
    ImageView pc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        MediaPlayer player = MediaPlayer.create(this, R.raw.welcome);
        player.start();

        alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        up = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        pc = (ImageView) findViewById(R.id.pc);
        cardview1 = (Button) findViewById(R.id.cardview1);
        cardview2 = (Button) findViewById(R.id.cardview2);
        cardview3 = (Button) findViewById(R.id.cardview3);
        cardview4 = (Button) findViewById(R.id.cardview4);
        cardview5 = (Button) findViewById(R.id.cardview5);
        cardview6 = (Button) findViewById(R.id.cardview6);

        pc.startAnimation(alpha);
        cardview1.startAnimation(up);
        cardview2.startAnimation(alpha);
        cardview3.startAnimation(up);
        cardview4.startAnimation(alpha);
        cardview5.startAnimation(up);
        cardview6.startAnimation(alpha);

    }



    public void mk(View view){
        Intent PengertianDoa = new Intent(MainActivity.this, MengenalKomputer.class);
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        startActivity(PengertianDoa);
    }
    public void hardware(View view) {
        Intent hardware = new Intent(MainActivity.this, Hardware.class);
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        startActivity(hardware);
    }
    public void software(View view) {
        Intent software = new Intent(MainActivity.this, Software.class);
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        startActivity(software);
    }
    public void quiz(View view) {
        Intent quiz = new Intent(MainActivity.this, QuizActivity.class);
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        startActivity(quiz);
    }
    public void info(View view){
        Intent about = new Intent(MainActivity.this, About.class);
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        startActivity(about);
    }

    public void keluar(View view) {
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
    @Override
    public void onBackPressed() {
        MediaPlayer player = MediaPlayer.create(this, R.raw.b);
        player.start();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }


}