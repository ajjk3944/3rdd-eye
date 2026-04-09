package I4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes2.dex */
public final class h {

    /* compiled from: CycleDetector.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final I4.a<?> f2460a;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f2461b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f2462c = new HashSet();

        public a(I4.a<?> aVar) {
            this.f2460a = aVar;
        }
    }

    /* compiled from: CycleDetector.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final s<?> f2463a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2464b;

        public b() {
            throw null;
        }

        public b(s sVar, boolean z10) {
            this.f2463a = sVar;
            this.f2464b = z10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f2463a.equals(this.f2463a) && bVar.f2464b == this.f2464b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f2463a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2464b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (i iVar : aVar.f2460a.f2435c) {
                            if (iVar.f2467c == 0) {
                                Set<a> set = (Set) map.get(new b(iVar.f2465a, iVar.f2466b == 2));
                                if (set != null) {
                                    for (a aVar2 : set) {
                                        aVar.f2461b.add(aVar2);
                                        aVar2.f2462c.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar3 = (a) it4.next();
                    if (aVar3.f2462c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i++;
                    Iterator it5 = aVar4.f2461b.iterator();
                    while (it5.hasNext()) {
                        a aVar5 = (a) it5.next();
                        aVar5.f2462c.remove(aVar4);
                        if (aVar5.f2462c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    a aVar6 = (a) it6.next();
                    if (!aVar6.f2462c.isEmpty() && !aVar6.f2461b.isEmpty()) {
                        arrayList2.add(aVar6.f2460a);
                    }
                }
                throw new j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            I4.a aVar7 = (I4.a) it.next();
            a aVar8 = new a(aVar7);
            Iterator it7 = aVar7.f2434b.iterator();
            while (it7.hasNext()) {
                s sVar = (s) it7.next();
                boolean z10 = aVar7.f2437e == 0;
                b bVar = new b(sVar, !z10);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set2 = (Set) map.get(bVar);
                if (!set2.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + sVar + ".");
                }
                set2.add(aVar8);
            }
        }
    }
}
