package androidx.core.widget;

import F1.W;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    private static final int f30726r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f30729c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f30730d;

    /* renamed from: g, reason: collision with root package name */
    private int f30733g;

    /* renamed from: h, reason: collision with root package name */
    private int f30734h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30738l;

    /* renamed from: m, reason: collision with root package name */
    boolean f30739m;

    /* renamed from: n, reason: collision with root package name */
    boolean f30740n;

    /* renamed from: o, reason: collision with root package name */
    boolean f30741o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30742p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30743q;

    /* renamed from: a, reason: collision with root package name */
    final C1094a f30727a = new C1094a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f30728b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f30731e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f30732f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f30735i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f30736j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f30737k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C1094a {

        /* renamed from: a, reason: collision with root package name */
        private int f30744a;

        /* renamed from: b, reason: collision with root package name */
        private int f30745b;

        /* renamed from: c, reason: collision with root package name */
        private float f30746c;

        /* renamed from: d, reason: collision with root package name */
        private float f30747d;

        /* renamed from: j, reason: collision with root package name */
        private float f30753j;

        /* renamed from: k, reason: collision with root package name */
        private int f30754k;

        /* renamed from: e, reason: collision with root package name */
        private long f30748e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f30752i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f30749f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f30750g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f30751h = 0;

        C1094a() {
        }

        private float e(long j10) {
            if (j10 < this.f30748e) {
                return 0.0f;
            }
            long j11 = this.f30752i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f30744a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f30753j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f30754k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f30749f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f30749f;
            this.f30749f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f30750g = (int) (this.f30746c * f10);
            this.f30751h = (int) (f10 * this.f30747d);
        }

        public int b() {
            return this.f30750g;
        }

        public int c() {
            return this.f30751h;
        }

        public int d() {
            float f10 = this.f30746c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f30747d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f30752i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f30752i + ((long) this.f30754k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f30754k = a.f((int) (jCurrentAnimationTimeMillis - this.f30748e), 0, this.f30745b);
            this.f30753j = e(jCurrentAnimationTimeMillis);
            this.f30752i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f30745b = i10;
        }

        public void k(int i10) {
            this.f30744a = i10;
        }

        public void l(float f10, float f11) {
            this.f30746c = f10;
            this.f30747d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f30748e = jCurrentAnimationTimeMillis;
            this.f30752i = -1L;
            this.f30749f = jCurrentAnimationTimeMillis;
            this.f30753j = 0.5f;
            this.f30750g = 0;
            this.f30751h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f30741o) {
                if (aVar.f30739m) {
                    aVar.f30739m = false;
                    aVar.f30727a.m();
                }
                C1094a c1094a = a.this.f30727a;
                if (c1094a.h() || !a.this.u()) {
                    a.this.f30741o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f30740n) {
                    aVar2.f30740n = false;
                    aVar2.c();
                }
                c1094a.a();
                a.this.j(c1094a.b(), c1094a.c());
                W.e0(a.this.f30729c, this);
            }
        }
    }

    public a(View view) {
        this.f30729c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f30726r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f30731e[i10], f11, this.f30732f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f30735i[i10];
        float f14 = this.f30736j[i10];
        float f15 = this.f30737k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f30733g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f30741o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f30728b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f30728b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f30739m) {
            this.f30741o = false;
        } else {
            this.f30727a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f30730d == null) {
            this.f30730d = new b();
        }
        this.f30741o = true;
        this.f30739m = true;
        if (this.f30738l || (i10 = this.f30734h) <= 0) {
            this.f30730d.run();
        } else {
            W.f0(this.f30729c, this.f30730d, i10);
        }
        this.f30738l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f30729c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f30734h = i10;
        return this;
    }

    public a l(int i10) {
        this.f30733g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f30742p && !z10) {
            i();
        }
        this.f30742p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f30732f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f30737k;
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
            boolean r0 = r5.f30742p
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
            r5.f30740n = r2
            r5.f30738l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f30729c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f30729c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f30727a
            r7.l(r0, r6)
            boolean r6 = r5.f30741o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f30743q
            if (r6 == 0) goto L61
            boolean r6 = r5.f30741o
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f30736j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f30727a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f30727a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f30731e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f30735i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C1094a c1094a = this.f30727a;
        int iF = c1094a.f();
        int iD = c1094a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
