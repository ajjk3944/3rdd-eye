package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o;
import kotlinx.coroutines.selects.h;
import kotlinx.coroutines.u2;
import l9.l;
import y8.s;

/* loaded from: classes4.dex */
public class SemaphoreImpl {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22673c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22674d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22675e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f22676f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22677g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f22678a;

    /* renamed from: b, reason: collision with root package name */
    public final l f22679b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreImpl(int i10, int i11) {
        this.f22678a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        d dVar = new d(0L, null, 2);
        this.head$volatile = dVar;
        this.tail$volatile = dVar;
        this._availablePermits$volatile = i10 - i11;
        this.f22679b = new l() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return s.f25199a;
            }

            public final void invoke(Throwable th) {
                this.this$0.m();
            }
        };
    }

    public final void c(o oVar) {
        while (f() <= 0) {
            p.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (d((u2) oVar)) {
                return;
            }
        }
        oVar.y(s.f25199a, this.f22679b);
    }

    public final boolean d(u2 u2Var) {
        Object objC;
        d dVar = (d) f22675e.get(this);
        long andIncrement = f22676f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.f22680a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22675e;
        long j10 = andIncrement / c.f22689f;
        loop0: while (true) {
            objC = kotlinx.coroutines.internal.d.c(dVar, j10, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!a0.c(objC)) {
                z zVarB = a0.b(objC);
                while (true) {
                    z zVar = (z) atomicReferenceFieldUpdater.get(this);
                    if (zVar.f22569c >= zVarB.f22569c) {
                        break loop0;
                    }
                    if (!zVarB.t()) {
                        break;
                    }
                    if (t.a.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                        if (zVar.o()) {
                            zVar.m();
                        }
                    } else if (zVarB.o()) {
                        zVarB.m();
                    }
                }
            } else {
                break;
            }
        }
        d dVar2 = (d) a0.b(objC);
        int i10 = (int) (andIncrement % c.f22689f);
        if (f.a(dVar2.u(), i10, null, u2Var)) {
            u2Var.a(dVar2, i10);
            return true;
        }
        if (!f.a(dVar2.u(), i10, c.f22685b, c.f22686c)) {
            return false;
        }
        if (u2Var instanceof o) {
            p.c(u2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((o) u2Var).y(s.f25199a, this.f22679b);
        } else {
            if (!(u2Var instanceof h)) {
                throw new IllegalStateException(("unexpected: " + u2Var).toString());
            }
            ((h) u2Var).e(s.f25199a);
        }
        return true;
    }

    public final void e() {
        int i10;
        do {
            i10 = f22677g.get(this);
            if (i10 <= this.f22678a) {
                return;
            }
        } while (!f22677g.compareAndSet(this, i10, this.f22678a));
    }

    public final int f() {
        int andDecrement;
        do {
            andDecrement = f22677g.getAndDecrement(this);
        } while (andDecrement > this.f22678a);
        return andDecrement;
    }

    public int g() {
        return Math.max(f22677g.get(this), 0);
    }

    public void m() {
        do {
            int andIncrement = f22677g.getAndIncrement(this);
            if (andIncrement >= this.f22678a) {
                e();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f22678a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!p());
    }

    public boolean n() {
        while (true) {
            int i10 = f22677g.get(this);
            if (i10 > this.f22678a) {
                e();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f22677g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean o(Object obj) {
        if (!(obj instanceof o)) {
            if (obj instanceof h) {
                return ((h) obj).h(this, s.f25199a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        p.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        o oVar = (o) obj;
        Object objS = oVar.s(s.f25199a, null, this.f22679b);
        if (objS == null) {
            return false;
        }
        oVar.C(objS);
        return true;
    }

    public final boolean p() {
        Object objC;
        d dVar = (d) f22673c.get(this);
        long andIncrement = f22674d.getAndIncrement(this);
        long j10 = andIncrement / c.f22689f;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.f22681a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22673c;
        loop0: while (true) {
            objC = kotlinx.coroutines.internal.d.c(dVar, j10, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (a0.c(objC)) {
                break;
            }
            z zVarB = a0.b(objC);
            while (true) {
                z zVar = (z) atomicReferenceFieldUpdater.get(this);
                if (zVar.f22569c >= zVarB.f22569c) {
                    break loop0;
                }
                if (!zVarB.t()) {
                    break;
                }
                if (t.a.a(atomicReferenceFieldUpdater, this, zVar, zVarB)) {
                    if (zVar.o()) {
                        zVar.m();
                    }
                } else if (zVarB.o()) {
                    zVarB.m();
                }
            }
        }
        d dVar2 = (d) a0.b(objC);
        dVar2.b();
        if (dVar2.f22569c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % c.f22689f);
        Object andSet = dVar2.u().getAndSet(i10, c.f22685b);
        if (andSet != null) {
            if (andSet == c.f22688e) {
                return false;
            }
            return o(andSet);
        }
        int i11 = c.f22684a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (dVar2.u().get(i10) == c.f22686c) {
                return true;
            }
        }
        return !f.a(dVar2.u(), i10, c.f22685b, c.f22687d);
    }
}
