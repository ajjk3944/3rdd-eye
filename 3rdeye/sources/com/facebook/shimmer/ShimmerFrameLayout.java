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
import com.facebook.shimmer.b;

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f22349b;

    /* renamed from: c, reason: collision with root package name */
    public final c f22350c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22351d;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22349b = new Paint();
        this.f22350c = new c();
        this.f22351d = true;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f22350c.setCallback(this);
        if (attributeSet == null) {
            b(new b.a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22352a, 0, 0);
        try {
            b(((typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) ? new b.c() : new b.a()).b(typedArrayObtainStyledAttributes).a());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(b bVar) {
        boolean zIsStarted;
        c cVar = this.f22350c;
        cVar.f22378f = bVar;
        if (bVar != null) {
            cVar.f22374b.setXfermode(new PorterDuffXfermode(cVar.f22378f.f22367p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        cVar.b();
        if (cVar.f22378f != null) {
            ValueAnimator valueAnimator = cVar.f22377e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                cVar.f22377e.cancel();
                cVar.f22377e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            b bVar2 = cVar.f22378f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (bVar2.f22371t / bVar2.f22370s) + 1.0f);
            cVar.f22377e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(cVar.f22378f.f22369r);
            cVar.f22377e.setRepeatCount(cVar.f22378f.f22368q);
            ValueAnimator valueAnimator2 = cVar.f22377e;
            b bVar3 = cVar.f22378f;
            valueAnimator2.setDuration(bVar3.f22370s + bVar3.f22371t);
            cVar.f22377e.addUpdateListener(cVar.f22373a);
            if (zIsStarted) {
                cVar.f22377e.start();
            }
        }
        cVar.invalidateSelf();
        if (bVar == null || !bVar.f22365n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f22349b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f22351d) {
            this.f22350c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22350c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f22350c;
        ValueAnimator valueAnimator = cVar.f22377e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        cVar.f22377e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        this.f22350c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22350c;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f22349b = new Paint();
        this.f22350c = new c();
        this.f22351d = true;
        a(context, attributeSet);
    }
}
