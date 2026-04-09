package h7;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10038a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f10039b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f10040c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10041d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10042e;

    /* renamed from: f, reason: collision with root package name */
    public View f10043f;

    /* renamed from: g, reason: collision with root package name */
    public final h1 f10044g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10045h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f10046i;
    public final DecelerateInterpolator j;
    public PointF k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f10047l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10048m;

    /* renamed from: n, reason: collision with root package name */
    public float f10049n;

    /* renamed from: o, reason: collision with root package name */
    public int f10050o;

    /* renamed from: p, reason: collision with root package name */
    public int f10051p;

    public e0(Context context) {
        h1 h1Var = new h1();
        h1Var.f10082d = -1;
        h1Var.f10084f = false;
        h1Var.f10085g = 0;
        h1Var.f10079a = 0;
        h1Var.f10080b = 0;
        h1Var.f10081c = Integer.MIN_VALUE;
        h1Var.f10083e = null;
        this.f10044g = h1Var;
        this.f10046i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f10048m = false;
        this.f10050o = 0;
        this.f10051p = 0;
        this.f10047l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int b(View view, int i10) {
        y0 y0Var = this.f10040c;
        if (y0Var == null || !y0Var.d()) {
            return 0;
        }
        z0 z0Var = (z0) view.getLayoutParams();
        return a((view.getLeft() - ((z0) view.getLayoutParams()).f10293b.left) - ((ViewGroup.MarginLayoutParams) z0Var).leftMargin, view.getRight() + ((z0) view.getLayoutParams()).f10293b.right + ((ViewGroup.MarginLayoutParams) z0Var).rightMargin, y0Var.E(), y0Var.f10284n - y0Var.F(), i10);
    }

    public int c(View view, int i10) {
        y0 y0Var = this.f10040c;
        if (y0Var == null || !y0Var.e()) {
            return 0;
        }
        z0 z0Var = (z0) view.getLayoutParams();
        return a((view.getTop() - ((z0) view.getLayoutParams()).f10293b.top) - ((ViewGroup.MarginLayoutParams) z0Var).topMargin, view.getBottom() + ((z0) view.getLayoutParams()).f10293b.bottom + ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin, y0Var.G(), y0Var.f10285o - y0Var.D(), i10);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f10048m) {
            this.f10049n = d(this.f10047l);
            this.f10048m = true;
        }
        return (int) Math.ceil(fAbs * this.f10049n);
    }

    public PointF f(int i10) {
        Object obj = this.f10040c;
        if (obj instanceof i1) {
            return ((i1) obj).a(i10);
        }
        io.sentry.android.core.e0.p("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + i1.class.getCanonicalName());
        return null;
    }

    public int g() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.e0.h(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(android.view.View r7, h7.h1 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.k
            r1 = 1
            if (r0 == 0) goto L13
            float r0 = r0.x
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            if (r0 <= 0) goto L11
            r0 = r1
            goto L14
        L11:
            r0 = -1
            goto L14
        L13:
            r0 = 0
        L14:
            int r0 = r6.b(r7, r0)
            int r2 = r6.g()
            int r7 = r6.c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L4b
            int r0 = -r0
            int r7 = -r7
            r8.f10079a = r0
            r8.f10080b = r7
            r8.f10081c = r2
            android.view.animation.DecelerateInterpolator r7 = r6.j
            r8.f10083e = r7
            r8.f10084f = r1
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.e0.i(android.view.View, h7.h1):void");
    }

    public final void j() {
        if (this.f10042e) {
            this.f10042e = false;
            this.f10051p = 0;
            this.f10050o = 0;
            this.k = null;
            this.f10039b.D0.f10101a = -1;
            this.f10043f = null;
            this.f10038a = -1;
            this.f10041d = false;
            y0 y0Var = this.f10040c;
            if (y0Var.f10277e == this) {
                y0Var.f10277e = null;
            }
            this.f10040c = null;
            this.f10039b = null;
        }
    }
}
