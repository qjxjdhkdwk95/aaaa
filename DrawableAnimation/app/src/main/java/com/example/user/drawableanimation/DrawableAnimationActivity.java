package com.example.user.drawableanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.ImageView;

public class DrawableAnimationActivity extends ActionBarActivity {
    AnimationDrawable rocketAnimation;

    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        ImageView rocketImage = (ImageView) findViewById(R.id.rocket_image);
        rocketImage.setBackgroundResource(R.drawable.rocket);
     rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            rocketAnimation.start();
            return true;
        }
        return super.onTouchEvent(event);
    }
}
