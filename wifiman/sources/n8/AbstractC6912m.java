package n8;

import Cc.AbstractC2558b;
import Cc.InterfaceC2557a;
import Tc.a;
import com.ubnt.usurvey.product.m;
import com.ubnt.usurvey.product.o;
import com.ui.wifiman.model.vendor.d;
import java.net.URI;
import k8.AbstractC6402b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;
import s9.c;
import xa.InterfaceC8439a;

/* renamed from: n8.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6912m {
    private static final InterfaceC7929a.b a(InterfaceC2557a interfaceC2557a, InterfaceC7929a.b bVar) {
        AbstractC2558b abstractC2558bD = interfaceC2557a.d();
        if ((abstractC2558bD != null ? AbstractC6402b.b(abstractC2558bD) : null) == null) {
            com.ui.wifiman.model.vendor.d dVarC = interfaceC2557a.c();
            d.c cVar = dVarC instanceof d.c ? (d.c) dVarC : null;
            return (cVar != null ? cVar.c() : null) == d.EnumC1510d.UBIQUITI ? Pe.a.f18599a.B() : bVar;
        }
        AbstractC2558b abstractC2558bD2 = interfaceC2557a.d();
        InterfaceC7929a.b bVarB = abstractC2558bD2 != null ? AbstractC6402b.b(abstractC2558bD2) : null;
        AbstractC6492s.f(bVarB);
        return bVarB;
    }

    private static final InterfaceC7929a b(InterfaceC2557a interfaceC2557a, m.c cVar, InterfaceC7929a.b bVar) {
        a.C0794a c0794aL;
        String strJ;
        InterfaceC8439a.d dVarF = interfaceC2557a.f();
        URI uriA = null;
        com.ubnt.usurvey.product.m mVarB = dVarF != null ? o.b(dVarF, cVar) : null;
        if (mVarB != null) {
            if (mVarB instanceof m.b) {
                return new c.b(((m.b) mVarB).a(), bVar, null, null, 12, null);
            }
            if (mVarB instanceof m.a) {
                return new c.a(((m.a) mVarB).a(), null, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        Dc.j jVarJ = interfaceC2557a.j();
        if (jVarJ != null && (c0794aL = jVarJ.L()) != null && (strJ = c0794aL.j()) != null) {
            uriA = L8.j.f11266a.a(strJ);
        }
        URI uri = uriA;
        return uri != null ? new c.b(uri, bVar, null, null, 12, null) : bVar;
    }

    public static final InterfaceC7929a c(Cc.k kVar, m.c variant) {
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(variant, "variant");
        if (kVar instanceof InterfaceC2557a) {
            return b((InterfaceC2557a) kVar, variant, null);
        }
        return null;
    }

    private static final InterfaceC7929a d(InterfaceC2557a interfaceC2557a, m.c cVar, InterfaceC7929a.b bVar) {
        InterfaceC7929a interfaceC7929aB = b(interfaceC2557a, cVar, bVar);
        return interfaceC7929aB == null ? bVar : interfaceC7929aB;
    }

    public static final InterfaceC7929a e(Cc.k kVar, m.c variant, InterfaceC7929a.b fallback) {
        InterfaceC7929a.b bVarB;
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(variant, "variant");
        AbstractC6492s.i(fallback, "fallback");
        if (kVar instanceof InterfaceC2557a) {
            InterfaceC2557a interfaceC2557a = (InterfaceC2557a) kVar;
            return d(interfaceC2557a, variant, a(interfaceC2557a, fallback));
        }
        AbstractC2558b abstractC2558bD = kVar.d();
        return (abstractC2558bD == null || (bVarB = AbstractC6402b.b(abstractC2558bD)) == null) ? fallback : bVarB;
    }

    public static /* synthetic */ InterfaceC7929a f(Cc.k kVar, m.c cVar, InterfaceC7929a.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = Pe.a.f18599a.k();
        }
        return e(kVar, cVar, bVar);
    }
}
