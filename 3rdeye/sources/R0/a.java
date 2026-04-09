package R0;

import L0.I;
import L0.S;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import o.C5376D;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f11601r = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public final C0150a f11602b;

    /* renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f11603c;

    /* renamed from: d, reason: collision with root package name */
    public final ListView f11604d;

    /* renamed from: e, reason: collision with root package name */
    public b f11605e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f11606f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f11607g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11608h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f11609j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f11610k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f11611l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11612m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11613n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11614o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11615p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11616q;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: R0.a$a, reason: collision with other inner class name */
    public static class C0150a {

        /* renamed from: a, reason: collision with root package name */
        public int f11617a;

        /* renamed from: b, reason: collision with root package name */
        public int f11618b;

        /* renamed from: c, reason: collision with root package name */
        public float f11619c;

        /* renamed from: d, reason: collision with root package name */
        public float f11620d;

        /* renamed from: e, reason: collision with root package name */
        public long f11621e;

        /* renamed from: f, reason: collision with root package name */
        public long f11622f;

        /* renamed from: g, reason: collision with root package name */
        public long f11623g;

        /* renamed from: h, reason: collision with root package name */
        public float f11624h;
        public int i;

        public final float a(long j4) {
            if (j4 < this.f11621e) {
                return 0.0f;
            }
            long j10 = this.f11623g;
            if (j10 < 0 || j4 < j10) {
                return a.b((j4 - r0) / this.f11617a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f11624h;
            return (a.b((j4 - j10) / this.i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* compiled from: AutoScrollHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f11615p) {
                boolean z10 = aVar.f11613n;
                C0150a c0150a = aVar.f11602b;
                if (z10) {
                    aVar.f11613n = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0150a.f11621e = jCurrentAnimationTimeMillis;
                    c0150a.f11623g = -1L;
                    c0150a.f11622f = jCurrentAnimationTimeMillis;
                    c0150a.f11624h = 0.5f;
                }
                if ((c0150a.f11623g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0150a.f11623g + c0150a.i) || !aVar.e()) {
                    aVar.f11615p = false;
                    return;
                }
                boolean z11 = aVar.f11614o;
                ListView listView = aVar.f11604d;
                if (z11) {
                    aVar.f11614o = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0150a.f11622f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c0150a.a(jCurrentAnimationTimeMillis2);
                long j4 = jCurrentAnimationTimeMillis2 - c0150a.f11622f;
                c0150a.f11622f = jCurrentAnimationTimeMillis2;
                ((f) aVar).f11626s.scrollListBy((int) (j4 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c0150a.f11620d));
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                listView.postOnAnimation(this);
            }
        }
    }

    public a(ListView listView) {
        C0150a c0150a = new C0150a();
        c0150a.f11621e = Long.MIN_VALUE;
        c0150a.f11623g = -1L;
        c0150a.f11622f = 0L;
        this.f11602b = c0150a;
        this.f11603c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f11606f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f11607g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f11609j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f11610k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f11611l = fArr5;
        this.f11604d = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f11608h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.i = f11601r;
        c0150a.f11617a = 500;
        c0150a.f11618b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f11606f
            r0 = r0[r7]
            float[] r1 = r3.f11607g
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f11603c
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f11609j
            r0 = r0[r7]
            float[] r1 = r3.f11610k
            r1 = r1[r7]
            float[] r2 = r3.f11611l
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i = this.f11608h;
            if (i == 0 || i == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f11615p && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f11613n) {
            this.f11615p = false;
            return;
        }
        C0150a c0150a = this.f11602b;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (jCurrentAnimationTimeMillis - c0150a.f11621e);
        int i11 = c0150a.f11618b;
        if (i10 > i11) {
            i = i11;
        } else if (i10 >= 0) {
            i = i10;
        }
        c0150a.i = i;
        c0150a.f11624h = c0150a.a(jCurrentAnimationTimeMillis);
        c0150a.f11623g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C5376D c5376d;
        int count;
        C0150a c0150a = this.f11602b;
        float f10 = c0150a.f11620d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(c0150a.f11619c);
        if (iAbs != 0 && (count = (c5376d = ((f) this).f11626s).getCount()) != 0) {
            int childCount = c5376d.getChildCount();
            int firstVisiblePosition = c5376d.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c5376d.getChildAt(0).getTop() >= 0)) : !(i >= count && c5376d.getChildAt(childCount - 1).getBottom() <= c5376d.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f11616q
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.f11614o = r2
            r7.f11612m = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f11604d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            R0.a$a r9 = r7.f11602b
            r9.f11619c = r0
            r9.f11620d = r8
            boolean r8 = r7.f11615p
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            R0.a$b r8 = r7.f11605e
            if (r8 != 0) goto L60
            R0.a$b r8 = new R0.a$b
            r8.<init>()
            r7.f11605e = r8
        L60:
            r7.f11615p = r2
            r7.f11613n = r2
            boolean r8 = r7.f11612m
            if (r8 != 0) goto L75
            int r8 = r7.i
            if (r8 <= 0) goto L75
            R0.a$b r9 = r7.f11605e
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, L0.S> r8 = L0.I.f3792a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            R0.a$b r8 = r7.f11605e
            r8.run()
        L7a:
            r7.f11612m = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
