package km;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f28450a;

    /* renamed from: b, reason: collision with root package name */
    public final d f28451b;

    public p(Executor executor, d dVar) {
        this.f28450a = executor;
        this.f28451b = dVar;
    }

    @Override // km.d
    public final void c(g gVar) {
        this.f28451b.c(new o(this, gVar));
    }

    @Override // km.d
    public final void cancel() {
        this.f28451b.cancel();
    }

    @Override // km.d
    public final boolean isCanceled() {
        return this.f28451b.isCanceled();
    }

    @Override // km.d
    public final va.o request() {
        return this.f28451b.request();
    }

    @Override // km.d
    public final d clone() {
        return new p(this.f28450a, this.f28451b.clone());
    }
}
