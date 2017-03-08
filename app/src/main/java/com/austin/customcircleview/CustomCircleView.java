package com.austin.customcircleview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Austin on 2017/3/8.
 */

public class CustomCircleView extends View {
    private float currentX = 50;
    private float currentY = 50;
    private float radius = 20;

    public CustomCircleView(Context context) {
        super(context);
    }

    public CustomCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomCircleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = MeasureSpec.getSize(widthMeasureSpec);
        int size1 = MeasureSpec.getSize(heightMeasureSpec);
        //相当于Drawing区
        Log.e("TAG", "onMeasure width:" + size+ " height:" + size1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //相当于Drawing区
        Log.e("TAG", "onDraw");
        Log.e("TAG", "canvas.getHeight() " + canvas.getHeight());
        Log.e("TAG", "canvas.getHeight() " + canvas.getHeight());

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);

        canvas.drawCircle(currentX, currentY, radius, paint);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        //相当于Drawing区
        Log.e("TAG", "onSizechanged w:" + w + " h: " + h + " oldw:" + oldw + " oldh:" + oldh);
    }

    public void setCurrentX(float currentX) {
        this.currentX = currentX;
    }

    public void setCurrentY(float currentY) {
        this.currentY = currentY;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


}
