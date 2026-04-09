package e4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: b, reason: collision with root package name */
    public static final c2 f22314b;

    /* renamed from: a, reason: collision with root package name */
    public final z1 f22315a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f22314b = y1.f22421s;
        } else if (i4 >= 30) {
            f22314b = w1.f22415r;
        } else {
            f22314b = z1.f22425b;
        }
    }

    public c2(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f22315a = new y1(this, windowInsets);
            return;
        }
        if (i4 >= 31) {
            this.f22315a = new x1(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f22315a = new w1(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f22315a = new v1(this, windowInsets);
        } else if (i4 >= 28) {
            this.f22315a = new u1(this, windowInsets);
        } else {
            this.f22315a = new t1(this, windowInsets);
        }
    }

    public static v3.b e(v3.b bVar, int i4, int i10, int i11, int i12) {
        int iMax = Math.max(0, bVar.f35793a - i4);
        int iMax2 = Math.max(0, bVar.f35794b - i10);
        int iMax3 = Math.max(0, bVar.f35795c - i11);
        int iMax4 = Math.max(0, bVar.f35796d - i12);
        return (iMax == i4 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? bVar : v3.b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static c2 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        c2 c2Var = new c2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = v0.f22405a;
            c2 c2VarA = n0.a(view);
            z1 z1Var = c2Var.f22315a;
            z1Var.t(c2VarA);
            z1Var.d(view.getRootView());
            z1Var.v(view.getWindowSystemUiVisibility());
        }
        return c2Var;
    }

    public final int a() {
        return this.f22315a.l().f35796d;
    }

    public final int b() {
        return this.f22315a.l().f35793a;
    }

    public final int c() {
        return this.f22315a.l().f35795c;
    }

    public final int d() {
        return this.f22315a.l().f35794b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c2) {
            return Objects.equals(this.f22315a, ((c2) obj).f22315a);
        }
        return false;
    }

    public final c2 f(int i4, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        r1 q1Var = i13 >= 34 ? new q1(this) : i13 >= 31 ? new p1(this) : i13 >= 30 ? new o1(this) : i13 >= 29 ? new n1(this) : new m1(this);
        q1Var.g(v3.b.c(i4, i10, i11, i12));
        return q1Var.b();
    }

    public final WindowInsets g() {
        z1 z1Var = this.f22315a;
        if (z1Var instanceof s1) {
            return ((s1) z1Var).f22391c;
        }
        return null;
    }

    public final int hashCode() {
        z1 z1Var = this.f22315a;
        if (z1Var == null) {
            return 0;
        }
        return z1Var.hashCode();
    }

    public c2(c2 c2Var) {
        if (c2Var != null) {
            z1 z1Var = c2Var.f22315a;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34 && (z1Var instanceof y1)) {
                this.f22315a = new y1(this, (y1) z1Var);
            } else if (i4 >= 31 && (z1Var instanceof x1)) {
                this.f22315a = new x1(this, (x1) z1Var);
            } else if (i4 >= 30 && (z1Var instanceof w1)) {
                this.f22315a = new w1(this, (w1) z1Var);
            } else if (i4 >= 29 && (z1Var instanceof v1)) {
                this.f22315a = new v1(this, (v1) z1Var);
            } else if (i4 >= 28 && (z1Var instanceof u1)) {
                this.f22315a = new u1(this, (u1) z1Var);
            } else if (z1Var instanceof t1) {
                this.f22315a = new t1(this, (t1) z1Var);
            } else if (z1Var instanceof s1) {
                this.f22315a = new s1(this, (s1) z1Var);
            } else {
                this.f22315a = new z1(this);
            }
            z1Var.e(this);
            return;
        }
        this.f22315a = new z1(this);
    }
}
