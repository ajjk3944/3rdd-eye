package km;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends rl.c0 {

    /* renamed from: c, reason: collision with root package name */
    public final rl.c0 f28393c;

    /* renamed from: d, reason: collision with root package name */
    public final hm.q f28394d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f28395e;

    public b0(rl.c0 c0Var) {
        this.f28393c = c0Var;
        this.f28394d = u6.t.d(new a0(this, c0Var.m()));
    }

    @Override // rl.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28393c.close();
    }

    @Override // rl.c0
    public final long e() {
        return this.f28393c.e();
    }

    @Override // rl.c0
    public final rl.p g() {
        return this.f28393c.g();
    }

    @Override // rl.c0
    public final hm.g m() {
        return this.f28394d;
    }
}
