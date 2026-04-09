package bf;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.e0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i implements d {
    public static final g D = new g(0);
    public final df.c B;

    /* renamed from: x, reason: collision with root package name */
    public final o f2720x;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2716a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2717d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2718g = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f2719r = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f2721y = new AtomicReference();

    public i(cf.n nVar, ArrayList arrayList, ArrayList arrayList2, df.c cVar) {
        o oVar = new o(nVar);
        this.f2720x = oVar;
        this.B = cVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(c.c(oVar, o.class, bg.c.class, bg.b.class));
        arrayList3.add(c.c(this, i.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2 != null) {
                arrayList3.add(cVar2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((eg.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.B.C(componentRegistrar));
                        it3.remove();
                    }
                } catch (p e4) {
                    it3.remove();
                    e0.q("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((c) it4.next()).f2704b.toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2719r.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f2719r.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f2716a.isEmpty()) {
                y3.n(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2716a.keySet());
                arrayList6.addAll(arrayList3);
                y3.n(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                c cVar3 = (c) it5.next();
                this.f2716a.put(cVar3, new q(new h(this, 0, cVar3)));
            }
            arrayList5.addAll(f(arrayList3));
            arrayList5.addAll(h());
            c();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f2721y.get();
        if (bool != null) {
            b(this.f2716a, bool.booleanValue());
        }
    }

    public final void b(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            eg.b bVar = (eg.b) entry.getValue();
            int i10 = cVar.f2706d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        o oVar = this.f2720x;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.f2731b;
                if (arrayDeque != null) {
                    oVar.f2731b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw w.g.d(it);
            }
        }
    }

    public final void c() {
        HashMap map = this.f2717d;
        HashMap map2 = this.f2718g;
        for (c cVar : this.f2716a.keySet()) {
            for (l lVar : cVar.f2705c) {
                boolean z10 = lVar.f2728b == 2;
                u uVar = lVar.f2727a;
                if (z10 && !map2.containsKey(uVar)) {
                    Set set = Collections.EMPTY_SET;
                    r rVar = new r();
                    rVar.f2737b = null;
                    rVar.f2736a = Collections.newSetFromMap(new ConcurrentHashMap());
                    rVar.f2736a.addAll(set);
                    map2.put(uVar, rVar);
                } else if (map.containsKey(uVar)) {
                    continue;
                } else {
                    int i10 = lVar.f2728b;
                    if (i10 == 1) {
                        throw new m("Unsatisfied dependency for component " + cVar + ": " + uVar);
                    }
                    if (i10 != 2) {
                        map.put(uVar, new s(s.f2738c, s.f2739d));
                    }
                }
            }
        }
    }

    @Override // bf.d
    public final s d(u uVar) {
        eg.b bVarK = k(uVar);
        return bVarK == null ? new s(s.f2738c, s.f2739d) : bVarK instanceof s ? (s) bVarK : new s(null, bVarK);
    }

    @Override // bf.d
    public final synchronized eg.b e(u uVar) {
        r rVar = (r) this.f2718g.get(uVar);
        if (rVar != null) {
            return rVar;
        }
        return D;
    }

    public final ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f2707e == 0) {
                eg.b bVar = (eg.b) this.f2716a.get(cVar);
                for (u uVar : cVar.f2704b) {
                    HashMap map = this.f2717d;
                    if (map.containsKey(uVar)) {
                        arrayList2.add(new a5.o((s) ((eg.b) map.get(uVar)), 3, bVar));
                    } else {
                        map.put(uVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList h() {
        HashMap map = this.f2718g;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f2716a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (cVar.f2707e != 0) {
                eg.b bVar = (eg.b) entry.getValue();
                for (u uVar : cVar.f2704b) {
                    if (!map2.containsKey(uVar)) {
                        map2.put(uVar, new HashSet());
                    }
                    ((Set) map2.get(uVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                r rVar = (r) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new a5.o(rVar, 4, (eg.b) it.next()));
                }
            } else {
                u uVar2 = (u) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                r rVar2 = new r();
                rVar2.f2737b = null;
                rVar2.f2736a = Collections.newSetFromMap(new ConcurrentHashMap());
                rVar2.f2736a.addAll(set);
                map.put(uVar2, rVar2);
            }
        }
        return arrayList;
    }

    @Override // bf.d
    public final synchronized eg.b k(u uVar) {
        b4.f(uVar, "Null interface requested.");
        return (eg.b) this.f2717d.get(uVar);
    }
}
