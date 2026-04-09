package Vi;

import Zg.AbstractC3689v;
import Zi.A0;
import Zi.B0;
import Zi.C3697b0;
import Zi.C3701d0;
import Zi.C3704f;
import Zi.O0;
import Zi.Q;
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
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
abstract /* synthetic */ class z {
    private static final b b(th.d dVar, List list, InterfaceC6824a interfaceC6824a) {
        if (AbstractC6492s.d(dVar, O.b(Collection.class)) || AbstractC6492s.d(dVar, O.b(List.class)) || AbstractC6492s.d(dVar, O.b(List.class)) || AbstractC6492s.d(dVar, O.b(ArrayList.class))) {
            return new C3704f((b) list.get(0));
        }
        if (AbstractC6492s.d(dVar, O.b(HashSet.class))) {
            return new Q((b) list.get(0));
        }
        if (AbstractC6492s.d(dVar, O.b(Set.class)) || AbstractC6492s.d(dVar, O.b(Set.class)) || AbstractC6492s.d(dVar, O.b(LinkedHashSet.class))) {
            return new C3701d0((b) list.get(0));
        }
        if (AbstractC6492s.d(dVar, O.b(HashMap.class))) {
            return new Zi.O((b) list.get(0), (b) list.get(1));
        }
        if (AbstractC6492s.d(dVar, O.b(Map.class)) || AbstractC6492s.d(dVar, O.b(Map.class)) || AbstractC6492s.d(dVar, O.b(LinkedHashMap.class))) {
            return new C3697b0((b) list.get(0), (b) list.get(1));
        }
        if (AbstractC6492s.d(dVar, O.b(Map.Entry.class))) {
            return Wi.a.j((b) list.get(0), (b) list.get(1));
        }
        if (AbstractC6492s.d(dVar, O.b(Yg.s.class))) {
            return Wi.a.m((b) list.get(0), (b) list.get(1));
        }
        if (AbstractC6492s.d(dVar, O.b(Yg.y.class))) {
            return Wi.a.p((b) list.get(0), (b) list.get(1), (b) list.get(2));
        }
        if (!A0.o(dVar)) {
            return null;
        }
        Object objInvoke = interfaceC6824a.invoke();
        AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return Wi.a.a((th.d) objInvoke, (b) list.get(0));
    }

    private static final b c(th.d dVar, List list) {
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        return A0.d(dVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    private static final b d(b bVar, boolean z10) {
        if (z10) {
            return Wi.a.u(bVar);
        }
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return bVar;
    }

    public static final b e(th.d dVar, List serializers, InterfaceC6824a elementClassifierIfArray) {
        AbstractC6492s.i(dVar, "<this>");
        AbstractC6492s.i(serializers, "serializers");
        AbstractC6492s.i(elementClassifierIfArray, "elementClassifierIfArray");
        b bVarB = b(dVar, serializers, elementClassifierIfArray);
        return bVarB == null ? c(dVar, serializers) : bVarB;
    }

    public static final b f(cj.e eVar, th.p type) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(type, "type");
        b bVarI = i(eVar, type, true);
        if (bVarI != null) {
            return bVarI;
        }
        A0.p(B0.c(type));
        throw new KotlinNothingValueException();
    }

    public static final b g(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        b bVarH = w.h(dVar);
        if (bVarH != null) {
            return bVarH;
        }
        B0.f(dVar);
        throw new KotlinNothingValueException();
    }

    public static final b h(th.p type) {
        AbstractC6492s.i(type, "type");
        return w.c(cj.g.a(), type);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final Vi.b i(cj.e r6, th.p r7, boolean r8) {
        /*
            th.d r0 = Zi.B0.c(r7)
            boolean r1 = r7.t()
            java.util.List r7 = r7.j()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = Zg.AbstractC3689v.w(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r7.next()
            th.r r3 = (th.r) r3
            th.p r3 = Zi.B0.g(r3)
            r2.add(r3)
            goto L1d
        L31:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L4c
            boolean r7 = Zi.A0.l(r0)
            if (r7 == 0) goto L47
            Vi.b r7 = cj.e.c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L47
        L45:
            r7 = r4
            goto L60
        L47:
            Vi.b r7 = Vi.v.m(r0, r1)
            goto L60
        L4c:
            boolean r7 = r6.d()
            if (r7 == 0) goto L53
            goto L45
        L53:
            java.lang.Object r7 = Vi.v.n(r0, r2, r1)
            boolean r5 = Yg.u.l(r7)
            if (r5 == 0) goto L5e
            r7 = r4
        L5e:
            Vi.b r7 = (Vi.b) r7
        L60:
            if (r7 == 0) goto L63
            return r7
        L63:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L84
            Vi.b r7 = Vi.w.h(r0)
            if (r7 != 0) goto La9
            Vi.b r7 = cj.e.c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La9
            boolean r6 = Zi.A0.l(r0)
            if (r6 == 0) goto L82
            Vi.f r6 = new Vi.f
            r6.<init>(r0)
        L80:
            r7 = r6
            goto La9
        L82:
            r7 = r4
            goto La9
        L84:
            java.util.List r7 = Vi.w.i(r6, r2, r8)
            if (r7 != 0) goto L8b
            return r4
        L8b:
            Vi.y r8 = new Vi.y
            r8.<init>()
            Vi.b r8 = Vi.w.a(r0, r7, r8)
            if (r8 != 0) goto La8
            Vi.b r7 = r6.b(r0, r7)
            if (r7 != 0) goto La9
            boolean r6 = Zi.A0.l(r0)
            if (r6 == 0) goto L82
            Vi.f r6 = new Vi.f
            r6.<init>(r0)
            goto L80
        La8:
            r7 = r8
        La9:
            if (r7 == 0) goto Laf
            Vi.b r4 = d(r7, r1)
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Vi.z.i(cj.e, th.p, boolean):Vi.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th.e j(List list) {
        return ((th.p) list.get(0)).r();
    }

    public static final b k(cj.e eVar, th.p type) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(type, "type");
        return i(eVar, type, false);
    }

    public static final b l(th.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        b bVarB = A0.b(dVar);
        return bVarB == null ? O0.b(dVar) : bVarB;
    }

    public static final List m(cj.e eVar, List typeArguments, boolean z10) {
        ArrayList arrayList;
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(w.c(eVar, (th.p) it.next()));
            }
        } else {
            List list2 = typeArguments;
            arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                b bVarG = w.g(eVar, (th.p) it2.next());
                if (bVarG == null) {
                    return null;
                }
                arrayList.add(bVarG);
            }
        }
        return arrayList;
    }
}
