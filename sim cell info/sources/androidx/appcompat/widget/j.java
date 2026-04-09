package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f991b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static j f992c;

    /* renamed from: a, reason: collision with root package name */
    private m0 f993a;

    static class a implements m0.e {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f994a = {a.e.S, a.e.Q, a.e.f46a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f995b = {a.e.f60o, a.e.B, a.e.f65t, a.e.f61p, a.e.f62q, a.e.f64s, a.e.f63r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f996c = {a.e.P, a.e.R, a.e.f56k, a.e.I, a.e.J, a.e.L, a.e.N, a.e.K, a.e.M, a.e.O};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f997d = {a.e.f68w, a.e.f54i, a.e.f67v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f998e = {a.e.H, a.e.T};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f999f = {a.e.f48c, a.e.f52g, a.e.f49d, a.e.f53h};

        a() {
        }

        private boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i2) {
            int iB = r0.b(context, a.a.f21v);
            return new ColorStateList(new int[][]{r0.f1114b, r0.f1117e, r0.f1115c, r0.f1121i}, new int[]{r0.a(context, a.a.f19t), t.a.b(iB, i2), t.a.b(iB, i2), i2});
        }

        private ColorStateList i(Context context) {
            return h(context, r0.b(context, a.a.f18s));
        }

        private ColorStateList j(Context context) {
            return h(context, r0.b(context, a.a.f19t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = a.a.f23x;
            ColorStateList colorStateListD = r0.d(context, i2);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = r0.f1114b;
                iArr2[0] = r0.a(context, i2);
                iArr[1] = r0.f1118f;
                iArr2[1] = r0.b(context, a.a.f20u);
                iArr[2] = r0.f1121i;
                iArr2[2] = r0.b(context, i2);
            } else {
                iArr[0] = r0.f1114b;
                iArr2[0] = colorStateListD.getColorForState(iArr[0], 0);
                iArr[1] = r0.f1118f;
                iArr2[1] = r0.b(context, a.a.f20u);
                iArr[2] = r0.f1121i;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f991b;
            }
            drawable.setColorFilter(j.e(i2, mode));
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable a(m0 m0Var, Context context, int i2) {
            if (i2 == a.e.f55j) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, a.e.f54i), m0Var.j(context, a.e.f56k)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList b(Context context, int i2) {
            if (i2 == a.e.f58m) {
                return c.a.c(context, a.c.f30d);
            }
            if (i2 == a.e.G) {
                return c.a.c(context, a.c.f33g);
            }
            if (i2 == a.e.F) {
                return k(context);
            }
            if (i2 == a.e.f51f) {
                return j(context);
            }
            if (i2 == a.e.f47b) {
                return g(context);
            }
            if (i2 == a.e.f50e) {
                return i(context);
            }
            if (i2 == a.e.D || i2 == a.e.E) {
                return c.a.c(context, a.c.f32f);
            }
            if (f(this.f995b, i2)) {
                return r0.d(context, a.a.f22w);
            }
            if (f(this.f998e, i2)) {
                return c.a.c(context, a.c.f29c);
            }
            if (f(this.f999f, i2)) {
                return c.a.c(context, a.c.f28b);
            }
            if (i2 == a.e.A) {
                return c.a.c(context, a.c.f31e);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f994a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = a.a.f22w
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f996c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = a.a.f20u
                goto L14
            L22:
                int[] r1 = r6.f997d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = a.e.f66u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = a.e.f57l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.r0.b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean d(Context context, int i2, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iB;
            if (i2 == a.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = a.a.f22w;
                l(drawableFindDrawableByLayerId2, r0.b(context, i3), j.f991b);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), r0.b(context, i3), j.f991b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iB = r0.b(context, a.a.f20u);
            } else {
                if (i2 != a.e.f70y && i2 != a.e.f69x && i2 != a.e.f71z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(R.id.background), r0.a(context, a.a.f22w), j.f991b);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i4 = a.a.f20u;
                l(drawableFindDrawableByLayerId3, r0.b(context, i4), j.f991b);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iB = r0.b(context, i4);
            }
            l(drawableFindDrawableByLayerId, iB, j.f991b);
            return true;
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode e(int i2) {
            if (i2 == a.e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized j b() {
        if (f992c == null) {
            h();
        }
        return f992c;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        return m0.l(i2, mode);
    }

    public static synchronized void h() {
        if (f992c == null) {
            j jVar = new j();
            f992c = jVar;
            jVar.f993a = m0.h();
            f992c.f993a.u(new a());
        }
    }

    static void i(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.w(drawable, u0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.f993a.j(context, i2);
    }

    synchronized Drawable d(Context context, int i2, boolean z2) {
        return this.f993a.k(context, i2, z2);
    }

    synchronized ColorStateList f(Context context, int i2) {
        return this.f993a.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.f993a.s(context);
    }
}
