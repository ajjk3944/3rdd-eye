package L0;

import L0.C0775f;
import L0.I;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import g0.C4356c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: b, reason: collision with root package name */
    public static final X f3849b;

    /* renamed from: a, reason: collision with root package name */
    public final k f3850a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f3851a;

        /* renamed from: b, reason: collision with root package name */
        public static final Field f3852b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f3853c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f3854d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3851a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3852b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3853c = declaredField3;
                declaredField3.setAccessible(true);
                f3854d = true;
            } catch (ReflectiveOperationException e4) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class d extends c {
        public d() {
        }

        @Override // L0.X.e
        public void c(int i, C0.e eVar) {
            this.f3861c.setInsets(m.a(i), eVar.d());
        }

        public d(X x10) {
            super(x10);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final X f3862a;

        /* renamed from: b, reason: collision with root package name */
        public C0.e[] f3863b;

        public e() {
            this(new X());
        }

        public final void a() {
            C0.e[] eVarArr = this.f3863b;
            if (eVarArr != null) {
                C0.e eVarF = eVarArr[0];
                C0.e eVarF2 = eVarArr[1];
                X x10 = this.f3862a;
                if (eVarF2 == null) {
                    eVarF2 = x10.f3850a.f(2);
                }
                if (eVarF == null) {
                    eVarF = x10.f3850a.f(1);
                }
                g(C0.e.a(eVarF, eVarF2));
                C0.e eVar = this.f3863b[l.a(16)];
                if (eVar != null) {
                    f(eVar);
                }
                C0.e eVar2 = this.f3863b[l.a(32)];
                if (eVar2 != null) {
                    d(eVar2);
                }
                C0.e eVar3 = this.f3863b[l.a(64)];
                if (eVar3 != null) {
                    h(eVar3);
                }
            }
        }

        public X b() {
            throw null;
        }

        public void c(int i, C0.e eVar) {
            if (this.f3863b == null) {
                this.f3863b = new C0.e[9];
            }
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i & i10) != 0) {
                    this.f3863b[l.a(i10)] = eVar;
                }
            }
        }

        public void e(C0.e eVar) {
            throw null;
        }

        public void g(C0.e eVar) {
            throw null;
        }

        public e(X x10) {
            this.f3862a = x10;
        }

        public void d(C0.e eVar) {
        }

        public void f(C0.e eVar) {
        }

        public void h(C0.e eVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class f extends k {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f3864h = false;
        public static Method i;

        /* renamed from: j, reason: collision with root package name */
        public static Class<?> f3865j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f3866k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f3867l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f3868c;

        /* renamed from: d, reason: collision with root package name */
        public C0.e[] f3869d;

        /* renamed from: e, reason: collision with root package name */
        public C0.e f3870e;

        /* renamed from: f, reason: collision with root package name */
        public X f3871f;

        /* renamed from: g, reason: collision with root package name */
        public C0.e f3872g;

        public f(X x10, WindowInsets windowInsets) {
            super(x10);
            this.f3870e = null;
            this.f3868c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private C0.e r(int i10, boolean z10) {
            C0.e eVarA = C0.e.f800e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    eVarA = C0.e.a(eVarA, s(i11, z10));
                }
            }
            return eVarA;
        }

        private C0.e t() {
            X x10 = this.f3871f;
            return x10 != null ? x10.f3850a.h() : C0.e.f800e;
        }

        private C0.e u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3864h) {
                v();
            }
            Method method = i;
            if (method != null && f3865j != null && f3866k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3866k.get(f3867l.get(objInvoke));
                    if (rect != null) {
                        return C0.e.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e4) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void v() throws ClassNotFoundException, SecurityException {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3865j = cls;
                f3866k = cls.getDeclaredField("mVisibleInsets");
                f3867l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3866k.setAccessible(true);
                f3867l.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
            f3864h = true;
        }

        @Override // L0.X.k
        public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            C0.e eVarU = u(view);
            if (eVarU == null) {
                eVarU = C0.e.f800e;
            }
            w(eVarU);
        }

        @Override // L0.X.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3872g, ((f) obj).f3872g);
            }
            return false;
        }

        @Override // L0.X.k
        public C0.e f(int i10) {
            return r(i10, false);
        }

        @Override // L0.X.k
        public final C0.e j() {
            if (this.f3870e == null) {
                WindowInsets windowInsets = this.f3868c;
                this.f3870e = C0.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f3870e;
        }

        @Override // L0.X.k
        public X l(int i10, int i11, int i12, int i13) {
            X xH = X.h(null, this.f3868c);
            int i14 = Build.VERSION.SDK_INT;
            e dVar = i14 >= 30 ? new d(xH) : i14 >= 29 ? new c(xH) : new b(xH);
            dVar.g(X.e(j(), i10, i11, i12, i13));
            dVar.e(X.e(h(), i10, i11, i12, i13));
            return dVar.b();
        }

        @Override // L0.X.k
        public boolean n() {
            return this.f3868c.isRound();
        }

        @Override // L0.X.k
        public void o(C0.e[] eVarArr) {
            this.f3869d = eVarArr;
        }

        @Override // L0.X.k
        public void p(X x10) {
            this.f3871f = x10;
        }

        public C0.e s(int i10, boolean z10) {
            C0.e eVarH;
            int i11;
            if (i10 == 1) {
                return z10 ? C0.e.b(0, Math.max(t().f802b, j().f802b), 0, 0) : C0.e.b(0, j().f802b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C0.e eVarT = t();
                    C0.e eVarH2 = h();
                    return C0.e.b(Math.max(eVarT.f801a, eVarH2.f801a), 0, Math.max(eVarT.f803c, eVarH2.f803c), Math.max(eVarT.f804d, eVarH2.f804d));
                }
                C0.e eVarJ = j();
                X x10 = this.f3871f;
                eVarH = x10 != null ? x10.f3850a.h() : null;
                int iMin = eVarJ.f804d;
                if (eVarH != null) {
                    iMin = Math.min(iMin, eVarH.f804d);
                }
                return C0.e.b(eVarJ.f801a, 0, eVarJ.f803c, iMin);
            }
            C0.e eVar = C0.e.f800e;
            if (i10 == 8) {
                C0.e[] eVarArr = this.f3869d;
                eVarH = eVarArr != null ? eVarArr[l.a(8)] : null;
                if (eVarH != null) {
                    return eVarH;
                }
                C0.e eVarJ2 = j();
                C0.e eVarT2 = t();
                int i12 = eVarJ2.f804d;
                if (i12 > eVarT2.f804d) {
                    return C0.e.b(0, 0, 0, i12);
                }
                C0.e eVar2 = this.f3872g;
                return (eVar2 == null || eVar2.equals(eVar) || (i11 = this.f3872g.f804d) <= eVarT2.f804d) ? eVar : C0.e.b(0, 0, 0, i11);
            }
            if (i10 == 16) {
                return i();
            }
            if (i10 == 32) {
                return g();
            }
            if (i10 == 64) {
                return k();
            }
            if (i10 != 128) {
                return eVar;
            }
            X x11 = this.f3871f;
            C0775f c0775fE = x11 != null ? x11.f3850a.e() : e();
            if (c0775fE == null) {
                return eVar;
            }
            int i13 = Build.VERSION.SDK_INT;
            return C0.e.b(i13 >= 28 ? C0775f.a.d(c0775fE.f3910a) : 0, i13 >= 28 ? C0775f.a.f(c0775fE.f3910a) : 0, i13 >= 28 ? C0775f.a.e(c0775fE.f3910a) : 0, i13 >= 28 ? C0775f.a.c(c0775fE.f3910a) : 0);
        }

        public void w(C0.e eVar) {
            this.f3872g = eVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class g extends f {

        /* renamed from: m, reason: collision with root package name */
        public C0.e f3873m;

        public g(X x10, WindowInsets windowInsets) {
            super(x10, windowInsets);
            this.f3873m = null;
        }

        @Override // L0.X.k
        public X b() {
            return X.h(null, this.f3868c.consumeStableInsets());
        }

        @Override // L0.X.k
        public X c() {
            return X.h(null, this.f3868c.consumeSystemWindowInsets());
        }

        @Override // L0.X.k
        public final C0.e h() {
            if (this.f3873m == null) {
                WindowInsets windowInsets = this.f3868c;
                this.f3873m = C0.e.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f3873m;
        }

        @Override // L0.X.k
        public boolean m() {
            return this.f3868c.isConsumed();
        }

        @Override // L0.X.k
        public void q(C0.e eVar) {
            this.f3873m = eVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class h extends g {
        public h(X x10, WindowInsets windowInsets) {
            super(x10, windowInsets);
        }

        @Override // L0.X.k
        public X a() {
            return X.h(null, this.f3868c.consumeDisplayCutout());
        }

        @Override // L0.X.k
        public C0775f e() {
            DisplayCutout displayCutout = this.f3868c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0775f(displayCutout);
        }

        @Override // L0.X.f, L0.X.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f3868c, hVar.f3868c) && Objects.equals(this.f3872g, hVar.f3872g);
        }

        @Override // L0.X.k
        public int hashCode() {
            return this.f3868c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class l {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(C4356c.h(i, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class m {
        public static int a(int i) {
            int iStatusBars;
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i & i11) != 0) {
                    if (i11 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i11 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i11 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i11 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i11 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i11 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i11 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i11 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i10 |= iStatusBars;
                }
            }
            return i10;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3849b = j.f3877q;
        } else {
            f3849b = k.f3878b;
        }
    }

    public X(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3850a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f3850a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f3850a = new h(this, windowInsets);
        } else {
            this.f3850a = new g(this, windowInsets);
        }
    }

    public static C0.e e(C0.e eVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, eVar.f801a - i10);
        int iMax2 = Math.max(0, eVar.f802b - i11);
        int iMax3 = Math.max(0, eVar.f803c - i12);
        int iMax4 = Math.max(0, eVar.f804d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? eVar : C0.e.b(iMax, iMax2, iMax3, iMax4);
    }

    public static X h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        X x10 = new X(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            X xA = I.e.a(view);
            k kVar = x10.f3850a;
            kVar.p(xA);
            kVar.d(view.getRootView());
        }
        return x10;
    }

    @Deprecated
    public final int a() {
        return this.f3850a.j().f804d;
    }

    @Deprecated
    public final int b() {
        return this.f3850a.j().f801a;
    }

    @Deprecated
    public final int c() {
        return this.f3850a.j().f803c;
    }

    @Deprecated
    public final int d() {
        return this.f3850a.j().f802b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        return Objects.equals(this.f3850a, ((X) obj).f3850a);
    }

    @Deprecated
    public final X f(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        e dVar = i14 >= 30 ? new d(this) : i14 >= 29 ? new c(this) : new b(this);
        dVar.g(C0.e.b(i10, i11, i12, i13));
        return dVar.b();
    }

    public final WindowInsets g() {
        k kVar = this.f3850a;
        if (kVar instanceof f) {
            return ((f) kVar).f3868c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f3850a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public static Field f3855e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f3856f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f3857g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f3858h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f3859c;

        /* renamed from: d, reason: collision with root package name */
        public C0.e f3860d;

        public b() {
            this.f3859c = i();
        }

        private static WindowInsets i() {
            if (!f3856f) {
                try {
                    f3855e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
                }
                f3856f = true;
            }
            Field field = f3855e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
                }
            }
            if (!f3858h) {
                try {
                    f3857g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
                }
                f3858h = true;
            }
            Constructor<WindowInsets> constructor = f3857g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
                }
            }
            return null;
        }

        @Override // L0.X.e
        public X b() {
            a();
            X xH = X.h(null, this.f3859c);
            C0.e[] eVarArr = this.f3863b;
            k kVar = xH.f3850a;
            kVar.o(eVarArr);
            kVar.q(this.f3860d);
            return xH;
        }

        @Override // L0.X.e
        public void e(C0.e eVar) {
            this.f3860d = eVar;
        }

        @Override // L0.X.e
        public void g(C0.e eVar) {
            WindowInsets windowInsets = this.f3859c;
            if (windowInsets != null) {
                this.f3859c = windowInsets.replaceSystemWindowInsets(eVar.f801a, eVar.f802b, eVar.f803c, eVar.f804d);
            }
        }

        public b(X x10) {
            super(x10);
            this.f3859c = x10.g();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class c extends e {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f3861c;

        public c() {
            this.f3861c = H2.e.e();
        }

        @Override // L0.X.e
        public X b() {
            a();
            X xH = X.h(null, this.f3861c.build());
            xH.f3850a.o(this.f3863b);
            return xH;
        }

        @Override // L0.X.e
        public void d(C0.e eVar) {
            this.f3861c.setMandatorySystemGestureInsets(eVar.d());
        }

        @Override // L0.X.e
        public void e(C0.e eVar) {
            this.f3861c.setStableInsets(eVar.d());
        }

        @Override // L0.X.e
        public void f(C0.e eVar) {
            this.f3861c.setSystemGestureInsets(eVar.d());
        }

        @Override // L0.X.e
        public void g(C0.e eVar) {
            this.f3861c.setSystemWindowInsets(eVar.d());
        }

        @Override // L0.X.e
        public void h(C0.e eVar) {
            this.f3861c.setTappableElementInsets(eVar.d());
        }

        public c(X x10) {
            WindowInsets.Builder builderE;
            super(x10);
            WindowInsets windowInsetsG = x10.g();
            if (windowInsetsG != null) {
                builderE = K1.u.e(windowInsetsG);
            } else {
                builderE = H2.e.e();
            }
            this.f3861c = builderE;
        }
    }

    public X() {
        this.f3850a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class i extends h {

        /* renamed from: n, reason: collision with root package name */
        public C0.e f3874n;

        /* renamed from: o, reason: collision with root package name */
        public C0.e f3875o;

        /* renamed from: p, reason: collision with root package name */
        public C0.e f3876p;

        public i(X x10, WindowInsets windowInsets) {
            super(x10, windowInsets);
            this.f3874n = null;
            this.f3875o = null;
            this.f3876p = null;
        }

        @Override // L0.X.k
        public C0.e g() {
            if (this.f3875o == null) {
                this.f3875o = C0.e.c(this.f3868c.getMandatorySystemGestureInsets());
            }
            return this.f3875o;
        }

        @Override // L0.X.k
        public C0.e i() {
            if (this.f3874n == null) {
                this.f3874n = C0.e.c(this.f3868c.getSystemGestureInsets());
            }
            return this.f3874n;
        }

        @Override // L0.X.k
        public C0.e k() {
            if (this.f3876p == null) {
                this.f3876p = C0.e.c(this.f3868c.getTappableElementInsets());
            }
            return this.f3876p;
        }

        @Override // L0.X.f, L0.X.k
        public X l(int i, int i10, int i11, int i12) {
            return X.h(null, this.f3868c.inset(i, i10, i11, i12));
        }

        @Override // L0.X.g, L0.X.k
        public void q(C0.e eVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class j extends i {

        /* renamed from: q, reason: collision with root package name */
        public static final X f3877q = X.h(null, WindowInsets.CONSUMED);

        public j(X x10, WindowInsets windowInsets) {
            super(x10, windowInsets);
        }

        @Override // L0.X.f, L0.X.k
        public C0.e f(int i) {
            return C0.e.c(this.f3868c.getInsets(m.a(i)));
        }

        @Override // L0.X.f, L0.X.k
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class k {

        /* renamed from: b, reason: collision with root package name */
        public static final X f3878b;

        /* renamed from: a, reason: collision with root package name */
        public final X f3879a;

        static {
            int i = Build.VERSION.SDK_INT;
            f3878b = (i >= 30 ? new d() : i >= 29 ? new c() : new b()).b().f3850a.a().f3850a.b().f3850a.c();
        }

        public k(X x10) {
            this.f3879a = x10;
        }

        public X a() {
            return this.f3879a;
        }

        public X b() {
            return this.f3879a;
        }

        public X c() {
            return this.f3879a;
        }

        public C0775f e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return n() == kVar.n() && m() == kVar.m() && Objects.equals(j(), kVar.j()) && Objects.equals(h(), kVar.h()) && Objects.equals(e(), kVar.e());
        }

        public C0.e f(int i) {
            return C0.e.f800e;
        }

        public C0.e g() {
            return j();
        }

        public C0.e h() {
            return C0.e.f800e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public C0.e i() {
            return j();
        }

        public C0.e j() {
            return C0.e.f800e;
        }

        public C0.e k() {
            return j();
        }

        public X l(int i, int i10, int i11, int i12) {
            return f3878b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void d(View view) {
        }

        public void o(C0.e[] eVarArr) {
        }

        public void p(X x10) {
        }

        public void q(C0.e eVar) {
        }
    }
}
