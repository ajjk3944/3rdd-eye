package Ni;

import mh.InterfaceC6839p;

/* renamed from: Ni.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3399a {

    /* renamed from: a, reason: collision with root package name */
    private static final C f16586a = new C("CLOSED");

    public static final AbstractC3400b b(AbstractC3400b abstractC3400b) {
        while (true) {
            Object objG = abstractC3400b.g();
            if (objG == f16586a) {
                return abstractC3400b;
            }
            AbstractC3400b abstractC3400b2 = (AbstractC3400b) objG;
            if (abstractC3400b2 != null) {
                abstractC3400b = abstractC3400b2;
            } else if (abstractC3400b.m()) {
                return abstractC3400b;
            }
        }
    }

    public static final Object c(z zVar, long j10, InterfaceC6839p interfaceC6839p) {
        while (true) {
            if (zVar.f16629c >= j10 && !zVar.k()) {
                return A.a(zVar);
            }
            Object objG = zVar.g();
            if (objG == f16586a) {
                return A.a(f16586a);
            }
            z zVar2 = (z) ((AbstractC3400b) objG);
            if (zVar2 == null) {
                zVar2 = (z) interfaceC6839p.invoke(Long.valueOf(zVar.f16629c + 1), zVar);
                if (zVar.o(zVar2)) {
                    if (zVar.k()) {
                        zVar.n();
                    }
                }
            }
            zVar = zVar2;
        }
    }
}
