package u3;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f23160b;

    /* renamed from: a, reason: collision with root package name */
    public final h1 f23161a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f23160b = (i10 >= 30 ? new x0() : i10 >= 29 ? new w0() : new v0()).b().f23176a.a().f23176a.b().f23176a.c();
    }

    public f1(h1 h1Var) {
        this.f23161a = h1Var;
    }

    public h1 a() {
        return this.f23161a;
    }

    public h1 b() {
        return this.f23161a;
    }

    public h1 c() {
        return this.f23161a;
    }

    public h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return o() == f1Var.o() && n() == f1Var.n() && Objects.equals(k(), f1Var.k()) && Objects.equals(i(), f1Var.i()) && Objects.equals(e(), f1Var.e());
    }

    public k3.d f(int i10) {
        return k3.d.f14013e;
    }

    public k3.d g(int i10) {
        if ((i10 & 8) == 0) {
            return k3.d.f14013e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public k3.d h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public k3.d i() {
        return k3.d.f14013e;
    }

    public k3.d j() {
        return k();
    }

    public k3.d k() {
        return k3.d.f14013e;
    }

    public k3.d l() {
        return k();
    }

    public h1 m(int i10, int i11, int i12, int i13) {
        return f23160b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(k3.d[] dVarArr) {
    }

    public void r(h1 h1Var) {
    }

    public void s(k3.d dVar) {
    }
}
