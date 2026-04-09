package j4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import b5.o;
import p.p1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f27372r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f27373a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f27374b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f27375c;

    /* renamed from: d, reason: collision with root package name */
    public o f27376d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f27377e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f27378f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27379h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f27380i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f27381k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27382l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27383m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27384n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27385o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27386p;

    /* renamed from: q, reason: collision with root package name */
    public final p1 f27387q;

    public d(p1 p1Var) {
        a aVar = new a();
        aVar.f27368e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f27369f = 0L;
        this.f27373a = aVar;
        this.f27374b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f27377e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f27378f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f27380i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f27381k = fArr5;
        this.f27375c = p1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f27379h = f27372r;
        aVar.f27364a = 500;
        aVar.f27365b = 500;
        this.f27387q = p1Var;
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
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f27377e
            r0 = r0[r4]
            float[] r1 = r3.f27378f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f27374b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f27380i
            r0 = r0[r4]
            float[] r1 = r3.j
            r1 = r1[r4]
            float[] r2 = r3.f27381k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i4 = this.g;
            if (i4 == 0 || i4 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f27385o && i4 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i4 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i4 = 0;
        if (this.f27383m) {
            this.f27385o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f27373a;
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.f27368e);
        int i11 = aVar.f27365b;
        if (i10 > i11) {
            i4 = i11;
        } else if (i10 >= 0) {
            i4 = i10;
        }
        aVar.f27371i = i4;
        aVar.f27370h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        p1 p1Var;
        int count;
        a aVar = this.f27373a;
        float f10 = aVar.f27367d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f27366c);
        if (iAbs != 0 && (count = (p1Var = this.f27387q).getCount()) != 0) {
            int childCount = p1Var.getChildCount();
            int firstVisiblePosition = p1Var.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && p1Var.getChildAt(0).getTop() >= 0)) : !(i4 >= count && p1Var.getChildAt(childCount - 1).getBottom() <= p1Var.getHeight())) {
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
            boolean r0 = r7.f27386p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f27384n = r2
            r7.f27382l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p.p1 r4 = r7.f27375c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            j4.a r9 = r7.f27373a
            r9.f27366c = r0
            r9.f27367d = r8
            boolean r8 = r7.f27385o
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            b5.o r8 = r7.f27376d
            if (r8 != 0) goto L62
            b5.o r8 = new b5.o
            r9 = 22
            r8.<init>(r9, r7)
            r7.f27376d = r8
        L62:
            r7.f27385o = r2
            r7.f27383m = r2
            boolean r8 = r7.f27382l
            if (r8 != 0) goto L77
            int r8 = r7.f27379h
            if (r8 <= 0) goto L77
            b5.o r9 = r7.f27376d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = e4.v0.f22405a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            b5.o r8 = r7.f27376d
            r8.run()
        L7c:
            r7.f27382l = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
