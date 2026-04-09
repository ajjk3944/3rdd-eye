package W;

import java.util.concurrent.ScheduledFuture;

/* compiled from: Recorder.java */
/* loaded from: classes.dex */
public final class E implements I.c<d0.k> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f13071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f13072c;

    public E(F f10, Y y10) {
        this.f13072c = f10;
        this.f13071b = y10;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        C.S.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
    }

    @Override // I.c
    public final void onSuccess(d0.k kVar) {
        d0.s sVar;
        d0.k kVar2 = kVar;
        C.S.a("Recorder", "VideoEncoder can be released: " + kVar2);
        if (kVar2 == null) {
            return;
        }
        F f10 = this.f13072c;
        ScheduledFuture<?> scheduledFuture = f10.f13104X;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (sVar = f10.f13084D) != null && sVar == kVar2) {
            F.q(sVar);
        }
        f10.f13108a0 = this.f13071b;
        f10.A(null);
        f10.t(f10.n());
    }
}
