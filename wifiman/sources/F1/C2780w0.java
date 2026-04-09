package F1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: F1.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2780w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C2780w0 f5774b;

    /* renamed from: a, reason: collision with root package name */
    private final k f5775a;

    /* renamed from: F1.w0$d */
    private static class d extends c {
        d() {
        }

        @Override // F1.C2780w0.e
        void c(int i10, w1.f fVar) {
            this.f5783c.setInsets(m.a(i10), fVar.e());
        }

        d(C2780w0 c2780w0) {
            super(c2780w0);
        }
    }

    /* renamed from: F1.w0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final C2780w0 f5784a;

        /* renamed from: b, reason: collision with root package name */
        w1.f[] f5785b;

        e() {
            this(new C2780w0((C2780w0) null));
        }

        protected final void a() {
            w1.f[] fVarArr = this.f5785b;
            if (fVarArr != null) {
                w1.f fVarF = fVarArr[l.d(1)];
                w1.f fVarF2 = this.f5785b[l.d(2)];
                if (fVarF2 == null) {
                    fVarF2 = this.f5784a.f(2);
                }
                if (fVarF == null) {
                    fVarF = this.f5784a.f(1);
                }
                g(w1.f.a(fVarF, fVarF2));
                w1.f fVar = this.f5785b[l.d(16)];
                if (fVar != null) {
                    f(fVar);
                }
                w1.f fVar2 = this.f5785b[l.d(32)];
                if (fVar2 != null) {
                    d(fVar2);
                }
                w1.f fVar3 = this.f5785b[l.d(64)];
                if (fVar3 != null) {
                    h(fVar3);
                }
            }
        }

        abstract C2780w0 b();

        void c(int i10, w1.f fVar) {
            if (this.f5785b == null) {
                this.f5785b = new w1.f[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f5785b[l.d(i11)] = fVar;
                }
            }
        }

        void d(w1.f fVar) {
        }

        abstract void e(w1.f fVar);

        void f(w1.f fVar) {
        }

        abstract void g(w1.f fVar);

        void h(w1.f fVar) {
        }

        e(C2780w0 c2780w0) {
            this.f5784a = c2780w0;
        }
    }

    /* renamed from: F1.w0$h */
    private static class h extends g {
        h(C2780w0 c2780w0, WindowInsets windowInsets) {
            super(c2780w0, windowInsets);
        }

        @Override // F1.C2780w0.k
        C2780w0 a() {
            return C2780w0.w(this.f5791c.consumeDisplayCutout());
        }

        @Override // F1.C2780w0.f, F1.C2780w0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f5791c, hVar.f5791c) && Objects.equals(this.f5795g, hVar.f5795g);
        }

        @Override // F1.C2780w0.k
        r f() {
            return r.f(this.f5791c.getDisplayCutout());
        }

        @Override // F1.C2780w0.k
        public int hashCode() {
            return this.f5791c.hashCode();
        }

        h(C2780w0 c2780w0, h hVar) {
            super(c2780w0, hVar);
        }
    }

    /* renamed from: F1.w0$j */
    private static class j extends i {

        /* renamed from: q, reason: collision with root package name */
        static final C2780w0 f5800q = C2780w0.w(WindowInsets.CONSUMED);

        j(C2780w0 c2780w0, WindowInsets windowInsets) {
            super(c2780w0, windowInsets);
        }

        @Override // F1.C2780w0.f, F1.C2780w0.k
        final void d(View view) {
        }

        @Override // F1.C2780w0.f, F1.C2780w0.k
        public w1.f g(int i10) {
            return w1.f.d(this.f5791c.getInsets(m.a(i10)));
        }

        @Override // F1.C2780w0.f, F1.C2780w0.k
        public w1.f h(int i10) {
            return w1.f.d(this.f5791c.getInsetsIgnoringVisibility(m.a(i10)));
        }

        @Override // F1.C2780w0.f, F1.C2780w0.k
        public boolean q(int i10) {
            return this.f5791c.isVisible(m.a(i10));
        }

        j(C2780w0 c2780w0, j jVar) {
            super(c2780w0, jVar);
        }
    }

    /* renamed from: F1.w0$k */
    private static class k {

        /* renamed from: b, reason: collision with root package name */
        static final C2780w0 f5801b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final C2780w0 f5802a;

        k(C2780w0 c2780w0) {
            this.f5802a = c2780w0;
        }

        C2780w0 a() {
            return this.f5802a;
        }

        C2780w0 b() {
            return this.f5802a;
        }

        C2780w0 c() {
            return this.f5802a;
        }

        void d(View view) {
        }

        void e(C2780w0 c2780w0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && E1.d.a(l(), kVar.l()) && E1.d.a(j(), kVar.j()) && E1.d.a(f(), kVar.f());
        }

        r f() {
            return null;
        }

        w1.f g(int i10) {
            return w1.f.f64335e;
        }

        w1.f h(int i10) {
            if ((i10 & 8) == 0) {
                return w1.f.f64335e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return E1.d.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        w1.f i() {
            return l();
        }

        w1.f j() {
            return w1.f.f64335e;
        }

        w1.f k() {
            return l();
        }

        w1.f l() {
            return w1.f.f64335e;
        }

        w1.f m() {
            return l();
        }

        C2780w0 n(int i10, int i11, int i12, int i13) {
            return f5801b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        public void r(w1.f[] fVarArr) {
        }

        void s(w1.f fVar) {
        }

        void t(C2780w0 c2780w0) {
        }

        public void u(w1.f fVar) {
        }
    }

    /* renamed from: F1.w0$l */
    public static final class l {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* renamed from: F1.w0$m */
    private static final class m {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5774b = j.f5800q;
        } else {
            f5774b = k.f5801b;
        }
    }

    private C2780w0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f5775a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f5775a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f5775a = new h(this, windowInsets);
        } else {
            this.f5775a = new g(this, windowInsets);
        }
    }

    static w1.f n(w1.f fVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, fVar.f64336a - i10);
        int iMax2 = Math.max(0, fVar.f64337b - i11);
        int iMax3 = Math.max(0, fVar.f64338c - i12);
        int iMax4 = Math.max(0, fVar.f64339d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? fVar : w1.f.b(iMax, iMax2, iMax3, iMax4);
    }

    public static C2780w0 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static C2780w0 x(WindowInsets windowInsets, View view) {
        C2780w0 c2780w0 = new C2780w0((WindowInsets) E1.h.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c2780w0.t(W.F(view));
            c2780w0.d(view.getRootView());
        }
        return c2780w0;
    }

    public C2780w0 a() {
        return this.f5775a.a();
    }

    public C2780w0 b() {
        return this.f5775a.b();
    }

    public C2780w0 c() {
        return this.f5775a.c();
    }

    void d(View view) {
        this.f5775a.d(view);
    }

    public r e() {
        return this.f5775a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2780w0) {
            return E1.d.a(this.f5775a, ((C2780w0) obj).f5775a);
        }
        return false;
    }

    public w1.f f(int i10) {
        return this.f5775a.g(i10);
    }

    public w1.f g(int i10) {
        return this.f5775a.h(i10);
    }

    public w1.f h() {
        return this.f5775a.j();
    }

    public int hashCode() {
        k kVar = this.f5775a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public int i() {
        return this.f5775a.l().f64339d;
    }

    public int j() {
        return this.f5775a.l().f64336a;
    }

    public int k() {
        return this.f5775a.l().f64338c;
    }

    public int l() {
        return this.f5775a.l().f64337b;
    }

    public C2780w0 m(int i10, int i11, int i12, int i13) {
        return this.f5775a.n(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f5775a.o();
    }

    public boolean p(int i10) {
        return this.f5775a.q(i10);
    }

    public C2780w0 q(int i10, int i11, int i12, int i13) {
        return new a(this).d(w1.f.b(i10, i11, i12, i13)).a();
    }

    void r(w1.f[] fVarArr) {
        this.f5775a.r(fVarArr);
    }

    void s(w1.f fVar) {
        this.f5775a.s(fVar);
    }

    void t(C2780w0 c2780w0) {
        this.f5775a.t(c2780w0);
    }

    void u(w1.f fVar) {
        this.f5775a.u(fVar);
    }

    public WindowInsets v() {
        k kVar = this.f5775a;
        if (kVar instanceof f) {
            return ((f) kVar).f5791c;
        }
        return null;
    }

    /* renamed from: F1.w0$b */
    private static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private static Field f5777e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f5778f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor f5779g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f5780h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f5781c;

        /* renamed from: d, reason: collision with root package name */
        private w1.f f5782d;

        b() {
            this.f5781c = i();
        }

        private static WindowInsets i() {
            if (!f5778f) {
                try {
                    f5777e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f5778f = true;
            }
            Field field = f5777e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f5780h) {
                try {
                    f5779g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f5780h = true;
            }
            Constructor constructor = f5779g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // F1.C2780w0.e
        C2780w0 b() {
            a();
            C2780w0 c2780w0W = C2780w0.w(this.f5781c);
            c2780w0W.r(this.f5785b);
            c2780w0W.u(this.f5782d);
            return c2780w0W;
        }

        @Override // F1.C2780w0.e
        void e(w1.f fVar) {
            this.f5782d = fVar;
        }

        @Override // F1.C2780w0.e
        void g(w1.f fVar) {
            WindowInsets windowInsets = this.f5781c;
            if (windowInsets != null) {
                this.f5781c = windowInsets.replaceSystemWindowInsets(fVar.f64336a, fVar.f64337b, fVar.f64338c, fVar.f64339d);
            }
        }

        b(C2780w0 c2780w0) {
            super(c2780w0);
            this.f5781c = c2780w0.v();
        }
    }

    /* renamed from: F1.w0$c */
    private static class c extends e {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f5783c;

        c() {
            this.f5783c = C1.e.a();
        }

        @Override // F1.C2780w0.e
        C2780w0 b() {
            a();
            C2780w0 c2780w0W = C2780w0.w(this.f5783c.build());
            c2780w0W.r(this.f5785b);
            return c2780w0W;
        }

        @Override // F1.C2780w0.e
        void d(w1.f fVar) {
            this.f5783c.setMandatorySystemGestureInsets(fVar.e());
        }

        @Override // F1.C2780w0.e
        void e(w1.f fVar) {
            this.f5783c.setStableInsets(fVar.e());
        }

        @Override // F1.C2780w0.e
        void f(w1.f fVar) {
            this.f5783c.setSystemGestureInsets(fVar.e());
        }

        @Override // F1.C2780w0.e
        void g(w1.f fVar) {
            this.f5783c.setSystemWindowInsets(fVar.e());
        }

        @Override // F1.C2780w0.e
        void h(w1.f fVar) {
            this.f5783c.setTappableElementInsets(fVar.e());
        }

        c(C2780w0 c2780w0) {
            WindowInsets.Builder builderA;
            super(c2780w0);
            WindowInsets windowInsetsV = c2780w0.v();
            if (windowInsetsV != null) {
                builderA = C0.a(windowInsetsV);
            } else {
                builderA = C1.e.a();
            }
            this.f5783c = builderA;
        }
    }

    /* renamed from: F1.w0$g */
    private static class g extends f {

        /* renamed from: m, reason: collision with root package name */
        private w1.f f5796m;

        g(C2780w0 c2780w0, WindowInsets windowInsets) {
            super(c2780w0, windowInsets);
            this.f5796m = null;
        }

        @Override // F1.C2780w0.k
        C2780w0 b() {
            return C2780w0.w(this.f5791c.consumeStableInsets());
        }

        @Override // F1.C2780w0.k
        C2780w0 c() {
            return C2780w0.w(this.f5791c.consumeSystemWindowInsets());
        }

        @Override // F1.C2780w0.k
        final w1.f j() {
            if (this.f5796m == null) {
                this.f5796m = w1.f.b(this.f5791c.getStableInsetLeft(), this.f5791c.getStableInsetTop(), this.f5791c.getStableInsetRight(), this.f5791c.getStableInsetBottom());
            }
            return this.f5796m;
        }

        @Override // F1.C2780w0.k
        boolean o() {
            return this.f5791c.isConsumed();
        }

        @Override // F1.C2780w0.k
        public void u(w1.f fVar) {
            this.f5796m = fVar;
        }

        g(C2780w0 c2780w0, g gVar) {
            super(c2780w0, gVar);
            this.f5796m = null;
            this.f5796m = gVar.f5796m;
        }
    }

    /* renamed from: F1.w0$f */
    private static class f extends k {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f5786h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f5787i;

        /* renamed from: j, reason: collision with root package name */
        private static Class f5788j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f5789k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f5790l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f5791c;

        /* renamed from: d, reason: collision with root package name */
        private w1.f[] f5792d;

        /* renamed from: e, reason: collision with root package name */
        private w1.f f5793e;

        /* renamed from: f, reason: collision with root package name */
        private C2780w0 f5794f;

        /* renamed from: g, reason: collision with root package name */
        w1.f f5795g;

        f(C2780w0 c2780w0, WindowInsets windowInsets) {
            super(c2780w0);
            this.f5793e = null;
            this.f5791c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() throws ClassNotFoundException, SecurityException {
            try {
                f5787i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5788j = cls;
                f5789k = cls.getDeclaredField("mVisibleInsets");
                f5790l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5789k.setAccessible(true);
                f5790l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f5786h = true;
        }

        @SuppressLint({"WrongConstant"})
        private w1.f v(int i10, boolean z10) {
            w1.f fVarA = w1.f.f64335e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    fVarA = w1.f.a(fVarA, w(i11, z10));
                }
            }
            return fVarA;
        }

        private w1.f x() {
            C2780w0 c2780w0 = this.f5794f;
            return c2780w0 != null ? c2780w0.h() : w1.f.f64335e;
        }

        private w1.f y(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f5786h) {
                A();
            }
            Method method = f5787i;
            if (method != null && f5788j != null && f5789k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f5789k.get(f5790l.get(objInvoke));
                    if (rect != null) {
                        return w1.f.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // F1.C2780w0.k
        void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            w1.f fVarY = y(view);
            if (fVarY == null) {
                fVarY = w1.f.f64335e;
            }
            s(fVarY);
        }

        @Override // F1.C2780w0.k
        void e(C2780w0 c2780w0) {
            c2780w0.t(this.f5794f);
            c2780w0.s(this.f5795g);
        }

        @Override // F1.C2780w0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f5795g, ((f) obj).f5795g);
            }
            return false;
        }

        @Override // F1.C2780w0.k
        public w1.f g(int i10) {
            return v(i10, false);
        }

        @Override // F1.C2780w0.k
        public w1.f h(int i10) {
            return v(i10, true);
        }

        @Override // F1.C2780w0.k
        final w1.f l() {
            if (this.f5793e == null) {
                this.f5793e = w1.f.b(this.f5791c.getSystemWindowInsetLeft(), this.f5791c.getSystemWindowInsetTop(), this.f5791c.getSystemWindowInsetRight(), this.f5791c.getSystemWindowInsetBottom());
            }
            return this.f5793e;
        }

        @Override // F1.C2780w0.k
        C2780w0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(C2780w0.w(this.f5791c));
            aVar.d(C2780w0.n(l(), i10, i11, i12, i13));
            aVar.c(C2780w0.n(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // F1.C2780w0.k
        boolean p() {
            return this.f5791c.isRound();
        }

        @Override // F1.C2780w0.k
        @SuppressLint({"WrongConstant"})
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // F1.C2780w0.k
        public void r(w1.f[] fVarArr) {
            this.f5792d = fVarArr;
        }

        @Override // F1.C2780w0.k
        void s(w1.f fVar) {
            this.f5795g = fVar;
        }

        @Override // F1.C2780w0.k
        void t(C2780w0 c2780w0) {
            this.f5794f = c2780w0;
        }

        protected w1.f w(int i10, boolean z10) {
            w1.f fVarH;
            int i11;
            if (i10 == 1) {
                return z10 ? w1.f.b(0, Math.max(x().f64337b, l().f64337b), 0, 0) : w1.f.b(0, l().f64337b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    w1.f fVarX = x();
                    w1.f fVarJ = j();
                    return w1.f.b(Math.max(fVarX.f64336a, fVarJ.f64336a), 0, Math.max(fVarX.f64338c, fVarJ.f64338c), Math.max(fVarX.f64339d, fVarJ.f64339d));
                }
                w1.f fVarL = l();
                C2780w0 c2780w0 = this.f5794f;
                fVarH = c2780w0 != null ? c2780w0.h() : null;
                int iMin = fVarL.f64339d;
                if (fVarH != null) {
                    iMin = Math.min(iMin, fVarH.f64339d);
                }
                return w1.f.b(fVarL.f64336a, 0, fVarL.f64338c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return w1.f.f64335e;
                }
                C2780w0 c2780w02 = this.f5794f;
                r rVarE = c2780w02 != null ? c2780w02.e() : f();
                return rVarE != null ? w1.f.b(rVarE.b(), rVarE.d(), rVarE.c(), rVarE.a()) : w1.f.f64335e;
            }
            w1.f[] fVarArr = this.f5792d;
            fVarH = fVarArr != null ? fVarArr[l.d(8)] : null;
            if (fVarH != null) {
                return fVarH;
            }
            w1.f fVarL2 = l();
            w1.f fVarX2 = x();
            int i12 = fVarL2.f64339d;
            if (i12 > fVarX2.f64339d) {
                return w1.f.b(0, 0, 0, i12);
            }
            w1.f fVar = this.f5795g;
            return (fVar == null || fVar.equals(w1.f.f64335e) || (i11 = this.f5795g.f64339d) <= fVarX2.f64339d) ? w1.f.f64335e : w1.f.b(0, 0, 0, i11);
        }

        protected boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(w1.f.f64335e);
        }

        f(C2780w0 c2780w0, f fVar) {
            this(c2780w0, new WindowInsets(fVar.f5791c));
        }
    }

    /* renamed from: F1.w0$i */
    private static class i extends h {

        /* renamed from: n, reason: collision with root package name */
        private w1.f f5797n;

        /* renamed from: o, reason: collision with root package name */
        private w1.f f5798o;

        /* renamed from: p, reason: collision with root package name */
        private w1.f f5799p;

        i(C2780w0 c2780w0, WindowInsets windowInsets) {
            super(c2780w0, windowInsets);
            this.f5797n = null;
            this.f5798o = null;
            this.f5799p = null;
        }

        @Override // F1.C2780w0.k
        w1.f i() {
            if (this.f5798o == null) {
                this.f5798o = w1.f.d(this.f5791c.getMandatorySystemGestureInsets());
            }
            return this.f5798o;
        }

        @Override // F1.C2780w0.k
        w1.f k() {
            if (this.f5797n == null) {
                this.f5797n = w1.f.d(this.f5791c.getSystemGestureInsets());
            }
            return this.f5797n;
        }

        @Override // F1.C2780w0.k
        w1.f m() {
            if (this.f5799p == null) {
                this.f5799p = w1.f.d(this.f5791c.getTappableElementInsets());
            }
            return this.f5799p;
        }

        @Override // F1.C2780w0.f, F1.C2780w0.k
        C2780w0 n(int i10, int i11, int i12, int i13) {
            return C2780w0.w(this.f5791c.inset(i10, i11, i12, i13));
        }

        @Override // F1.C2780w0.g, F1.C2780w0.k
        public void u(w1.f fVar) {
        }

        i(C2780w0 c2780w0, i iVar) {
            super(c2780w0, iVar);
            this.f5797n = null;
            this.f5798o = null;
            this.f5799p = null;
        }
    }

    /* renamed from: F1.w0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f5776a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f5776a = new d();
            } else if (i10 >= 29) {
                this.f5776a = new c();
            } else {
                this.f5776a = new b();
            }
        }

        public C2780w0 a() {
            return this.f5776a.b();
        }

        public a b(int i10, w1.f fVar) {
            this.f5776a.c(i10, fVar);
            return this;
        }

        public a c(w1.f fVar) {
            this.f5776a.e(fVar);
            return this;
        }

        public a d(w1.f fVar) {
            this.f5776a.g(fVar);
            return this;
        }

        public a(C2780w0 c2780w0) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f5776a = new d(c2780w0);
            } else if (i10 >= 29) {
                this.f5776a = new c(c2780w0);
            } else {
                this.f5776a = new b(c2780w0);
            }
        }
    }

    public C2780w0(C2780w0 c2780w0) {
        if (c2780w0 != null) {
            k kVar = c2780w0.f5775a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f5775a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f5775a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f5775a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f5775a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f5775a = new f(this, (f) kVar);
            } else {
                this.f5775a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f5775a = new k(this);
    }
}
