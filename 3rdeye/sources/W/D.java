package W;

import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import b0.C1811b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.s f13070c;

    public /* synthetic */ D(d0.s sVar, int i) {
        this.f13069b = i;
        this.f13070c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13069b) {
            case 0:
                d0.s sVar = this.f13070c;
                C.S.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                if (C1811b.f17055a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    F.q(sVar);
                    return;
                }
                return;
            case 1:
                d0.s sVar2 = this.f13070c;
                int iOrdinal = sVar2.f37276t.ordinal();
                if (iOrdinal == 1) {
                    sVar2.h();
                    return;
                } else {
                    if (iOrdinal == 6 || iOrdinal == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            default:
                d0.s sVar3 = this.f13070c;
                sVar3.f37255B = true;
                if (sVar3.f37254A) {
                    sVar3.f37262e.stop();
                    sVar3.i();
                    return;
                }
                return;
        }
    }
}
