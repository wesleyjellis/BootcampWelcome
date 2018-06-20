package com.example.wes.bootcampwelcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
        ImageView image = (ImageView) findViewById(R.id.image);

        AnimationSet set = new AnimationSet(false);

        Animation animation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        animation.setDuration(2_000);
        set.addAnimation(animation);

        Animation animation2 = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        animation2.setStartOffset(2_000);
        animation2.setDuration(2_000);
        set.addAnimation(animation2);


        image.setAnimation(set);
    }
}
