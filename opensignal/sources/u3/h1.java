package u3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f23175b;

    /* renamed from: a, reason: collision with root package name */
    public final f1 f23176a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f23175b = e1.f23158q;
        } else {
            f23175b = f1.f23160b;
        }
    }

    public h1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f23176a = new e1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f23176a = new d1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f23176a = new b1(this, windowInsets);
        } else {
            this.f23176a = new a1(this, windowInsets);
        }
    }

    public static k3.d e(k3.d dVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, dVar.f14014a - i10);
        int iMax2 = Math.max(0, dVar.f14015b - i11);
        int iMax3 = Math.max(0, dVar.f14016c - i12);
        int iMax4 = Math.max(0, dVar.f14017d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? dVar : k3.d.b(iMax, iMax2, iMax3, iMax4);
    }

    public static h1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        h1 h1Var = new h1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.f23177a;
            h1 h1VarA = a0.a(view);
            f1 f1Var = h1Var.f23176a;
            f1Var.r(h1VarA);
            f1Var.d(view.getRootView());
        }
        return h1Var;
    }

    public final int a() {
        return this.f23176a.k().f14017d;
    }

    public final int b() {
        return this.f23176a.k().f14014a;
    }

    public final int c() {
        return this.f23176a.k().f14016c;
    }

    public final int d() {
        return this.f23176a.k().f14015b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return Objects.equals(this.f23176a, ((h1) obj).f23176a);
        }
        return false;
    }

    public final WindowInsets f() {
        f1 f1Var = this.f23176a;
        if (f1Var instanceof z0) {
            return ((z0) f1Var).f23240c;
        }
        return null;
    }

    public final int hashCode() {
        f1 f1Var = this.f23176a;
        if (f1Var == null) {
            return 0;
        }
        return f1Var.hashCode();
    }

    public h1() {
        this.f23176a = new f1(this);
    }
}
