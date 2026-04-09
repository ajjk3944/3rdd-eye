package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.t0;

/* loaded from: classes4.dex */
public final class i extends t0 implements d9.c, c9.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22534h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f22535d;

    /* renamed from: e, reason: collision with root package name */
    public final c9.c f22536e;

    /* renamed from: f, reason: collision with root package name */
    public Object f22537f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f22538g;

    public i(CoroutineDispatcher coroutineDispatcher, c9.c cVar) {
        super(-1);
        this.f22535d = coroutineDispatcher;
        this.f22536e = cVar;
        this.f22537f = j.f22539a;
        this.f22538g = ThreadContextKt.b(getContext());
    }

    @Override // kotlinx.coroutines.t0
    public void b(Object obj, Throwable th) {
        if (obj instanceof kotlinx.coroutines.d0) {
            ((kotlinx.coroutines.d0) obj).f22303b.invoke(th);
        }
    }

    @Override // d9.c
    public d9.c getCallerFrame() {
        c9.c cVar = this.f22536e;
        if (cVar instanceof d9.c) {
            return (d9.c) cVar;
        }
        return null;
    }

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        return this.f22536e.getContext();
    }

    @Override // kotlinx.coroutines.t0
    public Object j() {
        Object obj = this.f22537f;
        this.f22537f = j.f22539a;
        return obj;
    }

    public final void l() {
        while (f22534h.get(this) == j.f22540b) {
        }
    }

    public final kotlinx.coroutines.p m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22534h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f22534h.set(this, j.f22540b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.p) {
                if (t.a.a(f22534h, this, obj, j.f22540b)) {
                    return (kotlinx.coroutines.p) obj;
                }
            } else if (obj != j.f22540b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(kotlin.coroutines.d dVar, Object obj) {
        this.f22537f = obj;
        this.f22692c = 1;
        this.f22535d.Y(dVar, this);
    }

    public final kotlinx.coroutines.p o() {
        Object obj = f22534h.get(this);
        if (obj instanceof kotlinx.coroutines.p) {
            return (kotlinx.coroutines.p) obj;
        }
        return null;
    }

    public final boolean q() {
        return f22534h.get(this) != null;
    }

    public final boolean r(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22534h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c0 c0Var = j.f22540b;
            if (kotlin.jvm.internal.p.a(obj, c0Var)) {
                if (t.a.a(f22534h, this, c0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (t.a.a(f22534h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        kotlin.coroutines.d context = this.f22536e.getContext();
        Object objD = kotlinx.coroutines.f0.d(obj, null, 1, null);
        if (this.f22535d.Z(context)) {
            this.f22537f = objD;
            this.f22692c = 0;
            this.f22535d.X(context, this);
            return;
        }
        c1 c1VarB = p2.f22589a.b();
        if (c1VarB.i0()) {
            this.f22537f = objD;
            this.f22692c = 0;
            c1VarB.e0(this);
            return;
        }
        c1VarB.g0(true);
        try {
            kotlin.coroutines.d context2 = getContext();
            Object objC = ThreadContextKt.c(context2, this.f22538g);
            try {
                this.f22536e.resumeWith(obj);
                y8.s sVar = y8.s.f25199a;
                while (c1VarB.l0()) {
                }
            } finally {
                ThreadContextKt.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void t() {
        l();
        kotlinx.coroutines.p pVarO = o();
        if (pVarO != null) {
            pVarO.q();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f22535d + ", " + l0.c(this.f22536e) + ']';
    }

    public final Throwable u(kotlinx.coroutines.o oVar) {
        c0 c0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22534h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c0Var = j.f22540b;
            if (obj != c0Var) {
                if (obj instanceof Throwable) {
                    if (t.a.a(f22534h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!t.a.a(f22534h, this, c0Var, oVar));
        return null;
    }

    @Override // kotlinx.coroutines.t0
    public c9.c c() {
        return this;
    }
}
