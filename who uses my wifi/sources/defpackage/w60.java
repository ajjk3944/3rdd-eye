package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class w60 {
    public int a = -1;
    public RecyclerView b;
    public ho0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final ro0 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public w60(Context context) {
        ro0 ro0Var = new ro0();
        ro0Var.d = -1;
        ro0Var.f = false;
        ro0Var.g = 0;
        ro0Var.a = 0;
        ro0Var.b = 0;
        ro0Var.c = Integer.MIN_VALUE;
        ro0Var.e = null;
        this.g = ro0Var;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        ho0 ho0Var = this.c;
        if (ho0Var == null || !ho0Var.d()) {
            return 0;
        }
        io0 io0Var = (io0) view.getLayoutParams();
        return a((view.getLeft() - ((io0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) io0Var).leftMargin, view.getRight() + ((io0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) io0Var).rightMargin, ho0Var.E(), ho0Var.n - ho0Var.F(), i);
    }

    public int c(View view, int i) {
        ho0 ho0Var = this.c;
        if (ho0Var == null || !ho0Var.e()) {
            return 0;
        }
        io0 io0Var = (io0) view.getLayoutParams();
        return a((view.getTop() - ((io0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) io0Var).topMargin, view.getBottom() + ((io0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) io0Var).bottomMargin, ho0Var.G(), ho0Var.o - ho0Var.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil(fAbs * this.m);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof so0) {
            return ((so0) obj).a(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w60.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r7, defpackage.ro0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.j
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.j
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.a = r0
            r8.b = r7
            r8.c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.i
            r8.e = r7
            r8.f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w60.h(android.view.View, ro0):void");
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.b.k0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            ho0 ho0Var = this.c;
            if (ho0Var.e == this) {
                ho0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
