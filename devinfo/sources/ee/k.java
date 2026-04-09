package ee;

import ea.o;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f23424f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23425a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f23426b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f23427c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f23428d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final vd.a f23429e = new vd.a(this);

    public k(Executor executor) {
        y.h(executor);
        this.f23425a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.h(runnable);
        synchronized (this.f23426b) {
            int i4 = this.f23427c;
            if (i4 != 4 && i4 != 3) {
                long j = this.f23428d;
                o oVar = new o(1, runnable);
                this.f23426b.add(oVar);
                this.f23427c = 2;
                try {
                    this.f23425a.execute(this.f23429e);
                    if (this.f23427c != 2) {
                        return;
                    }
                    synchronized (this.f23426b) {
                        try {
                            if (this.f23428d == j && this.f23427c == 2) {
                                this.f23427c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f23426b) {
                        try {
                            int i10 = this.f23427c;
                            boolean z3 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f23426b.removeLastOccurrence(oVar)) {
                                z3 = false;
                            }
                            if (!(e2 instanceof RejectedExecutionException) || z3) {
                                throw e2;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f23426b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f23425a + "}";
    }
}
