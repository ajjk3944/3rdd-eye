package F4;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final F4.c f5997a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f5998b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set f5999c = new HashSet();

        b(F4.c cVar) {
            this.f5997a = cVar;
        }

        void a(b bVar) {
            this.f5998b.add(bVar);
        }

        void b(b bVar) {
            this.f5999c.add(bVar);
        }

        F4.c c() {
            return this.f5997a;
        }

        Set d() {
            return this.f5998b;
        }

        boolean e() {
            return this.f5998b.isEmpty();
        }

        boolean f() {
            return this.f5999c.isEmpty();
        }

        void g(b bVar) {
            this.f5999c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final A f6000a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6001b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f6000a.equals(this.f6000a) && cVar.f6001b == this.f6001b;
        }

        public int hashCode() {
            return ((this.f6000a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f6001b).hashCode();
        }

        private c(A a10, boolean z10) {
            this.f6000a = a10;
            this.f6001b = z10;
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
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
                return hashSet;
            }
            F4.c cVar = (F4.c) it.next();
            b bVar3 = new b(cVar);
            for (A a10 : cVar.j()) {
                c cVar2 = new c(a10, !cVar.p());
                if (!map.containsKey(cVar2)) {
                    map.put(cVar2, new HashSet());
                }
                Set set2 = (Set) map.get(cVar2);
                if (!set2.isEmpty() && !cVar2.f6001b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", a10));
                }
                set2.add(bVar3);
            }
        }
    }
}
