package khandana.com.kp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class About extends AppCompatActivity {
    ImageView ll;
    Animation roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        roll = AnimationUtils.loadAnimation(this, R.anim.roll);

        ll = (ImageView) findViewById(R.id.imageView);

        ll.startAnimation(roll);

    }
    public void Back(View view){
        Intent Back = new Intent(this, MainActivity.class);
        startActivity(Back);
        moveTaskToBack(false);
    }
}
