package u;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f34686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f34687c;

    public /* synthetic */ b(g gVar, Bundle bundle, int i4) {
        this.f34685a = i4;
        this.f34687c = gVar;
        this.f34686b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34685a) {
            case 0:
                this.f34687c.f34708b.onUnminimized(this.f34686b);
                break;
            case 1:
                this.f34687c.f34708b.onMessageChannelReady(this.f34686b);
                break;
            case 2:
                this.f34687c.f34708b.onWarmupCompleted(this.f34686b);
                break;
            default:
                this.f34687c.f34708b.onMinimized(this.f34686b);
                break;
        }
    }
}
