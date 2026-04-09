package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class n1 {
    public static final int a(kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f[] typeParams) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        kotlin.jvm.internal.p.e(typeParams, "typeParams");
        int iHashCode = (fVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = kotlinx.serialization.descriptors.g.a(fVar);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strH = ((kotlinx.serialization.descriptors.f) it.next()).h();
            if (strH != null) {
                iHashCode3 = strH.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            kotlinx.serialization.descriptors.h kind = ((kotlinx.serialization.descriptors.f) it2.next()).getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
