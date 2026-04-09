package I0;

import C0.AbstractC2538s;
import C0.r;
import E0.AbstractC2624c0;
import J0.q;
import Y0.p;
import androidx.compose.ui.platform.AbstractC3936l1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class n {
    private static final boolean a(J0.n nVar) {
        InterfaceC6839p interfaceC6839pC = c(nVar);
        J0.h hVar = (J0.h) J0.k.a(nVar.w(), q.f9676a.I());
        return (interfaceC6839pC == null || hVar == null || ((Number) hVar.a().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    private static final List b(J0.n nVar) {
        return nVar.l(false, false, false);
    }

    public static final InterfaceC6839p c(J0.n nVar) {
        return (InterfaceC6839p) J0.k.a(nVar.w(), J0.i.f9619a.u());
    }

    private static final void d(J0.n nVar, int i10, InterfaceC6835l interfaceC6835l) {
        J0.n nVar2;
        V.b bVar = new V.b(new J0.n[16], 0);
        List listB = b(nVar);
        while (true) {
            bVar.e(bVar.o(), listB);
            while (bVar.u()) {
                nVar2 = (J0.n) bVar.z(bVar.o() - 1);
                if (AbstractC3936l1.g(nVar2) && !nVar2.w().f(q.f9676a.f())) {
                    AbstractC2624c0 abstractC2624c0E = nVar2.e();
                    if (abstractC2624c0E == null) {
                        B0.a.c("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    r rVarC1 = abstractC2624c0E.c1();
                    p pVarB = Y0.q.b(AbstractC2538s.c(rVarC1));
                    if (pVarB.k()) {
                        continue;
                    } else {
                        if (!a(nVar2)) {
                            break;
                        }
                        int i11 = i10 + 1;
                        interfaceC6835l.invoke(new m(nVar2, i11, pVarB, rVarC1));
                        d(nVar2, i11, interfaceC6835l);
                    }
                }
            }
            return;
            listB = b(nVar2);
        }
    }

    static /* synthetic */ void e(J0.n nVar, int i10, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(nVar, i10, interfaceC6835l);
    }
}
