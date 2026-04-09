package androidx.recyclerview.widget;

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
public class d extends RecyclerView.m implements RecyclerView.r {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.s C;

    /* renamed from: a, reason: collision with root package name */
    public final int f3936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3937b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3938c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f3939d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3940e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3941f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3942g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f3943h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3944i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3945j;

    /* renamed from: k, reason: collision with root package name */
    public int f3946k;

    /* renamed from: l, reason: collision with root package name */
    public int f3947l;

    /* renamed from: m, reason: collision with root package name */
    public float f3948m;

    /* renamed from: n, reason: collision with root package name */
    public int f3949n;

    /* renamed from: o, reason: collision with root package name */
    public int f3950o;

    /* renamed from: p, reason: collision with root package name */
    public float f3951p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f3954s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3961z;

    /* renamed from: q, reason: collision with root package name */
    public int f3952q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3953r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3955t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3956u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f3957v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3958w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3959x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f3960y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.k(500);
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            d.this.v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3964a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3964a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3964a) {
                this.f3964a = false;
                return;
            }
            if (((Float) d.this.f3961z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.s(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.p();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    public class C0040d implements ValueAnimator.AnimatorUpdateListener {
        public C0040d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3938c.setAlpha(iFloatValue);
            d.this.f3939d.setAlpha(iFloatValue);
            d.this.p();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3961z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3938c = stateListDrawable;
        this.f3939d = drawable;
        this.f3942g = stateListDrawable2;
        this.f3943h = drawable2;
        this.f3940e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3941f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3944i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3945j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3936a = i11;
        this.f3937b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0040d());
        d(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3957v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zO = o(motionEvent.getX(), motionEvent.getY());
            boolean zN = n(motionEvent.getX(), motionEvent.getY());
            if (zO || zN) {
                if (zN) {
                    this.f3958w = 1;
                    this.f3951p = (int) motionEvent.getX();
                } else if (zO) {
                    this.f3958w = 2;
                    this.f3948m = (int) motionEvent.getY();
                }
                s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3957v == 2) {
            this.f3948m = 0.0f;
            this.f3951p = 0.0f;
            s(1);
            this.f3958w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3957v == 2) {
            u();
            if (this.f3958w == 1) {
                l(motionEvent.getX());
            }
            if (this.f3958w == 2) {
                w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3957v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zO = o(motionEvent.getX(), motionEvent.getY());
        boolean zN = n(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zO && !zN)) {
            return false;
        }
        if (zN) {
            this.f3958w = 1;
            this.f3951p = (int) motionEvent.getX();
        } else if (zO) {
            this.f3958w = 2;
            this.f3948m = (int) motionEvent.getY();
        }
        s(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z10) {
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3954s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f3954s = recyclerView;
        if (recyclerView != null) {
            t();
        }
    }

    public final void e() {
        this.f3954s.removeCallbacks(this.B);
    }

    public final void f() {
        this.f3954s.k1(this);
        this.f3954s.m1(this);
        this.f3954s.n1(this.C);
        e();
    }

    public final void g(Canvas canvas) {
        int i10 = this.f3953r;
        int i11 = this.f3944i;
        int i12 = this.f3950o;
        int i13 = this.f3949n;
        this.f3942g.setBounds(0, 0, i13, i11);
        this.f3943h.setBounds(0, 0, this.f3952q, this.f3945j);
        canvas.translate(0.0f, i10 - i11);
        this.f3943h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f3942g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void h(Canvas canvas) {
        int i10 = this.f3952q;
        int i11 = this.f3940e;
        int i12 = i10 - i11;
        int i13 = this.f3947l;
        int i14 = this.f3946k;
        int i15 = i13 - (i14 / 2);
        this.f3938c.setBounds(0, 0, i11, i14);
        this.f3939d.setBounds(0, 0, this.f3941f, this.f3953r);
        if (!m()) {
            canvas.translate(i12, 0.0f);
            this.f3939d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3938c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f3939d.draw(canvas);
        canvas.translate(this.f3940e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f3938c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f3940e, -i15);
    }

    public final int[] i() {
        int[] iArr = this.f3960y;
        int i10 = this.f3937b;
        iArr[0] = i10;
        iArr[1] = this.f3952q - i10;
        return iArr;
    }

    public final int[] j() {
        int[] iArr = this.f3959x;
        int i10 = this.f3937b;
        iArr[0] = i10;
        iArr[1] = this.f3953r - i10;
        return iArr;
    }

    public void k(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3961z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3961z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3961z.setDuration(i10);
        this.f3961z.start();
    }

    public final void l(float f10) {
        int[] iArrI = i();
        float fMax = Math.max(iArrI[0], Math.min(iArrI[1], f10));
        if (Math.abs(this.f3950o - fMax) < 2.0f) {
            return;
        }
        int iR = r(this.f3951p, fMax, iArrI, this.f3954s.computeHorizontalScrollRange(), this.f3954s.computeHorizontalScrollOffset(), this.f3952q);
        if (iR != 0) {
            this.f3954s.scrollBy(iR, 0);
        }
        this.f3951p = fMax;
    }

    public final boolean m() {
        return this.f3954s.getLayoutDirection() == 1;
    }

    public boolean n(float f10, float f11) {
        if (f11 < this.f3953r - this.f3944i) {
            return false;
        }
        int i10 = this.f3950o;
        int i11 = this.f3949n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    public boolean o(float f10, float f11) {
        if (m()) {
            if (f10 > this.f3940e) {
                return false;
            }
        } else if (f10 < this.f3952q - this.f3940e) {
            return false;
        }
        int i10 = this.f3947l;
        int i11 = this.f3946k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.f3952q != this.f3954s.getWidth() || this.f3953r != this.f3954s.getHeight()) {
            this.f3952q = this.f3954s.getWidth();
            this.f3953r = this.f3954s.getHeight();
            s(0);
        } else if (this.A != 0) {
            if (this.f3955t) {
                h(canvas);
            }
            if (this.f3956u) {
                g(canvas);
            }
        }
    }

    public void p() {
        this.f3954s.invalidate();
    }

    public final void q(int i10) {
        e();
        this.f3954s.postDelayed(this.B, i10);
    }

    public final int r(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
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

    public void s(int i10) {
        if (i10 == 2 && this.f3957v != 2) {
            this.f3938c.setState(D);
            e();
        }
        if (i10 == 0) {
            p();
        } else {
            u();
        }
        if (this.f3957v == 2 && i10 != 2) {
            this.f3938c.setState(E);
            q(1200);
        } else if (i10 == 1) {
            q(1500);
        }
        this.f3957v = i10;
    }

    public final void t() {
        this.f3954s.j(this);
        this.f3954s.m(this);
        this.f3954s.n(this.C);
    }

    public void u() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f3961z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3961z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3961z.setDuration(500L);
        this.f3961z.setStartDelay(0L);
        this.f3961z.start();
    }

    public void v(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f3954s.computeVerticalScrollRange();
        int i12 = this.f3953r;
        this.f3955t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f3936a;
        int iComputeHorizontalScrollRange = this.f3954s.computeHorizontalScrollRange();
        int i13 = this.f3952q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f3936a;
        this.f3956u = z10;
        boolean z11 = this.f3955t;
        if (!z11 && !z10) {
            if (this.f3957v != 0) {
                s(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f3947l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3946k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f3956u) {
            float f11 = i13;
            this.f3950o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3949n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f3957v;
        if (i14 == 0 || i14 == 1) {
            s(1);
        }
    }

    public final void w(float f10) {
        int[] iArrJ = j();
        float fMax = Math.max(iArrJ[0], Math.min(iArrJ[1], f10));
        if (Math.abs(this.f3947l - fMax) < 2.0f) {
            return;
        }
        int iR = r(this.f3948m, fMax, iArrJ, this.f3954s.computeVerticalScrollRange(), this.f3954s.computeVerticalScrollOffset(), this.f3953r);
        if (iR != 0) {
            this.f3954s.scrollBy(0, iR);
        }
        this.f3948m = fMax;
    }
}
