package bu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wt.c0;
import wt.k0;
import wt.k1;

/* loaded from: classes.dex */
public final class f extends c0 implements rq.d, pq.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final Object B;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final wt.q f2963r;

    /* renamed from: x, reason: collision with root package name */
    public final rq.c f2964x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2965y;

    public f(wt.q qVar, rq.c cVar) {
        super(-1);
        this.f2963r = qVar;
        this.f2964x = cVar;
        this.f2965y = a.f2952b;
        this.B = a.k(cVar.m());
    }

    @Override // rq.d
    public final rq.d e() {
        return this.f2964x;
    }

    @Override // pq.c
    public final void g(Object obj) {
        Throwable thA = lq.o.a(obj);
        Object oVar = thA == null ? obj : new wt.o(thA, false);
        rq.c cVar = this.f2964x;
        pq.h hVarM = cVar.m();
        wt.q qVar = this.f2963r;
        if (qVar.p0(hVarM)) {
            this.f2965y = oVar;
            this.f24608g = 0;
            qVar.n0(cVar.m(), this);
            return;
        }
        k0 k0VarA = k1.a();
        if (k0VarA.f24629g >= 4294967296L) {
            this.f2965y = oVar;
            this.f24608g = 0;
            k0VarA.s0(this);
            return;
        }
        k0VarA.u0(true);
        try {
            pq.h hVarM2 = cVar.m();
            Object objL = a.l(hVarM2, this.B);
            try {
                cVar.g(obj);
                while (k0VarA.w0()) {
                }
            } finally {
                a.g(hVarM2, objL);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // wt.c0
    public final Object i() {
        Object obj = this.f2965y;
        this.f2965y = a.f2952b;
        return obj;
    }

    @Override // pq.c
    public final pq.h m() {
        return this.f2964x.m();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2963r + ", " + wt.w.y(this.f2964x) + ']';
    }

    @Override // wt.c0
    public final pq.c c() {
        return this;
    }
}
