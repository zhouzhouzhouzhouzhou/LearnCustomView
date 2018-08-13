package com.example.admin.learncustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * @author zhou.jn
 * @creator_at 2018/8/13 19:45
 */
public class TestView extends View {
    private static final String TAG = "TestView";
    private Paint mPaint;
    private int mWidth;
    private int mHeight;
    private Canvas mCanvas;

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL);
    }





    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

//        Log.i(TAG, "onMeasure: " + widthMeasureSpec + " mHeight " + heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        mWidth = getWidth();
        mHeight = getHeight();
//        Log.i(TAG, "onLayout: " + " mWidth " + mWidth + " mHeight " + mHeight);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path mPath = new Path();
        mPath.moveTo(100, 500);
        mPath.quadTo(100, 100, 600, 600);
        canvas.drawPath(mPath, mPaint);
    }
}
