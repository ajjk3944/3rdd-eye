package yt;

import bu.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lf.t1;
import wt.q1;
import wt.w;

/* loaded from: classes.dex */
public final class b implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f26419a = e.f26441p;

    /* renamed from: d, reason: collision with root package name */
    public wt.g f26420d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f26421g;

    public b(c cVar) {
        this.f26421g = cVar;
    }

    @Override // wt.q1
    public final void a(bu.r rVar, int i10) {
        wt.g gVar = this.f26420d;
        if (gVar != null) {
            gVar.a(rVar, i10);
        }
    }

    public final Object b(rq.c cVar) {
        k kVarM;
        Object obj = this.f26419a;
        boolean z10 = true;
        if (obj == e.f26441p || obj == e.f26437l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.B;
            c cVar2 = this.f26421g;
            k kVar = (k) atomicReferenceFieldUpdater.get(cVar2);
            while (true) {
                cVar2.getClass();
                if (cVar2.s(c.f26422d.get(cVar2), true)) {
                    this.f26419a = e.f26437l;
                    Throwable thN = cVar2.n();
                    if (thN != null) {
                        int i10 = bu.s.f2988a;
                        throw thN;
                    }
                    z10 = false;
                } else {
                    long andIncrement = c.f26423g.getAndIncrement(cVar2);
                    long j = e.f26429b;
                    long j7 = andIncrement / j;
                    int i11 = (int) (andIncrement % j);
                    if (kVar.f2987c != j7) {
                        kVarM = cVar2.m(j7, kVar);
                        if (kVarM == null) {
                            continue;
                        }
                    } else {
                        kVarM = kVar;
                    }
                    Object objA = cVar2.A(kVarM, i11, andIncrement, null);
                    t tVar = e.f26438m;
                    if (objA == tVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    t tVar2 = e.f26440o;
                    if (objA == tVar2) {
                        if (andIncrement < cVar2.q()) {
                            kVarM.a();
                        }
                        kVar = kVarM;
                    } else {
                        if (objA == e.f26439n) {
                            c cVar3 = this.f26421g;
                            wt.g gVarN = w.n(xu.l.D(cVar));
                            try {
                                this.f26420d = gVarN;
                                Object objA2 = cVar3.A(kVarM, i11, andIncrement, this);
                                if (objA2 == tVar) {
                                    a(kVarM, i11);
                                } else {
                                    if (objA2 == tVar2) {
                                        if (andIncrement < cVar3.q()) {
                                            kVarM.a();
                                        }
                                        k kVar2 = (k) c.B.get(cVar3);
                                        while (true) {
                                            if (cVar3.s(c.f26422d.get(cVar3), true)) {
                                                wt.g gVar = this.f26420d;
                                                br.l.b(gVar);
                                                this.f26420d = null;
                                                this.f26419a = e.f26437l;
                                                Throwable thN2 = cVar2.n();
                                                if (thN2 == null) {
                                                    gVar.g(Boolean.FALSE);
                                                } else {
                                                    gVar.g(t1.k(thN2));
                                                }
                                            } else {
                                                long andIncrement2 = c.f26423g.getAndIncrement(cVar3);
                                                long j10 = e.f26429b;
                                                long j11 = andIncrement2 / j10;
                                                int i12 = (int) (andIncrement2 % j10);
                                                if (kVar2.f2987c != j11) {
                                                    k kVarM2 = cVar3.m(j11, kVar2);
                                                    if (kVarM2 != null) {
                                                        kVar2 = kVarM2;
                                                    }
                                                }
                                                Object objA3 = cVar3.A(kVar2, i12, andIncrement2, this);
                                                if (objA3 == e.f26438m) {
                                                    a(kVar2, i12);
                                                    break;
                                                }
                                                if (objA3 == e.f26440o) {
                                                    if (andIncrement2 < cVar3.q()) {
                                                        kVar2.a();
                                                    }
                                                } else {
                                                    if (objA3 == e.f26439n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar2.a();
                                                    this.f26419a = objA3;
                                                    this.f26420d = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kVarM.a();
                                        this.f26419a = objA2;
                                        this.f26420d = null;
                                    }
                                    gVarN.j(Boolean.TRUE, null);
                                }
                                Object objU = gVarN.u();
                                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                                return objU;
                            } catch (Throwable th2) {
                                gVarN.C();
                                throw th2;
                            }
                        }
                        kVarM.a();
                        this.f26419a = objA;
                    }
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public final Object c() {
        Object obj = this.f26419a;
        t tVar = e.f26441p;
        if (obj == tVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f26419a = tVar;
        if (obj != e.f26437l) {
            return obj;
        }
        Throwable thO = this.f26421g.o();
        int i10 = bu.s.f2988a;
        throw thO;
    }
}
