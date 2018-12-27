package com.tamanna.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView=findViewById(R.id.image_View);

        imgView.setImageResource(R.drawable.frameanimation);

        frameAnimation=(AnimationDrawable)imgView.getDrawable();
        frameAnimation.start();

    }
}
