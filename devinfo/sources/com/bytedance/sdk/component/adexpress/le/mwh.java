package com.bytedance.sdk.component.adexpress.le;

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
import com.applovin.shadow.okio.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public final class mwh extends ImageView {
    private float bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f7334cf;
    private boolean fkw;

    /* renamed from: jg, reason: collision with root package name */
    private boolean f7335jg;

    /* renamed from: le, reason: collision with root package name */
    private boolean f7336le;

    /* renamed from: lh, reason: collision with root package name */
    private int f7337lh;
    private boolean mwh;
    private Movie ouw;
    private float pno;
    private float ra;
    private volatile boolean ryl;
    private int tlj;
    private long vt;
    private AnimatedImageDrawable yu;

    public mwh(Context context) {
        super(context);
        boolean z3 = Build.VERSION.SDK_INT >= 28;
        this.fkw = z3;
        this.f7336le = false;
        this.mwh = true;
        this.f7335jg = true;
        if (z3) {
            return;
        }
        setLayerType(1, null);
    }

    private void ouw() {
        if (this.ouw == null || this.fkw || !this.mwh) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && a.i(drawable)) {
            AnimatedImageDrawable animatedImageDrawableC = a.c(drawable);
            this.yu = animatedImageDrawableC;
            if (!this.ryl) {
                animatedImageDrawableC.start();
            }
            if (!this.f7335jg) {
                animatedImageDrawableC.setRepeatCount(0);
            }
        }
        ouw();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.ouw == null || this.fkw) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.ryl) {
                ouw(canvas);
                return;
            }
            if (this.ouw != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.vt == 0) {
                    this.vt = jUptimeMillis;
                }
                int iDuration = this.ouw.duration();
                if (iDuration == 0) {
                    iDuration = 1000;
                }
                if (this.f7335jg || Math.abs(iDuration - this.f7337lh) >= 60) {
                    this.f7337lh = (int) ((jUptimeMillis - this.vt) % iDuration);
                } else {
                    this.f7337lh = iDuration;
                    this.ryl = true;
                }
            }
            ouw(canvas);
            ouw();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("GifView", "onDraw->Throwable->", th2);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        if (this.ouw != null && !this.fkw) {
            this.ra = (getWidth() - this.tlj) / 2.0f;
            this.pno = (getHeight() - this.f7334cf) / 2.0f;
        }
        this.mwh = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i10) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i4, i10);
        if (this.fkw || (movie = this.ouw) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.ouw.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i4) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i4))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i10) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i10))) ? 1.0f : iHeight / size);
        this.bly = fMax;
        int i11 = (int) (iWidth * fMax);
        this.tlj = i11;
        int i12 = (int) (iHeight * fMax);
        this.f7334cf = i12;
        setMeasuredDimension(i11, i12);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void onScreenStateChanged(int i4) {
        super.onScreenStateChanged(i4);
        if (this.ouw != null) {
            this.mwh = i4 == 1;
            ouw();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (this.ouw != null) {
            this.mwh = i4 == 0;
            ouw();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (this.ouw != null) {
            this.mwh = i4 == 0;
            ouw();
        }
    }

    public final void setRepeatConfig(boolean z3) {
        AnimatedImageDrawable animatedImageDrawable;
        this.f7335jg = z3;
        if (z3) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.yu) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ko.lh("GifView", "setRepeatConfig error", e2);
        }
    }

    private void ouw(Canvas canvas) {
        Movie movie = this.ouw;
        if (movie == null) {
            return;
        }
        movie.setTime(this.f7337lh);
        float f10 = this.bly;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.ouw.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.ouw;
            float f11 = this.ra;
            float f12 = this.bly;
            movie2.draw(canvas, f11 / f12, this.pno / f12);
        }
        canvas.restore();
    }
}
