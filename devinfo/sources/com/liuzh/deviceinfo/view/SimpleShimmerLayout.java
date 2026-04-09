package com.liuzh.deviceinfo.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.liuzh.deviceinfo.R;
import eh.a;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SimpleShimmerLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21355e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f21356a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f21357b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f21358c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f21359d;

    public SimpleShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.f21357b = paint;
        paint.setColor(-1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.5f);
        this.f21356a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1800L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new a(5, this));
        Drawable drawable = getContext().getDrawable(R.drawable.ic_simple_shimmer);
        Objects.requireNonNull(drawable);
        this.f21358c = ((BitmapDrawable) drawable).getBitmap();
    }

    public final void a(boolean z3) {
        ValueAnimator valueAnimator = this.f21356a;
        if (z3) {
            if (valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.start();
        } else if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
            valueAnimator.end();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ValueAnimator valueAnimator = this.f21356a;
        if (valueAnimator == null || !valueAnimator.isRunning() || this.f21359d == null) {
            return;
        }
        int width = ((int) (getWidth() * ((Float) valueAnimator.getAnimatedValue()).floatValue())) - this.f21359d.getWidth();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawBitmap(this.f21359d, width, 0.0f, this.f21357b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.f21356a;
        if (valueAnimator.isPaused()) {
            valueAnimator.resume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21356a.pause();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        Bitmap bitmap = this.f21358c;
        int width = (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * 1.0f * getHeight());
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f21359d = Bitmap.createScaledBitmap(bitmap, width, height, false);
    }
}
