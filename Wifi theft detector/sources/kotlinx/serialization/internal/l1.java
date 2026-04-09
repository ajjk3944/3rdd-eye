package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f[] f22882a = new kotlinx.serialization.descriptors.f[0];

    public static final Set a(kotlinx.serialization.descriptors.f fVar) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int iD = fVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            hashSet.add(fVar.e(i10));
        }
        return hashSet;
    }

    public static final kotlinx.serialization.descriptors.f[] b(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new kotlinx.serialization.descriptors.f[0]);
            kotlin.jvm.internal.p.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            kotlinx.serialization.descriptors.f[] fVarArr = (kotlinx.serialization.descriptors.f[]) array;
            if (fVarArr != null) {
                return fVarArr;
            }
        }
        return f22882a;
    }

    public static final r9.c c(r9.p pVar) {
        kotlin.jvm.internal.p.e(pVar, "<this>");
        r9.e eVarG = pVar.g();
        if (eVarG instanceof r9.c) {
            return (r9.c) eVarG;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + eVarG).toString());
    }

    public static final Void d(r9.c cVar) {
        kotlin.jvm.internal.p.e(cVar, "<this>");
        throw new SerializationException("Serializer for class '" + cVar.i() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}
