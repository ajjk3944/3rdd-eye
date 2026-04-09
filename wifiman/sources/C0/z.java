package C0;

import E0.AbstractC2624c0;
import kotlin.jvm.internal.AbstractC6492s;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;

/* loaded from: classes.dex */
public final class z implements r {

    /* renamed from: a, reason: collision with root package name */
    private final E0.Q f2168a;

    public z(E0.Q q10) {
        this.f2168a = q10;
    }

    private final long b() {
        E0.Q qA = A.a(this.f2168a);
        r rVarC1 = qA.c1();
        C6531g.a aVar = C6531g.f52335b;
        return C6531g.q(b0(rVarC1, aVar.c()), a().b0(qA.d2(), aVar.c()));
    }

    @Override // C0.r
    public long A(long j10) {
        return a().A(C6531g.r(j10, b()));
    }

    @Override // C0.r
    public C6533i J(r rVar, boolean z10) {
        return a().J(rVar, z10);
    }

    @Override // C0.r
    public boolean M() {
        return a().M();
    }

    @Override // C0.r
    public void O(float[] fArr) {
        a().O(fArr);
    }

    @Override // C0.r
    public long V(r rVar, long j10, boolean z10) {
        if (!(rVar instanceof z)) {
            E0.Q qA = A.a(this.f2168a);
            return C6531g.r(V(qA.e2(), j10, z10), qA.d2().c1().V(rVar, C6531g.f52335b.c(), z10));
        }
        E0.Q q10 = ((z) rVar).f2168a;
        q10.d2().V2();
        E0.Q qC2 = a().t2(q10.d2()).C2();
        if (qC2 != null) {
            long jK = Y0.n.k(Y0.n.l(q10.j2(qC2, !z10), Y0.o.d(j10)), this.f2168a.j2(qC2, !z10));
            return AbstractC6532h.a(Y0.n.h(jK), Y0.n.i(jK));
        }
        E0.Q qA2 = A.a(q10);
        long jL = Y0.n.l(Y0.n.l(q10.j2(qA2, !z10), qA2.r1()), Y0.o.d(j10));
        E0.Q qA3 = A.a(this.f2168a);
        long jK2 = Y0.n.k(jL, Y0.n.l(this.f2168a.j2(qA3, !z10), qA3.r1()));
        long jA = AbstractC6532h.a(Y0.n.h(jK2), Y0.n.i(jK2));
        AbstractC2624c0 abstractC2624c0I2 = qA3.d2().I2();
        AbstractC6492s.f(abstractC2624c0I2);
        AbstractC2624c0 abstractC2624c0I22 = qA2.d2().I2();
        AbstractC6492s.f(abstractC2624c0I22);
        return abstractC2624c0I2.V(abstractC2624c0I22, jA, z10);
    }

    @Override // C0.r
    public long W(long j10) {
        return C6531g.r(a().W(j10), b());
    }

    public final AbstractC2624c0 a() {
        return this.f2168a.d2();
    }

    @Override // C0.r
    public r a0() {
        E0.Q qC2;
        if (!M()) {
            B0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC2624c0 abstractC2624c0I2 = a().G1().m0().I2();
        if (abstractC2624c0I2 == null || (qC2 = abstractC2624c0I2.C2()) == null) {
            return null;
        }
        return qC2.c1();
    }

    @Override // C0.r
    public long b0(r rVar, long j10) {
        return V(rVar, j10, true);
    }

    @Override // C0.r
    public long h() {
        E0.Q q10 = this.f2168a;
        return Y0.s.a(q10.I0(), q10.C0());
    }

    @Override // C0.r
    public long o0(long j10) {
        return a().o0(C6531g.r(j10, b()));
    }

    @Override // C0.r
    public long r(long j10) {
        return C6531g.r(a().r(j10), b());
    }

    @Override // C0.r
    public void z(r rVar, float[] fArr) {
        a().z(rVar, fArr);
    }
}
