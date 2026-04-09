package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class WindowInsetsCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f2669b;

    /* renamed from: a, reason: collision with root package name */
    public final l f2670a;

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface InsetsType {
        }

        public static int a() {
            return 128;
        }

        public static int b() {
            return 8;
        }

        public static int c(int i10) {
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

        public static int d() {
            return 32;
        }

        public static int e() {
            return 7;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Field f2671a;

        /* renamed from: b, reason: collision with root package name */
        public static Field f2672b;

        /* renamed from: c, reason: collision with root package name */
        public static Field f2673c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f2674d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2671a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2672b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2673c = declaredField3;
                declaredField3.setAccessible(true);
                f2674d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static WindowInsetsCompat a(View view) throws IllegalAccessException, IllegalArgumentException {
            if (f2674d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2671a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2672b.get(obj);
                        Rect rect2 = (Rect) f2673c.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat windowInsetsCompatA = new b().c(j0.b.c(rect)).d(j0.b.c(rect2)).a();
                            windowInsetsCompatA.t(windowInsetsCompatA);
                            windowInsetsCompatA.d(view.getRootView());
                            return windowInsetsCompatA;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    public static class e extends d {
        public e() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void c(int i10, @NonNull j0.b bVar) {
            this.f2682c.setInsets(m.a(i10), bVar.e());
        }

        public e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f2683a;

        /* renamed from: b, reason: collision with root package name */
        public j0.b[] f2684b;

        public f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            j0.b[] bVarArr = this.f2684b;
            if (bVarArr != null) {
                j0.b bVarF = bVarArr[Type.c(1)];
                j0.b bVarF2 = this.f2684b[Type.c(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f2683a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f2683a.f(1);
                }
                g(j0.b.a(bVarF, bVarF2));
                j0.b bVar = this.f2684b[Type.c(16)];
                if (bVar != null) {
                    f(bVar);
                }
                j0.b bVar2 = this.f2684b[Type.c(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                j0.b bVar3 = this.f2684b[Type.c(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        @NonNull
        public abstract WindowInsetsCompat b();

        public void c(int i10, @NonNull j0.b bVar) {
            if (this.f2684b == null) {
                this.f2684b = new j0.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f2684b[Type.c(i11)] = bVar;
                }
            }
        }

        public abstract void e(@NonNull j0.b bVar);

        public abstract void g(@NonNull j0.b bVar);

        public f(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f2683a = windowInsetsCompat;
        }

        public void d(@NonNull j0.b bVar) {
        }

        public void f(@NonNull j0.b bVar) {
        }

        public void h(@NonNull j0.b bVar) {
        }
    }

    public static class i extends h {
        public i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public WindowInsetsCompat a() {
            return WindowInsetsCompat.w(this.f2690c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2690c, iVar.f2690c) && Objects.equals(this.f2694g, iVar.f2694g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @Nullable
        public q f() {
            return q.e(this.f2690c.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public int hashCode() {
            return this.f2690c.hashCode();
        }

        public i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull i iVar) {
            super(windowInsetsCompat, iVar);
        }
    }

    public static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        public static final WindowInsetsCompat f2699q = WindowInsetsCompat.w(WindowInsets.CONSUMED);

        public k(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        public final void d(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public j0.b g(int i10) {
            return j0.b.d(this.f2690c.getInsets(m.a(i10)));
        }

        public k(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull k kVar) {
            super(windowInsetsCompat, kVar);
        }
    }

    public static final class m {
        public static int a(int i10) {
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
            f2669b = k.f2699q;
        } else {
            f2669b = l.f2700b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2670a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f2670a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2670a = new i(this, windowInsets);
        } else {
            this.f2670a = new h(this, windowInsets);
        }
    }

    public static j0.b o(j0.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f21686a - i10);
        int iMax2 = Math.max(0, bVar.f21687b - i11);
        int iMax3 = Math.max(0, bVar.f21688c - i12);
        int iMax4 = Math.max(0, bVar.f21689d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : j0.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static WindowInsetsCompat x(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) r0.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.t(ViewCompat.F(view));
            windowInsetsCompat.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public WindowInsetsCompat a() {
        return this.f2670a.a();
    }

    public WindowInsetsCompat b() {
        return this.f2670a.b();
    }

    public WindowInsetsCompat c() {
        return this.f2670a.c();
    }

    public void d(View view) {
        this.f2670a.d(view);
    }

    public q e() {
        return this.f2670a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return r0.d.a(this.f2670a, ((WindowInsetsCompat) obj).f2670a);
        }
        return false;
    }

    public j0.b f(int i10) {
        return this.f2670a.g(i10);
    }

    public j0.b g() {
        return this.f2670a.i();
    }

    public j0.b h() {
        return this.f2670a.j();
    }

    public int hashCode() {
        l lVar = this.f2670a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f2670a.k().f21689d;
    }

    public int j() {
        return this.f2670a.k().f21686a;
    }

    public int k() {
        return this.f2670a.k().f21688c;
    }

    public int l() {
        return this.f2670a.k().f21687b;
    }

    public boolean m() {
        return !this.f2670a.k().equals(j0.b.f21685e);
    }

    public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
        return this.f2670a.m(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f2670a.n();
    }

    public WindowInsetsCompat q(int i10, int i11, int i12, int i13) {
        return new b(this).d(j0.b.b(i10, i11, i12, i13)).a();
    }

    public void r(j0.b[] bVarArr) {
        this.f2670a.p(bVarArr);
    }

    public void s(j0.b bVar) {
        this.f2670a.q(bVar);
    }

    public void t(WindowInsetsCompat windowInsetsCompat) {
        this.f2670a.r(windowInsetsCompat);
    }

    public void u(j0.b bVar) {
        this.f2670a.s(bVar);
    }

    public WindowInsets v() {
        l lVar = this.f2670a;
        if (lVar instanceof g) {
            return ((g) lVar).f2690c;
        }
        return null;
    }

    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public static Field f2676e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f2677f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor f2678g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f2679h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f2680c;

        /* renamed from: d, reason: collision with root package name */
        public j0.b f2681d;

        public c() {
            this.f2680c = i();
        }

        @Nullable
        private static WindowInsets i() {
            if (!f2677f) {
                try {
                    f2676e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f2677f = true;
            }
            Field field = f2676e;
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
            if (!f2679h) {
                try {
                    f2678g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f2679h = true;
            }
            Constructor constructor = f2678g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatW = WindowInsetsCompat.w(this.f2680c);
            windowInsetsCompatW.r(this.f2684b);
            windowInsetsCompatW.u(this.f2681d);
            return windowInsetsCompatW;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void e(@Nullable j0.b bVar) {
            this.f2681d = bVar;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void g(@NonNull j0.b bVar) {
            WindowInsets windowInsets = this.f2680c;
            if (windowInsets != null) {
                this.f2680c = windowInsets.replaceSystemWindowInsets(bVar.f21686a, bVar.f21687b, bVar.f21688c, bVar.f21689d);
            }
        }

        public c(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f2680c = windowInsetsCompat.v();
        }
    }

    public static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f2682c;

        public d() {
            this.f2682c = p0.e.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatW = WindowInsetsCompat.w(this.f2682c.build());
            windowInsetsCompatW.r(this.f2684b);
            return windowInsetsCompatW;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void d(@NonNull j0.b bVar) {
            this.f2682c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void e(@NonNull j0.b bVar) {
            this.f2682c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void f(@NonNull j0.b bVar) {
            this.f2682c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void g(@NonNull j0.b bVar) {
            this.f2682c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f
        public void h(@NonNull j0.b bVar) {
            this.f2682c.setTappableElementInsets(bVar.e());
        }

        public d(@NonNull WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderA;
            super(windowInsetsCompat);
            WindowInsets windowInsetsV = windowInsetsCompat.v();
            if (windowInsetsV != null) {
                builderA = c2.a(windowInsetsV);
            } else {
                builderA = p0.e.a();
            }
            this.f2682c = builderA;
        }
    }

    public static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        public j0.b f2695m;

        public h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f2695m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.w(this.f2690c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.w(this.f2690c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public final j0.b i() {
            if (this.f2695m == null) {
                this.f2695m = j0.b.b(this.f2690c.getStableInsetLeft(), this.f2690c.getStableInsetTop(), this.f2690c.getStableInsetRight(), this.f2690c.getStableInsetBottom());
            }
            return this.f2695m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public boolean n() {
            return this.f2690c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void s(@Nullable j0.b bVar) {
            this.f2695m = bVar;
        }

        public h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull h hVar) {
            super(windowInsetsCompat, hVar);
            this.f2695m = null;
            this.f2695m = hVar.f2695m;
        }
    }

    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f2685h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f2686i;

        /* renamed from: j, reason: collision with root package name */
        public static Class f2687j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f2688k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f2689l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f2690c;

        /* renamed from: d, reason: collision with root package name */
        public j0.b[] f2691d;

        /* renamed from: e, reason: collision with root package name */
        public j0.b f2692e;

        /* renamed from: f, reason: collision with root package name */
        public WindowInsetsCompat f2693f;

        /* renamed from: g, reason: collision with root package name */
        public j0.b f2694g;

        public g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f2692e = null;
            this.f2690c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private j0.b t(int i10, boolean z10) {
            j0.b bVarA = j0.b.f21685e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = j0.b.a(bVarA, u(i11, z10));
                }
            }
            return bVarA;
        }

        private j0.b v() {
            WindowInsetsCompat windowInsetsCompat = this.f2693f;
            return windowInsetsCompat != null ? windowInsetsCompat.g() : j0.b.f21685e;
        }

        @Nullable
        private j0.b w(@NonNull View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2685h) {
                x();
            }
            Method method = f2686i;
            if (method != null && f2687j != null && f2688k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2688k.get(f2689l.get(objInvoke));
                    if (rect != null) {
                        return j0.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() throws ClassNotFoundException, SecurityException {
            try {
                f2686i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2687j = cls;
                f2688k = cls.getDeclaredField("mVisibleInsets");
                f2689l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2688k.setAccessible(true);
                f2689l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f2685h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void d(@NonNull View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            j0.b bVarW = w(view);
            if (bVarW == null) {
                bVarW = j0.b.f21685e;
            }
            q(bVarW);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.t(this.f2693f);
            windowInsetsCompat.s(this.f2694g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2694g, ((g) obj).f2694g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public j0.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public final j0.b k() {
            if (this.f2692e == null) {
                this.f2692e = j0.b.b(this.f2690c.getSystemWindowInsetLeft(), this.f2690c.getSystemWindowInsetTop(), this.f2690c.getSystemWindowInsetRight(), this.f2690c.getSystemWindowInsetBottom());
            }
            return this.f2692e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public WindowInsetsCompat m(int i10, int i11, int i12, int i13) {
            b bVar = new b(WindowInsetsCompat.w(this.f2690c));
            bVar.d(WindowInsetsCompat.o(k(), i10, i11, i12, i13));
            bVar.c(WindowInsetsCompat.o(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public boolean o() {
            return this.f2690c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void p(j0.b[] bVarArr) {
            this.f2691d = bVarArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void q(@NonNull j0.b bVar) {
            this.f2694g = bVar;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        public void r(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f2693f = windowInsetsCompat;
        }

        @NonNull
        public j0.b u(int i10, boolean z10) {
            j0.b bVarG;
            int i11;
            if (i10 == 1) {
                return z10 ? j0.b.b(0, Math.max(v().f21687b, k().f21687b), 0, 0) : j0.b.b(0, k().f21687b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    j0.b bVarV = v();
                    j0.b bVarI = i();
                    return j0.b.b(Math.max(bVarV.f21686a, bVarI.f21686a), 0, Math.max(bVarV.f21688c, bVarI.f21688c), Math.max(bVarV.f21689d, bVarI.f21689d));
                }
                j0.b bVarK = k();
                WindowInsetsCompat windowInsetsCompat = this.f2693f;
                bVarG = windowInsetsCompat != null ? windowInsetsCompat.g() : null;
                int iMin = bVarK.f21689d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f21689d);
                }
                return j0.b.b(bVarK.f21686a, 0, bVarK.f21688c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return j0.b.f21685e;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f2693f;
                q qVarE = windowInsetsCompat2 != null ? windowInsetsCompat2.e() : f();
                return qVarE != null ? j0.b.b(qVarE.b(), qVarE.d(), qVarE.c(), qVarE.a()) : j0.b.f21685e;
            }
            j0.b[] bVarArr = this.f2691d;
            bVarG = bVarArr != null ? bVarArr[Type.c(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            j0.b bVarK2 = k();
            j0.b bVarV2 = v();
            int i12 = bVarK2.f21689d;
            if (i12 > bVarV2.f21689d) {
                return j0.b.b(0, 0, 0, i12);
            }
            j0.b bVar = this.f2694g;
            return (bVar == null || bVar.equals(j0.b.f21685e) || (i11 = this.f2694g.f21689d) <= bVarV2.f21689d) ? j0.b.f21685e : j0.b.b(0, 0, 0, i11);
        }

        public g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull g gVar) {
            this(windowInsetsCompat, new WindowInsets(gVar.f2690c));
        }
    }

    public static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        public j0.b f2696n;

        /* renamed from: o, reason: collision with root package name */
        public j0.b f2697o;

        /* renamed from: p, reason: collision with root package name */
        public j0.b f2698p;

        public j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f2696n = null;
            this.f2697o = null;
            this.f2698p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public j0.b h() {
            if (this.f2697o == null) {
                this.f2697o = j0.b.d(this.f2690c.getMandatorySystemGestureInsets());
            }
            return this.f2697o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public j0.b j() {
            if (this.f2696n == null) {
                this.f2696n = j0.b.d(this.f2690c.getSystemGestureInsets());
            }
            return this.f2696n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public j0.b l() {
            if (this.f2698p == null) {
                this.f2698p = j0.b.d(this.f2690c.getTappableElementInsets());
            }
            return this.f2698p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.l
        @NonNull
        public WindowInsetsCompat m(int i10, int i11, int i12, int i13) {
            return WindowInsetsCompat.w(this.f2690c.inset(i10, i11, i12, i13));
        }

        public j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull j jVar) {
            super(windowInsetsCompat, jVar);
            this.f2696n = null;
            this.f2697o = null;
            this.f2698p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.h, androidx.core.view.WindowInsetsCompat.l
        public void s(@Nullable j0.b bVar) {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f2675a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2675a = new e();
            } else if (i10 >= 29) {
                this.f2675a = new d();
            } else {
                this.f2675a = new c();
            }
        }

        public WindowInsetsCompat a() {
            return this.f2675a.b();
        }

        public b b(int i10, j0.b bVar) {
            this.f2675a.c(i10, bVar);
            return this;
        }

        public b c(j0.b bVar) {
            this.f2675a.e(bVar);
            return this;
        }

        public b d(j0.b bVar) {
            this.f2675a.g(bVar);
            return this;
        }

        public b(WindowInsetsCompat windowInsetsCompat) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2675a = new e(windowInsetsCompat);
            } else if (i10 >= 29) {
                this.f2675a = new d(windowInsetsCompat);
            } else {
                this.f2675a = new c(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            l lVar = windowInsetsCompat.f2670a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f2670a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f2670a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f2670a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f2670a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f2670a = new g(this, (g) lVar);
            } else {
                this.f2670a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f2670a = new l(this);
    }

    public static class l {

        /* renamed from: b, reason: collision with root package name */
        public static final WindowInsetsCompat f2700b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f2701a;

        public l(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f2701a = windowInsetsCompat;
        }

        @NonNull
        public WindowInsetsCompat a() {
            return this.f2701a;
        }

        @NonNull
        public WindowInsetsCompat b() {
            return this.f2701a;
        }

        @NonNull
        public WindowInsetsCompat c() {
            return this.f2701a;
        }

        public void d(@NonNull View view) {
        }

        public void e(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && r0.d.a(k(), lVar.k()) && r0.d.a(i(), lVar.i()) && r0.d.a(f(), lVar.f());
        }

        @Nullable
        public q f() {
            return null;
        }

        @NonNull
        public j0.b g(int i10) {
            return j0.b.f21685e;
        }

        @NonNull
        public j0.b h() {
            return k();
        }

        public int hashCode() {
            return r0.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        @NonNull
        public j0.b i() {
            return j0.b.f21685e;
        }

        @NonNull
        public j0.b j() {
            return k();
        }

        @NonNull
        public j0.b k() {
            return j0.b.f21685e;
        }

        @NonNull
        public j0.b l() {
            return k();
        }

        @NonNull
        public WindowInsetsCompat m(int i10, int i11, int i12, int i13) {
            return f2700b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void r(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void p(j0.b[] bVarArr) {
        }

        public void q(@NonNull j0.b bVar) {
        }

        public void s(j0.b bVar) {
        }
    }
}
