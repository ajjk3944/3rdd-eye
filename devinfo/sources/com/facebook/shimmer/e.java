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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final d f8963a = new d(0, this);

    /* renamed from: b, reason: collision with root package name */
    public final Paint f8964b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8965c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f8966d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f8967e;

    /* renamed from: f, reason: collision with root package name */
    public c f8968f;

    public e() {
        Paint paint = new Paint();
        this.f8964b = paint;
        this.f8965c = new Rect();
        this.f8966d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        c cVar;
        ValueAnimator valueAnimator = this.f8967e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cVar = this.f8968f) == null || !cVar.f8955o || getCallback() == null) {
            return;
        }
        this.f8967e.start();
    }

    public final void b() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (cVar = this.f8968f) == null) {
            return;
        }
        int iRound = cVar.g;
        if (iRound <= 0) {
            iRound = Math.round(cVar.f8950i * iWidth);
        }
        c cVar2 = this.f8968f;
        int iRound2 = cVar2.f8949h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(cVar2.j * iHeight);
        }
        c cVar3 = this.f8968f;
        boolean z3 = true;
        if (cVar3.f8948f != 1) {
            int i4 = cVar3.f8945c;
            if (i4 != 1 && i4 != 3) {
                z3 = false;
            }
            if (z3) {
                iRound = 0;
            }
            if (!z3) {
                iRound2 = 0;
            }
            c cVar4 = this.f8968f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, cVar4.f8944b, cVar4.f8943a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (Math.max(iRound, iRound2) / Math.sqrt(2.0d));
            c cVar5 = this.f8968f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, cVar5.f8944b, cVar5.f8943a, Shader.TileMode.CLAMP);
        }
        this.f8964b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fC;
        float fC2;
        if (this.f8968f != null) {
            Paint paint = this.f8964b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f8968f.f8953m));
            Rect rect = this.f8965c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f8967e;
            float f10 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i4 = this.f8968f.f8945c;
            if (i4 != 1) {
                if (i4 == 2) {
                    fC2 = r5.c.c(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i4 != 3) {
                    float f11 = -fHeight;
                    fC2 = r5.c.c(fHeight, f11, animatedFraction, f11);
                } else {
                    fC = r5.c.c(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f10 = fC2;
                fC = 0.0f;
            } else {
                float f12 = -fWidth;
                fC = r5.c.c(fWidth, f12, animatedFraction, f12);
            }
            Matrix matrix = this.f8966d;
            matrix.reset();
            matrix.setRotate(this.f8968f.f8953m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f10, fC);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        c cVar = this.f8968f;
        if (cVar != null) {
            return (cVar.f8954n || cVar.f8956p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8965c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
