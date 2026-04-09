package com.bytedance.sdk.openadsdk.core.widget;

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
import w1.a;

/* loaded from: classes.dex */
public class aa extends com.bytedance.sdk.openadsdk.core.ycc.dg {
    private final RectF bw;
    private final Matrix dg;
    private final Paint emc;
    private int xq;
    private BitmapShader ycc;
    private int ypw;

    public aa(Context context) {
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
        Bitmap bitmapEmc;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.ycc == null && (bitmapEmc = emc(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.ycc = new BitmapShader(bitmapEmc, tileMode, tileMode);
            float fMax = (bitmapEmc.getWidth() == getWidth() && bitmapEmc.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapEmc.getWidth(), (getHeight() * 1.0f) / bitmapEmc.getHeight());
            this.dg.setScale(fMax, fMax);
            this.ycc.setLocalMatrix(this.dg);
        }
        BitmapShader bitmapShader = this.ycc;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.emc.setShader(bitmapShader);
            canvas.drawRoundRect(this.bw, this.ypw, this.xq, this.emc);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        this.bw.set(0.0f, 0.0f, i, i3);
    }

    public void setXRound(int i) {
        this.ypw = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.xq = i;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.ycc = null;
    }

    public aa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ypw = 25;
        this.xq = 25;
        this.bw = new RectF();
        Paint paint = new Paint();
        this.emc = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.dg = new Matrix();
    }
}
