package I;

import Q0.AbstractC3434k;
import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private i1 f8363a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6839p f8364b;

    /* renamed from: c, reason: collision with root package name */
    private final i1 f8365c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f8366d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f8367e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f8368f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3551q0 f8369g;

    /* renamed from: h, reason: collision with root package name */
    private final D.b f8370h;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L0.M invoke() {
            return l1.this.f8363a.getValue();
        }
    }

    public l1() {
        i1 i1Var = new i1();
        this.f8363a = i1Var;
        this.f8365c = i1Var;
        this.f8366d = T.o1.h(null, T.o1.j());
        this.f8367e = T.o1.h(null, T.o1.j());
        this.f8368f = T.o1.h(null, T.o1.j());
        this.f8369g = t1.d(Y0.h.d(Y0.h.j(0)), null, 2, null);
        this.f8370h = androidx.compose.foundation.relocation.b.a();
    }

    public static /* synthetic */ int i(l1 l1Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return l1Var.h(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r6) {
        /*
            r5 = this;
            C0.r r0 = r5.j()
            if (r0 == 0) goto L22
            boolean r1 = r0.M()
            if (r1 == 0) goto L1a
            C0.r r1 = r5.e()
            r2 = 0
            if (r1 == 0) goto L20
            r3 = 0
            r4 = 2
            l0.i r2 = C0.r.c0(r1, r0, r3, r4, r2)
            goto L20
        L1a:
            l0.i$a r0 = l0.C6533i.f52340e
            l0.i r2 = r0.a()
        L20:
            if (r2 != 0) goto L28
        L22:
            l0.i$a r0 = l0.C6533i.f52340e
            l0.i r2 = r0.a()
        L28:
            long r6 = I.m1.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I.l1.b(long):long");
    }

    public final D.b c() {
        return this.f8370h;
    }

    public final C0.r d() {
        return (C0.r) this.f8367e.getValue();
    }

    public final C0.r e() {
        return (C0.r) this.f8368f.getValue();
    }

    public final L0.M f() {
        return (L0.M) this.f8365c.getValue();
    }

    public final float g() {
        return ((Y0.h) this.f8369g.getValue()).s();
    }

    public final int h(long j10, boolean z10) {
        L0.M mF = f();
        if (mF == null) {
            return -1;
        }
        if (z10) {
            j10 = b(j10);
        }
        return mF.x(m1.b(this, j10));
    }

    public final C0.r j() {
        return (C0.r) this.f8366d.getValue();
    }

    public final boolean k(long j10) {
        L0.M mF = f();
        if (mF == null) {
            return false;
        }
        long jB = m1.b(this, b(j10));
        int iR = mF.r(C6531g.n(jB));
        return C6531g.m(jB) >= mF.s(iR) && C6531g.m(jB) <= mF.t(iR);
    }

    public final L0.M l(Y0.d dVar, Y0.t tVar, AbstractC3434k.b bVar, long j10) {
        L0.M mU = this.f8363a.u(dVar, tVar, bVar, j10);
        InterfaceC6839p interfaceC6839p = this.f8364b;
        if (interfaceC6839p != null) {
            interfaceC6839p.invoke(dVar, new a());
        }
        return mU;
    }

    public final void m(C0.r rVar) {
        this.f8367e.setValue(rVar);
    }

    public final void n(C0.r rVar) {
        this.f8368f.setValue(rVar);
    }

    public final void o(float f10) {
        this.f8369g.setValue(Y0.h.d(f10));
    }

    public final void p(InterfaceC6839p interfaceC6839p) {
        this.f8364b = interfaceC6839p;
    }

    public final void q(C0.r rVar) {
        this.f8366d.setValue(rVar);
    }

    public final void r(o1 o1Var, L0.U u10, boolean z10, boolean z11) {
        this.f8363a.y(o1Var, u10, z10, z11);
    }
}
