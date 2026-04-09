package H5;

import E5.t;
import c5.C0412i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C3030f;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1822b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1823c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1824d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1825e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1826f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final g f1827a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i() {
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = 1;
        this.f1827a = new g(0, this);
    }

    public final void a(c cVar) {
        Object objA;
        k kVar;
        C3030f c3030f = cVar.f1816a;
        d dVar = cVar.f1817b;
        while (true) {
            int andDecrement = f1826f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0412i c0412i = C0412i.f5929a;
                if (andDecrement > 0) {
                    d.f1818g.set(dVar, null);
                    c3030f.B(c0412i, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1824d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1825e.getAndIncrement(this);
                f fVar = f.i;
                long j6 = andIncrement / j.f1833f;
                while (true) {
                    objA = E5.a.a(kVar2, j6, fVar);
                    if (!E5.a.d(objA)) {
                        t tVarB = E5.a.b(objA);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.f1413c >= tVarB.f1413c) {
                                break;
                            }
                            if (!tVarB.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarB)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (tVarB.e()) {
                                        tVarB.d();
                                    }
                                    kVar2 = kVar;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    kVar2 = kVar;
                }
                k kVar3 = (k) E5.a.b(objA);
                AtomicReferenceArray atomicReferenceArray = kVar3.f1834e;
                int i = (int) (andIncrement % j.f1833f);
                while (!atomicReferenceArray.compareAndSet(i, null, cVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        B2.a aVar = j.f1829b;
                        B2.a aVar2 = j.f1830c;
                        while (!atomicReferenceArray.compareAndSet(i, aVar, aVar2)) {
                            if (atomicReferenceArray.get(i) != aVar) {
                                break;
                            }
                        }
                        d.f1818g.set(dVar, null);
                        c3030f.B(c0412i, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(kVar3, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.i.b():void");
    }
}
