package Lg;

import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private final EventListener f11777a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11778b;

    public static class a extends m {

        /* renamed from: d, reason: collision with root package name */
        private static Ej.b f11779d = Ej.c.i(a.class);

        /* renamed from: c, reason: collision with root package name */
        private final ConcurrentMap f11780c;

        public a(Kg.e eVar, boolean z10) {
            super(eVar, z10);
            this.f11780c = new ConcurrentHashMap(32);
        }

        private static final boolean c(Kg.d dVar, Kg.d dVar2) {
            if (dVar == null || dVar2 == null || !dVar.equals(dVar2)) {
                return false;
            }
            byte[] bArrZ = dVar.z();
            byte[] bArrZ2 = dVar2.z();
            if (bArrZ.length != bArrZ2.length) {
                return false;
            }
            for (int i10 = 0; i10 < bArrZ.length; i10++) {
                if (bArrZ[i10] != bArrZ2[i10]) {
                    return false;
                }
            }
            return dVar.E(dVar2);
        }

        void d(Kg.c cVar) {
            if (this.f11780c.putIfAbsent(cVar.getName() + "." + cVar.h(), cVar.d().clone()) != null) {
                f11779d.n("Service Added called for a service already added: {}", cVar);
                return;
            }
            ((Kg.e) a()).c(cVar);
            Kg.d dVarD = cVar.d();
            if (dVarD == null || !dVarD.D()) {
                return;
            }
            ((Kg.e) a()).e(cVar);
        }

        void e(Kg.c cVar) {
            String str = cVar.getName() + "." + cVar.h();
            ConcurrentMap concurrentMap = this.f11780c;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                ((Kg.e) a()).b(cVar);
            } else {
                f11779d.n("Service Removed called for a service already removed: {}", cVar);
            }
        }

        synchronized void f(Kg.c cVar) {
            try {
                Kg.d dVarD = cVar.d();
                if (dVarD == null || !dVarD.D()) {
                    f11779d.a("Service Resolved called for an unresolved event: {}", cVar);
                } else {
                    String str = cVar.getName() + "." + cVar.h();
                    Kg.d dVar = (Kg.d) this.f11780c.get(str);
                    if (c(dVarD, dVar)) {
                        f11779d.n("Service Resolved called for a service already resolved: {}", cVar);
                    } else if (dVar == null) {
                        if (this.f11780c.putIfAbsent(str, dVarD.clone()) == null) {
                            ((Kg.e) a()).e(cVar);
                        }
                    } else if (this.f11780c.replace(str, dVar, dVarD.clone())) {
                        ((Kg.e) a()).e(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(2048);
            sb2.append("[Status for ");
            sb2.append(((Kg.e) a()).toString());
            if (this.f11780c.isEmpty()) {
                sb2.append(" no type event ");
            } else {
                sb2.append(" (");
                Iterator it = this.f11780c.keySet().iterator();
                while (it.hasNext()) {
                    sb2.append(((String) it.next()) + ", ");
                }
                sb2.append(") ");
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class b extends m {

        /* renamed from: d, reason: collision with root package name */
        private static Ej.b f11781d = Ej.c.i(b.class);

        /* renamed from: c, reason: collision with root package name */
        private final ConcurrentMap f11782c;

        public b(Kg.f fVar, boolean z10) {
            super(fVar, z10);
            this.f11782c = new ConcurrentHashMap(32);
        }

        void c(Kg.c cVar) {
            if (this.f11782c.putIfAbsent(cVar.h(), cVar.h()) == null) {
                ((Kg.f) a()).d(cVar);
            } else {
                f11781d.d("Service Type Added called for a service type already added: {}", cVar);
            }
        }

        void d(Kg.c cVar) {
            if (this.f11782c.putIfAbsent(cVar.h(), cVar.h()) == null) {
                ((Kg.f) a()).a(cVar);
            } else {
                f11781d.d("Service Sub Type Added called for a service sub type already added: {}", cVar);
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(2048);
            sb2.append("[Status for ");
            sb2.append(((Kg.f) a()).toString());
            if (this.f11782c.isEmpty()) {
                sb2.append(" no type event ");
            } else {
                sb2.append(" (");
                Iterator it = this.f11782c.keySet().iterator();
                while (it.hasNext()) {
                    sb2.append(((String) it.next()) + ", ");
                }
                sb2.append(") ");
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public m(EventListener eventListener, boolean z10) {
        this.f11777a = eventListener;
        this.f11778b = z10;
    }

    public EventListener a() {
        return this.f11777a;
    }

    public boolean b() {
        return this.f11778b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && a().equals(((m) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
