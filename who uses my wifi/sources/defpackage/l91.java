package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class l91 {
    public static final o91 b;
    public final o91 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 30 ? new e91() : i >= 29 ? new d91() : new c91()).b().a.a().a.b().a.c();
    }

    public l91(o91 o91Var) {
        this.a = o91Var;
    }

    public o91 a() {
        return this.a;
    }

    public o91 b() {
        return this.a;
    }

    public o91 c() {
        return this.a;
    }

    public hp e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l91)) {
            return false;
        }
        l91 l91Var = (l91) obj;
        return n() == l91Var.n() && m() == l91Var.m() && Objects.equals(j(), l91Var.j()) && Objects.equals(h(), l91Var.h()) && Objects.equals(e(), l91Var.e());
    }

    public y20 f(int i) {
        return y20.e;
    }

    public y20 g() {
        return j();
    }

    public y20 h() {
        return y20.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public y20 i() {
        return j();
    }

    public y20 j() {
        return y20.e;
    }

    public y20 k() {
        return j();
    }

    public o91 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(y20[] y20VarArr) {
    }

    public void p(o91 o91Var) {
    }

    public void q(y20 y20Var) {
    }
}
