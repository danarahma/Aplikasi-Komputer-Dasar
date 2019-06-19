package khandana.com.kp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MengenalKomputer extends AppCompatActivity {
    LinearLayout mk;
    Animation alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mengenal_komputer);

        alpha = AnimationUtils.loadAnimation(this, R.anim.roll);

        mk = (LinearLayout) findViewById(R.id.mk);

        mk.startAnimation(alpha);
    }

}
