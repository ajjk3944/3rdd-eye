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
import com.applovin.shadow.okio.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class zih extends com.bytedance.sdk.openadsdk.core.le.yu {
    private final RectF fkw;

    /* renamed from: le, reason: collision with root package name */
    private BitmapShader f8519le;

    /* renamed from: lh, reason: collision with root package name */
    private int f8520lh;
    private final Paint ouw;
    private int vt;
    private final Matrix yu;

    public zih(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && a.i(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f8519le == null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
                int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, width, height);
                drawable.draw(canvas2);
                bitmap = bitmapCreateBitmap;
            }
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f8519le = new BitmapShader(bitmap, tileMode, tileMode);
                float fMax = (bitmap.getWidth() == getWidth() && bitmap.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmap.getWidth(), (getHeight() * 1.0f) / bitmap.getHeight());
                this.yu.setScale(fMax, fMax);
                this.f8519le.setLocalMatrix(this.yu);
            }
        }
        BitmapShader bitmapShader = this.f8519le;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.ouw.setShader(bitmapShader);
            canvas.drawRoundRect(this.fkw, this.vt, this.f8520lh, this.ouw);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        this.fkw.set(0.0f, 0.0f, i4, i10);
    }

    public void setXRound(int i4) {
        this.vt = i4;
        postInvalidate();
    }

    public void setYRound(int i4) {
        this.f8520lh = i4;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f8519le = null;
    }

    private zih(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private zih(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.vt = 25;
        this.f8520lh = 25;
        this.fkw = new RectF();
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.yu = new Matrix();
    }
}
