package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends f1 implements m {
    public final Object g0(ek.c cVar) throws Throwable {
        Object obj;
        do {
            obj = f1.f37187a.get(this);
            if (!(obj instanceof v0)) {
                if (obj instanceof p) {
                    throw ((p) obj).f37219a;
                }
                return x.C(obj);
            }
        } while (c0(obj) < 0);
        c1 c1Var = new c1(a.a.r(cVar), this);
        c1Var.s();
        c1Var.v(new e(2, x.r(this, true, new j0(2, c1Var))));
        return c1Var.r();
    }
}
