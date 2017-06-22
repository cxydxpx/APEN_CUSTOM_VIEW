package com.example.apen.apencustomview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.circle_shape);

        iv.setImageResource(R.drawable.circle_shape);
    }
}
