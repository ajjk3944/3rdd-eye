package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.gn0;
import defpackage.r4;
import defpackage.sf;
import defpackage.tf;
import defpackage.wl2;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int s = 0;
    public final ValueAnimator f;
    public boolean g;
    public final ArrayList h;
    public final int i;
    public final float j;
    public final Paint k;
    public final RectF l;
    public final int m;
    public float n;
    public boolean o;
    public double p;
    public int q;
    public int r;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.k = paint;
        this.l = new RectF();
        this.r = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        wl2.t(context, R.attr.motionDurationLong2, 200);
        wl2.u(context, R.attr.motionEasingEmphasizedInterpolator, r4.b);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.j = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.s;
                this.a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new sf());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.q * 0.66f) : this.q;
    }

    public final void b(float f) {
        this.f.cancel();
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.n = f2;
        this.p = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.r);
        float fCos = (((float) Math.cos(this.p)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.p))) + height;
        float f3 = this.i;
        this.l.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((tf) obj);
            if (Math.abs(clockFaceView.L - f2) > 0.001f) {
                clockFaceView.L = f2;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fA = a(this.r);
        float fCos = (((float) Math.cos(this.p)) * fA) + f;
        float f2 = height;
        float fSin = (fA * ((float) Math.sin(this.p))) + f2;
        Paint paint = this.k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.i, paint);
        double dSin = Math.sin(this.p);
        paint.setStrokeWidth(this.m);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.p) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f.isRunning()) {
            return;
        }
        b(this.n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.o = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.o;
            if (this.g) {
                this.r = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.o;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.n != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            b(f);
            z3 = true;
        }
        this.o = z4 | z3;
        return true;
    }
}
