package Zi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Xi.f[] f25532a = new Xi.f[0];

    public static final Set a(Xi.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        if (fVar instanceof InterfaceC3720n) {
            return ((InterfaceC3720n) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(fVar.f(i10));
        }
        return hashSet;
    }

    public static final Xi.f[] b(List list) {
        Xi.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (Xi.f[]) list.toArray(new Xi.f[0])) == null) ? f25532a : fVarArr;
    }

    public static final th.d c(th.p pVar) {
        AbstractC6492s.i(pVar, "<this>");
        th.e eVarR = pVar.r();
        if (eVarR instanceof th.d) {
            return (th.d) eVarR;
        }
        if (!(eVarR instanceof th.q)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + eVarR);
        }
        throw new IllegalArgumentException("Captured type parameter " + eVarR + " from generic non-reified function. Such functionality cannot be supported because " + eVarR + " is erased, either specify serializer explicitly or make calling function inline with reified " + eVarR + '.');
    }

    public static final String d(String className) {
        AbstractC6492s.i(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        String strV = dVar.v();
        if (strV == null) {
            strV = "<local class name not available>";
        }
        return d(strV);
    }

    public static final Void f(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        throw new SerializationException(e(dVar));
    }

    public static final th.p g(th.r rVar) {
        AbstractC6492s.i(rVar, "<this>");
        th.p pVarC = rVar.c();
        if (pVarC != null) {
            return pVarC;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + rVar.c()).toString());
    }
}
