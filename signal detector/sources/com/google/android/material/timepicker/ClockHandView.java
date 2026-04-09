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
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import d3.AbstractC2266a;
import e3.AbstractC2303a;
import java.util.ArrayList;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f18582n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f18583a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18584b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18585c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18586d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18587e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f18588f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f18589g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18590h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18591j;

    /* renamed from: k, reason: collision with root package name */
    public double f18592k;

    /* renamed from: l, reason: collision with root package name */
    public int f18593l;

    /* renamed from: m, reason: collision with root package name */
    public int f18594m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f18583a = valueAnimator;
        this.f18585c = new ArrayList();
        Paint paint = new Paint();
        this.f18588f = paint;
        this.f18589g = new RectF();
        this.f18594m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19756k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        com.bumptech.glide.d.O(context, R.attr.motionDurationLong2, TTAdConstant.MATE_VALID);
        com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19928b);
        this.f18593l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f18586d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f18590h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f18587e = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
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
                int i = ClockHandView.f18582n;
                this.f18600a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f18593l * 0.66f) : this.f18593l;
    }

    public final void b(float f2) {
        this.f18583a.cancel();
        c(f2);
    }

    public final void c(float f2) {
        float f5 = f2 % 360.0f;
        this.i = f5;
        this.f18592k = Math.toRadians(f5 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f18594m);
        float fCos = (((float) Math.cos(this.f18592k)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f18592k))) + height;
        float f6 = this.f18586d;
        this.f18589g.set(fCos - f6, fSin - f6, fCos + f6, fSin + f6);
        ArrayList arrayList = this.f18585c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.f18580W - f5) > 0.001f) {
                clockFaceView.f18580W = f5;
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
        float f2 = width;
        float fA = a(this.f18594m);
        float fCos = (((float) Math.cos(this.f18592k)) * fA) + f2;
        float f5 = height;
        float fSin = (fA * ((float) Math.sin(this.f18592k))) + f5;
        Paint paint = this.f18588f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f18586d, paint);
        double dSin = Math.sin(this.f18592k);
        paint.setStrokeWidth(this.f18590h);
        canvas.drawLine(f2, f5, width + ((int) (Math.cos(this.f18592k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f2, f5, this.f18587e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        if (this.f18583a.isRunning()) {
            return;
        }
        b(this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean z8 = false;
        if (actionMasked == 0) {
            this.f18591j = false;
            z6 = true;
            z7 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z7 = this.f18591j;
            if (this.f18584b) {
                this.f18594m = ((float) Math.hypot((double) (x6 - ((float) (getWidth() / 2))), (double) (y3 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + AbstractC2993B.e(getContext(), 12) ? 2 : 1;
            }
            z6 = false;
        } else {
            z7 = false;
            z6 = false;
        }
        boolean z9 = this.f18591j;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x6 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f2 = i;
        boolean z10 = this.i != f2;
        if (z6 && z10) {
            z8 = true;
        } else if (z10 || z7) {
            b(f2);
            z8 = true;
        }
        this.f18591j = z9 | z8;
        return true;
    }
}
