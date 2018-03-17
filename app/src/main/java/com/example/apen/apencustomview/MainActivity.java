package com.example.apen.apencustomview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.apen.apencustomview.view.CurveView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CurveView mCurveView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCurveView = (CurveView) findViewById(R.id.curveView);

        List<Float> yline=new ArrayList<Float>();
        yline.add(4.22f);
        yline.add(4.26f);
        yline.add(4.24f);
        yline.add(4.25f);
        yline.add(4.22f);
        yline.add(4.23f);
        yline.add(4.27f);
        mCurveView.setDataY(yline);

    }
}
