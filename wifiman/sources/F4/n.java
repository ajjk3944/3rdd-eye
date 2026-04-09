package F4;

import F4.n;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import f5.InterfaceC5535a;
import f5.InterfaceC5536b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;

/* loaded from: classes3.dex */
public class n implements d, Y4.a {

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC5536b f5983i = new InterfaceC5536b() { // from class: F4.j
        @Override // f5.InterfaceC5536b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f5984a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5985b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5986c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5987d;

    /* renamed from: e, reason: collision with root package name */
    private Set f5988e;

    /* renamed from: f, reason: collision with root package name */
    private final s f5989f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f5990g;

    /* renamed from: h, reason: collision with root package name */
    private final i f5991h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f5992a;

        /* renamed from: b, reason: collision with root package name */
        private final List f5993b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f5994c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f5995d = i.f5976a;

        b(Executor executor) {
            this.f5992a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c cVar) {
            this.f5994c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f5993b.add(new InterfaceC5536b() { // from class: F4.o
                @Override // f5.InterfaceC5536b
                public final Object get() {
                    return n.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f5993b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f5992a, this.f5993b, this.f5994c, this.f5995d);
        }

        public b g(i iVar) {
            this.f5995d = iVar;
            return this;
        }
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f5987d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC5536b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f5991h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f5988e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f5988e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f5984a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f5984a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final c cVar = (c) it3.next();
                this.f5984a.put(cVar, new t(new InterfaceC5536b() { // from class: F4.k
                    @Override // f5.InterfaceC5536b
                    public final Object get() {
                        return this.f5977a.r(cVar);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            InterfaceC5536b interfaceC5536b = (InterfaceC5536b) entry.getValue();
            if (cVar.n() || (cVar.o() && z10)) {
                interfaceC5536b.get();
            }
        }
        this.f5989f.c();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new B(cVar, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f5990g.get();
        if (bool != null) {
            o(this.f5984a, bool.booleanValue());
        }
    }

    private void v() {
        for (c cVar : this.f5984a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.g() && !this.f5986c.containsKey(qVar.c())) {
                    this.f5986c.put(qVar.c(), u.b(Collections.emptySet()));
                } else if (this.f5985b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f5985b.put(qVar.c(), y.e());
                    }
                }
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.p()) {
                final InterfaceC5536b interfaceC5536b = (InterfaceC5536b) this.f5984a.get(cVar);
                for (A a10 : cVar.j()) {
                    if (this.f5985b.containsKey(a10)) {
                        final y yVar = (y) ((InterfaceC5536b) this.f5985b.get(a10));
                        arrayList.add(new Runnable() { // from class: F4.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                yVar.j(interfaceC5536b);
                            }
                        });
                    } else {
                        this.f5985b.put(a10, interfaceC5536b);
                    }
                }
            }
        }
        return arrayList;
    }

    private List x() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5984a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.p()) {
                InterfaceC5536b interfaceC5536b = (InterfaceC5536b) entry.getValue();
                for (A a10 : cVar.j()) {
                    if (!map.containsKey(a10)) {
                        map.put(a10, new HashSet());
                    }
                    ((Set) map.get(a10)).add(interfaceC5536b);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f5986c.containsKey(entry2.getKey())) {
                final u uVar = (u) this.f5986c.get(entry2.getKey());
                for (final InterfaceC5536b interfaceC5536b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: F4.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(interfaceC5536b2);
                        }
                    });
                }
            } else {
                this.f5986c.put((A) entry2.getKey(), u.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // F4.d
    public InterfaceC5535a c(A a10) {
        InterfaceC5536b interfaceC5536bD = d(a10);
        return interfaceC5536bD == null ? y.e() : interfaceC5536bD instanceof y ? (y) interfaceC5536bD : y.i(interfaceC5536bD);
    }

    @Override // F4.d
    public synchronized InterfaceC5536b d(A a10) {
        z.c(a10, "Null interface requested.");
        return (InterfaceC5536b) this.f5985b.get(a10);
    }

    @Override // F4.d
    public synchronized InterfaceC5536b h(A a10) {
        u uVar = (u) this.f5986c.get(a10);
        if (uVar != null) {
            return uVar;
        }
        return f5983i;
    }

    public void p(boolean z10) {
        HashMap map;
        if (Y.a(this.f5990g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f5984a);
            }
            o(map, z10);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f5984a = new HashMap();
        this.f5985b = new HashMap();
        this.f5986c = new HashMap();
        this.f5988e = new HashSet();
        this.f5990g = new AtomicReference();
        s sVar = new s(executor);
        this.f5989f = sVar;
        this.f5991h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(sVar, s.class, d5.d.class, d5.c.class));
        arrayList.add(c.s(this, Y4.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f5987d = q(iterable);
        n(arrayList);
    }
}
