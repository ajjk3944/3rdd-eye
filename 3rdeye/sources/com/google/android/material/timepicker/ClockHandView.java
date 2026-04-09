package com.google.android.material.timepicker;

import L0.I;
import L0.S;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f4.C4334b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t4.C5606d;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f23176b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23177c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23178d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23179e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23180f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f23181g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f23182h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public float f23183j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23184k;

    /* renamed from: l, reason: collision with root package name */
    public double f23185l;

    /* renamed from: m, reason: collision with root package name */
    public int f23186m;

    /* renamed from: n, reason: collision with root package name */
    public int f23187n;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f23176b = new ValueAnimator();
        this.f23178d = new ArrayList();
        Paint paint = new Paint();
        this.f23181g = paint;
        this.f23182h = new RectF();
        this.f23187n = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3119f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        C4334b.c(context, R.attr.motionDurationLong2, 200);
        C4334b.d(context, R.attr.motionEasingEmphasizedInterpolator, L3.a.f4035b);
        this.f23186m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f23179e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.i = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f23180f = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f23186m * 0.66f) : this.f23186m;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f23176b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f23183j = f11;
        this.f23185l = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f23187n);
        float fCos = (((float) Math.cos(this.f23185l)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f23185l))) + height;
        float f12 = this.f23179e;
        this.f23182h.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f23178d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fA = a(this.f23187n);
        float fCos = (((float) Math.cos(this.f23185l)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.f23185l))) + f11;
        Paint paint = this.f23181g;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f23179e, paint);
        double dSin = Math.sin(this.f23185l);
        paint.setStrokeWidth(this.i);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f23185l) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f23180f, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        if (this.f23176b.isRunning()) {
            return;
        }
        b(this.f23183j);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f23184k = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.f23184k;
            if (this.f23177c) {
                this.f23187n = C5606d.s((float) (getWidth() / 2), (float) (getHeight() / 2), x10, y10) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.f23184k;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f10 = i;
        boolean z14 = this.f23183j != f10;
        if (z10 && z14) {
            z12 = true;
        } else if (z14 || z11) {
            b(f10);
            z12 = true;
        }
        this.f23184k = z13 | z12;
        return true;
    }
}
