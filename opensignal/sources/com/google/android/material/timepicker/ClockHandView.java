package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ir.f0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int J = 0;
    public final RectF B;
    public final int D;
    public float E;
    public boolean F;
    public double G;
    public int H;
    public int I;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f5783a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5784d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5785g;

    /* renamed from: r, reason: collision with root package name */
    public final int f5786r;

    /* renamed from: x, reason: collision with root package name */
    public final float f5787x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f5788y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        int i10 = ed.b.materialClockStyle;
        super(context, attributeSet, i10);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f5783a = valueAnimator;
        this.f5785g = new ArrayList();
        Paint paint = new Paint();
        this.f5788y = paint;
        this.B = new RectF();
        this.I = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ed.l.ClockHandView, i10, ed.k.Widget_MaterialComponents_TimePicker_Clock);
        f0.U(context, ed.b.motionDurationLong2, 200);
        f0.V(context, ed.b.motionEasingEmphasizedInterpolator, fd.a.f8823b);
        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.ClockHandView_materialCircleRadius, 0);
        this.f5786r = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.ClockHandView_selectorSize, 0);
        this.D = getResources().getDimensionPixelSize(ed.d.material_clock_hand_stroke_width);
        this.f5787x = r0.getDimensionPixelSize(ed.d.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(ed.l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i11 = ClockHandView.J;
                this.f5792a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.H * 0.66f) : this.H;
    }

    public final void b(float f10) {
        this.f5783a.cancel();
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.E = f11;
        this.G = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.I);
        float fCos = (((float) Math.cos(this.G)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.G))) + height;
        float f12 = this.f5786r;
        this.B.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f5785g.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f) it.next());
            if (Math.abs(clockFaceView.f5781f0 - f11) > 0.001f) {
                clockFaceView.f5781f0 = f11;
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
        float f10 = width;
        float fA = a(this.I);
        float fCos = (((float) Math.cos(this.G)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.G))) + f11;
        Paint paint = this.f5788y;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f5786r, paint);
        double dSin = Math.sin(this.G);
        paint.setStrokeWidth(this.D);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.G) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f5787x, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f5783a.isRunning()) {
            return;
        }
        b(this.E);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.F = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.F;
            if (this.f5784d) {
                this.I = ((float) Math.hypot((double) (x10 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + xd.l.b(getContext(), 12) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.F;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z14 = this.E != f10;
        if (z10 && z14) {
            z12 = true;
        } else if (z14 || z11) {
            b(f10);
            z12 = true;
        }
        this.F = z13 | z12;
        return true;
    }
}
