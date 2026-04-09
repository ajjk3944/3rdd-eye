package u0;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final w f34801a;

    /* renamed from: b, reason: collision with root package name */
    public final t f34802b;

    /* renamed from: c, reason: collision with root package name */
    public final p f34803c;

    /* renamed from: d, reason: collision with root package name */
    public final mk.e f34804d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34805e;

    /* renamed from: f, reason: collision with root package name */
    public final i0.f f34806f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f34807h = new AtomicReference(g1.f34815c);

    /* renamed from: i, reason: collision with root package name */
    public long f34808i = c1.n.b();
    public x.f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final c1.o f34809k;

    /* renamed from: l, reason: collision with root package name */
    public final i0.f f34810l;

    public f1(w wVar, t tVar, p pVar, x.h0 h0Var, mk.e eVar, boolean z3, i0.f fVar, Object obj) {
        this.f34801a = wVar;
        this.f34802b = tVar;
        this.f34803c = pVar;
        this.f34804d = eVar;
        this.f34805e = z3;
        this.f34806f = fVar;
        this.g = obj;
        x.f0 f0Var = x.m0.f36916a;
        nk.k.c(f0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.j = f0Var;
        c1.o oVar = new c1.o();
        oVar.g(h0Var, pVar.z());
        this.f34809k = oVar;
        this.f34810l = new i0.f(fVar.f25418d);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f34807h;
        try {
            switch (((g1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    g1 g1Var = g1.f34818f;
                    g1 g1Var2 = g1.g;
                    while (!atomicReference.compareAndSet(g1Var, g1Var2)) {
                        if (atomicReference.get() != g1Var) {
                            j1.b("Unexpected state change from: " + g1Var + " to: " + g1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new ac.m();
            }
        } catch (Exception e2) {
            atomicReference.set(g1.f34813a);
            throw e2;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.f34810l.L(this.f34806f, this.f34809k);
                    this.f34809k.c();
                    this.f34809k.d();
                } finally {
                    this.f34809k.b();
                    this.f34801a.f35006q = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((g1) this.f34807h.get()).compareTo(g1.f34818f) >= 0;
    }

    public final void d() {
        g1 g1Var;
        g1 g1Var2;
        boolean z3;
        while (true) {
            AtomicReference atomicReference = this.f34807h;
            g1Var = g1.f34816d;
            g1Var2 = g1.f34818f;
            if (atomicReference.compareAndSet(g1Var, g1Var2)) {
                z3 = true;
                break;
            } else if (atomicReference.get() != g1Var) {
                z3 = false;
                break;
            }
        }
        if (z3) {
            return;
        }
        j1.b("Unexpected state change from: " + g1Var + " to: " + g1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(z1 z1Var) throws Exception {
        g1 g1Var = g1.f34817e;
        AtomicReference atomicReference = this.f34807h;
        try {
            int iOrdinal = ((g1) atomicReference.get()).ordinal();
            g1 g1Var2 = g1.f34816d;
            w wVar = this.f34801a;
            t tVar = this.f34802b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    p pVar = this.f34803c;
                    boolean z3 = this.f34805e;
                    if (z3) {
                        pVar.f34921z = 100;
                        pVar.f34920y = true;
                    }
                    try {
                        this.j = tVar.b(wVar, z1Var, this.f34804d);
                        g1 g1Var3 = g1.f34815c;
                        while (true) {
                            if (!atomicReference.compareAndSet(g1Var3, g1Var2)) {
                                if (atomicReference.get() != g1Var3) {
                                    j1.b("Unexpected state change from: " + g1Var3 + " to: " + g1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z3) {
                            pVar.s();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(g1Var2, g1Var)) {
                            if (atomicReference.get() != g1Var2) {
                                j1.b("Unexpected state change from: " + g1Var2 + " to: " + g1Var + '.');
                            }
                        }
                    }
                    long j = this.f34808i;
                    try {
                        this.f34808i = c1.n.b();
                        this.j = tVar.n(wVar, z1Var, this.j);
                        this.f34808i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(g1Var, g1Var2)) {
                                if (atomicReference.get() != g1Var) {
                                    j1.b("Unexpected state change from: " + g1Var + " to: " + g1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.f34808i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(g1Var, g1Var2)) {
                                if (atomicReference.get() != g1Var) {
                                    j1.b("Unexpected state change from: " + g1Var + " to: " + g1Var2 + '.');
                                }
                            }
                        }
                        throw th2;
                    }
                case 4:
                    r.b("Recursive call to resume()");
                    throw new ac.m();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new ac.m();
            }
        } catch (Exception e2) {
            atomicReference.set(g1.f34813a);
            throw e2;
        }
    }
}
