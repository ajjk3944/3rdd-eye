package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f2813r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    public final View f2816c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f2817d;

    /* renamed from: g, reason: collision with root package name */
    public int f2820g;

    /* renamed from: h, reason: collision with root package name */
    public int f2821h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2825l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2826m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2827n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2828o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2829p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2830q;

    /* renamed from: a, reason: collision with root package name */
    public final C0025a f2814a = new C0025a();

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f2815b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    public float[] f2818e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    public float[] f2819f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    public float[] f2822i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    public float[] f2823j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    public float[] f2824k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    public static class C0025a {

        /* renamed from: a, reason: collision with root package name */
        public int f2831a;

        /* renamed from: b, reason: collision with root package name */
        public int f2832b;

        /* renamed from: c, reason: collision with root package name */
        public float f2833c;

        /* renamed from: d, reason: collision with root package name */
        public float f2834d;

        /* renamed from: j, reason: collision with root package name */
        public float f2840j;

        /* renamed from: k, reason: collision with root package name */
        public int f2841k;

        /* renamed from: e, reason: collision with root package name */
        public long f2835e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public long f2839i = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f2836f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f2837g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f2838h = 0;

        public void a() {
            if (this.f2836f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f2836f;
            this.f2836f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f2837g = (int) (this.f2833c * f10);
            this.f2838h = (int) (f10 * this.f2834d);
        }

        public int b() {
            return this.f2837g;
        }

        public int c() {
            return this.f2838h;
        }

        public int d() {
            float f10 = this.f2833c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            if (j10 < this.f2835e) {
                return 0.0f;
            }
            long j11 = this.f2839i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f2831a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2840j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f2841k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f2834d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f2839i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2839i + ((long) this.f2841k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2841k = a.f((int) (jCurrentAnimationTimeMillis - this.f2835e), 0, this.f2832b);
            this.f2840j = e(jCurrentAnimationTimeMillis);
            this.f2839i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f2832b = i10;
        }

        public void k(int i10) {
            this.f2831a = i10;
        }

        public void l(float f10, float f11) {
            this.f2833c = f10;
            this.f2834d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2835e = jCurrentAnimationTimeMillis;
            this.f2839i = -1L;
            this.f2836f = jCurrentAnimationTimeMillis;
            this.f2840j = 0.5f;
            this.f2837g = 0;
            this.f2838h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f2828o) {
                if (aVar.f2826m) {
                    aVar.f2826m = false;
                    aVar.f2814a.m();
                }
                C0025a c0025a = a.this.f2814a;
                if (c0025a.h() || !a.this.u()) {
                    a.this.f2828o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f2827n) {
                    aVar2.f2827n = false;
                    aVar2.c();
                }
                c0025a.a();
                a.this.j(c0025a.b(), c0025a.c());
                ViewCompat.b0(a.this.f2816c, this);
            }
        }
    }

    public a(View view) {
        this.f2816c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2813r);
        r(500);
        q(500);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2816c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f2818e[i10], f11, this.f2819f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f2822i[i10];
        float f14 = this.f2823j[i10];
        float f15 = this.f2824k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2820g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f2828o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f2815b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2815b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f2826m) {
            this.f2828o = false;
        } else {
            this.f2814a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f2821h = i10;
        return this;
    }

    public a l(int i10) {
        this.f2820g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f2829p && !z10) {
            i();
        }
        this.f2829p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f2819f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f2824k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2829p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f2827n = r2
            r5.f2825l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2816c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2816c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2814a
            r7.l(r0, r6)
            boolean r6 = r5.f2828o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f2830q
            if (r6 == 0) goto L61
            boolean r6 = r5.f2828o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f2823j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f2814a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f2814a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f2818e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f2822i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0025a c0025a = this.f2814a;
        int iF = c0025a.f();
        int iD = c0025a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f2817d == null) {
            this.f2817d = new b();
        }
        this.f2828o = true;
        this.f2826m = true;
        if (this.f2825l || (i10 = this.f2821h) <= 0) {
            this.f2817d.run();
        } else {
            ViewCompat.c0(this.f2816c, this.f2817d, i10);
        }
        this.f2825l = true;
    }
}
