package com.austin.customcircleview;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CustomCircleView circleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleView = (CustomCircleView) findViewById(R.id.circleView);

        circleView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                circleView.setCurrentX(x);
                circleView.setCurrentY(y);
                circleView.invalidate();
                return true;
            }
        });

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        //相当于Drawing区
        int height = circleView.getHeight();
        Log.e("TAG", ""+ height);
        Rect rect = new Rect();

        //相当于Application区
        circleView.getWindowVisibleDisplayFrame(rect);
        Log.e("TAG", ""+rect.height());

        //相当于Drawing区
        circleView.getDrawingRect(rect);
        Log.e("TAG", ""+rect.height());
    }


}
