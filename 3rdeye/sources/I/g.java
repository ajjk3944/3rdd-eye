package I;

import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f2355c;

    public /* synthetic */ g(ScheduledFuture scheduledFuture, int i) {
        this.f2354b = i;
        this.f2355c = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2354b) {
            case 0:
                this.f2355c.cancel(true);
                break;
            default:
                this.f2355c.cancel(true);
                break;
        }
    }
}
