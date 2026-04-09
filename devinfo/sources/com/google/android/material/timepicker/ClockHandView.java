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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class ClockHandView extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20654n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f20655a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20656b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20658d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20659e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f20660f;
    public final RectF g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20661h;

    /* renamed from: i, reason: collision with root package name */
    public float f20662i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public double f20663k;

    /* renamed from: l, reason: collision with root package name */
    public int f20664l;

    /* renamed from: m, reason: collision with root package name */
    public int f20665m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f20655a = valueAnimator;
        this.f20657c = new ArrayList();
        Paint paint = new Paint();
        this.f20660f = paint;
        this.g = new RectF();
        this.f20665m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.f25949i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        nh.a.v(context, R.attr.motionDurationLong2, TTAdConstant.MATE_VALID);
        nh.a.w(context, R.attr.motionEasingEmphasizedInterpolator, jc.a.f27483b);
        this.f20664l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f20658d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f20661h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f20659e = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
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
                int i4 = ClockHandView.f20654n;
                this.f20671a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i4) {
        return i4 == 2 ? Math.round(this.f20664l * 0.66f) : this.f20664l;
    }

    public final void b(float f10) {
        this.f20655a.cancel();
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.f20662i = f11;
        this.f20663k = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f20665m);
        float fCos = (((float) Math.cos(this.f20663k)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f20663k))) + height;
        float f12 = this.f20658d;
        this.g.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        ArrayList arrayList = this.f20657c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.G - f11) > 0.001f) {
                clockFaceView.G = f11;
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
        float fA = a(this.f20665m);
        float fCos = (((float) Math.cos(this.f20663k)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.f20663k))) + f11;
        Paint paint = this.f20660f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f20658d, paint);
        double dSin = Math.sin(this.f20663k);
        paint.setStrokeWidth(this.f20661h);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f20663k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f20659e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        if (this.f20655a.isRunning()) {
            return;
        }
        b(this.f20662i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.j = false;
            z3 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.j;
            if (this.f20656b) {
                this.f20665m = ((float) Math.hypot((double) (x10 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + m.d(12, getContext()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z10 = false;
            z3 = false;
        }
        boolean z12 = this.j;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i4 = degrees + 90;
        if (i4 < 0) {
            i4 = degrees + 450;
        }
        float f10 = i4;
        boolean z13 = this.f20662i != f10;
        if (z3 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            b(f10);
            z11 = true;
        }
        this.j = z12 | z11;
        return true;
    }
}
