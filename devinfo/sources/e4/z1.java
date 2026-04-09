package e4;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class z1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c2 f22425b;

    /* renamed from: a, reason: collision with root package name */
    public final c2 f22426a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f22425b = (i4 >= 34 ? new q1() : i4 >= 31 ? new p1() : i4 >= 30 ? new o1() : i4 >= 29 ? new n1() : new m1()).b().f22315a.a().f22315a.b().f22315a.c();
    }

    public z1(c2 c2Var) {
        this.f22426a = c2Var;
    }

    public c2 a() {
        return this.f22426a;
    }

    public c2 b() {
        return this.f22426a;
    }

    public c2 c() {
        return this.f22426a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return p() == z1Var.p() && o() == z1Var.o() && Objects.equals(l(), z1Var.l()) && Objects.equals(j(), z1Var.j()) && Objects.equals(f(), z1Var.f());
    }

    public k f() {
        return null;
    }

    public v3.b g(int i4) {
        return v3.b.f35792e;
    }

    public v3.b h(int i4) {
        if ((i4 & 8) == 0) {
            return v3.b.f35792e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public v3.b i() {
        return l();
    }

    public v3.b j() {
        return v3.b.f35792e;
    }

    public v3.b k() {
        return l();
    }

    public v3.b l() {
        return v3.b.f35792e;
    }

    public v3.b m() {
        return l();
    }

    public c2 n(int i4, int i10, int i11, int i12) {
        return f22425b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i4) {
        return true;
    }

    public void d(View view) {
    }

    public void e(c2 c2Var) {
    }

    public void r(v3.b[] bVarArr) {
    }

    public void s(v3.b bVar) {
    }

    public void t(c2 c2Var) {
    }

    public void u(v3.b bVar) {
    }

    public void v(int i4) {
    }
}
