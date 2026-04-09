package U;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import o.C2732p0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: F, reason: collision with root package name */
    public static final int f3641F = ViewConfiguration.getTapTimeout();

    /* renamed from: C, reason: collision with root package name */
    public boolean f3642C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3643D;

    /* renamed from: E, reason: collision with root package name */
    public final C2732p0 f3644E;

    /* renamed from: a, reason: collision with root package name */
    public final a f3645a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f3646b;

    /* renamed from: c, reason: collision with root package name */
    public final C2732p0 f3647c;

    /* renamed from: d, reason: collision with root package name */
    public C0.k f3648d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f3649e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f3650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3651g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3652h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f3653j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f3654k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3655l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3656m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3657n;

    public d(C2732p0 c2732p0) {
        a aVar = new a();
        aVar.f3637e = Long.MIN_VALUE;
        aVar.f3639g = -1L;
        aVar.f3638f = 0L;
        this.f3645a = aVar;
        this.f3646b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3649e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3650f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3653j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3654k = fArr5;
        this.f3647c = c2732p0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f3651g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3652h = f3641F;
        aVar.f3633a = 500;
        aVar.f3634b = 500;
        this.f3644E = c2732p0;
    }

    public static float b(float f2, float f5, float f6) {
        return f2 > f6 ? f6 : f2 < f5 ? f5 : f2;
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
            float[] r0 = r3.f3649e
            r0 = r0[r7]
            float[] r1 = r3.f3650f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f3646b
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
            float[] r0 = r3.i
            r0 = r0[r7]
            float[] r1 = r3.f3653j
            r1 = r1[r7]
            float[] r2 = r3.f3654k
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
        throw new UnsupportedOperationException("Method not decompiled: U.d.a(float, float, float, int):float");
    }

    public final float c(float f2, float f5) {
        if (f5 != 0.0f) {
            int i = this.f3651g;
            if (i == 0 || i == 1) {
                if (f2 < f5) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f5);
                    }
                    if (this.f3642C && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f2 < 0.0f) {
                return f2 / (-f5);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f3656m) {
            this.f3642C = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f3645a;
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f3637e);
        int i6 = aVar.f3634b;
        if (i3 > i6) {
            i = i6;
        } else if (i3 >= 0) {
            i = i3;
        }
        aVar.i = i;
        aVar.f3640h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f3639g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C2732p0 c2732p0;
        int count;
        a aVar = this.f3645a;
        float f2 = aVar.f3636d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f3635c);
        if (iAbs != 0 && (count = (c2732p0 = this.f3644E).getCount()) != 0) {
            int childCount = c2732p0.getChildCount();
            int firstVisiblePosition = c2732p0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c2732p0.getChildAt(0).getTop() >= 0)) : !(i >= count && c2732p0.getChildAt(childCount - 1).getBottom() <= c2732p0.getHeight())) {
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
            boolean r0 = r7.f3643D
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.f3657n = r2
            r7.f3655l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            o.p0 r4 = r7.f3647c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            U.a r9 = r7.f3645a
            r9.f3635c = r0
            r9.f3636d = r8
            boolean r8 = r7.f3642C
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            C0.k r8 = r7.f3648d
            if (r8 != 0) goto L61
            C0.k r8 = new C0.k
            r9 = 7
            r8.<init>(r9, r7)
            r7.f3648d = r8
        L61:
            r7.f3642C = r2
            r7.f3656m = r2
            boolean r8 = r7.f3655l
            if (r8 != 0) goto L76
            int r8 = r7.f3652h
            if (r8 <= 0) goto L76
            C0.k r9 = r7.f3648d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = R.O.f3270a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            C0.k r8 = r7.f3648d
            r8.run()
        L7b:
            r7.f3655l = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
