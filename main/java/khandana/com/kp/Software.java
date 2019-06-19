package khandana.com.kp;

import android.content.Intent;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Software extends AppCompatActivity {
    LinearLayout sw;
    Animation roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.software);

        roll = AnimationUtils.loadAnimation(this, R.anim.roll);

        sw = (LinearLayout) findViewById(R.id.sw);

        sw.startAnimation(roll);

        CardView word = (CardView) findViewById(R.id.word);
        CardView excel = (CardView) findViewById(R.id.excel);
        CardView pp = (CardView) findViewById(R.id.pp);
        CardView photoshop = (CardView) findViewById(R.id.photoshop);
        CardView paint = (CardView) findViewById(R.id.paint);
        CardView corel = (CardView) findViewById(R.id.corel);

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent word = new Intent(getApplicationContext(),Word.class);
                MediaPlayer player = MediaPlayer.create(Software.this, R.raw.b);
                player.start();
                startActivity(word);
            }
        });
        excel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent excel = new Intent(getApplicationContext(),Excel.class);
                MediaPlayer player = MediaPlayer.create(Software.this, R.raw.b);
                player.start();
                startActivity(excel);
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp = new Intent(getApplicationContext(),Pp.class);
                MediaPlayer player = MediaPlayer.create(Software.this, R.raw.b);
                player.start();
                startActivity(pp);
            }
        });
        photoshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoshop = new Intent(getApplicationContext(),Photoshop.class);
                MediaPlayer player = MediaPlayer.create(Software.this, R.raw.b);
                player.start();
                startActivity(photoshop);
            }
        });
        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paint = new Intent(getApplicationContext(), khandana.com.kp.Paint.class);
                MediaPlayer player = MediaPlayer.create(Software.this, R.raw.b);
                player.start();
                startActivity(paint);
            }
        });
        corel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent corel = new Intent(getApplicationContext(),Corel.class);
                MediaPlayer player = MediaPlayer.create(Software.this, R.raw.b);
                player.start();
                startActivity(corel);
            }
        });
    }


    public void vid(View view) {
        Intent vid = new Intent(this, Vsoftware.class);
        startActivity(vid);
    }
}
