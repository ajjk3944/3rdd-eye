package el;

import cl.v;
import java.util.concurrent.Executor;
import xk.r;
import xk.r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends r0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f23561c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final r f23562d;

    static {
        l lVar = l.f23575c;
        int i4 = v.f2943a;
        if (64 >= i4) {
            i4 = 64;
        }
        f23562d = lVar.W(cl.b.l(i4, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        f23562d.T(hVar, runnable);
    }

    @Override // xk.r
    public final void U(ck.h hVar, Runnable runnable) {
        f23562d.U(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        T(ck.i.f2898a, runnable);
    }

    @Override // xk.r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
