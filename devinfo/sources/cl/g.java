package cl;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.e0;
import xk.n1;
import xk.q0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends e0 implements ek.d, ck.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2913h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final xk.r f2914d;

    /* renamed from: e, reason: collision with root package name */
    public final ek.c f2915e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2916f;
    public final Object g;

    public g(xk.r rVar, ek.c cVar) {
        super(-1);
        this.f2914d = rVar;
        this.f2915e = cVar;
        this.f2916f = b.f2903b;
        this.g = b.m(cVar.getContext());
    }

    @Override // ek.d
    public final ek.d getCallerFrame() {
        return this.f2915e;
    }

    @Override // ck.c
    public final ck.h getContext() {
        return this.f2915e.getContext();
    }

    @Override // xk.e0
    public final Object h() {
        Object obj = this.f2916f;
        this.f2916f = b.f2903b;
        return obj;
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        Throwable thA = yj.l.a(obj);
        Object pVar = thA == null ? obj : new xk.p(thA, false);
        ek.c cVar = this.f2915e;
        ck.h context = cVar.getContext();
        xk.r rVar = this.f2914d;
        if (b.j(rVar, context)) {
            this.f2916f = pVar;
            this.f37182c = 0;
            b.i(rVar, cVar.getContext(), this);
            return;
        }
        q0 q0VarA = n1.a();
        if (q0VarA.f37226c >= 4294967296L) {
            this.f2916f = pVar;
            this.f37182c = 0;
            q0VarA.Y(this);
            return;
        }
        q0VarA.a0(true);
        try {
            ck.h context2 = cVar.getContext();
            Object objN = b.n(context2, this.g);
            try {
                cVar.resumeWith(obj);
                while (q0VarA.c0()) {
                }
            } finally {
                b.g(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2914d + ", " + xk.x.B(this.f2915e) + ']';
    }

    @Override // xk.e0
    public final ck.c c() {
        return this;
    }
}
