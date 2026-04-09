package androidx.core.widget;

import a0.s;
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

    /* renamed from: s, reason: collision with root package name */
    private static final int f1486s = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    final View f1489d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f1490e;

    /* renamed from: h, reason: collision with root package name */
    private int f1493h;

    /* renamed from: i, reason: collision with root package name */
    private int f1494i;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1498m;

    /* renamed from: n, reason: collision with root package name */
    boolean f1499n;

    /* renamed from: o, reason: collision with root package name */
    boolean f1500o;

    /* renamed from: p, reason: collision with root package name */
    boolean f1501p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1502q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1503r;

    /* renamed from: b, reason: collision with root package name */
    final C0011a f1487b = new C0011a();

    /* renamed from: c, reason: collision with root package name */
    private final Interpolator f1488c = new AccelerateInterpolator();

    /* renamed from: f, reason: collision with root package name */
    private float[] f1491f = {0.0f, 0.0f};

    /* renamed from: g, reason: collision with root package name */
    private float[] f1492g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j, reason: collision with root package name */
    private float[] f1495j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f1496k = {0.0f, 0.0f};

    /* renamed from: l, reason: collision with root package name */
    private float[] f1497l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0011a {

        /* renamed from: a, reason: collision with root package name */
        private int f1504a;

        /* renamed from: b, reason: collision with root package name */
        private int f1505b;

        /* renamed from: c, reason: collision with root package name */
        private float f1506c;

        /* renamed from: d, reason: collision with root package name */
        private float f1507d;

        /* renamed from: j, reason: collision with root package name */
        private float f1513j;

        /* renamed from: k, reason: collision with root package name */
        private int f1514k;

        /* renamed from: e, reason: collision with root package name */
        private long f1508e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f1512i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f1509f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f1510g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f1511h = 0;

        C0011a() {
        }

        private float e(long j2) {
            if (j2 < this.f1508e) {
                return 0.0f;
            }
            long j3 = this.f1512i;
            if (j3 < 0 || j2 < j3) {
                return a.e((j2 - r0) / this.f1504a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f1513j;
            return (1.0f - f2) + (f2 * a.e((j2 - j3) / this.f1514k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f1509f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f1509f;
            this.f1509f = jCurrentAnimationTimeMillis;
            float f2 = j2 * fG;
            this.f1510g = (int) (this.f1506c * f2);
            this.f1511h = (int) (f2 * this.f1507d);
        }

        public int b() {
            return this.f1510g;
        }

        public int c() {
            return this.f1511h;
        }

        public int d() {
            float f2 = this.f1506c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f1507d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f1512i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1512i + ((long) this.f1514k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1514k = a.f((int) (jCurrentAnimationTimeMillis - this.f1508e), 0, this.f1505b);
            this.f1513j = e(jCurrentAnimationTimeMillis);
            this.f1512i = jCurrentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f1505b = i2;
        }

        public void k(int i2) {
            this.f1504a = i2;
        }

        public void l(float f2, float f3) {
            this.f1506c = f2;
            this.f1507d = f3;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1508e = jCurrentAnimationTimeMillis;
            this.f1512i = -1L;
            this.f1509f = jCurrentAnimationTimeMillis;
            this.f1513j = 0.5f;
            this.f1510g = 0;
            this.f1511h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1501p) {
                if (aVar.f1499n) {
                    aVar.f1499n = false;
                    aVar.f1487b.m();
                }
                C0011a c0011a = a.this.f1487b;
                if (c0011a.h() || !a.this.u()) {
                    a.this.f1501p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1500o) {
                    aVar2.f1500o = false;
                    aVar2.c();
                }
                c0011a.a();
                a.this.j(c0011a.b(), c0011a.c());
                s.L(a.this.f1489d, this);
            }
        }
    }

    public a(View view) {
        this.f1489d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1486s);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float fH = h(this.f1491f[i2], f3, this.f1492g[i2], f2);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f1495j[i2];
        float f6 = this.f1496k[i2];
        float f7 = this.f1497l[i2];
        float f8 = f5 * f4;
        return fH > 0.0f ? e(fH * f8, f6, f7) : -e((-fH) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1493h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1501p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fE = e(f2 * f3, 0.0f, f4);
        float fG = g(f3 - f5, fE) - g(f5, fE);
        if (fG < 0.0f) {
            interpolation = -this.f1488c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1488c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f1499n) {
            this.f1501p = false;
        } else {
            this.f1487b.i();
        }
    }

    private void v() {
        int i2;
        if (this.f1490e == null) {
            this.f1490e = new b();
        }
        this.f1501p = true;
        this.f1499n = true;
        if (this.f1498m || (i2 = this.f1494i) <= 0) {
            this.f1490e.run();
        } else {
            s.M(this.f1489d, this.f1490e, i2);
        }
        this.f1498m = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1489d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f1494i = i2;
        return this;
    }

    public a l(int i2) {
        this.f1493h = i2;
        return this;
    }

    public a m(boolean z2) {
        if (this.f1502q && !z2) {
            i();
        }
        this.f1502q = z2;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f1492g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f1497l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
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
            boolean r0 = r5.f1502q
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
            r5.f1500o = r2
            r5.f1498m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1489d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1489d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1487b
            r7.l(r0, r6)
            boolean r6 = r5.f1501p
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f1503r
            if (r6 == 0) goto L61
            boolean r6 = r5.f1501p
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f2, float f3) {
        float[] fArr = this.f1496k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f1487b.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f1487b.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f1491f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f1495j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0011a c0011a = this.f1487b;
        int iF = c0011a.f();
        int iD = c0011a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
