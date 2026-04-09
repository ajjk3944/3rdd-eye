package d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* loaded from: classes.dex */
class b extends Drawable implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    private c f2476b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f2477c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f2478d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f2479e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2481g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2484j;

    /* renamed from: k, reason: collision with root package name */
    private Runnable f2485k;

    /* renamed from: l, reason: collision with root package name */
    private long f2486l;

    /* renamed from: m, reason: collision with root package name */
    private long f2487m;

    /* renamed from: n, reason: collision with root package name */
    private C0027b f2488n;

    /* renamed from: f, reason: collision with root package name */
    private int f2480f = 255;

    /* renamed from: h, reason: collision with root package name */
    private int f2482h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f2483i = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    static class C0027b implements Drawable.Callback {

        /* renamed from: b, reason: collision with root package name */
        private Drawable.Callback f2490b;

        C0027b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f2490b;
            this.f2490b = null;
            return callback;
        }

        public C0027b b(Drawable.Callback callback) {
            this.f2490b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f2490b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2490b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f2491a;

        /* renamed from: b, reason: collision with root package name */
        Resources f2492b;

        /* renamed from: c, reason: collision with root package name */
        int f2493c;

        /* renamed from: d, reason: collision with root package name */
        int f2494d;

        /* renamed from: e, reason: collision with root package name */
        int f2495e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f2496f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f2497g;

        /* renamed from: h, reason: collision with root package name */
        int f2498h;

        /* renamed from: i, reason: collision with root package name */
        boolean f2499i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2500j;

        /* renamed from: k, reason: collision with root package name */
        Rect f2501k;

        /* renamed from: l, reason: collision with root package name */
        boolean f2502l;

        /* renamed from: m, reason: collision with root package name */
        boolean f2503m;

        /* renamed from: n, reason: collision with root package name */
        int f2504n;

        /* renamed from: o, reason: collision with root package name */
        int f2505o;

        /* renamed from: p, reason: collision with root package name */
        int f2506p;

        /* renamed from: q, reason: collision with root package name */
        int f2507q;

        /* renamed from: r, reason: collision with root package name */
        boolean f2508r;

        /* renamed from: s, reason: collision with root package name */
        int f2509s;

        /* renamed from: t, reason: collision with root package name */
        boolean f2510t;

        /* renamed from: u, reason: collision with root package name */
        boolean f2511u;

        /* renamed from: v, reason: collision with root package name */
        boolean f2512v;

        /* renamed from: w, reason: collision with root package name */
        boolean f2513w;

        /* renamed from: x, reason: collision with root package name */
        boolean f2514x;

        /* renamed from: y, reason: collision with root package name */
        boolean f2515y;

        /* renamed from: z, reason: collision with root package name */
        int f2516z;

        c(c cVar, b bVar, Resources resources) {
            this.f2493c = 160;
            this.f2499i = false;
            this.f2502l = false;
            this.f2514x = true;
            this.A = 0;
            this.B = 0;
            this.f2491a = bVar;
            this.f2492b = resources != null ? resources : cVar != null ? cVar.f2492b : null;
            int iF = b.f(resources, cVar != null ? cVar.f2493c : 0);
            this.f2493c = iF;
            if (cVar == null) {
                this.f2497g = new Drawable[10];
                this.f2498h = 0;
                return;
            }
            this.f2494d = cVar.f2494d;
            this.f2495e = cVar.f2495e;
            this.f2512v = true;
            this.f2513w = true;
            this.f2499i = cVar.f2499i;
            this.f2502l = cVar.f2502l;
            this.f2514x = cVar.f2514x;
            this.f2515y = cVar.f2515y;
            this.f2516z = cVar.f2516z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f2493c == iF) {
                if (cVar.f2500j) {
                    this.f2501k = new Rect(cVar.f2501k);
                    this.f2500j = true;
                }
                if (cVar.f2503m) {
                    this.f2504n = cVar.f2504n;
                    this.f2505o = cVar.f2505o;
                    this.f2506p = cVar.f2506p;
                    this.f2507q = cVar.f2507q;
                    this.f2503m = true;
                }
            }
            if (cVar.f2508r) {
                this.f2509s = cVar.f2509s;
                this.f2508r = true;
            }
            if (cVar.f2510t) {
                this.f2511u = cVar.f2511u;
                this.f2510t = true;
            }
            Drawable[] drawableArr = cVar.f2497g;
            this.f2497g = new Drawable[drawableArr.length];
            this.f2498h = cVar.f2498h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f2496f;
            this.f2496f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2498h);
            int i2 = this.f2498h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                    if (constantState != null) {
                        this.f2496f.put(i3, constantState);
                    } else {
                        this.f2497g[i3] = drawableArr[i3];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2496f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2497g[this.f2496f.keyAt(i2)] = s(this.f2496f.valueAt(i2).newDrawable(this.f2492b));
                }
                this.f2496f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f2516z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f2491a);
            return drawableMutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f2498h;
            if (i2 >= this.f2497g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2491a);
            this.f2497g[i2] = drawable;
            this.f2498h++;
            this.f2495e = drawable.getChangingConfigurations() | this.f2495e;
            p();
            this.f2501k = null;
            this.f2500j = false;
            this.f2503m = false;
            this.f2512v = false;
            return i2;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f2498h;
                Drawable[] drawableArr = this.f2497g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f2495e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f2512v) {
                return this.f2513w;
            }
            e();
            this.f2512v = true;
            int i2 = this.f2498h;
            Drawable[] drawableArr = this.f2497g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f2513w = false;
                    return false;
                }
            }
            this.f2513w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f2498h;
            Drawable[] drawableArr = this.f2497g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2496f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f2503m = true;
            e();
            int i2 = this.f2498h;
            Drawable[] drawableArr = this.f2497g;
            this.f2505o = -1;
            this.f2504n = -1;
            this.f2507q = 0;
            this.f2506p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2504n) {
                    this.f2504n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2505o) {
                    this.f2505o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2506p) {
                    this.f2506p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2507q) {
                    this.f2507q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f2497g.length;
        }

        public final Drawable g(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.f2497g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2496f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableS = s(this.f2496f.valueAt(iIndexOfKey).newDrawable(this.f2492b));
            this.f2497g[i2] = drawableS;
            this.f2496f.removeAt(iIndexOfKey);
            if (this.f2496f.size() == 0) {
                this.f2496f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2494d | this.f2495e;
        }

        public final int h() {
            return this.f2498h;
        }

        public final int i() {
            if (!this.f2503m) {
                d();
            }
            return this.f2505o;
        }

        public final int j() {
            if (!this.f2503m) {
                d();
            }
            return this.f2507q;
        }

        public final int k() {
            if (!this.f2503m) {
                d();
            }
            return this.f2506p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f2499i) {
                return null;
            }
            Rect rect2 = this.f2501k;
            if (rect2 != null || this.f2500j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f2498h;
            Drawable[] drawableArr = this.f2497g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f2500j = true;
            this.f2501k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f2503m) {
                d();
            }
            return this.f2504n;
        }

        public final int n() {
            if (this.f2508r) {
                return this.f2509s;
            }
            e();
            int i2 = this.f2498h;
            Drawable[] drawableArr = this.f2497g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f2509s = opacity;
            this.f2508r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f2497g, 0, drawableArr, 0, i2);
            this.f2497g = drawableArr;
        }

        void p() {
            this.f2508r = false;
            this.f2510t = false;
        }

        public final boolean q() {
            return this.f2502l;
        }

        abstract void r();

        public final void t(boolean z2) {
            this.f2502l = z2;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        final boolean w(int i2, int i3) {
            int i4 = this.f2498h;
            Drawable[] drawableArr = this.f2497g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z2 = layoutDirection;
                    }
                }
            }
            this.f2516z = i2;
            return z2;
        }

        public final void x(boolean z2) {
            this.f2499i = z2;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f2492b = resources;
                int iF = b.f(resources, this.f2493c);
                int i2 = this.f2493c;
                this.f2493c = iF;
                if (i2 != iF) {
                    this.f2503m = false;
                    this.f2500j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.f2488n == null) {
            this.f2488n = new C0027b();
        }
        drawable.setCallback(this.f2488n.b(drawable.getCallback()));
        try {
            if (this.f2476b.A <= 0 && this.f2481g) {
                drawable.setAlpha(this.f2480f);
            }
            c cVar = this.f2476b;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    u.a.n(drawable, cVar.F);
                }
                c cVar2 = this.f2476b;
                if (cVar2.I) {
                    u.a.o(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2476b.f2514x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i2 >= 19) {
                drawable.setAutoMirrored(this.f2476b.C);
            }
            Rect rect = this.f2477c;
            if (i2 >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f2488n.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && u.a.e(this) == 1;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    void a(boolean z2) {
        boolean z3;
        boolean z4 = true;
        this.f2481g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            long j2 = this.f2486l;
            if (j2 == 0) {
                z3 = false;
            } else if (j2 <= jUptimeMillis) {
                drawable.setAlpha(this.f2480f);
                this.f2486l = 0L;
                z3 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f2476b.A)) * this.f2480f) / 255);
                z3 = true;
            }
        } else {
            this.f2486l = 0L;
            z3 = false;
        }
        Drawable drawable2 = this.f2479e;
        if (drawable2 != null) {
            long j3 = this.f2487m;
            if (j3 == 0) {
                z4 = z3;
            } else if (j3 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f2479e = null;
                this.f2483i = -1;
                this.f2487m = 0L;
                z4 = z3;
            } else {
                drawable2.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f2476b.B) * this.f2480f) / 255);
            }
        } else {
            this.f2487m = 0L;
            z4 = z3;
        }
        if (z2 && z4) {
            scheduleSelf(this.f2485k, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f2476b.b(theme);
    }

    c b() {
        throw null;
    }

    int c() {
        return this.f2482h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f2476b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2479e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r9) {
        /*
            r8 = this;
            int r0 = r8.f2482h
            r1 = 0
            if (r9 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            d.b$c r0 = r8.f2476b
            int r0 = r0.B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L35
            android.graphics.drawable.Drawable r0 = r8.f2479e
            if (r0 == 0) goto L1b
            r0.setVisible(r1, r1)
        L1b:
            android.graphics.drawable.Drawable r0 = r8.f2478d
            if (r0 == 0) goto L2e
            r8.f2479e = r0
            int r0 = r8.f2482h
            r8.f2483i = r0
            d.b$c r0 = r8.f2476b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.f2487m = r0
            goto L3c
        L2e:
            r8.f2479e = r5
            r8.f2483i = r4
            r8.f2487m = r6
            goto L3c
        L35:
            android.graphics.drawable.Drawable r0 = r8.f2478d
            if (r0 == 0) goto L3c
            r0.setVisible(r1, r1)
        L3c:
            if (r9 < 0) goto L5c
            d.b$c r0 = r8.f2476b
            int r1 = r0.f2498h
            if (r9 >= r1) goto L5c
            android.graphics.drawable.Drawable r0 = r0.g(r9)
            r8.f2478d = r0
            r8.f2482h = r9
            if (r0 == 0) goto L60
            d.b$c r9 = r8.f2476b
            int r9 = r9.A
            if (r9 <= 0) goto L58
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.f2486l = r2
        L58:
            r8.d(r0)
            goto L60
        L5c:
            r8.f2478d = r5
            r8.f2482h = r4
        L60:
            long r0 = r8.f2486l
            r9 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L6d
            long r0 = r8.f2487m
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L7f
        L6d:
            java.lang.Runnable r0 = r8.f2485k
            if (r0 != 0) goto L79
            d.b$a r0 = new d.b$a
            r0.<init>()
            r8.f2485k = r0
            goto L7c
        L79:
            r8.unscheduleSelf(r0)
        L7c:
            r8.a(r9)
        L7f:
            r8.invalidateSelf()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2480f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2476b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f2476b.c()) {
            return null;
        }
        this.f2476b.f2494d = getChangingConfigurations();
        return this.f2476b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2478d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2477c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f2476b.q()) {
            return this.f2476b.i();
        }
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f2476b.q()) {
            return this.f2476b.m();
        }
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f2476b.q()) {
            return this.f2476b.j();
        }
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f2476b.q()) {
            return this.f2476b.k();
        }
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2478d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2476b.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f2476b.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f2478d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    void h(c cVar) {
        this.f2476b = cVar;
        int i2 = this.f2482h;
        if (i2 >= 0) {
            Drawable drawableG = cVar.g(i2);
            this.f2478d = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f2483i = -1;
        this.f2479e = null;
    }

    final void i(Resources resources) {
        this.f2476b.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f2476b;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable != this.f2478d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2476b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f2479e;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2479e = null;
            this.f2483i = -1;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f2478d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2481g) {
                this.f2478d.setAlpha(this.f2480f);
            }
        }
        if (this.f2487m != 0) {
            this.f2487m = 0L;
            z2 = true;
        }
        if (this.f2486l != 0) {
            this.f2486l = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2484j && super.mutate() == this) {
            c cVarB = b();
            cVarB.r();
            h(cVarB);
            this.f2484j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2479e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2478d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f2476b.w(i2, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f2479e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2478d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2479e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2478d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f2478d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f2481g && this.f2480f == i2) {
            return;
        }
        this.f2481g = true;
        this.f2480f = i2;
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            if (this.f2486l == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        c cVar = this.f2476b;
        if (cVar.C != z2) {
            cVar.C = z2;
            Drawable drawable = this.f2478d;
            if (drawable != null) {
                u.a.i(drawable, z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f2476b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f2478d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        c cVar = this.f2476b;
        if (cVar.f2514x != z2) {
            cVar.f2514x = z2;
            Drawable drawable = this.f2478d;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            u.a.j(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2477c;
        if (rect == null) {
            this.f2477c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2478d;
        if (drawable != null) {
            u.a.k(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f2476b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            u.a.n(this.f2478d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2476b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            u.a.o(this.f2478d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f2479e;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f2478d;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2478d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
