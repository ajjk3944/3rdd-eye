package Zi;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class I0 {
    public static final int a(Xi.f fVar, Xi.f[] typeParams) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(typeParams, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = Xi.j.a(fVar);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strA = ((Xi.f) it.next()).a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            Xi.m mVarH = ((Xi.f) it2.next()).h();
            iHashCode2 = i12 + (mVarH != null ? mVarH.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
