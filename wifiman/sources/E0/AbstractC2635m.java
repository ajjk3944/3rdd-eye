package E0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: E0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2635m extends e.c {

    /* renamed from: n, reason: collision with root package name */
    private final int f3949n = f0.g(this);

    /* renamed from: o, reason: collision with root package name */
    private e.c f3950o;

    private final void H2(int i10, boolean z10) {
        e.c cVarB2;
        int iF2 = f2();
        x2(i10);
        if (iF2 != i10) {
            if (AbstractC2633k.f(this)) {
                t2(i10);
            }
            if (k2()) {
                e.c cVarH1 = h1();
                e.c cVarH2 = this;
                while (cVarH2 != null) {
                    i10 |= cVarH2.f2();
                    cVarH2.x2(i10);
                    if (cVarH2 == cVarH1) {
                        break;
                    } else {
                        cVarH2 = cVarH2.h2();
                    }
                }
                if (z10 && cVarH2 == cVarH1) {
                    i10 = f0.h(cVarH1);
                    cVarH1.x2(i10);
                }
                int iA2 = i10 | ((cVarH2 == null || (cVarB2 = cVarH2.b2()) == null) ? 0 : cVarB2.a2());
                while (cVarH2 != null) {
                    iA2 |= cVarH2.f2();
                    cVarH2.t2(iA2);
                    cVarH2 = cVarH2.h2();
                }
            }
        }
    }

    private final void I2(int i10, e.c cVar) {
        int iF2 = f2();
        if ((i10 & e0.a(2)) == 0 || (e0.a(2) & iF2) == 0 || (this instanceof B)) {
            return;
        }
        B0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
    }

    @Override // androidx.compose.ui.e.c
    public void C2(AbstractC2624c0 abstractC2624c0) {
        super.C2(abstractC2624c0);
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.C2(abstractC2624c0);
        }
    }

    protected final InterfaceC2632j D2(InterfaceC2632j interfaceC2632j) {
        e.c cVarH1 = interfaceC2632j.h1();
        if (cVarH1 != interfaceC2632j) {
            e.c cVar = interfaceC2632j instanceof e.c ? (e.c) interfaceC2632j : null;
            e.c cVarH2 = cVar != null ? cVar.h2() : null;
            if (cVarH1 == h1() && AbstractC6492s.d(cVarH2, this)) {
                return interfaceC2632j;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (cVarH1.k2()) {
            B0.a.b("Cannot delegate to an already attached node");
        }
        cVarH1.u2(h1());
        int iF2 = f2();
        int iH = f0.h(cVarH1);
        cVarH1.x2(iH);
        I2(iH, cVarH1);
        cVarH1.v2(this.f3950o);
        this.f3950o = cVarH1;
        cVarH1.z2(this);
        H2(f2() | iH, false);
        if (k2()) {
            if ((iH & e0.a(2)) == 0 || (iF2 & e0.a(2)) != 0) {
                C2(c2());
            } else {
                C2620a0 c2620a0K0 = AbstractC2633k.m(this).k0();
                h1().C2(null);
                c2620a0K0.C();
            }
            cVarH1.l2();
            cVarH1.r2();
            f0.a(cVarH1);
        }
        return interfaceC2632j;
    }

    public final e.c E2() {
        return this.f3950o;
    }

    public final int F2() {
        return this.f3949n;
    }

    protected final void G2(InterfaceC2632j interfaceC2632j) {
        e.c cVar = null;
        for (e.c cVarB2 = this.f3950o; cVarB2 != null; cVarB2 = cVarB2.b2()) {
            if (cVarB2 == interfaceC2632j) {
                if (cVarB2.k2()) {
                    f0.d(cVarB2);
                    cVarB2.s2();
                    cVarB2.m2();
                }
                cVarB2.u2(cVarB2);
                cVarB2.t2(0);
                if (cVar == null) {
                    this.f3950o = cVarB2.b2();
                } else {
                    cVar.v2(cVarB2.b2());
                }
                cVarB2.v2(null);
                cVarB2.z2(null);
                int iF2 = f2();
                int iH = f0.h(this);
                H2(iH, true);
                if (k2() && (iF2 & e0.a(2)) != 0 && (e0.a(2) & iH) == 0) {
                    C2620a0 c2620a0K0 = AbstractC2633k.m(this).k0();
                    h1().C2(null);
                    c2620a0K0.C();
                    return;
                }
                return;
            }
            cVar = cVarB2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC2632j).toString());
    }

    @Override // androidx.compose.ui.e.c
    public void l2() {
        super.l2();
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.C2(c2());
            if (!cVarE2.k2()) {
                cVarE2.l2();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public void m2() {
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.m2();
        }
        super.m2();
    }

    @Override // androidx.compose.ui.e.c
    public void q2() {
        super.q2();
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.q2();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void r2() {
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.r2();
        }
        super.r2();
    }

    @Override // androidx.compose.ui.e.c
    public void s2() {
        super.s2();
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.s2();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void u2(e.c cVar) {
        super.u2(cVar);
        for (e.c cVarE2 = E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            cVarE2.u2(cVar);
        }
    }
}
