package xk;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37180a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37181b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f37180a = i4;
        this.f37181b = obj;
    }

    @Override // xk.f
    public final void b(Throwable th2) {
        switch (this.f37180a) {
            case 0:
                ((ScheduledFuture) this.f37181b).cancel(false);
                break;
            case 1:
                ((mk.c) this.f37181b).invoke(th2);
                break;
            default:
                ((i0) this.f37181b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f37180a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f37181b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((mk.c) this.f37181b).getClass().getSimpleName() + '@' + x.n(this) + ']';
            default:
                return "DisposeOnCancel[" + ((i0) this.f37181b) + ']';
        }
    }
}
