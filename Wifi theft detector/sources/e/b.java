package e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class b extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public d f20829a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f20830b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f20831c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f20832d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20834f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20836h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f20837i;

    /* renamed from: j, reason: collision with root package name */
    public long f20838j;

    /* renamed from: k, reason: collision with root package name */
    public long f20839k;

    /* renamed from: l, reason: collision with root package name */
    public c f20840l;

    /* renamed from: e, reason: collision with root package name */
    public int f20833e = 255;

    /* renamed from: g, reason: collision with root package name */
    public int f20835g = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: e.b$b, reason: collision with other inner class name */
    public static class C0387b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a, reason: collision with root package name */
        public final b f20843a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f20844b;

        /* renamed from: c, reason: collision with root package name */
        public int f20845c;

        /* renamed from: d, reason: collision with root package name */
        public int f20846d;

        /* renamed from: e, reason: collision with root package name */
        public int f20847e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f20848f;

        /* renamed from: g, reason: collision with root package name */
        public Drawable[] f20849g;

        /* renamed from: h, reason: collision with root package name */
        public int f20850h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f20851i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f20852j;

        /* renamed from: k, reason: collision with root package name */
        public Rect f20853k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f20854l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f20855m;

        /* renamed from: n, reason: collision with root package name */
        public int f20856n;

        /* renamed from: o, reason: collision with root package name */
        public int f20857o;

        /* renamed from: p, reason: collision with root package name */
        public int f20858p;

        /* renamed from: q, reason: collision with root package name */
        public int f20859q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f20860r;

        /* renamed from: s, reason: collision with root package name */
        public int f20861s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f20862t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f20863u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f20864v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f20865w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f20866x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f20867y;

        /* renamed from: z, reason: collision with root package name */
        public int f20868z;

        public d(d dVar, b bVar, Resources resources) {
            this.f20851i = false;
            this.f20854l = false;
            this.f20866x = true;
            this.A = 0;
            this.B = 0;
            this.f20843a = bVar;
            this.f20844b = resources != null ? resources : dVar != null ? dVar.f20844b : null;
            int iF = b.f(resources, dVar != null ? dVar.f20845c : 0);
            this.f20845c = iF;
            if (dVar == null) {
                this.f20849g = new Drawable[10];
                this.f20850h = 0;
                return;
            }
            this.f20846d = dVar.f20846d;
            this.f20847e = dVar.f20847e;
            this.f20864v = true;
            this.f20865w = true;
            this.f20851i = dVar.f20851i;
            this.f20854l = dVar.f20854l;
            this.f20866x = dVar.f20866x;
            this.f20867y = dVar.f20867y;
            this.f20868z = dVar.f20868z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f20845c == iF) {
                if (dVar.f20852j) {
                    this.f20853k = dVar.f20853k != null ? new Rect(dVar.f20853k) : null;
                    this.f20852j = true;
                }
                if (dVar.f20855m) {
                    this.f20856n = dVar.f20856n;
                    this.f20857o = dVar.f20857o;
                    this.f20858p = dVar.f20858p;
                    this.f20859q = dVar.f20859q;
                    this.f20855m = true;
                }
            }
            if (dVar.f20860r) {
                this.f20861s = dVar.f20861s;
                this.f20860r = true;
            }
            if (dVar.f20862t) {
                this.f20863u = dVar.f20863u;
                this.f20862t = true;
            }
            Drawable[] drawableArr = dVar.f20849g;
            this.f20849g = new Drawable[drawableArr.length];
            this.f20850h = dVar.f20850h;
            SparseArray sparseArray = dVar.f20848f;
            if (sparseArray != null) {
                this.f20848f = sparseArray.clone();
            } else {
                this.f20848f = new SparseArray(this.f20850h);
            }
            int i10 = this.f20850h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f20848f.put(i11, constantState);
                    } else {
                        this.f20849g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f20850h;
            if (i10 >= this.f20849g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f20843a);
            this.f20849g[i10] = drawable;
            this.f20850h++;
            this.f20847e = drawable.getChangingConfigurations() | this.f20847e;
            p();
            this.f20853k = null;
            this.f20852j = false;
            this.f20855m = false;
            this.f20864v = false;
            return i10;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f20850h;
                Drawable[] drawableArr = this.f20849g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && k0.a.b(drawable)) {
                        k0.a.a(drawableArr[i11], theme);
                        this.f20847e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0387b.c(theme));
            }
        }

        public boolean c() {
            if (this.f20864v) {
                return this.f20865w;
            }
            e();
            this.f20864v = true;
            int i10 = this.f20850h;
            Drawable[] drawableArr = this.f20849g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f20865w = false;
                    return false;
                }
            }
            this.f20865w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f20850h;
            Drawable[] drawableArr = this.f20849g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f20848f.get(i11);
                    if (constantState != null && C0387b.a(constantState)) {
                        return true;
                    }
                } else if (k0.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            this.f20855m = true;
            e();
            int i10 = this.f20850h;
            Drawable[] drawableArr = this.f20849g;
            this.f20857o = -1;
            this.f20856n = -1;
            this.f20859q = 0;
            this.f20858p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f20856n) {
                    this.f20856n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f20857o) {
                    this.f20857o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f20858p) {
                    this.f20858p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f20859q) {
                    this.f20859q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray sparseArray = this.f20848f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f20849g[this.f20848f.keyAt(i10)] = s(((Drawable.ConstantState) this.f20848f.valueAt(i10)).newDrawable(this.f20844b));
                }
                this.f20848f = null;
            }
        }

        public final int f() {
            return this.f20849g.length;
        }

        public final Drawable g(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f20849g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f20848f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableS = s(((Drawable.ConstantState) this.f20848f.valueAt(iIndexOfKey)).newDrawable(this.f20844b));
            this.f20849g[i10] = drawableS;
            this.f20848f.removeAt(iIndexOfKey);
            if (this.f20848f.size() == 0) {
                this.f20848f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f20846d | this.f20847e;
        }

        public final int h() {
            return this.f20850h;
        }

        public final int i() {
            if (!this.f20855m) {
                d();
            }
            return this.f20857o;
        }

        public final int j() {
            if (!this.f20855m) {
                d();
            }
            return this.f20859q;
        }

        public final int k() {
            if (!this.f20855m) {
                d();
            }
            return this.f20858p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f20851i) {
                return null;
            }
            Rect rect2 = this.f20853k;
            if (rect2 != null || this.f20852j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f20850h;
            Drawable[] drawableArr = this.f20849g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f20852j = true;
            this.f20853k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f20855m) {
                d();
            }
            return this.f20856n;
        }

        public final int n() {
            if (this.f20860r) {
                return this.f20861s;
            }
            e();
            int i10 = this.f20850h;
            Drawable[] drawableArr = this.f20849g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f20861s = opacity;
            this.f20860r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f20849g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f20849g = drawableArr;
        }

        public void p() {
            this.f20860r = false;
            this.f20862t = false;
        }

        public final boolean q() {
            return this.f20854l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            k0.a.m(drawable, this.f20868z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f20843a);
            return drawableMutate;
        }

        public final void t(boolean z10) {
            this.f20854l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        public final boolean w(int i10, int i11) {
            int i12 = this.f20850h;
            Drawable[] drawableArr = this.f20849g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean zM = k0.a.m(drawable, i10);
                    if (i13 == i11) {
                        z10 = zM;
                    }
                }
            }
            this.f20868z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f20851i = z10;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.f20844b = resources;
                int iF = b.f(resources, this.f20845c);
                int i10 = this.f20845c;
                this.f20845c = iF;
                if (i10 != iF) {
                    this.f20855m = false;
                    this.f20852j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f20834f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f20831c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f20838j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f20833e
            r3.setAlpha(r9)
            r13.f20838j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            e.b$d r10 = r13.f20829a
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f20833e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f20838j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f20832d
            if (r9 == 0) goto L61
            long r10 = r13.f20839k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f20832d = r0
            r13.f20839k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.b$d r4 = r13.f20829a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f20833e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f20839k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f20837i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f20829a.b(theme);
    }

    public abstract d b();

    public int c() {
        return this.f20835g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f20829a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f20840l == null) {
            this.f20840l = new c();
        }
        drawable.setCallback(this.f20840l.b(drawable.getCallback()));
        try {
            if (this.f20829a.A <= 0 && this.f20834f) {
                drawable.setAlpha(this.f20833e);
            }
            d dVar = this.f20829a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    k0.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f20829a;
                if (dVar2.I) {
                    k0.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f20829a.f20866x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            k0.a.m(drawable, k0.a.f(this));
            k0.a.j(drawable, this.f20829a.C);
            Rect rect = this.f20830b;
            if (rect != null) {
                k0.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f20840l.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f20840l.a());
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f20832d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && k0.a.f(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f20835g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.b$d r0 = r9.f20829a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f20832d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f20831c
            if (r0 == 0) goto L29
            r9.f20832d = r0
            e.b$d r0 = r9.f20829a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f20839k = r0
            goto L35
        L29:
            r9.f20832d = r4
            r9.f20839k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f20831c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            e.b$d r0 = r9.f20829a
            int r1 = r0.f20850h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f20831c = r0
            r9.f20835g = r10
            if (r0 == 0) goto L5a
            e.b$d r10 = r9.f20829a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f20838j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f20831c = r4
            r10 = -1
            r9.f20835g = r10
        L5a:
            long r0 = r9.f20838j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f20839k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f20837i
            if (r10 != 0) goto L73
            e.b$a r10 = new e.b$a
            r10.<init>()
            r9.f20837i = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20833e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f20829a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f20829a.c()) {
            return null;
        }
        this.f20829a.f20846d = getChangingConfigurations();
        return this.f20829a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f20831c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f20830b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f20829a.q()) {
            return this.f20829a.i();
        }
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f20829a.q()) {
            return this.f20829a.m();
        }
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f20829a.q()) {
            return this.f20829a.j();
        }
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f20829a.q()) {
            return this.f20829a.k();
        }
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f20831c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f20829a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            C0387b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f20829a.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f20831c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    public void h(d dVar) {
        this.f20829a = dVar;
        int i10 = this.f20835g;
        if (i10 >= 0) {
            Drawable drawableG = dVar.g(i10);
            this.f20831c = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f20832d = null;
    }

    public final void i(Resources resources) {
        this.f20829a.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f20829a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f20831c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f20829a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f20832d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f20832d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f20831c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f20834f) {
                this.f20831c.setAlpha(this.f20833e);
            }
        }
        if (this.f20839k != 0) {
            this.f20839k = 0L;
            z10 = true;
        }
        if (this.f20838j != 0) {
            this.f20838j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f20836h && super.mutate() == this) {
            d dVarB = b();
            dVarB.r();
            h(dVarB);
            this.f20836h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20832d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f20831c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f20829a.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f20832d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f20831c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f20831c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f20834f && this.f20833e == i10) {
            return;
        }
        this.f20834f = true;
        this.f20833e = i10;
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            if (this.f20838j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f20829a;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f20831c;
            if (drawable != null) {
                k0.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f20829a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f20831c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f20829a;
        if (dVar.f20866x != z10) {
            dVar.f20866x = z10;
            Drawable drawable = this.f20831c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            k0.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f20830b;
        if (rect == null) {
            this.f20830b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f20831c;
        if (drawable != null) {
            k0.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f20829a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            k0.a.o(this.f20831c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f20829a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            k0.a.p(this.f20831c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f20832d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f20831c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f20831c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    public static class c implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        public Drawable.Callback f20842a;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f20842a;
            this.f20842a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f20842a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f20842a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f20842a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
