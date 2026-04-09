package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class ee extends ImageView {
    private Matrix dg;
    private Paint emc;
    private int xq;
    private int ypw;

    public ee(Context context) {
        this(context, null);
    }

    private Bitmap emc(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.zz.dg.a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapEmc = emc(drawable);
        if (bitmapEmc == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapEmc, tileMode, tileMode);
        float fMax = (bitmapEmc.getWidth() == getWidth() && bitmapEmc.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapEmc.getWidth(), (getHeight() * 1.0f) / bitmapEmc.getHeight());
        this.dg.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.dg);
        this.emc.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.ypw, this.xq, this.emc);
    }

    public void setXRound(int i10) {
        this.ypw = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.xq = i10;
        postInvalidate();
    }

    public ee(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ee(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.ypw = 25;
        this.xq = 25;
        Paint paint = new Paint();
        this.emc = paint;
        paint.setAntiAlias(true);
        this.emc.setFilterBitmap(true);
        this.dg = new Matrix();
    }
}
