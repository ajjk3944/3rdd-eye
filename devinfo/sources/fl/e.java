package fl;

import cl.s;
import cl.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nk.k;
import xk.u1;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements xk.f, f, u1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24074f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final ck.h f24075a;

    /* renamed from: c, reason: collision with root package name */
    public Object f24077c;
    private volatile /* synthetic */ Object state$volatile = h.f24081a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f24076b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f24078d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f24079e = h.f24084d;

    public e(ck.h hVar) {
        this.f24075a = hVar;
    }

    @Override // xk.u1
    public final void a(s sVar, int i4) {
        this.f24077c = sVar;
        this.f24078d = i4;
    }

    @Override // xk.f
    public final void b(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24074f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f24082b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f24083c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f24076b;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                ((c) obj2).a();
            }
            this.f24079e = h.f24084d;
            this.f24076b = null;
            return;
        }
    }

    public final Object c(ek.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24074f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.f24079e;
        ArrayList arrayList = this.f24076b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj3 = arrayList.get(i4);
                i4++;
                c cVar3 = (c) obj3;
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f24082b);
            this.f24079e = h.f24084d;
            this.f24076b = null;
        }
        Object objA = cVar2.f24064c.a(cVar2.f24062a, cVar2.f24065d, obj2);
        ck.c cVar4 = cVar2.f24066e;
        return cVar2.f24065d == h.f24085e ? ((mk.c) cVar4).invoke(cVar) : ((mk.e) cVar4).invoke(objA, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ek.c r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.e.d(ek.c):java.lang.Object");
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f24076b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i4);
            i4++;
            if (((c) obj3).f24062a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z3) {
        Object obj = cVar.f24062a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24074f;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z3) {
            ArrayList arrayList = this.f24076b;
            k.b(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    if (((c) obj2).f24062a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f24063b.a(obj, this, cVar.f24065d);
        if (this.f24079e != h.f24084d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z3) {
            ArrayList arrayList2 = this.f24076b;
            k.b(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.g = this.f24077c;
        cVar.f24068h = this.f24078d;
        this.f24077c = null;
        this.f24078d = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24074f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof xk.g)) {
                if (k.a(obj3, h.f24082b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (k.a(obj3, h.f24083c)) {
                    return 2;
                }
                if (k.a(obj3, h.f24081a)) {
                    List listS = cm.g.s(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listS)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListK0 = n.k0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListK0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c cVarE = e(obj);
            if (cVarE != null) {
                mk.f fVar = cVarE.f24067f;
                mk.f fVar2 = fVar != null ? (mk.f) fVar.a(this, cVarE.f24065d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVarE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                xk.g gVar = (xk.g) obj3;
                this.f24079e = obj2;
                u uVarJ = gVar.j(yj.u.f37649a, fVar2);
                if (uVarJ == null) {
                    this.f24079e = h.f24084d;
                    return 2;
                }
                gVar.n(uVarJ);
                return 0;
            }
            continue;
        }
    }
}
