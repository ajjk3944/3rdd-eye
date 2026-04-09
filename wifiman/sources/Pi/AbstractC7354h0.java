package pi;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import pi.C7377y;

/* renamed from: pi.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7354h0 {
    public static final C7339a a(S s10) {
        AbstractC6492s.i(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof C7339a) {
            return (C7339a) m0Q0;
        }
        return null;
    }

    public static final AbstractC7346d0 b(S s10) {
        AbstractC6492s.i(s10, "<this>");
        C7339a c7339aA = a(s10);
        if (c7339aA != null) {
            return c7339aA.Z0();
        }
        return null;
    }

    public static final boolean c(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return s10.Q0() instanceof C7377y;
    }

    private static final Q d(Q q10) {
        S s10;
        Collection collectionA = q10.a();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionA, 10));
        Iterator it = collectionA.iterator();
        boolean z10 = false;
        while (true) {
            s10 = null;
            if (!it.hasNext()) {
                break;
            }
            S sF = (S) it.next();
            if (J0.l(sF)) {
                sF = f(sF.Q0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(sF);
        }
        if (!z10) {
            return null;
        }
        S sL = q10.l();
        if (sL != null) {
            if (J0.l(sL)) {
                sL = f(sL.Q0(), false, 1, null);
            }
            s10 = sL;
        }
        return new Q(arrayList).s(s10);
    }

    public static final M0 e(M0 m02, boolean z10) {
        AbstractC6492s.i(m02, "<this>");
        C7377y c7377yC = C7377y.a.c(C7377y.f58191d, m02, z10, false, 4, null);
        if (c7377yC != null) {
            return c7377yC;
        }
        AbstractC7346d0 abstractC7346d0G = g(m02);
        return abstractC7346d0G != null ? abstractC7346d0G : m02.R0(false);
    }

    public static /* synthetic */ M0 f(M0 m02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(m02, z10);
    }

    private static final AbstractC7346d0 g(S s10) {
        Q qD;
        v0 v0VarN0 = s10.N0();
        Q q10 = v0VarN0 instanceof Q ? (Q) v0VarN0 : null;
        if (q10 == null || (qD = d(q10)) == null) {
            return null;
        }
        return qD.j();
    }

    public static final AbstractC7346d0 h(AbstractC7346d0 abstractC7346d0, boolean z10) {
        AbstractC6492s.i(abstractC7346d0, "<this>");
        C7377y c7377yC = C7377y.a.c(C7377y.f58191d, abstractC7346d0, z10, false, 4, null);
        if (c7377yC != null) {
            return c7377yC;
        }
        AbstractC7346d0 abstractC7346d0G = g(abstractC7346d0);
        return abstractC7346d0G == null ? abstractC7346d0.R0(false) : abstractC7346d0G;
    }

    public static /* synthetic */ AbstractC7346d0 i(AbstractC7346d0 abstractC7346d0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(abstractC7346d0, z10);
    }

    public static final AbstractC7346d0 j(AbstractC7346d0 abstractC7346d0, AbstractC7346d0 abbreviatedType) {
        AbstractC6492s.i(abstractC7346d0, "<this>");
        AbstractC6492s.i(abbreviatedType, "abbreviatedType");
        return W.a(abstractC7346d0) ? abstractC7346d0 : new C7339a(abstractC7346d0, abbreviatedType);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.i k(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        AbstractC6492s.i(iVar, "<this>");
        return new kotlin.reflect.jvm.internal.impl.types.checker.i(iVar.W0(), iVar.N0(), iVar.Y0(), iVar.M0(), iVar.O0(), true);
    }
}
