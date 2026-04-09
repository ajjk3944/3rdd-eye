package e4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.z3;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s1 extends z1 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f22387i = false;
    public static Method j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f22388k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f22389l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f22390m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f22391c;

    /* renamed from: d, reason: collision with root package name */
    public v3.b[] f22392d;

    /* renamed from: e, reason: collision with root package name */
    public v3.b f22393e;

    /* renamed from: f, reason: collision with root package name */
    public c2 f22394f;
    public v3.b g;

    /* renamed from: h, reason: collision with root package name */
    public int f22395h;

    public s1(c2 c2Var, WindowInsets windowInsets) {
        super(c2Var);
        this.f22393e = null;
        this.f22391c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void B() throws ClassNotFoundException, SecurityException {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f22388k = cls;
            f22389l = cls.getDeclaredField("mVisibleInsets");
            f22390m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f22389l.setAccessible(true);
            f22390m.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f22387i = true;
    }

    public static boolean C(int i4, int i10) {
        return (i4 & 6) == (i10 & 6);
    }

    @SuppressLint({"WrongConstant"})
    private v3.b w(int i4, boolean z3) {
        v3.b bVarA = v3.b.f35792e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i4 & i10) != 0) {
                bVarA = v3.b.a(bVarA, x(i10, z3));
            }
        }
        return bVarA;
    }

    private v3.b y() {
        c2 c2Var = this.f22394f;
        return c2Var != null ? c2Var.f22315a.j() : v3.b.f35792e;
    }

    private v3.b z(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f22387i) {
            B();
        }
        Method method = j;
        if (method != null && f22388k != null && f22389l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f22389l.get(f22390m.get(objInvoke));
                if (rect != null) {
                    return v3.b.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    public boolean A(int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 8 && i4 != 128) {
                return true;
            }
        }
        return !x(i4, false).equals(v3.b.f35792e);
    }

    @Override // e4.z1
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v3.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = v3.b.f35792e;
        }
        s(bVarZ);
    }

    @Override // e4.z1
    public void e(c2 c2Var) {
        c2Var.f22315a.t(this.f22394f);
        v3.b bVar = this.g;
        z1 z1Var = c2Var.f22315a;
        z1Var.s(bVar);
        z1Var.v(this.f22395h);
    }

    @Override // e4.z1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Objects.equals(this.g, s1Var.g) && C(this.f22395h, s1Var.f22395h);
    }

    @Override // e4.z1
    public v3.b g(int i4) {
        return w(i4, false);
    }

    @Override // e4.z1
    public v3.b h(int i4) {
        return w(i4, true);
    }

    @Override // e4.z1
    public final v3.b l() {
        if (this.f22393e == null) {
            WindowInsets windowInsets = this.f22391c;
            this.f22393e = v3.b.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f22393e;
    }

    @Override // e4.z1
    public c2 n(int i4, int i10, int i11, int i12) {
        c2 c2VarH = c2.h(null, this.f22391c);
        int i13 = Build.VERSION.SDK_INT;
        r1 q1Var = i13 >= 34 ? new q1(c2VarH) : i13 >= 31 ? new p1(c2VarH) : i13 >= 30 ? new o1(c2VarH) : i13 >= 29 ? new n1(c2VarH) : new m1(c2VarH);
        q1Var.g(c2.e(l(), i4, i10, i11, i12));
        q1Var.e(c2.e(j(), i4, i10, i11, i12));
        return q1Var.b();
    }

    @Override // e4.z1
    public boolean p() {
        return this.f22391c.isRound();
    }

    @Override // e4.z1
    @SuppressLint({"WrongConstant"})
    public boolean q(int i4) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i4 & i10) != 0 && !A(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // e4.z1
    public void r(v3.b[] bVarArr) {
        this.f22392d = bVarArr;
    }

    @Override // e4.z1
    public void s(v3.b bVar) {
        this.g = bVar;
    }

    @Override // e4.z1
    public void t(c2 c2Var) {
        this.f22394f = c2Var;
    }

    @Override // e4.z1
    public void v(int i4) {
        this.f22395h = i4;
    }

    public v3.b x(int i4, boolean z3) {
        v3.b bVarJ;
        int i10;
        v3.b bVar = v3.b.f35792e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 8) {
                    v3.b[] bVarArr = this.f22392d;
                    bVarJ = bVarArr != null ? bVarArr[z3.n(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    v3.b bVarL = l();
                    v3.b bVarY = y();
                    int i11 = bVarL.f35796d;
                    if (i11 > bVarY.f35796d) {
                        return v3.b.c(0, 0, 0, i11);
                    }
                    v3.b bVar2 = this.g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i10 = this.g.f35796d) > bVarY.f35796d) {
                        return v3.b.c(0, 0, 0, i10);
                    }
                } else {
                    if (i4 == 16) {
                        return k();
                    }
                    if (i4 == 32) {
                        return i();
                    }
                    if (i4 == 64) {
                        return m();
                    }
                    if (i4 == 128) {
                        c2 c2Var = this.f22394f;
                        k kVarF = c2Var != null ? c2Var.f22315a.f() : f();
                        if (kVarF != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return v3.b.c(i12 >= 28 ? a4.f.m(kVarF.f22363a) : 0, i12 >= 28 ? a4.f.o(kVarF.f22363a) : 0, i12 >= 28 ? a4.f.n(kVarF.f22363a) : 0, i12 >= 28 ? a4.f.l(kVarF.f22363a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    v3.b bVarY2 = y();
                    v3.b bVarJ2 = j();
                    return v3.b.c(Math.max(bVarY2.f35793a, bVarJ2.f35793a), 0, Math.max(bVarY2.f35795c, bVarJ2.f35795c), Math.max(bVarY2.f35796d, bVarJ2.f35796d));
                }
                if ((this.f22395h & 2) == 0) {
                    v3.b bVarL2 = l();
                    c2 c2Var2 = this.f22394f;
                    bVarJ = c2Var2 != null ? c2Var2.f22315a.j() : null;
                    int iMin = bVarL2.f35796d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f35796d);
                    }
                    return v3.b.c(bVarL2.f35793a, 0, bVarL2.f35795c, iMin);
                }
            }
        } else {
            if (z3) {
                return v3.b.c(0, Math.max(y().f35794b, l().f35794b), 0, 0);
            }
            if ((this.f22395h & 4) == 0) {
                return v3.b.c(0, l().f35794b, 0, 0);
            }
        }
        return bVar;
    }

    public s1(c2 c2Var, s1 s1Var) {
        this(c2Var, new WindowInsets(s1Var.f22391c));
    }
}
