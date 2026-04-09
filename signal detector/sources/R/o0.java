package R;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f3352b;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f3353a;

    static {
        int i = Build.VERSION.SDK_INT;
        f3352b = (i >= 34 ? new e0() : i >= 30 ? new d0() : i >= 29 ? new c0() : new b0()).b().f3359a.a().f3359a.b().f3359a.c();
    }

    public o0(r0 r0Var) {
        this.f3353a = r0Var;
    }

    public r0 a() {
        return this.f3353a;
    }

    public r0 b() {
        return this.f3353a;
    }

    public r0 c() {
        return this.f3353a;
    }

    public C0181h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return n() == o0Var.n() && m() == o0Var.m() && Objects.equals(j(), o0Var.j()) && Objects.equals(h(), o0Var.h()) && Objects.equals(e(), o0Var.e());
    }

    public J.c f(int i) {
        return J.c.f2006e;
    }

    public J.c g() {
        return j();
    }

    public J.c h() {
        return J.c.f2006e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public J.c i() {
        return j();
    }

    public J.c j() {
        return J.c.f2006e;
    }

    public J.c k() {
        return j();
    }

    public r0 l(int i, int i3, int i6, int i7) {
        return f3352b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(J.c[] cVarArr) {
    }

    public void p(r0 r0Var) {
    }

    public void q(J.c cVar) {
    }

    public void r(int i) {
    }
}
