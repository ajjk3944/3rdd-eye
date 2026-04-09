package com.bytedance.sdk.component.adexpress.ycc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import w1.a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class sz extends ImageView {
    private boolean bw;
    private AnimatedImageDrawable dg;
    private Movie emc;
    private int gbl;
    private float msw;
    private boolean qh;
    private int ru;
    private volatile boolean sup;
    private boolean sz;
    private float uym;
    private int xq;
    private boolean ycc;
    private long ypw;
    private float zz;

    public sz(Context context) {
        super(context);
        this.bw = Build.VERSION.SDK_INT >= 28;
        this.ycc = false;
        this.sz = true;
        this.qh = true;
        emc();
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
            AnimatedImageDrawable animatedImageDrawableB = a.b(drawable);
            this.dg = animatedImageDrawableB;
            if (!this.sup) {
                animatedImageDrawableB.start();
            }
            if (!this.qh) {
                animatedImageDrawableB.setRepeatCount(0);
            }
        }
        ypw();
    }

    private void xq() {
        if (this.emc == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.ypw == 0) {
            this.ypw = jUptimeMillis;
        }
        int iDuration = this.emc.duration();
        if (iDuration == 0) {
            iDuration = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        }
        if (this.qh || Math.abs(iDuration - this.xq) >= 60) {
            this.xq = (int) ((jUptimeMillis - this.ypw) % iDuration);
        } else {
            this.xq = iDuration;
            this.sup = true;
        }
    }

    private void ypw() {
        if (this.emc == null || this.bw || !this.sz) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void emc() {
        if (this.bw) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.emc == null || this.bw) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.sup) {
                emc(canvas);
                return;
            }
            xq();
            emc(canvas);
            ypw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        if (this.emc != null && !this.bw) {
            this.uym = (getWidth() - this.ru) / 2.0f;
            this.msw = (getHeight() - this.gbl) / 2.0f;
        }
        this.sz = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i3) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i3);
        if (this.bw || (movie = this.emc) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.emc.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i3) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i3))) ? 1.0f : iHeight / size);
        this.zz = fMax;
        int i6 = (int) (iWidth * fMax);
        this.ru = i6;
        int i7 = (int) (iHeight * fMax);
        this.gbl = i7;
        setMeasuredDimension(i6, i7);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.emc != null) {
            this.sz = i == 1;
            ypw();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.emc != null) {
            this.sz = i == 0;
            ypw();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.emc != null) {
            this.sz = i == 0;
            ypw();
        }
    }

    public void setRepeatConfig(boolean z6) {
        AnimatedImageDrawable animatedImageDrawable;
        this.qh = z6;
        if (z6) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.dg) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    private void emc(Canvas canvas) {
        Movie movie = this.emc;
        if (movie == null) {
            return;
        }
        movie.setTime(this.xq);
        float f2 = this.zz;
        if (f2 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.emc.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f2, f2);
            Movie movie2 = this.emc;
            float f5 = this.uym;
            float f6 = this.zz;
            movie2.draw(canvas, f5 / f6, this.msw / f6);
        }
        canvas.restore();
    }
}
