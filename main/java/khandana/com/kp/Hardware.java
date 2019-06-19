package khandana.com.kp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Hardware extends AppCompatActivity {
    LinearLayout ll;
    Animation roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hardware);

        roll = AnimationUtils.loadAnimation(this, R.anim.roll);

        ll = (LinearLayout) findViewById(R.id.ll);

        ll.startAnimation(roll);

       CardView keyboard = (CardView) findViewById(R.id.keyboard);
       CardView mouse = (CardView) findViewById(R.id.mouse);
       CardView cpu = (CardView) findViewById(R.id.cpu);
       CardView monitor = (CardView) findViewById(R.id.monitor);
       CardView printer = (CardView) findViewById(R.id.printer);
       CardView speaker = (CardView) findViewById(R.id.speaker);

     keyboard.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent keyboard = new Intent(getApplicationContext(),Keyboard.class);
           MediaPlayer player = MediaPlayer.create(Hardware.this, R.raw.b);
           player.start();
           startActivity(keyboard);
        }
     });
        mouse.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
             Intent mouse = new Intent(getApplicationContext(),Mouse.class);
            MediaPlayer player = MediaPlayer.create(Hardware.this, R.raw.b);
            player.start();
             startActivity(mouse);
          }
         });
       cpu.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View v) {
             Intent cpu = new Intent(getApplicationContext(),Cpu.class);
            MediaPlayer player = MediaPlayer.create(Hardware.this, R.raw.b);
            player.start();
             startActivity(cpu);
         }
       });
       monitor.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View v) {
             Intent monitor = new Intent(getApplicationContext(),Monitor.class);
            MediaPlayer player = MediaPlayer.create(Hardware.this, R.raw.b);
            player.start();
             startActivity(monitor);
         }
       });
       printer.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent printer = new Intent(getApplicationContext(),Printer.class);
             MediaPlayer player = MediaPlayer.create(Hardware.this, R.raw.b);
             player.start();
             startActivity(printer);
         }
       });
       speaker.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent speaker = new Intent(getApplicationContext(),Speaker.class);
             MediaPlayer player = MediaPlayer.create(Hardware.this, R.raw.b);
             player.start();
             startActivity(speaker);
         }
       });


    }

    public void vid(View view) {
        Intent vid = new Intent(this, Vhardware.class);
        startActivity(vid);
    }
}
