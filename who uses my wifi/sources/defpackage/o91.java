package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o91 {
    public static final o91 b;
    public final l91 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k91.q;
        } else {
            b = l91.b;
        }
    }

    public o91(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new k91(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new j91(this, windowInsets);
        } else if (i >= 28) {
            this.a = new i91(this, windowInsets);
        } else {
            this.a = new h91(this, windowInsets);
        }
    }

    public static y20 e(y20 y20Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, y20Var.a - i);
        int iMax2 = Math.max(0, y20Var.b - i2);
        int iMax3 = Math.max(0, y20Var.c - i3);
        int iMax4 = Math.max(0, y20Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? y20Var : y20.b(iMax, iMax2, iMax3, iMax4);
    }

    public static o91 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        o91 o91Var = new o91(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = e61.a;
            o91 o91VarA = u51.a(view);
            l91 l91Var = o91Var.a;
            l91Var.p(o91VarA);
            l91Var.d(view.getRootView());
        }
        return o91Var;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o91) {
            return Objects.equals(this.a, ((o91) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        l91 l91Var = this.a;
        if (l91Var instanceof g91) {
            return ((g91) l91Var).c;
        }
        return null;
    }

    public final int hashCode() {
        l91 l91Var = this.a;
        if (l91Var == null) {
            return 0;
        }
        return l91Var.hashCode();
    }

    public o91() {
        this.a = new l91(this);
    }
}
