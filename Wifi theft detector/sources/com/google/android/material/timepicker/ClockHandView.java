package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.google.android.material.internal.d0;
import j4.k;
import j4.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f11453a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f11454b;

    /* renamed from: c, reason: collision with root package name */
    public final ValueAnimator f11455c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11456d;

    /* renamed from: e, reason: collision with root package name */
    public float f11457e;

    /* renamed from: f, reason: collision with root package name */
    public float f11458f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11459g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11460h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11461i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11462j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11463k;

    /* renamed from: l, reason: collision with root package name */
    public final float f11464l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f11465m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f11466n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11467o;

    /* renamed from: p, reason: collision with root package name */
    public float f11468p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11469q;

    /* renamed from: r, reason: collision with root package name */
    public double f11470r;

    /* renamed from: s, reason: collision with root package name */
    public int f11471s;

    /* renamed from: t, reason: collision with root package name */
    public int f11472t;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(b bVar) {
        this.f11462j.add(bVar);
    }

    public final void c(float f10, float f11) {
        this.f11472t = a5.a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + d0.g(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f11472t);
        float fCos = (((float) Math.cos(this.f11470r)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f11470r))) + f11;
        this.f11465m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f11463k, this.f11465m);
        double dSin = Math.sin(this.f11470r);
        double dCos = Math.cos(this.f11470r);
        this.f11465m.setStrokeWidth(this.f11467o);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f11465m);
        canvas.drawCircle(f10, f11, this.f11464l, this.f11465m);
    }

    public RectF e() {
        return this.f11466n;
    }

    public final int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    public float g() {
        return this.f11468p;
    }

    public final int h(int i10) {
        return i10 == 2 ? Math.round(this.f11471s * 0.66f) : this.f11471s;
    }

    public int i() {
        return this.f11463k;
    }

    public final Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    public final boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f11456d) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    public final void l() {
        this.f11455c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f11487a, valueAnimator);
            }
        });
        this.f11455c.addListener(new a());
    }

    public void m(int i10) {
        this.f11471s = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        this.f11455c.cancel();
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f11455c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f11455c.setDuration(this.f11453a);
        this.f11455c.setInterpolator(this.f11454b);
        this.f11455c.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f11455c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f11457e = x10;
            this.f11458f = y10;
            this.f11459g = true;
            this.f11469q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f11457e);
            int i11 = (int) (y10 - this.f11458f);
            this.f11459g = (i10 * i10) + (i11 * i11) > this.f11460h;
            z11 = this.f11469q;
            boolean z13 = actionMasked == 1;
            if (this.f11461i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f11469q |= k(x10, y10, z11, z10, z12);
        return true;
    }

    public final void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f11468p = f11;
        this.f11470r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f11472t);
        float fCos = width + (((float) Math.cos(this.f11470r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f11470r)));
        RectF rectF = this.f11466n;
        int i10 = this.f11463k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f11462j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void q(boolean z10) {
        if (this.f11461i && !z10) {
            this.f11472t = 1;
        }
        this.f11461i = z10;
        invalidate();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11455c = new ValueAnimator();
        this.f11462j = new ArrayList();
        Paint paint = new Paint();
        this.f11465m = paint;
        this.f11466n = new RectF();
        this.f11472t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ClockHandView, i10, k.Widget_MaterialComponents_TimePicker_Clock);
        this.f11453a = b5.k.f(context, j4.b.motionDurationLong2, 200);
        this.f11454b = b5.k.g(context, j4.b.motionEasingEmphasizedInterpolator, k4.a.f21835b);
        this.f11471s = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ClockHandView_materialCircleRadius, 0);
        this.f11463k = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ClockHandView_selectorSize, 0);
        this.f11467o = getResources().getDimensionPixelSize(j4.d.material_clock_hand_stroke_width);
        this.f11464l = r7.getDimensionPixelSize(j4.d.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f11460h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        l();
    }
}
