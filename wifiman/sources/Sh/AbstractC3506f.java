package Sh;

import Sh.A;
import Xh.a;
import Yh.d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* renamed from: Sh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3506f {
    public static final A a(Uh.n proto, Wh.c nameResolver, Wh.g typeTable, boolean z10, boolean z11, boolean z12) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        AbstractC6492s.i(typeTable, "typeTable");
        h.f propertySignature = Xh.a.f24345d;
        AbstractC6492s.h(propertySignature, "propertySignature");
        a.d dVar = (a.d) Wh.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            d.a aVarC = Yh.i.f25057a.c(proto, nameResolver, typeTable, z12);
            if (aVarC == null) {
                return null;
            }
            return A.f20700b.b(aVarC);
        }
        if (!z11 || !dVar.P0()) {
            return null;
        }
        A.a aVar = A.f20700b;
        a.c cVarE0 = dVar.E0();
        AbstractC6492s.h(cVarE0, "getSyntheticMethod(...)");
        return aVar.c(nameResolver, cVarE0);
    }

    public static /* synthetic */ A b(Uh.n nVar, Wh.c cVar, Wh.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        boolean z13 = (i10 & 8) != 0 ? false : z10;
        boolean z14 = (i10 & 16) != 0 ? false : z11;
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(nVar, cVar, gVar, z13, z14, z12);
    }
}
