package Ti;

import Ii.InterfaceC3069n;
import Ii.a1;
import Ki.l;
import Ni.A;
import Ni.AbstractC3399a;
import Ni.z;
import Yg.J;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6839p;
import mh.q;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22034c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f22035d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22036e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f22037f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22038g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f22039a;

    /* renamed from: b, reason: collision with root package name */
    private final q f22040b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends C6490p implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22041a = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k a(long j10, k kVar) {
            return j.h(j10, kVar);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (k) obj2);
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22042a = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k a(long j10, k kVar) {
            return j.h(j10, kVar);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (k) obj2);
        }
    }

    public i(int i10, int i11) {
        this.f22039a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10 - i11;
        this.f22040b = new q() { // from class: Ti.h
            @Override // mh.q
            public final Object s(Object obj, Object obj2, Object obj3) {
                return i.p(this.f22033a, (Throwable) obj, (J) obj2, (InterfaceC5384i) obj3);
            }
        };
    }

    private final boolean g(a1 a1Var) {
        Object objC;
        k kVar = (k) f22036e.get(this);
        long andIncrement = f22037f.getAndIncrement(this);
        a aVar = a.f22041a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22036e;
        long j10 = andIncrement / j.f22048f;
        loop0: while (true) {
            objC = AbstractC3399a.c(kVar, j10, aVar);
            if (!A.c(objC)) {
                z zVarB = A.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f16629c >= zVarB.f16629c) {
                        break loop0;
                    }
                    if (!zVarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.p()) {
                            zVar.n();
                        }
                    } else if (zVarB.p()) {
                        zVarB.n();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) A.b(objC);
        int i10 = (int) (andIncrement % j.f22048f);
        if (l.a(kVar2.v(), i10, null, a1Var)) {
            a1Var.b(kVar2, i10);
            return true;
        }
        if (!l.a(kVar2.v(), i10, j.f22044b, j.f22045c)) {
            return false;
        }
        if (a1Var instanceof InterfaceC3069n) {
            AbstractC6492s.g(a1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC3069n) a1Var).b0(J.f24997a, this.f22040b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + a1Var).toString());
    }

    private final void h() {
        int i10;
        do {
            i10 = f22038g.get(this);
            if (i10 <= this.f22039a) {
                return;
            }
        } while (!f22038g.compareAndSet(this, i10, this.f22039a));
    }

    private final int i() {
        int andDecrement;
        do {
            andDecrement = f22038g.getAndDecrement(this);
        } while (andDecrement > this.f22039a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(i iVar, Throwable th2, J j10, InterfaceC5384i interfaceC5384i) {
        iVar.q();
        return J.f24997a;
    }

    private final boolean s(Object obj) {
        if (!(obj instanceof InterfaceC3069n)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC3069n interfaceC3069n = (InterfaceC3069n) obj;
        Object objP = interfaceC3069n.p(J.f24997a, null, this.f22040b);
        if (objP == null) {
            return false;
        }
        interfaceC3069n.C0(objP);
        return true;
    }

    private final boolean t() {
        Object objC;
        k kVar = (k) f22034c.get(this);
        long andIncrement = f22035d.getAndIncrement(this);
        long j10 = andIncrement / j.f22048f;
        b bVar = b.f22042a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22034c;
        loop0: while (true) {
            objC = AbstractC3399a.c(kVar, j10, bVar);
            if (A.c(objC)) {
                break;
            }
            z zVarB = A.b(objC);
            while (true) {
                z zVar = (z) atomicReferenceFieldUpdater.get(this);
                if (zVar.f16629c >= zVarB.f16629c) {
                    break loop0;
                }
                if (!zVarB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                    if (zVar.p()) {
                        zVar.n();
                    }
                } else if (zVarB.p()) {
                    zVarB.n();
                }
            }
        }
        k kVar2 = (k) A.b(objC);
        kVar2.c();
        if (kVar2.f16629c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % j.f22048f);
        Object andSet = kVar2.v().getAndSet(i10, j.f22044b);
        if (andSet != null) {
            if (andSet == j.f22047e) {
                return false;
            }
            return s(andSet);
        }
        int i11 = j.f22043a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (kVar2.v().get(i10) == j.f22045c) {
                return true;
            }
        }
        return !l.a(kVar2.v(), i10, j.f22044b, j.f22046d);
    }

    protected final void f(InterfaceC3069n interfaceC3069n) {
        while (i() <= 0) {
            AbstractC6492s.g(interfaceC3069n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((a1) interfaceC3069n)) {
                return;
            }
        }
        interfaceC3069n.b0(J.f24997a, this.f22040b);
    }

    public final int j() {
        return Math.max(f22038g.get(this), 0);
    }

    public final void q() {
        do {
            int andIncrement = f22038g.getAndIncrement(this);
            if (andIncrement >= this.f22039a) {
                h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f22039a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!t());
    }

    public final boolean r() {
        while (true) {
            int i10 = f22038g.get(this);
            if (i10 > this.f22039a) {
                h();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f22038g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
