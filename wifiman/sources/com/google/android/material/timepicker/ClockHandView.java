package com.google.android.material.timepicker;

import F1.W;
import O3.i;
import O3.j;
import a4.AbstractC3764d;
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
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final int f37925a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f37926b;

    /* renamed from: c, reason: collision with root package name */
    private final ValueAnimator f37927c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37928d;

    /* renamed from: e, reason: collision with root package name */
    private float f37929e;

    /* renamed from: f, reason: collision with root package name */
    private float f37930f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37931g;

    /* renamed from: h, reason: collision with root package name */
    private final int f37932h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37933i;

    /* renamed from: j, reason: collision with root package name */
    private final List f37934j;

    /* renamed from: k, reason: collision with root package name */
    private final int f37935k;

    /* renamed from: l, reason: collision with root package name */
    private final float f37936l;

    /* renamed from: m, reason: collision with root package name */
    private final Paint f37937m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f37938n;

    /* renamed from: o, reason: collision with root package name */
    private final int f37939o;

    /* renamed from: p, reason: collision with root package name */
    private float f37940p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37941q;

    /* renamed from: r, reason: collision with root package name */
    private double f37942r;

    /* renamed from: s, reason: collision with root package name */
    private int f37943s;

    /* renamed from: t, reason: collision with root package name */
    private int f37944t;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16982u);
    }

    private void c(float f10, float f11) {
        this.f37944t = Z3.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + n.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f37944t);
        float fCos = (((float) Math.cos(this.f37942r)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f37942r))) + f11;
        this.f37937m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f37935k, this.f37937m);
        double dSin = Math.sin(this.f37942r);
        double dCos = Math.cos(this.f37942r);
        this.f37937m.setStrokeWidth(this.f37939o);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f37937m);
        canvas.drawCircle(f10, f11, this.f37936l, this.f37937m);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f37943s * 0.66f) : this.f37943s;
    }

    private Pair j(float f10) {
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

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f37928d) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f37940p = f11;
        this.f37942r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f37944t);
        float fCos = width + (((float) Math.cos(this.f37942r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f37942r)));
        RectF rectF = this.f37938n;
        int i10 = this.f37935k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f37934j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f37934j.add(bVar);
    }

    public RectF e() {
        return this.f37938n;
    }

    public float g() {
        return this.f37940p;
    }

    public int i() {
        return this.f37935k;
    }

    public void m(int i10) {
        this.f37943s = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f37927c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f37927c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f37927c.setDuration(this.f37925a);
        this.f37927c.setInterpolator(this.f37926b);
        this.f37927c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f37956a.l(valueAnimator2);
            }
        });
        this.f37927c.addListener(new a());
        this.f37927c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f37927c.isRunning()) {
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
            this.f37929e = x10;
            this.f37930f = y10;
            this.f37931g = true;
            this.f37941q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f37929e);
            int i11 = (int) (y10 - this.f37930f);
            this.f37931g = (i10 * i10) + (i11 * i11) > this.f37932h;
            z11 = this.f37941q;
            boolean z13 = actionMasked == 1;
            if (this.f37933i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f37941q |= k(x10, y10, z11, z10, z12);
        return true;
    }

    void q(boolean z10) {
        if (this.f37933i && !z10) {
            this.f37944t = 1;
        }
        this.f37933i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37927c = new ValueAnimator();
        this.f37934j = new ArrayList();
        Paint paint = new Paint();
        this.f37937m = paint;
        this.f37938n = new RectF();
        this.f37944t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17322V0, i10, i.f17152n);
        this.f37925a = AbstractC3764d.f(context, O3.a.f16984w, 200);
        this.f37926b = AbstractC3764d.g(context, O3.a.f16950D, P3.a.f18022b);
        this.f37943s = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17336X0, 0);
        this.f37935k = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17343Y0, 0);
        this.f37939o = getResources().getDimensionPixelSize(O3.c.f17036r);
        this.f37936l = r7.getDimensionPixelSize(O3.c.f17034p);
        int color = typedArrayObtainStyledAttributes.getColor(j.f17329W0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f37932h = ViewConfiguration.get(context).getScaledTouchSlop();
        W.u0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
