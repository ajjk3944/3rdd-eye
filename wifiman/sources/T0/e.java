package T0;

import L0.B;
import L0.C3178h;
import L0.InterfaceC3188s;
import L0.U;
import L0.z;
import Q0.AbstractC3434k;
import W0.l;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class e {
    public static final InterfaceC3188s a(String str, U u10, List list, List list2, Y0.d dVar, AbstractC3434k.b bVar) {
        return new d(str, u10, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(U u10) {
        z zVarA;
        B bW = u10.w();
        return !(((bW == null || (zVarA = bW.a()) == null) ? null : C3178h.d(zVarA.b())) == null ? false : C3178h.g(r1.j(), C3178h.f11144b.c()));
    }

    public static final int d(int i10, S0.e eVar) {
        Locale localeA;
        l.a aVar = W0.l.f23537b;
        if (W0.l.j(i10, aVar.b())) {
            return 2;
        }
        if (!W0.l.j(i10, aVar.c())) {
            if (W0.l.j(i10, aVar.d())) {
                return 0;
            }
            if (W0.l.j(i10, aVar.e())) {
                return 1;
            }
            if (!(W0.l.j(i10, aVar.a()) ? true : W0.l.j(i10, aVar.f()))) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if (eVar == null || (localeA = eVar.f(0).a()) == null) {
                localeA = Locale.getDefault();
            }
            int iA = D1.n.a(localeA);
            if (iA == 0 || iA != 1) {
                return 2;
            }
        }
        return 3;
    }
}
