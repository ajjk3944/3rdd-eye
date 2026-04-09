package xk;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i1 extends ck.a implements y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f37197b = new i1(s.f37235b);

    @Override // xk.y0
    public final k N(f1 f1Var) {
        return j1.f37202a;
    }

    @Override // xk.y0
    public final boolean c() {
        return true;
    }

    @Override // xk.y0
    public final Object g(ek.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // xk.y0
    public final boolean isCancelled() {
        return false;
    }

    @Override // xk.y0
    public final i0 m(mk.c cVar) {
        return j1.f37202a;
    }

    @Override // xk.y0
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // xk.y0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // xk.y0
    public final i0 w(boolean z3, boolean z10, c0.a aVar) {
        return j1.f37202a;
    }

    @Override // xk.y0
    public final void e(CancellationException cancellationException) {
    }
}
