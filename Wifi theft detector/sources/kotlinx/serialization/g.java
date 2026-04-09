package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.internal.k0;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.l1;
import kotlinx.serialization.internal.m0;
import kotlinx.serialization.internal.t1;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.x0;
import r9.q;
import z8.s;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class g {
    public static final b a(r9.c cVar, List list, List list2) {
        if (p.a(cVar, t.b(Collection.class)) ? true : p.a(cVar, t.b(List.class)) ? true : p.a(cVar, t.b(List.class)) ? true : p.a(cVar, t.b(ArrayList.class))) {
            return new kotlinx.serialization.internal.f((b) list2.get(0));
        }
        if (p.a(cVar, t.b(HashSet.class))) {
            return new m0((b) list2.get(0));
        }
        if (p.a(cVar, t.b(Set.class)) ? true : p.a(cVar, t.b(Set.class)) ? true : p.a(cVar, t.b(LinkedHashSet.class))) {
            return new x0((b) list2.get(0));
        }
        if (p.a(cVar, t.b(HashMap.class))) {
            return new k0((b) list2.get(0), (b) list2.get(1));
        }
        if (p.a(cVar, t.b(Map.class)) ? true : p.a(cVar, t.b(Map.class)) ? true : p.a(cVar, t.b(LinkedHashMap.class))) {
            return new v0((b) list2.get(0), (b) list2.get(1));
        }
        if (p.a(cVar, t.b(Map.Entry.class))) {
            return x9.a.j((b) list2.get(0), (b) list2.get(1));
        }
        if (p.a(cVar, t.b(Pair.class))) {
            return x9.a.l((b) list2.get(0), (b) list2.get(1));
        }
        if (p.a(cVar, t.b(Triple.class))) {
            return x9.a.n((b) list2.get(0), (b) list2.get(1), (b) list2.get(2));
        }
        if (!k1.l(cVar)) {
            return null;
        }
        r9.e eVarG = ((r9.p) list.get(0)).g();
        p.c(eVarG, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return x9.a.a((r9.c) eVarG, (b) list2.get(0));
    }

    public static final b b(r9.c cVar, List list) {
        Object[] array = list.toArray(new b[0]);
        p.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        b[] bVarArr = (b[]) array;
        return k1.d(cVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final b c(b bVar, boolean z10) {
        if (z10) {
            return x9.a.s(bVar);
        }
        p.c(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return bVar;
    }

    public static final b d(r9.c cVar, List types, List serializers) {
        p.e(cVar, "<this>");
        p.e(types, "types");
        p.e(serializers, "serializers");
        b bVarA = a(cVar, types, serializers);
        return bVarA == null ? b(cVar, serializers) : bVarA;
    }

    public static final b e(aa.c cVar, r9.p type) {
        p.e(cVar, "<this>");
        p.e(type, "type");
        b bVarF = f(cVar, type, true);
        if (bVarF != null) {
            return bVarF;
        }
        k1.m(l1.c(type));
        throw new KotlinNothingValueException();
    }

    public static final b f(aa.c cVar, r9.p pVar, boolean z10) {
        b bVarA;
        b bVarB;
        r9.c cVarC = l1.c(pVar);
        boolean zD = pVar.d();
        List listJ = pVar.j();
        ArrayList arrayList = new ArrayList(s.s(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            r9.p pVarA = ((q) it.next()).a();
            if (pVarA == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + pVar).toString());
            }
            arrayList.add(pVarA);
        }
        if (arrayList.isEmpty()) {
            bVarA = SerializersCacheKt.a(cVarC, zD);
        } else {
            Object objB = SerializersCacheKt.b(cVarC, arrayList, zD);
            if (!z10) {
                if (Result.e(objB) == null) {
                    bVarA = (b) objB;
                }
                return null;
            }
            if (Result.g(objB)) {
                objB = null;
            }
            bVarA = (b) objB;
        }
        if (bVarA != null) {
            return bVarA;
        }
        if (arrayList.isEmpty()) {
            bVarB = aa.c.c(cVar, cVarC, null, 2, null);
        } else {
            List listE = f.e(cVar, arrayList, z10);
            if (listE == null) {
                return null;
            }
            b bVarA2 = f.a(cVarC, arrayList, listE);
            bVarB = bVarA2 == null ? cVar.b(cVarC, listE) : bVarA2;
        }
        if (bVarB != null) {
            return c(bVarB, zD);
        }
        return null;
    }

    public static final b g(aa.c cVar, r9.p type) {
        p.e(cVar, "<this>");
        p.e(type, "type");
        return f(cVar, type, false);
    }

    public static final b h(r9.c cVar) {
        p.e(cVar, "<this>");
        b bVarB = k1.b(cVar);
        return bVarB == null ? t1.b(cVar) : bVarB;
    }

    public static final List i(aa.c cVar, List typeArguments, boolean z10) {
        p.e(cVar, "<this>");
        p.e(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(s.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f.b(cVar, (r9.p) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(s.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            b bVarC = f.c(cVar, (r9.p) it2.next());
            if (bVarC == null) {
                return null;
            }
            arrayList2.add(bVarC);
        }
        return arrayList2;
    }
}
