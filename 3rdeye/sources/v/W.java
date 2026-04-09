package v;

import java.util.concurrent.CancellationException;

/* compiled from: CaptureSession.java */
/* loaded from: classes.dex */
public final class W implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f46640b;

    public W(Y y10) {
        this.f46640b = y10;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        synchronized (this.f46640b.f46642a) {
            try {
                this.f46640b.f46645d.u();
                int iOrdinal = this.f46640b.i.ordinal();
                if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                    C.S.h("CaptureSession", "Opening session with fail " + this.f46640b.i, th);
                    this.f46640b.l();
                }
            } finally {
            }
        }
    }

    @Override // I.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
    }
}
