package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: ShimmerDrawable.java */
/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final a f22373a = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f22374b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f22375c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f22376d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f22377e;

    /* renamed from: f, reason: collision with root package name */
    public b f22378f;

    /* compiled from: ShimmerDrawable.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.invalidateSelf();
        }
    }

    public c() {
        Paint paint = new Paint();
        this.f22374b = paint;
        this.f22375c = new Rect();
        this.f22376d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        b bVar;
        ValueAnimator valueAnimator = this.f22377e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bVar = this.f22378f) == null || !bVar.f22366o || getCallback() == null) {
            return;
        }
        this.f22377e.start();
    }

    public final void b() {
        b bVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (bVar = this.f22378f) == null) {
            return;
        }
        int iRound = bVar.f22359g;
        if (iRound <= 0) {
            iRound = Math.round(bVar.i * iWidth);
        }
        b bVar2 = this.f22378f;
        int iRound2 = bVar2.f22360h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(bVar2.f22361j * iHeight);
        }
        b bVar3 = this.f22378f;
        boolean z10 = true;
        if (bVar3.f22358f != 1) {
            int i = bVar3.f22355c;
            if (i != 1 && i != 3) {
                z10 = false;
            }
            if (z10) {
                iRound = 0;
            }
            if (!z10) {
                iRound2 = 0;
            }
            b bVar4 = this.f22378f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, bVar4.f22354b, bVar4.f22353a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (Math.max(iRound, iRound2) / Math.sqrt(2.0d));
            b bVar5 = this.f22378f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, bVar5.f22354b, bVar5.f22353a, Shader.TileMode.CLAMP);
        }
        this.f22374b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fE;
        float fE2;
        if (this.f22378f != null) {
            Paint paint = this.f22374b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f22378f.f22364m));
            Rect rect = this.f22375c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f22377e;
            float f10 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f22378f.f22355c;
            if (i != 1) {
                if (i == 2) {
                    fE2 = com.google.android.gms.measurement.internal.a.e(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f11 = -fHeight;
                    fE2 = com.google.android.gms.measurement.internal.a.e(fHeight, f11, animatedFraction, f11);
                } else {
                    fE = com.google.android.gms.measurement.internal.a.e(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f10 = fE2;
                fE = 0.0f;
            } else {
                float f12 = -fWidth;
                fE = com.google.android.gms.measurement.internal.a.e(fWidth, f12, animatedFraction, f12);
            }
            Matrix matrix = this.f22376d;
            matrix.reset();
            matrix.setRotate(this.f22378f.f22364m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f10, fE);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        b bVar = this.f22378f;
        if (bVar != null) {
            return (bVar.f22365n || bVar.f22367p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f22375c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
