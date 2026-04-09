package lr;

import java.util.Collection;

/* loaded from: classes.dex */
public final class r0 extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final Class f15676d;

    /* renamed from: g, reason: collision with root package name */
    public final s1 f15677g;

    public r0(Class cls) {
        br.l.e(cls, "jClass");
        this.f15676d = cls;
        this.f15677g = new s1(new m0(this, 1));
    }

    @Override // br.e
    public final Class a() {
        return this.f15676d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return br.l.a(this.f15676d, ((r0) obj).f15676d);
        }
        return false;
    }

    @Override // lr.d0
    public final Collection g() {
        return mq.w.f16945a;
    }

    @Override // lr.d0
    public final Collection h(qs.g gVar) {
        r1 r1Var = ((p0) this.f15677g.c()).f15666d;
        ir.v vVar = p0.f15664g[1];
        Object objC = r1Var.c();
        br.l.d(objC, "<get-scope>(...)");
        return ((at.n) objC).f(gVar, zr.d.FROM_REFLECTION);
    }

    public final int hashCode() {
        return this.f15676d.hashCode();
    }

    @Override // lr.d0
    public final rr.m0 j(int i10) {
        s1 s1Var = ((p0) this.f15677g.c()).f15668f;
        ir.v vVar = p0.f15664g[3];
        lq.r rVar = (lq.r) s1Var.c();
        if (rVar == null) {
            return null;
        }
        ps.g gVar = (ps.g) rVar.f15580a;
        ls.c0 c0Var = (ls.c0) rVar.f15581d;
        ps.f fVar = (ps.f) rVar.f15582g;
        rs.o oVar = os.k.f19789n;
        br.l.d(oVar, "packageLocalVariable");
        ls.g0 g0Var = (ls.g0) a.a.p(c0Var, oVar, i10);
        if (g0Var == null) {
            return null;
        }
        ls.w0 w0Var = c0Var.B;
        br.l.d(w0Var, "packageProto.typeTable");
        return (rr.m0) z1.f(this.f15676d, g0Var, gVar, new h7.h0(w0Var), fVar, q0.E);
    }

    public final String toString() {
        return "file class " + xr.d.a(this.f15676d).b();
    }

    @Override // lr.d0
    public final Class w() {
        s1 s1Var = ((p0) this.f15677g.c()).f15667e;
        ir.v vVar = p0.f15664g[2];
        Class cls = (Class) s1Var.c();
        return cls == null ? this.f15676d : cls;
    }

    @Override // lr.d0
    public final Collection z(qs.g gVar) {
        r1 r1Var = ((p0) this.f15677g.c()).f15666d;
        ir.v vVar = p0.f15664g[1];
        Object objC = r1Var.c();
        br.l.d(objC, "<get-scope>(...)");
        return ((at.n) objC).b(gVar, zr.d.FROM_REFLECTION);
    }
}
