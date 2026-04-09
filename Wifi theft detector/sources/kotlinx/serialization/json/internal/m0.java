package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public abstract class m0 {
    public static final kotlinx.serialization.descriptors.f a(kotlinx.serialization.descriptors.f fVar, aa.c module) {
        kotlinx.serialization.descriptors.f fVarA;
        kotlin.jvm.internal.p.e(fVar, "<this>");
        kotlin.jvm.internal.p.e(module, "module");
        if (!kotlin.jvm.internal.p.a(fVar.getKind(), h.a.f22784a)) {
            return fVar.isInline() ? a(fVar.g(0), module) : fVar;
        }
        kotlinx.serialization.descriptors.f fVarB = kotlinx.serialization.descriptors.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final WriteMode b(z9.a aVar, kotlinx.serialization.descriptors.f desc) {
        kotlin.jvm.internal.p.e(aVar, "<this>");
        kotlin.jvm.internal.p.e(desc, "desc");
        kotlinx.serialization.descriptors.h kind = desc.getKind();
        if (kind instanceof kotlinx.serialization.descriptors.d) {
            return WriteMode.POLY_OBJ;
        }
        if (kotlin.jvm.internal.p.a(kind, i.b.f22787a)) {
            return WriteMode.LIST;
        }
        if (!kotlin.jvm.internal.p.a(kind, i.c.f22788a)) {
            return WriteMode.OBJ;
        }
        kotlinx.serialization.descriptors.f fVarA = a(desc.g(0), aVar.a());
        kotlinx.serialization.descriptors.h kind2 = fVarA.getKind();
        if ((kind2 instanceof kotlinx.serialization.descriptors.e) || kotlin.jvm.internal.p.a(kind2, h.b.f22785a)) {
            return WriteMode.MAP;
        }
        if (aVar.e().b()) {
            return WriteMode.LIST;
        }
        throw s.d(fVarA);
    }
}
