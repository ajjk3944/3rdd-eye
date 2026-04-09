package V;

import A2.l;
import J.e;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1789w;
import androidx.lifecycle.InterfaceC1790x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: LifecycleCameraRepository.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12812a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12813b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12814c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<InterfaceC1790x> f12815d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public D.a f12816e;

    /* compiled from: LifecycleCameraRepository.java */
    public static abstract class a {
        public abstract e.b a();

        public abstract InterfaceC1790x b();
    }

    /* compiled from: LifecycleCameraRepository.java */
    public static class b implements InterfaceC1789w {

        /* renamed from: b, reason: collision with root package name */
        public final c f12817b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1790x f12818c;

        public b(InterfaceC1790x interfaceC1790x, c cVar) {
            this.f12818c = interfaceC1790x;
            this.f12817b = cVar;
        }

        @G(AbstractC1781n.a.ON_DESTROY)
        public void onDestroy(InterfaceC1790x interfaceC1790x) {
            c cVar = this.f12817b;
            synchronized (cVar.f12812a) {
                try {
                    b bVarC = cVar.c(interfaceC1790x);
                    if (bVarC == null) {
                        return;
                    }
                    cVar.h(interfaceC1790x);
                    Iterator it = ((Set) cVar.f12814c.get(bVarC)).iterator();
                    while (it.hasNext()) {
                        cVar.f12813b.remove((a) it.next());
                    }
                    cVar.f12814c.remove(bVarC);
                    bVarC.f12818c.getLifecycle().removeObserver(bVarC);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @G(AbstractC1781n.a.ON_START)
        public void onStart(InterfaceC1790x interfaceC1790x) {
            this.f12817b.g(interfaceC1790x);
        }

        @G(AbstractC1781n.a.ON_STOP)
        public void onStop(InterfaceC1790x interfaceC1790x) {
            this.f12817b.h(interfaceC1790x);
        }
    }

    public final void a(V.b bVar, Collection collection, D.a aVar) {
        synchronized (this.f12812a) {
            try {
                l.l(!collection.isEmpty());
                this.f12816e = aVar;
                InterfaceC1790x interfaceC1790xO = bVar.o();
                b bVarC = c(interfaceC1790xO);
                if (bVarC == null) {
                    return;
                }
                Set set = (Set) this.f12814c.get(bVarC);
                D.a aVar2 = this.f12816e;
                if (aVar2 == null || ((A.a) aVar2).f4e != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        V.b bVar2 = (V.b) this.f12813b.get((a) it.next());
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.p().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.f12810d.K();
                    bVar.f12810d.I();
                    bVar.h(collection);
                    if (interfaceC1790xO.getLifecycle().getCurrentState().isAtLeast(AbstractC1781n.b.STARTED)) {
                        g(interfaceC1790xO);
                    }
                } catch (e.a e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final V.b b(InterfaceC1790x interfaceC1790x, J.e eVar) {
        synchronized (this.f12812a) {
            try {
                l.k("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.f12813b.get(new V.a(interfaceC1790x, eVar.f2659f)) == null);
                V.b bVar = new V.b(interfaceC1790x, eVar);
                if (((ArrayList) eVar.A()).isEmpty()) {
                    bVar.r();
                }
                if (interfaceC1790x.getLifecycle().getCurrentState() == AbstractC1781n.b.DESTROYED) {
                    return bVar;
                }
                f(bVar);
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b c(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12812a) {
            try {
                for (b bVar : this.f12814c.keySet()) {
                    if (interfaceC1790x.equals(bVar.f12818c)) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection<V.b> d() {
        Collection<V.b> collectionUnmodifiableCollection;
        synchronized (this.f12812a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f12813b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean e(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12812a) {
            try {
                b bVarC = c(interfaceC1790x);
                if (bVarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.f12814c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f12813b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.p().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(V.b bVar) {
        synchronized (this.f12812a) {
            try {
                InterfaceC1790x interfaceC1790xO = bVar.o();
                J.e eVar = bVar.f12810d;
                V.a aVar = new V.a(interfaceC1790xO, J.e.w(eVar.f2669q, eVar.f2670r));
                b bVarC = c(interfaceC1790xO);
                Set hashSet = bVarC != null ? (Set) this.f12814c.get(bVarC) : new HashSet();
                hashSet.add(aVar);
                this.f12813b.put(aVar, bVar);
                if (bVarC == null) {
                    b bVar2 = new b(interfaceC1790xO, this);
                    this.f12814c.put(bVar2, hashSet);
                    interfaceC1790xO.getLifecycle().addObserver(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12812a) {
            try {
                if (e(interfaceC1790x)) {
                    if (this.f12815d.isEmpty()) {
                        this.f12815d.push(interfaceC1790x);
                    } else {
                        D.a aVar = this.f12816e;
                        if (aVar == null || ((A.a) aVar).f4e != 2) {
                            InterfaceC1790x interfaceC1790xPeek = this.f12815d.peek();
                            if (!interfaceC1790x.equals(interfaceC1790xPeek)) {
                                i(interfaceC1790xPeek);
                                this.f12815d.remove(interfaceC1790x);
                                this.f12815d.push(interfaceC1790x);
                            }
                        }
                    }
                    k(interfaceC1790x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12812a) {
            try {
                this.f12815d.remove(interfaceC1790x);
                i(interfaceC1790x);
                if (!this.f12815d.isEmpty()) {
                    k(this.f12815d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12812a) {
            try {
                b bVarC = c(interfaceC1790x);
                if (bVarC == null) {
                    return;
                }
                Iterator it = ((Set) this.f12814c.get(bVarC)).iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f12813b.get((a) it.next());
                    bVar.getClass();
                    bVar.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f12812a) {
            try {
                Iterator it = this.f12813b.keySet().iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f12813b.get((a) it.next());
                    bVar.s();
                    h(bVar.o());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12812a) {
            try {
                Iterator it = ((Set) this.f12814c.get(c(interfaceC1790x))).iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f12813b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.p().isEmpty()) {
                        bVar.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
