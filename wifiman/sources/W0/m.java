package W0;

import L0.E;
import a1.AbstractC3751b;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class m {
    public static final n b(n nVar, n nVar2, float f10) {
        boolean z10 = nVar instanceof c;
        return (z10 || (nVar2 instanceof c)) ? (z10 && (nVar2 instanceof c)) ? n.f23545a.a((AbstractC6713l0) E.d(((c) nVar).e(), ((c) nVar2).e(), f10), AbstractC3751b.b(nVar.b(), nVar2.b(), f10)) : (n) E.d(nVar, nVar2, f10) : n.f23545a.b(AbstractC6737x0.h(nVar.c(), nVar2.c(), f10));
    }

    public static final long c(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : C6733v0.k(j10, C6733v0.n(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f10, InterfaceC6824a interfaceC6824a) {
        return Float.isNaN(f10) ? ((Number) interfaceC6824a.invoke()).floatValue() : f10;
    }
}
