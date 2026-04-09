package d0;

import d0.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f37243c;

    public /* synthetic */ n(s sVar, int i) {
        this.f37242b = i;
        this.f37243c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37242b) {
            case 0:
                s sVar = this.f37243c;
                I.j.a(sVar.a(), new A3.c(sVar, 4), sVar.f37265h);
                return;
            default:
                s sVar2 = this.f37243c;
                switch (sVar2.f37276t) {
                    case CONFIGURED:
                    case STARTED:
                    case PAUSED:
                    case ERROR:
                        sVar2.g();
                        return;
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                        sVar2.k(s.b.PENDING_RELEASE);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + sVar2.f37276t);
                }
        }
    }
}
