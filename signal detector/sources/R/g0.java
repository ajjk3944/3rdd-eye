package R;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g0 extends o0 {
    public static boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f3328j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f3329k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f3330l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f3331m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f3332c;

    /* renamed from: d, reason: collision with root package name */
    public J.c[] f3333d;

    /* renamed from: e, reason: collision with root package name */
    public J.c f3334e;

    /* renamed from: f, reason: collision with root package name */
    public r0 f3335f;

    /* renamed from: g, reason: collision with root package name */
    public J.c f3336g;

    /* renamed from: h, reason: collision with root package name */
    public int f3337h;

    public g0(r0 r0Var, WindowInsets windowInsets) {
        super(r0Var);
        this.f3334e = null;
        this.f3332c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private J.c s(int i3, boolean z6) {
        J.c cVarA = J.c.f2006e;
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i3 & i6) != 0) {
                cVarA = J.c.a(cVarA, t(i6, z6));
            }
        }
        return cVarA;
    }

    private J.c u() {
        r0 r0Var = this.f3335f;
        return r0Var != null ? r0Var.f3359a.h() : J.c.f2006e;
    }

    private J.c v(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            w();
        }
        Method method = f3328j;
        if (method != null && f3329k != null && f3330l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3330l.get(f3331m.get(objInvoke));
                if (rect != null) {
                    return J.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void w() throws ClassNotFoundException, SecurityException {
        try {
            f3328j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3329k = cls;
            f3330l = cls.getDeclaredField("mVisibleInsets");
            f3331m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3330l.setAccessible(true);
            f3331m.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        i = true;
    }

    public static boolean y(int i3, int i6) {
        return (i3 & 6) == (i6 & 6);
    }

    @Override // R.o0
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        J.c cVarV = v(view);
        if (cVarV == null) {
            cVarV = J.c.f2006e;
        }
        x(cVarV);
    }

    @Override // R.o0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Objects.equals(this.f3336g, g0Var.f3336g) && y(this.f3337h, g0Var.f3337h);
    }

    @Override // R.o0
    public J.c f(int i3) {
        return s(i3, false);
    }

    @Override // R.o0
    public final J.c j() {
        if (this.f3334e == null) {
            WindowInsets windowInsets = this.f3332c;
            this.f3334e = J.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3334e;
    }

    @Override // R.o0
    public r0 l(int i3, int i6, int i7, int i8) {
        r0 r0VarG = r0.g(null, this.f3332c);
        int i9 = Build.VERSION.SDK_INT;
        f0 e0Var = i9 >= 34 ? new e0(r0VarG) : i9 >= 30 ? new d0(r0VarG) : i9 >= 29 ? new c0(r0VarG) : new b0(r0VarG);
        e0Var.g(r0.e(j(), i3, i6, i7, i8));
        e0Var.e(r0.e(h(), i3, i6, i7, i8));
        return e0Var.b();
    }

    @Override // R.o0
    public boolean n() {
        return this.f3332c.isRound();
    }

    @Override // R.o0
    public void o(J.c[] cVarArr) {
        this.f3333d = cVarArr;
    }

    @Override // R.o0
    public void p(r0 r0Var) {
        this.f3335f = r0Var;
    }

    @Override // R.o0
    public void r(int i3) {
        this.f3337h = i3;
    }

    public J.c t(int i3, boolean z6) {
        J.c cVarH;
        int i6;
        J.c cVar = J.c.f2006e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    J.c[] cVarArr = this.f3333d;
                    cVarH = cVarArr != null ? cVarArr[I5.b.r(8)] : null;
                    if (cVarH != null) {
                        return cVarH;
                    }
                    J.c cVarJ = j();
                    J.c cVarU = u();
                    int i7 = cVarJ.f2010d;
                    if (i7 > cVarU.f2010d) {
                        return J.c.b(0, 0, 0, i7);
                    }
                    J.c cVar2 = this.f3336g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i6 = this.f3336g.f2010d) > cVarU.f2010d) {
                        return J.c.b(0, 0, 0, i6);
                    }
                } else {
                    if (i3 == 16) {
                        return i();
                    }
                    if (i3 == 32) {
                        return g();
                    }
                    if (i3 == 64) {
                        return k();
                    }
                    if (i3 == 128) {
                        r0 r0Var = this.f3335f;
                        C0181h c0181hE = r0Var != null ? r0Var.f3359a.e() : e();
                        if (c0181hE != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return J.c.b(i8 >= 28 ? K.a.g(c0181hE.f3338a) : 0, i8 >= 28 ? K.a.i(c0181hE.f3338a) : 0, i8 >= 28 ? K.a.h(c0181hE.f3338a) : 0, i8 >= 28 ? K.a.f(c0181hE.f3338a) : 0);
                        }
                    }
                }
            } else {
                if (z6) {
                    J.c cVarU2 = u();
                    J.c cVarH2 = h();
                    return J.c.b(Math.max(cVarU2.f2007a, cVarH2.f2007a), 0, Math.max(cVarU2.f2009c, cVarH2.f2009c), Math.max(cVarU2.f2010d, cVarH2.f2010d));
                }
                if ((this.f3337h & 2) == 0) {
                    J.c cVarJ2 = j();
                    r0 r0Var2 = this.f3335f;
                    cVarH = r0Var2 != null ? r0Var2.f3359a.h() : null;
                    int iMin = cVarJ2.f2010d;
                    if (cVarH != null) {
                        iMin = Math.min(iMin, cVarH.f2010d);
                    }
                    return J.c.b(cVarJ2.f2007a, 0, cVarJ2.f2009c, iMin);
                }
            }
        } else {
            if (z6) {
                return J.c.b(0, Math.max(u().f2008b, j().f2008b), 0, 0);
            }
            if ((this.f3337h & 4) == 0) {
                return J.c.b(0, j().f2008b, 0, 0);
            }
        }
        return cVar;
    }

    public void x(J.c cVar) {
        this.f3336g = cVar;
    }
}
