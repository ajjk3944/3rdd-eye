package A9;

import java.util.concurrent.ScheduledFuture;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
public final class V implements W {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f213b;

    public V(ScheduledFuture scheduledFuture) {
        this.f213b = scheduledFuture;
    }

    @Override // A9.W
    public final void dispose() {
        this.f213b.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f213b + ']';
    }
}
