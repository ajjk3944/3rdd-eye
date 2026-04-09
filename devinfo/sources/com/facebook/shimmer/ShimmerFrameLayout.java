package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f8938a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8939b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8940c;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f8938a = new Paint();
        e eVar = new e();
        this.f8939b = eVar;
        this.f8940c = true;
        setWillNotDraw(false);
        eVar.setCallback(this);
        if (attributeSet == null) {
            a(new b(0).p());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f8941a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                bVar = new b(1);
                ((c) bVar.f218b).f8956p = false;
            } else {
                bVar = new b(0);
            }
            a(bVar.q(typedArrayObtainStyledAttributes).p());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(c cVar) {
        boolean zIsStarted;
        e eVar = this.f8939b;
        eVar.f8968f = cVar;
        if (cVar != null) {
            eVar.f8964b.setXfermode(new PorterDuffXfermode(eVar.f8968f.f8956p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        eVar.b();
        if (eVar.f8968f != null) {
            ValueAnimator valueAnimator = eVar.f8967e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                eVar.f8967e.cancel();
                eVar.f8967e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            c cVar2 = eVar.f8968f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (cVar2.f8960t / cVar2.f8959s) + 1.0f);
            eVar.f8967e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(eVar.f8968f.f8958r);
            eVar.f8967e.setRepeatCount(eVar.f8968f.f8957q);
            ValueAnimator valueAnimator2 = eVar.f8967e;
            c cVar3 = eVar.f8968f;
            valueAnimator2.setDuration(cVar3.f8959s + cVar3.f8960t);
            eVar.f8967e.addUpdateListener(eVar.f8963a);
            if (zIsStarted) {
                eVar.f8967e.start();
            }
        }
        eVar.invalidateSelf();
        if (cVar == null || !cVar.f8954n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f8938a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8940c) {
            this.f8939b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8939b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f8939b;
        ValueAnimator valueAnimator = eVar.f8967e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        eVar.f8967e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        this.f8939b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8939b;
    }
}
