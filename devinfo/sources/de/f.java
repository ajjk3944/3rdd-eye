package de;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import je.u;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final e f22198h = new e(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22199a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22200b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22201c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f22202d;

    /* renamed from: e, reason: collision with root package name */
    public final k f22203e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f22204f;
    public final ja.c g;

    public f(ArrayList arrayList, ArrayList arrayList2, ja.c cVar) {
        ee.l lVar = ee.l.f23430a;
        this.f22199a = new HashMap();
        this.f22200b = new HashMap();
        this.f22201c = new HashMap();
        this.f22202d = new HashSet();
        this.f22204f = new AtomicReference();
        k kVar = new k();
        this.f22203e = kVar;
        this.g = cVar;
        ArrayList arrayList3 = new ArrayList();
        int i4 = 0;
        int i10 = 1;
        arrayList3.add(a.c(kVar, k.class, af.b.class, af.a.class));
        arrayList3.add(a.c(this, f.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((cf.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.A(componentRegistrar));
                        it.remove();
                    }
                } catch (l e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f22190b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f22202d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f22202d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f22199a.isEmpty()) {
                t.j(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f22199a.keySet());
                arrayList6.addAll(arrayList3);
                t.j(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f22199a.put(aVar2, new m(new bf.c(i10, this, aVar2)));
            }
            arrayList5.addAll(e(arrayList3));
            arrayList5.addAll(f());
            d();
        }
        int size4 = arrayList5.size();
        while (i4 < size4) {
            Object obj5 = arrayList5.get(i4);
            i4++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f22204f.get();
        if (bool != null) {
            b(this.f22199a, bool.booleanValue());
        }
    }

    @Override // de.b
    public final Object a(Class cls) {
        return l(q.a(cls));
    }

    public final void b(HashMap map, boolean z3) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            cf.b bVar = (cf.b) entry.getValue();
            int i4 = aVar.f22192d;
            if (i4 == 1 || (i4 == 2 && z3)) {
                bVar.get();
            }
        }
        k kVar = this.f22203e;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f22214b;
                if (arrayDeque != null) {
                    kVar.f22214b = null;
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
                throw u.o(it);
            }
        }
    }

    @Override // de.b
    public final Set c(q qVar) {
        cf.b bVar;
        synchronized (this) {
            bVar = (n) this.f22201c.get(qVar);
            if (bVar == null) {
                bVar = f22198h;
            }
        }
        return (Set) bVar.get();
    }

    public final void d() {
        HashMap map = this.f22200b;
        HashMap map2 = this.f22201c;
        for (a aVar : this.f22199a.keySet()) {
            for (i iVar : aVar.f22191c) {
                boolean z3 = iVar.f22211b == 2;
                q qVar = iVar.f22210a;
                if (z3 && !map2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.f22219b = null;
                    nVar.f22218a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f22218a.addAll(set);
                    map2.put(qVar, nVar);
                } else if (map.containsKey(qVar)) {
                    continue;
                } else {
                    int i4 = iVar.f22211b;
                    if (i4 == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + qVar);
                    }
                    if (i4 != 2) {
                        map.put(qVar, new o(o.f22220c, o.f22221d));
                    }
                }
            }
        }
    }

    public final ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            a aVar = (a) obj;
            if (aVar.f22193e == 0) {
                cf.b bVar = (cf.b) this.f22199a.get(aVar);
                for (q qVar : aVar.f22190b) {
                    HashMap map = this.f22200b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new aj.d(12, (o) ((cf.b) map.get(qVar)), bVar));
                    } else {
                        map.put(qVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        HashMap map = this.f22201c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f22199a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f22193e != 0) {
                cf.b bVar = (cf.b) entry.getValue();
                for (q qVar : aVar.f22190b) {
                    if (!map2.containsKey(qVar)) {
                        map2.put(qVar, new HashSet());
                    }
                    ((Set) map2.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                n nVar = (n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new aj.d(13, nVar, (cf.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f22219b = null;
                nVar2.f22218a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f22218a.addAll(set);
                map.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }

    @Override // de.b
    public final o g(q qVar) {
        cf.b bVarI = i(qVar);
        return bVarI == null ? new o(o.f22220c, o.f22221d) : bVarI instanceof o ? (o) bVarI : new o(null, bVarI);
    }

    @Override // de.b
    public final synchronized cf.b i(q qVar) {
        wb.e.f(qVar, "Null interface requested.");
        return (cf.b) this.f22200b.get(qVar);
    }

    @Override // de.b
    public final cf.b j(Class cls) {
        return i(q.a(cls));
    }

    @Override // de.b
    public final Object l(q qVar) {
        cf.b bVarI = i(qVar);
        if (bVarI == null) {
            return null;
        }
        return bVarI.get();
    }
}
