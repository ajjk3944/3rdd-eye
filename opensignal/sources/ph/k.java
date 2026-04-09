package ph;

import a5.x;
import android.os.SystemClock;
import ch.n;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f20575b;

    public /* synthetic */ k(int i10, Serializable serializable) {
        this.f20574a = i10;
        this.f20575b = serializable;
    }

    public final void a(int i10) {
        switch (this.f20574a) {
            case 0:
                l lVar = (l) this.f20575b;
                synchronized (lVar) {
                    n.b("SdkDefaultBandwidthMeter", "onNetworkTypeChanged with: " + i10);
                    int i11 = lVar.E;
                    if (i11 != 0 && !lVar.f20580x) {
                        n.b("SdkDefaultBandwidthMeter", "resetOnNetworkTypeChange is false, so not calculating new bitrate estimate. Return.");
                        return;
                    }
                    if (i11 == i10) {
                        n.b("SdkDefaultBandwidthMeter", "Network type changed to the same. Doing nothing.");
                        return;
                    }
                    lVar.E = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        lVar.H = lVar.h(i10);
                        n.b("SdkDefaultBandwidthMeter", "new bitrateEstimate: " + lVar.H);
                        ((et.d) lVar.f20579r).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = lVar.f20581y > 0 ? (int) (jElapsedRealtime - lVar.B) : 0;
                        long j = lVar.D;
                        long j7 = lVar.H;
                        if (i12 != 0 || j != 0 || j7 != lVar.I) {
                            lVar.I = j7;
                            lVar.f20577d.a(i12, j, j7);
                        }
                        lVar.B = jElapsedRealtime;
                        lVar.D = 0L;
                        lVar.G = 0L;
                        lVar.F = 0L;
                        oh.h hVar = lVar.f20578g;
                        hVar.f19468b.clear();
                        hVar.f19470d = -1;
                        hVar.f19471e = 0;
                        hVar.f19472f = 0;
                        return;
                    }
                    n.b("SdkDefaultBandwidthMeter", "Not resetting bandwidth meter for networkType: " + i10 + ". Return.");
                    return;
                }
            default:
                rh.h hVar2 = (rh.h) this.f20575b;
                synchronized (hVar2) {
                    n.b("SdkDefaultBandwidthMeter", "onNetworkTypeChanged with: " + i10);
                    int i13 = hVar2.E;
                    if (i13 != 0 && !hVar2.f21542x) {
                        n.b("SdkDefaultBandwidthMeter", "resetOnNetworkTypeChange is false, so not calculating new bitrate estimate. Return.");
                        return;
                    }
                    if (i13 == i10) {
                        n.b("SdkDefaultBandwidthMeter", "Network type changed to the same. Doing nothing.");
                        return;
                    }
                    hVar2.E = i10;
                    if (i10 != 1 && i10 != 0 && i10 != 8) {
                        hVar2.H = hVar2.h(i10);
                        n.b("SdkDefaultBandwidthMeter", "new bitrateEstimate: " + hVar2.H);
                        ((x) hVar2.f21541r).getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        int i14 = hVar2.f21543y > 0 ? (int) (jElapsedRealtime2 - hVar2.B) : 0;
                        long j10 = hVar2.D;
                        long j11 = hVar2.H;
                        if (i14 != 0 || j10 != 0 || j11 != hVar2.I) {
                            hVar2.I = j11;
                            hVar2.f21539d.a(i14, j10, j11);
                        }
                        hVar2.B = jElapsedRealtime2;
                        hVar2.D = 0L;
                        hVar2.G = 0L;
                        hVar2.F = 0L;
                        nh.f fVar = hVar2.f21540g;
                        fVar.f17558b.clear();
                        fVar.f17560d = -1;
                        fVar.f17561e = 0;
                        fVar.f17562f = 0;
                        return;
                    }
                    n.b("SdkDefaultBandwidthMeter", "Not resetting bandwidth meter for networkType: " + i10 + ". Return.");
                    return;
                }
        }
    }
}
