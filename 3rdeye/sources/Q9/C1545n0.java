package Q9;

import N7.C1154e9;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import w9.InterfaceC5748c;

/* compiled from: Platform.common.kt */
/* renamed from: Q9.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1545n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final O9.e[] f11505a = new O9.e[0];

    public static final Set<String> a(O9.e eVar) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        if (eVar instanceof InterfaceC1542m) {
            return ((InterfaceC1542m) eVar).b();
        }
        HashSet hashSet = new HashSet(eVar.f());
        int iF = eVar.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(eVar.g(i));
        }
        return hashSet;
    }

    public static final O9.e[] b(List<? extends O9.e> list) {
        O9.e[] eVarArr;
        List<? extends O9.e> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (O9.e[]) list.toArray(new O9.e[0])) == null) ? f11505a : eVarArr;
    }

    public static final InterfaceC5748c<Object> c(w9.j jVar) {
        InterfaceC5748c<Object> interfaceC5748cF = jVar.f();
        if (interfaceC5748cF instanceof InterfaceC5748c) {
            return interfaceC5748cF;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + interfaceC5748cF).toString());
    }

    public static final void d(InterfaceC5748c interfaceC5748c) {
        String strD = interfaceC5748c.d();
        if (strD == null) {
            strD = "<local class name not available>";
        }
        throw new M9.i(C1154e9.i("Serializer for class '", strD, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
