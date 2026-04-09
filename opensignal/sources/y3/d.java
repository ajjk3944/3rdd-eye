package y3;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import p.i1;
import pb.l0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int N = ViewConfiguration.getTapTimeout();
    public final int B;
    public final int D;
    public final float[] E;
    public final float[] F;
    public final float[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final i1 M;

    /* renamed from: a, reason: collision with root package name */
    public final a f25827a;

    /* renamed from: d, reason: collision with root package name */
    public final AccelerateInterpolator f25828d;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f25829g;

    /* renamed from: r, reason: collision with root package name */
    public l0 f25830r;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f25831x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f25832y;

    public d(i1 i1Var) {
        a aVar = new a();
        aVar.f25822e = Long.MIN_VALUE;
        aVar.f25824g = -1L;
        aVar.f25823f = 0L;
        this.f25827a = aVar;
        this.f25828d = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f25831x = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f25832y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.E = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.F = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.G = fArr5;
        this.f25829g = i1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.B = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.D = N;
        aVar.f25818a = 500;
        aVar.f25819b = 500;
        this.M = i1Var;
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
            float[] r0 = r3.f25831x
            r0 = r0[r7]
            float[] r1 = r3.f25832y
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f25828d
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
            float[] r0 = r3.E
            r0 = r0[r7]
            float[] r1 = r3.F
            r1 = r1[r7]
            float[] r2 = r3.G
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
        throw new UnsupportedOperationException("Method not decompiled: y3.d.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i10 = this.B;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.K && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.I) {
            this.K = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f25827a;
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f25822e);
        int i12 = aVar.f25819b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f25826i = i10;
        aVar.f25825h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f25824g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        i1 i1Var;
        int count;
        a aVar = this.f25827a;
        float f10 = aVar.f25821d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f25820c);
        if (iAbs != 0 && (count = (i1Var = this.M).getCount()) != 0) {
            int childCount = i1Var.getChildCount();
            int firstVisiblePosition = i1Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && i1Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && i1Var.getChildAt(childCount - 1).getBottom() <= i1Var.getHeight())) {
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
            boolean r0 = r7.L
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
            r7.J = r2
            r7.H = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p.i1 r4 = r7.f25829g
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            y3.a r9 = r7.f25827a
            r9.f25820c = r0
            r9.f25821d = r8
            boolean r8 = r7.K
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            pb.l0 r8 = r7.f25830r
            if (r8 != 0) goto L62
            pb.l0 r8 = new pb.l0
            r9 = 9
            r8.<init>(r9, r7)
            r7.f25830r = r8
        L62:
            r7.K = r2
            r7.I = r2
            boolean r8 = r7.H
            if (r8 != 0) goto L77
            int r8 = r7.D
            if (r8 <= 0) goto L77
            pb.l0 r9 = r7.f25830r
            long r5 = (long) r8
            java.util.WeakHashMap r8 = u3.i0.f23177a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            pb.l0 r8 = r7.f25830r
            r8.run()
        L7c:
            r7.H = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
