package A9;

import java.util.concurrent.ScheduledFuture;

/* compiled from: Future.kt */
/* renamed from: A9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0577g implements InterfaceC0579h {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f245b;

    public C0577g(ScheduledFuture scheduledFuture) {
        this.f245b = scheduledFuture;
    }

    @Override // A9.InterfaceC0579h
    public final void a(Throwable th) {
        if (th != null) {
            this.f245b.cancel(false);
        }
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f245b + ']';
    }
}
