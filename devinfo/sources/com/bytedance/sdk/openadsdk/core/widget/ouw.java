package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.sdk.openadsdk.core.le.yu {
    private int ouw;
    private int vt;

    public ouw(Context context) {
        super(context);
        this.ouw = 0;
        this.vt = 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.ouw == 0) {
            this.ouw = getWidth();
        }
        if (this.vt == 0) {
            this.vt = getHeight();
        }
        int i4 = this.ouw;
        int i10 = this.vt;
        if (i4 >= i10) {
            i4 = i10;
        }
        return i4 / 2;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapCreateBitmap;
        if (getDrawable() == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        measure(0, 0);
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            if ((getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null) {
                return;
            }
            try {
                bitmapCreateScaledBitmap = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
            } catch (Throwable unused) {
                bitmapCreateScaledBitmap = null;
            }
            if (bitmapCreateScaledBitmap == null) {
                super.onDraw(canvas);
                return;
            }
            int radius = getRadius() * 2;
            try {
                int width = bitmapCreateScaledBitmap.getWidth();
                int height = bitmapCreateScaledBitmap.getHeight();
                Bitmap bitmapCreateBitmap2 = height > width ? Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, (height - width) / 2, width, width) : height < width ? Bitmap.createBitmap(bitmapCreateScaledBitmap, (width - height) / 2, 0, height, height) : null;
                if (bitmapCreateBitmap2 != null) {
                    bitmapCreateScaledBitmap = bitmapCreateBitmap2;
                }
                if (bitmapCreateScaledBitmap.getWidth() != radius || bitmapCreateScaledBitmap.getHeight() != radius) {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, radius, radius, true);
                }
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                Paint paint = getPaint();
                Rect rect = new Rect(0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
                canvas2.drawARGB(0, 0, 0, 0);
                canvas2.drawCircle(bitmapCreateScaledBitmap.getWidth() / 2, bitmapCreateScaledBitmap.getHeight() / 2, bitmapCreateScaledBitmap.getWidth() / 2, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas2.drawBitmap(bitmapCreateScaledBitmap, rect, rect, paint);
            } catch (Throwable unused2) {
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap == null) {
                super.onDraw(canvas);
            } else {
                canvas.drawBitmap(bitmapCreateBitmap, (this.ouw / 2) - r4, (this.vt / 2) - r4, (Paint) null);
            }
        }
    }
}
