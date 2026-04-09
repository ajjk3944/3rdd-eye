package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class g91 extends l91 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public y20[] d;
    public y20 e;
    public o91 f;
    public y20 g;

    public g91(o91 o91Var, WindowInsets windowInsets) {
        super(o91Var);
        this.e = null;
        this.c = windowInsets;
    }

    private y20 r(int i2, boolean z) {
        y20 y20VarA = y20.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                y20VarA = y20.a(y20VarA, s(i3, z));
            }
        }
        return y20VarA;
    }

    private y20 t() {
        o91 o91Var = this.f;
        return o91Var != null ? o91Var.a.h() : y20.e;
    }

    private y20 u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) k.get(l.get(objInvoke));
                    if (rect != null) {
                        return y20.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void v() throws ClassNotFoundException, SecurityException {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // defpackage.l91
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y20 y20VarU = u(view);
        if (y20VarU == null) {
            y20VarU = y20.e;
        }
        w(y20VarU);
    }

    @Override // defpackage.l91
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((g91) obj).g);
        }
        return false;
    }

    @Override // defpackage.l91
    public y20 f(int i2) {
        return r(i2, false);
    }

    @Override // defpackage.l91
    public final y20 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = y20.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.l91
    public o91 l(int i2, int i3, int i4, int i5) {
        o91 o91VarG = o91.g(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        f91 e91Var = i6 >= 30 ? new e91(o91VarG) : i6 >= 29 ? new d91(o91VarG) : new c91(o91VarG);
        e91Var.g(o91.e(j(), i2, i3, i4, i5));
        e91Var.e(o91.e(h(), i2, i3, i4, i5));
        return e91Var.b();
    }

    @Override // defpackage.l91
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.l91
    public void o(y20[] y20VarArr) {
        this.d = y20VarArr;
    }

    @Override // defpackage.l91
    public void p(o91 o91Var) {
        this.f = o91Var;
    }

    public y20 s(int i2, boolean z) {
        y20 y20VarH;
        int i3;
        if (i2 == 1) {
            return z ? y20.b(0, Math.max(t().b, j().b), 0, 0) : y20.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                y20 y20VarT = t();
                y20 y20VarH2 = h();
                return y20.b(Math.max(y20VarT.a, y20VarH2.a), 0, Math.max(y20VarT.c, y20VarH2.c), Math.max(y20VarT.d, y20VarH2.d));
            }
            y20 y20VarJ = j();
            o91 o91Var = this.f;
            y20VarH = o91Var != null ? o91Var.a.h() : null;
            int iMin = y20VarJ.d;
            if (y20VarH != null) {
                iMin = Math.min(iMin, y20VarH.d);
            }
            return y20.b(y20VarJ.a, 0, y20VarJ.c, iMin);
        }
        y20 y20Var = y20.e;
        if (i2 == 8) {
            y20[] y20VarArr = this.d;
            y20VarH = y20VarArr != null ? y20VarArr[g82.j(8)] : null;
            if (y20VarH != null) {
                return y20VarH;
            }
            y20 y20VarJ2 = j();
            y20 y20VarT2 = t();
            int i4 = y20VarJ2.d;
            if (i4 > y20VarT2.d) {
                return y20.b(0, 0, 0, i4);
            }
            y20 y20Var2 = this.g;
            return (y20Var2 == null || y20Var2.equals(y20Var) || (i3 = this.g.d) <= y20VarT2.d) ? y20Var : y20.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return y20Var;
        }
        o91 o91Var2 = this.f;
        hp hpVarE = o91Var2 != null ? o91Var2.a.e() : e();
        if (hpVarE == null) {
            return y20Var;
        }
        int i5 = Build.VERSION.SDK_INT;
        return y20.b(i5 >= 28 ? gp.d(hpVarE.a) : 0, i5 >= 28 ? gp.f(hpVarE.a) : 0, i5 >= 28 ? gp.e(hpVarE.a) : 0, i5 >= 28 ? gp.c(hpVarE.a) : 0);
    }

    public void w(y20 y20Var) {
        this.g = y20Var;
    }
}
