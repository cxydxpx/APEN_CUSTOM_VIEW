package com.example.apen.apencustomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 作者 Y_MS
 * Created by ${APEN} on 2017/6/22.
 * GitHub：https://github.com/cxydxpx
 */

public class CircleView extends View {

    private Paint mPaint;
    private Context mContext;
    private int screenHeight;
    private int screenWidth;

    public CircleView(Context context) {
        super(context,null);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init();
    }

    private void init() {

        mPaint = new Paint();
//        抗锯齿
        mPaint.setAntiAlias(true);
//        设置颜色
        mPaint.setColor(Color.RED);
//         设置样式 1 填充 2 描边 3 填充并描边
        mPaint.setStyle(Paint.Style.FILL);
//         描边的情况下 设置描边的宽度
//        mPaint.setStrokeWidth(2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth()/2,getHeight()/2,50,mPaint);
    }
}
