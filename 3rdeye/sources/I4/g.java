package I4;

import A9.I;
import C.RunnableC0615b;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d5.C4276a;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
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
import z5.C5861a;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes2.dex */
public final class g implements b, Y4.a {

    /* renamed from: h, reason: collision with root package name */
    public static final e f2452h = new e();

    /* renamed from: e, reason: collision with root package name */
    public final l f2457e;

    /* renamed from: g, reason: collision with root package name */
    public final C5861a f2459g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2453a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2454b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2455c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f2456d = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<Boolean> f2458f = new AtomicReference<>();

    public g(J4.p pVar, ArrayList arrayList, ArrayList arrayList2, C5861a c5861a) {
        l lVar = new l(pVar);
        this.f2457e = lVar;
        this.f2459g = c5861a;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.c(lVar, l.class, d5.d.class, d5.c.class));
        arrayList3.add(a.c(this, Y4.a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC4392b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2459g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e4) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((a) it4.next()).f2434b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2456d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f2456d.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f2453a.isEmpty()) {
                h.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2453a.keySet());
                arrayList6.addAll(arrayList3);
                h.a(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                a aVar2 = (a) it5.next();
                this.f2453a.put(aVar2, new n(new f(0, this, aVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = this.f2458f.get();
        if (bool != null) {
            g(this.f2453a, bool.booleanValue());
        }
    }

    @Override // I4.b
    public final Object a(Class cls) {
        return b(s.a(cls));
    }

    @Override // I4.b
    public final Object b(s sVar) {
        InterfaceC4392b interfaceC4392bE = e(sVar);
        if (interfaceC4392bE == null) {
            return null;
        }
        return interfaceC4392bE.get();
    }

    @Override // I4.b
    public final InterfaceC4392b c(Class cls) {
        return e(s.a(cls));
    }

    @Override // I4.b
    public final Set d(s sVar) {
        InterfaceC4392b interfaceC4392b;
        synchronized (this) {
            interfaceC4392b = (o) this.f2455c.get(sVar);
            if (interfaceC4392b == null) {
                interfaceC4392b = f2452h;
            }
        }
        return (Set) interfaceC4392b.get();
    }

    @Override // I4.b
    public final synchronized <T> InterfaceC4392b<T> e(s<T> sVar) {
        I.l(sVar, "Null interface requested.");
        return (InterfaceC4392b) this.f2454b.get(sVar);
    }

    @Override // I4.b
    public final <T> InterfaceC4391a<T> f(s<T> sVar) {
        InterfaceC4392b<T> interfaceC4392bE = e(sVar);
        return interfaceC4392bE == null ? new r(r.f2477c, r.f2478d) : interfaceC4392bE instanceof r ? (r) interfaceC4392bE : new r(null, interfaceC4392bE);
    }

    public final void g(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            InterfaceC4392b interfaceC4392b = (InterfaceC4392b) entry.getValue();
            int i = aVar.f2436d;
            if (i == 1 || (i == 2 && z10)) {
                interfaceC4392b.get();
            }
        }
        l lVar = this.f2457e;
        synchronized (lVar) {
            arrayDeque = lVar.f2469b;
            if (arrayDeque != null) {
                lVar.f2469b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                lVar.d((C4276a) it.next());
            }
        }
    }

    public final void h() {
        for (a aVar : this.f2453a.keySet()) {
            for (i iVar : aVar.f2435c) {
                boolean z10 = iVar.f2466b == 2;
                s<?> sVar = iVar.f2465a;
                if (z10) {
                    HashMap map = this.f2455c;
                    if (!map.containsKey(sVar)) {
                        Set set = Collections.EMPTY_SET;
                        o oVar = new o();
                        oVar.f2475b = null;
                        oVar.f2474a = Collections.newSetFromMap(new ConcurrentHashMap());
                        oVar.f2474a.addAll(set);
                        map.put(sVar, oVar);
                    }
                }
                HashMap map2 = this.f2454b;
                if (map2.containsKey(sVar)) {
                    continue;
                } else {
                    int i = iVar.f2466b;
                    if (i == 1) {
                        throw new p("Unsatisfied dependency for component " + aVar + ": " + sVar);
                    }
                    if (i != 2) {
                        map2.put(sVar, new r(r.f2477c, r.f2478d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f2437e == 0) {
                InterfaceC4392b interfaceC4392b = (InterfaceC4392b) this.f2453a.get(aVar);
                Iterator it2 = aVar.f2434b.iterator();
                while (it2.hasNext()) {
                    s sVar = (s) it2.next();
                    HashMap map = this.f2454b;
                    if (map.containsKey(sVar)) {
                        arrayList2.add(new RunnableC0615b(4, (r) ((InterfaceC4392b) map.get(sVar)), interfaceC4392b));
                    } else {
                        map.put(sVar, interfaceC4392b);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2453a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f2437e != 0) {
                InterfaceC4392b interfaceC4392b = (InterfaceC4392b) entry.getValue();
                Iterator it = aVar.f2434b.iterator();
                while (it.hasNext()) {
                    s sVar = (s) it.next();
                    if (!map.containsKey(sVar)) {
                        map.put(sVar, new HashSet());
                    }
                    ((Set) map.get(sVar)).add(interfaceC4392b);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f2455c;
            if (map2.containsKey(key)) {
                o oVar = (o) map2.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new B.a(4, oVar, (InterfaceC4392b) it2.next()));
                }
            } else {
                s sVar2 = (s) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f2475b = null;
                oVar2.f2474a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f2474a.addAll(set);
                map2.put(sVar2, oVar2);
            }
        }
        return arrayList;
    }
}
