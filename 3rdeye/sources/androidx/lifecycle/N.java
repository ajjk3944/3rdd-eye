package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;

/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: classes.dex */
public final class N {
    public static final Object a(AbstractC1781n abstractC1781n, AbstractC1781n.b bVar, p9.p pVar, h9.i iVar) {
        if (bVar == AbstractC1781n.b.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (abstractC1781n.getCurrentState() == AbstractC1781n.b.DESTROYED) {
            return C1992A.f18074a;
        }
        Object objC = A9.F.c(new M(abstractC1781n, bVar, pVar, null), iVar);
        return objC == g9.a.COROUTINE_SUSPENDED ? objC : C1992A.f18074a;
    }
}
