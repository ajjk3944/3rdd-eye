package E0;

import androidx.compose.ui.e;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import m0.InterfaceC6671H0;

/* renamed from: E0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2633k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(V.b bVar, e.c cVar) {
        V.b bVarW0 = m(cVar).w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            int i10 = iO - 1;
            Object[] objArrM = bVarW0.m();
            do {
                bVar.b(((G) objArrM[i10]).k0().k());
                i10--;
            } while (i10 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final B d(e.c cVar) {
        if ((e0.a(2) & cVar.f2()) != 0) {
            if (cVar instanceof B) {
                return (B) cVar;
            }
            if (cVar instanceof AbstractC2635m) {
                e.c cVarE2 = ((AbstractC2635m) cVar).E2();
                while (cVarE2 != 0) {
                    if (cVarE2 instanceof B) {
                        return (B) cVarE2;
                    }
                    cVarE2 = (!(cVarE2 instanceof AbstractC2635m) || (e0.a(2) & cVarE2.f2()) == 0) ? cVarE2.b2() : ((AbstractC2635m) cVarE2).E2();
                }
            }
        }
        return null;
    }

    public static final boolean e(InterfaceC2632j interfaceC2632j, int i10) {
        return (interfaceC2632j.h1().a2() & i10) != 0;
    }

    public static final boolean f(InterfaceC2632j interfaceC2632j) {
        return interfaceC2632j.h1() == interfaceC2632j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c g(V.b bVar) {
        if (bVar == null || bVar.s()) {
            return null;
        }
        return (e.c) bVar.z(bVar.o() - 1);
    }

    public static final AbstractC2624c0 h(InterfaceC2632j interfaceC2632j, int i10) {
        AbstractC2624c0 abstractC2624c0C2 = interfaceC2632j.h1().c2();
        AbstractC6492s.f(abstractC2624c0C2);
        if (abstractC2624c0C2.G2() != interfaceC2632j || !f0.i(i10)) {
            return abstractC2624c0C2;
        }
        AbstractC2624c0 abstractC2624c0H2 = abstractC2624c0C2.H2();
        AbstractC6492s.f(abstractC2624c0H2);
        return abstractC2624c0H2;
    }

    public static final Y0.d i(InterfaceC2632j interfaceC2632j) {
        return m(interfaceC2632j).K();
    }

    public static final InterfaceC6671H0 j(InterfaceC2632j interfaceC2632j) {
        return n(interfaceC2632j).getGraphicsContext();
    }

    public static final C0.r k(InterfaceC2632j interfaceC2632j) {
        if (!interfaceC2632j.h1().k2()) {
            B0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        C0.r rVarC1 = h(interfaceC2632j, e0.a(2)).c1();
        if (!rVarC1.M()) {
            B0.a.b("LayoutCoordinates is not attached.");
        }
        return rVarC1;
    }

    public static final Y0.t l(InterfaceC2632j interfaceC2632j) {
        return m(interfaceC2632j).getLayoutDirection();
    }

    public static final G m(InterfaceC2632j interfaceC2632j) {
        AbstractC2624c0 abstractC2624c0C2 = interfaceC2632j.h1().c2();
        if (abstractC2624c0C2 != null) {
            return abstractC2624c0C2.G1();
        }
        B0.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final m0 n(InterfaceC2632j interfaceC2632j) {
        m0 m0VarN0 = m(interfaceC2632j).n0();
        if (m0VarN0 != null) {
            return m0VarN0;
        }
        B0.a.c("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }
}
