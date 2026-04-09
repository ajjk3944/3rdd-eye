package wt;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class e implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24612a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24613b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f24612a = i10;
        this.f24613b = obj;
    }

    public final String toString() {
        switch (this.f24612a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f24613b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ar.k) this.f24613b).getClass().getSimpleName() + '@' + w.l(this) + ']';
            default:
                return "DisposeOnCancel[" + ((e0) this.f24613b) + ']';
        }
    }
}
