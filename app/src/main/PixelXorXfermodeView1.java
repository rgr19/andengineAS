package com.jay.xfermodedemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PixelXorXfermode;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jay on 2015/10/22 0022.
 */
public class PixelXorXfermodeView1 extends View{

    private Paint mPaint;
    private Bitmap mBitmap;
    private PixelXorXfermode pixelxorXfermode;

    public PixelXorXfermodeView1(Context context) {
        super(context);
        init();

    }

    public PixelXorXfermodeView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PixelXorXfermodeView1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);  //抗锯齿
        pixelxorXfermode = new PixelXorXfermode(0XFFD9E5F3);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.iv_meizi);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mBitmap, 50, 50, mPaint);
        mPaint.setARGB(255, 222, 83, 71);
        mPaint.setXfermode(pixelxorXfermode);
        canvas.drawRect(50, 50, 690, 1010, mPaint);
    }

}
