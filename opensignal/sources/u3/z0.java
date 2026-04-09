package u3;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class z0 extends f1 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f23237h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f23238i;
    public static Class j;
    public static Field k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f23239l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f23240c;

    /* renamed from: d, reason: collision with root package name */
    public k3.d[] f23241d;

    /* renamed from: e, reason: collision with root package name */
    public k3.d f23242e;

    /* renamed from: f, reason: collision with root package name */
    public h1 f23243f;

    /* renamed from: g, reason: collision with root package name */
    public k3.d f23244g;

    public z0(h1 h1Var, WindowInsets windowInsets) {
        super(h1Var);
        this.f23242e = null;
        this.f23240c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private k3.d t(int i10, boolean z10) {
        k3.d dVarA = k3.d.f14013e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                dVarA = k3.d.a(dVarA, u(i11, z10));
            }
        }
        return dVarA;
    }

    private k3.d v() {
        h1 h1Var = this.f23243f;
        return h1Var != null ? h1Var.f23176a.i() : k3.d.f14013e;
    }

    private k3.d w(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f23237h) {
            y();
        }
        Method method = f23238i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    io.sentry.android.core.e0.q("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(f23239l.get(objInvoke));
                if (rect != null) {
                    return k3.d.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                io.sentry.android.core.e0.c("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void y() throws ClassNotFoundException, SecurityException {
        try {
            f23238i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            f23239l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            f23239l.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            io.sentry.android.core.e0.c("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f23237h = true;
    }

    @Override // u3.f1
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k3.d dVarW = w(view);
        if (dVarW == null) {
            dVarW = k3.d.f14013e;
        }
        z(dVarW);
    }

    @Override // u3.f1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f23244g, ((z0) obj).f23244g);
        }
        return false;
    }

    @Override // u3.f1
    public k3.d f(int i10) {
        return t(i10, false);
    }

    @Override // u3.f1
    public k3.d g(int i10) {
        return t(i10, true);
    }

    @Override // u3.f1
    public final k3.d k() {
        if (this.f23242e == null) {
            WindowInsets windowInsets = this.f23240c;
            this.f23242e = k3.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f23242e;
    }

    @Override // u3.f1
    public h1 m(int i10, int i11, int i12, int i13) {
        h1 h1VarG = h1.g(null, this.f23240c);
        int i14 = Build.VERSION.SDK_INT;
        y0 x0Var = i14 >= 30 ? new x0(h1VarG) : i14 >= 29 ? new w0(h1VarG) : new v0(h1VarG);
        x0Var.g(h1.e(k(), i10, i11, i12, i13));
        x0Var.e(h1.e(i(), i10, i11, i12, i13));
        return x0Var.b();
    }

    @Override // u3.f1
    public boolean o() {
        return this.f23240c.isRound();
    }

    @Override // u3.f1
    @SuppressLint({"WrongConstant"})
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0 && !x(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // u3.f1
    public void q(k3.d[] dVarArr) {
        this.f23241d = dVarArr;
    }

    @Override // u3.f1
    public void r(h1 h1Var) {
        this.f23243f = h1Var;
    }

    public k3.d u(int i10, boolean z10) {
        k3.d dVarI;
        int i11;
        if (i10 == 1) {
            return z10 ? k3.d.b(0, Math.max(v().f14015b, k().f14015b), 0, 0) : k3.d.b(0, k().f14015b, 0, 0);
        }
        if (i10 == 2) {
            if (z10) {
                k3.d dVarV = v();
                k3.d dVarI2 = i();
                return k3.d.b(Math.max(dVarV.f14014a, dVarI2.f14014a), 0, Math.max(dVarV.f14016c, dVarI2.f14016c), Math.max(dVarV.f14017d, dVarI2.f14017d));
            }
            k3.d dVarK = k();
            h1 h1Var = this.f23243f;
            dVarI = h1Var != null ? h1Var.f23176a.i() : null;
            int iMin = dVarK.f14017d;
            if (dVarI != null) {
                iMin = Math.min(iMin, dVarI.f14017d);
            }
            return k3.d.b(dVarK.f14014a, 0, dVarK.f14016c, iMin);
        }
        k3.d dVar = k3.d.f14013e;
        if (i10 == 8) {
            k3.d[] dVarArr = this.f23241d;
            dVarI = dVarArr != null ? dVarArr[se.b.G(8)] : null;
            if (dVarI != null) {
                return dVarI;
            }
            k3.d dVarK2 = k();
            k3.d dVarV2 = v();
            int i12 = dVarK2.f14017d;
            if (i12 > dVarV2.f14017d) {
                return k3.d.b(0, 0, 0, i12);
            }
            k3.d dVar2 = this.f23244g;
            if (dVar2 != null && !dVar2.equals(dVar) && (i11 = this.f23244g.f14017d) > dVarV2.f14017d) {
                return k3.d.b(0, 0, 0, i11);
            }
        } else {
            if (i10 == 16) {
                return j();
            }
            if (i10 == 32) {
                return h();
            }
            if (i10 == 64) {
                return l();
            }
            if (i10 == 128) {
                h1 h1Var2 = this.f23243f;
                h hVarE = h1Var2 != null ? h1Var2.f23176a.e() : e();
                if (hVarE != null) {
                    int i13 = Build.VERSION.SDK_INT;
                    return k3.d.b(i13 >= 28 ? i3.a.h(hVarE.f23170a) : 0, i13 >= 28 ? i3.a.j(hVarE.f23170a) : 0, i13 >= 28 ? i3.a.i(hVarE.f23170a) : 0, i13 >= 28 ? i3.a.g(hVarE.f23170a) : 0);
                }
            }
        }
        return dVar;
    }

    public boolean x(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !u(i10, false).equals(k3.d.f14013e);
    }

    public void z(k3.d dVar) {
        this.f23244g = dVar;
    }
}
