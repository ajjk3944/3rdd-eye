package R;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f3358b;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f3359a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f3358b = n0.f3351s;
        } else if (i >= 30) {
            f3358b = m0.f3348r;
        } else {
            f3358b = o0.f3352b;
        }
    }

    public r0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f3359a = new n0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f3359a = new m0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f3359a = new k0(this, windowInsets);
        } else if (i >= 28) {
            this.f3359a = new i0(this, windowInsets);
        } else {
            this.f3359a = new h0(this, windowInsets);
        }
    }

    public static J.c e(J.c cVar, int i, int i3, int i6, int i7) {
        int iMax = Math.max(0, cVar.f2007a - i);
        int iMax2 = Math.max(0, cVar.f2008b - i3);
        int iMax3 = Math.max(0, cVar.f2009c - i6);
        int iMax4 = Math.max(0, cVar.f2010d - i7);
        return (iMax == i && iMax2 == i3 && iMax3 == i6 && iMax4 == i7) ? cVar : J.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static r0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        r0 r0Var = new r0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = O.f3270a;
            r0 r0VarA = G.a(view);
            o0 o0Var = r0Var.f3359a;
            o0Var.p(r0VarA);
            o0Var.d(view.getRootView());
            o0Var.r(view.getWindowSystemUiVisibility());
        }
        return r0Var;
    }

    public final int a() {
        return this.f3359a.j().f2010d;
    }

    public final int b() {
        return this.f3359a.j().f2007a;
    }

    public final int c() {
        return this.f3359a.j().f2009c;
    }

    public final int d() {
        return this.f3359a.j().f2008b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return Objects.equals(this.f3359a, ((r0) obj).f3359a);
        }
        return false;
    }

    public final WindowInsets f() {
        o0 o0Var = this.f3359a;
        if (o0Var instanceof g0) {
            return ((g0) o0Var).f3332c;
        }
        return null;
    }

    public final int hashCode() {
        o0 o0Var = this.f3359a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    public r0() {
        this.f3359a = new o0(this);
    }
}
