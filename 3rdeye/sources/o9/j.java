package O9;

import O9.l;
import c9.C2091l;
import y9.q;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes3.dex */
public final class j {
    public static final f a(String str, e[] eVarArr, p9.l lVar) {
        if (q.i0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(str);
        lVar.invoke(aVar);
        return new f(str, l.a.f10523a, aVar.f10483c.size(), C2091l.t(eVarArr), aVar);
    }

    public static final f b(String serialName, k kind, e[] eVarArr, p9.l builder) {
        kotlin.jvm.internal.l.f(serialName, "serialName");
        kotlin.jvm.internal.l.f(kind, "kind");
        kotlin.jvm.internal.l.f(builder, "builder");
        if (q.i0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(l.a.f10523a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new f(serialName, kind, aVar.f10483c.size(), C2091l.t(eVarArr), aVar);
    }
}
