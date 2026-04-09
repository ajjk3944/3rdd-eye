package L0;

import W0.n;
import l0.AbstractC6534j;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.g1;
import o0.AbstractC7040g;
import o0.C7043j;
import o0.InterfaceC7039f;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f11102a = new Q();

    private Q() {
    }

    public final void a(InterfaceC6717n0 interfaceC6717n0, M m10) {
        boolean z10 = m10.i() && !W0.t.e(m10.l().f(), W0.t.f23567a.c());
        if (z10) {
            C6533i c6533iB = AbstractC6534j.b(C6531g.f52335b.c(), AbstractC6538n.a(Y0.r.g(m10.B()), Y0.r.f(m10.B())));
            interfaceC6717n0.j();
            InterfaceC6717n0.o(interfaceC6717n0, c6533iB, 0, 2, null);
        }
        D dY = m10.l().i().y();
        W0.k kVarS = dY.s();
        if (kVarS == null) {
            kVarS = W0.k.f23532b.c();
        }
        W0.k kVar = kVarS;
        g1 g1VarR = dY.r();
        if (g1VarR == null) {
            g1VarR = g1.f52914d.a();
        }
        g1 g1Var = g1VarR;
        AbstractC7040g abstractC7040gH = dY.h();
        if (abstractC7040gH == null) {
            abstractC7040gH = C7043j.f55038a;
        }
        AbstractC7040g abstractC7040g = abstractC7040gH;
        try {
            AbstractC6713l0 abstractC6713l0F = dY.f();
            if (abstractC6713l0F != null) {
                m10.w().E(interfaceC6717n0, abstractC6713l0F, (64 & 4) != 0 ? Float.NaN : dY.t() != n.b.f23547b ? dY.t().b() : 1.0f, (64 & 8) != 0 ? null : g1Var, (64 & 16) != 0 ? null : kVar, (64 & 32) != 0 ? null : abstractC7040g, (64 & 64) != 0 ? InterfaceC7039f.f55034d1.a() : 0);
            } else {
                m10.w().C(interfaceC6717n0, (32 & 2) != 0 ? C6733v0.f52951b.e() : dY.t() != n.b.f23547b ? dY.t().c() : C6733v0.f52951b.a(), (32 & 4) != 0 ? null : g1Var, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? abstractC7040g : null, (32 & 32) != 0 ? InterfaceC7039f.f55034d1.a() : 0);
            }
            if (z10) {
                interfaceC6717n0.r();
            }
        } catch (Throwable th2) {
            if (z10) {
                interfaceC6717n0.r();
            }
            throw th2;
        }
    }
}
