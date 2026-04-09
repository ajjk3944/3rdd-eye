package androidx.recyclerview.widget;

import F1.W;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class d extends RecyclerView.n implements RecyclerView.r {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f32170D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f32171E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f32172A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f32173B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.s f32174C;

    /* renamed from: a, reason: collision with root package name */
    private final int f32175a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32176b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f32177c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f32178d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32179e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32180f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f32181g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f32182h;

    /* renamed from: i, reason: collision with root package name */
    private final int f32183i;

    /* renamed from: j, reason: collision with root package name */
    private final int f32184j;

    /* renamed from: k, reason: collision with root package name */
    int f32185k;

    /* renamed from: l, reason: collision with root package name */
    int f32186l;

    /* renamed from: m, reason: collision with root package name */
    float f32187m;

    /* renamed from: n, reason: collision with root package name */
    int f32188n;

    /* renamed from: o, reason: collision with root package name */
    int f32189o;

    /* renamed from: p, reason: collision with root package name */
    float f32190p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f32193s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f32200z;

    /* renamed from: q, reason: collision with root package name */
    private int f32191q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f32192r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f32194t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f32195u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f32196v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f32197w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f32198x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f32199y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32203a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32203a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32203a) {
                this.f32203a = false;
                return;
            }
            if (((Float) d.this.f32200z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f32172A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f32172A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C1120d implements ValueAnimator.AnimatorUpdateListener {
        C1120d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f32177c.setAlpha(iFloatValue);
            d.this.f32178d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f32200z = valueAnimatorOfFloat;
        this.f32172A = 0;
        this.f32173B = new a();
        this.f32174C = new b();
        this.f32177c = stateListDrawable;
        this.f32178d = drawable;
        this.f32181g = stateListDrawable2;
        this.f32182h = drawable2;
        this.f32179e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f32180f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f32183i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f32184j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f32175a = i11;
        this.f32176b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C1120d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f32186l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f32187m, fMax, iArrP, this.f32193s.computeVerticalScrollRange(), this.f32193s.computeVerticalScrollOffset(), this.f32192r);
        if (iX != 0) {
            this.f32193s.scrollBy(0, iX);
        }
        this.f32187m = fMax;
    }

    private void k() {
        this.f32193s.removeCallbacks(this.f32173B);
    }

    private void l() {
        this.f32193s.V0(this);
        this.f32193s.W0(this);
        this.f32193s.X0(this.f32174C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f32192r;
        int i11 = this.f32183i;
        int i12 = this.f32189o;
        int i13 = this.f32188n;
        this.f32181g.setBounds(0, 0, i13, i11);
        this.f32182h.setBounds(0, 0, this.f32191q, this.f32184j);
        canvas.translate(0.0f, i10 - i11);
        this.f32182h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f32181g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f32191q;
        int i11 = this.f32179e;
        int i12 = i10 - i11;
        int i13 = this.f32186l;
        int i14 = this.f32185k;
        int i15 = i13 - (i14 / 2);
        this.f32177c.setBounds(0, 0, i11, i14);
        this.f32178d.setBounds(0, 0, this.f32180f, this.f32192r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f32178d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f32177c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f32178d.draw(canvas);
        canvas.translate(this.f32179e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f32177c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f32179e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f32199y;
        int i10 = this.f32176b;
        iArr[0] = i10;
        iArr[1] = this.f32191q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f32198x;
        int i10 = this.f32176b;
        iArr[0] = i10;
        iArr[1] = this.f32192r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f32189o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f32190p, fMax, iArrO, this.f32193s.computeHorizontalScrollRange(), this.f32193s.computeHorizontalScrollOffset(), this.f32191q);
        if (iX != 0) {
            this.f32193s.scrollBy(iX, 0);
        }
        this.f32190p = fMax;
    }

    private boolean s() {
        return W.z(this.f32193s) == 1;
    }

    private void w(int i10) {
        k();
        this.f32193s.postDelayed(this.f32173B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f32193s.h(this);
        this.f32193s.j(this);
        this.f32193s.k(this.f32174C);
    }

    public void A() {
        int i10 = this.f32172A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f32200z.cancel();
            }
        }
        this.f32172A = 1;
        ValueAnimator valueAnimator = this.f32200z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f32200z.setDuration(500L);
        this.f32200z.setStartDelay(0L);
        this.f32200z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f32193s.computeVerticalScrollRange();
        int i12 = this.f32192r;
        this.f32194t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f32175a;
        int iComputeHorizontalScrollRange = this.f32193s.computeHorizontalScrollRange();
        int i13 = this.f32191q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f32175a;
        this.f32195u = z10;
        boolean z11 = this.f32194t;
        if (!z11 && !z10) {
            if (this.f32196v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f32186l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f32185k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f32195u) {
            float f11 = i13;
            this.f32189o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f32188n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f32196v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f32196v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f32197w = 1;
                    this.f32190p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f32197w = 2;
                    this.f32187m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f32196v == 2) {
            this.f32187m = 0.0f;
            this.f32190p = 0.0f;
            y(1);
            this.f32197w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f32196v == 2) {
            A();
            if (this.f32197w == 1) {
                r(motionEvent.getX());
            }
            if (this.f32197w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f32196v;
        if (i10 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f32197w = 1;
                this.f32190p = (int) motionEvent.getX();
            } else if (zU) {
                this.f32197w = 2;
                this.f32187m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f32191q != this.f32193s.getWidth() || this.f32192r != this.f32193s.getHeight()) {
            this.f32191q = this.f32193s.getWidth();
            this.f32192r = this.f32193s.getHeight();
            y(0);
        } else if (this.f32172A != 0) {
            if (this.f32194t) {
                n(canvas);
            }
            if (this.f32195u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f32193s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f32193s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.f32172A;
        if (i11 == 1) {
            this.f32200z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f32172A = 3;
        ValueAnimator valueAnimator = this.f32200z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f32200z.setDuration(i10);
        this.f32200z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 >= this.f32192r - this.f32183i) {
            int i10 = this.f32189o;
            int i11 = this.f32188n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f10, float f11) {
        if (!s() ? f10 >= this.f32191q - this.f32179e : f10 <= this.f32179e / 2) {
            int i10 = this.f32186l;
            int i11 = this.f32185k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f32193s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f32196v != 2) {
            this.f32177c.setState(f32170D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f32196v == 2 && i10 != 2) {
            this.f32177c.setState(f32171E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f32196v = i10;
    }
}
