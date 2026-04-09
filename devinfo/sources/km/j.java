package km;

import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends CompletableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f28430a;

    public j(d0 d0Var) {
        this.f28430a = d0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        if (z3) {
            this.f28430a.cancel();
        }
        return super.cancel(z3);
    }
}
