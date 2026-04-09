package xk;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f37195a;

    public h0(ScheduledFuture scheduledFuture) {
        this.f37195a = scheduledFuture;
    }

    @Override // xk.i0
    public final void a() {
        this.f37195a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f37195a + ']';
    }
}
