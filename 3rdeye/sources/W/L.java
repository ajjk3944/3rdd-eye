package W;

import C.g0;
import W.F;
import java.util.concurrent.TimeUnit;

/* compiled from: Recorder.java */
/* loaded from: classes.dex */
public final class L implements I.c<d0.k> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f13167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F.i f13168c;

    public L(F.i iVar, Y y10) {
        this.f13168c = iVar;
        this.f13167b = y10;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        C1623k c1623k;
        C.S.h("Recorder", "VideoEncoder Setup error: " + th, th);
        F.i iVar = this.f13168c;
        int i = iVar.f13161e;
        if (i < iVar.f13159c) {
            iVar.f13161e = i + 1;
            iVar.f13162f = E.u.H().schedule(new B.a(9, F.this.f13113d, new g0(this, 8)), F.f13080k0, TimeUnit.MILLISECONDS);
            return;
        }
        F f10 = F.this;
        synchronized (f10.f13116g) {
            try {
                c1623k = null;
                switch (f10.i) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        C1623k c1623k2 = f10.f13121m;
                        f10.f13121m = null;
                        c1623k = c1623k2;
                    case CONFIGURING:
                        f10.C(-1);
                        f10.B(F.j.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + f10.i + ": " + th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c1623k != null) {
            f10.i(c1623k, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:22:0x0090, B:23:0x0096, B:50:0x0105, B:25:0x009b, B:28:0x00a7, B:31:0x00ac, B:32:0x00b3, B:35:0x00b7, B:36:0x00c4, B:37:0x00d7, B:40:0x00db, B:44:0x00e2, B:46:0x00e8, B:47:0x00f3, B:48:0x00fd), top: B:64:0x0090 }] */
    @Override // I.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(d0.k r8) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.L.onSuccess(java.lang.Object):void");
    }
}
