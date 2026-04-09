package androidx.recyclerview.widget;

import a0.s;
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
class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.t C;

    /* renamed from: a, reason: collision with root package name */
    private final int f2150a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2151b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f2152c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f2153d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2154e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2155f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f2156g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f2157h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2158i;

    /* renamed from: j, reason: collision with root package name */
    private final int f2159j;

    /* renamed from: k, reason: collision with root package name */
    int f2160k;

    /* renamed from: l, reason: collision with root package name */
    int f2161l;

    /* renamed from: m, reason: collision with root package name */
    float f2162m;

    /* renamed from: n, reason: collision with root package name */
    int f2163n;

    /* renamed from: o, reason: collision with root package name */
    int f2164o;

    /* renamed from: p, reason: collision with root package name */
    float f2165p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f2168s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f2175z;

    /* renamed from: q, reason: collision with root package name */
    private int f2166q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f2167r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2169t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2170u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f2171v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f2172w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f2173x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f2174y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i2, int i3) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2178a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2178a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2178a) {
                this.f2178a = false;
                return;
            }
            if (((Float) d.this.f2175z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0019d implements ValueAnimator.AnimatorUpdateListener {
        C0019d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f2152c.setAlpha(iFloatValue);
            d.this.f2153d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2175z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f2152c = stateListDrawable;
        this.f2153d = drawable;
        this.f2156g = stateListDrawable2;
        this.f2157h = drawable2;
        this.f2154e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2155f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2158i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2159j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f2150a = i3;
        this.f2151b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0019d());
        j(recyclerView);
    }

    private void C(float f2) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f2));
        if (Math.abs(this.f2161l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f2162m, fMax, iArrP, this.f2168s.computeVerticalScrollRange(), this.f2168s.computeVerticalScrollOffset(), this.f2167r);
        if (iX != 0) {
            this.f2168s.scrollBy(0, iX);
        }
        this.f2162m = fMax;
    }

    private void k() {
        this.f2168s.removeCallbacks(this.B);
    }

    private void l() {
        this.f2168s.S0(this);
        this.f2168s.T0(this);
        this.f2168s.U0(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i2 = this.f2167r;
        int i3 = this.f2158i;
        int i4 = this.f2164o;
        int i5 = this.f2163n;
        this.f2156g.setBounds(0, 0, i5, i3);
        this.f2157h.setBounds(0, 0, this.f2166q, this.f2159j);
        canvas.translate(0.0f, i2 - i3);
        this.f2157h.draw(canvas);
        canvas.translate(i4 - (i5 / 2), 0.0f);
        this.f2156g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i2 = this.f2166q;
        int i3 = this.f2154e;
        int i4 = i2 - i3;
        int i5 = this.f2161l;
        int i6 = this.f2160k;
        int i7 = i5 - (i6 / 2);
        this.f2152c.setBounds(0, 0, i3, i6);
        this.f2153d.setBounds(0, 0, this.f2155f, this.f2167r);
        if (s()) {
            this.f2153d.draw(canvas);
            canvas.translate(this.f2154e, i7);
            canvas.scale(-1.0f, 1.0f);
            this.f2152c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i4 = this.f2154e;
        } else {
            canvas.translate(i4, 0.0f);
            this.f2153d.draw(canvas);
            canvas.translate(0.0f, i7);
            this.f2152c.draw(canvas);
        }
        canvas.translate(-i4, -i7);
    }

    private int[] o() {
        int[] iArr = this.f2174y;
        int i2 = this.f2151b;
        iArr[0] = i2;
        iArr[1] = this.f2166q - i2;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f2173x;
        int i2 = this.f2151b;
        iArr[0] = i2;
        iArr[1] = this.f2167r - i2;
        return iArr;
    }

    private void r(float f2) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f2));
        if (Math.abs(this.f2164o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f2165p, fMax, iArrO, this.f2168s.computeHorizontalScrollRange(), this.f2168s.computeHorizontalScrollOffset(), this.f2166q);
        if (iX != 0) {
            this.f2168s.scrollBy(iX, 0);
        }
        this.f2165p = fMax;
    }

    private boolean s() {
        return s.t(this.f2168s) == 1;
    }

    private void w(int i2) {
        k();
        this.f2168s.postDelayed(this.B, i2);
    }

    private int x(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void z() {
        this.f2168s.g(this);
        this.f2168s.i(this);
        this.f2168s.j(this.C);
    }

    public void A() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.f2175z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f2175z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2175z.setDuration(500L);
        this.f2175z.setStartDelay(0L);
        this.f2175z.start();
    }

    void B(int i2, int i3) {
        int iComputeVerticalScrollRange = this.f2168s.computeVerticalScrollRange();
        int i4 = this.f2167r;
        this.f2169t = iComputeVerticalScrollRange - i4 > 0 && i4 >= this.f2150a;
        int iComputeHorizontalScrollRange = this.f2168s.computeHorizontalScrollRange();
        int i5 = this.f2166q;
        boolean z2 = iComputeHorizontalScrollRange - i5 > 0 && i5 >= this.f2150a;
        this.f2170u = z2;
        boolean z3 = this.f2169t;
        if (!z3 && !z2) {
            if (this.f2171v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i4;
            this.f2161l = (int) ((f2 * (i3 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.f2160k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (this.f2170u) {
            float f3 = i5;
            this.f2164o = (int) ((f3 * (i2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f2163n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = this.f2171v;
        if (i6 == 0 || i6 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.f2171v;
        if (i2 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f2172w = 1;
                this.f2165p = (int) motionEvent.getX();
            } else if (zU) {
                this.f2172w = 2;
                this.f2162m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2171v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f2172w = 1;
                    this.f2165p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f2172w = 2;
                    this.f2162m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2171v == 2) {
            this.f2162m = 0.0f;
            this.f2165p = 0.0f;
            y(1);
            this.f2172w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2171v == 2) {
            A();
            if (this.f2172w == 1) {
                r(motionEvent.getX());
            }
            if (this.f2172w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f2166q != this.f2168s.getWidth() || this.f2167r != this.f2168s.getHeight()) {
            this.f2166q = this.f2168s.getWidth();
            this.f2167r = this.f2168s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f2169t) {
                n(canvas);
            }
            if (this.f2170u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2168s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f2168s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i2) {
        int i3 = this.A;
        if (i3 == 1) {
            this.f2175z.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f2175z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f2175z.setDuration(i2);
        this.f2175z.start();
    }

    boolean t(float f2, float f3) {
        if (f3 >= this.f2167r - this.f2158i) {
            int i2 = this.f2164o;
            int i3 = this.f2163n;
            if (f2 >= i2 - (i3 / 2) && f2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f2, float f3) {
        if (!s() ? f2 >= this.f2166q - this.f2154e : f2 <= this.f2154e / 2) {
            int i2 = this.f2161l;
            int i3 = this.f2160k;
            if (f3 >= i2 - (i3 / 2) && f3 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f2168s.invalidate();
    }

    void y(int i2) {
        int i3;
        if (i2 == 2 && this.f2171v != 2) {
            this.f2152c.setState(D);
            k();
        }
        if (i2 == 0) {
            v();
        } else {
            A();
        }
        if (this.f2171v != 2 || i2 == 2) {
            i3 = i2 == 1 ? 1500 : 1200;
            this.f2171v = i2;
        }
        this.f2152c.setState(E);
        w(i3);
        this.f2171v = i2;
    }
}
