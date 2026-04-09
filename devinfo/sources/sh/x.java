package sh;

import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import android.widget.TextView;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.view.GpsSkyView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends GnssStatus$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33781b;

    public /* synthetic */ x(int i4, Object obj) {
        this.f33780a = i4;
        this.f33781b = obj;
    }

    public final void onFirstFix(int i4) {
        switch (this.f33780a) {
            case 0:
                a0.i0((a0) this.f33781b, i4);
                break;
        }
    }

    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        switch (this.f33780a) {
            case 0:
                if (!((a0) this.f33781b).c0()) {
                    a0.j0((a0) this.f33781b, gnssStatus);
                    a0.h0((a0) this.f33781b);
                    a0 a0Var = (a0) this.f33781b;
                    j1.q qVar = a0Var.f33628k0;
                    if (qVar != null) {
                        ((TextView) ((qg.d) qVar.f27058a).f32343n).setText(a0Var.f33631n0);
                        break;
                    }
                }
                break;
            default:
                ((RealtimeSatelliteActivity) this.f33781b).G.setGnssStatus(gnssStatus);
                break;
        }
    }

    public final void onStarted() {
        switch (this.f33780a) {
            case 0:
                break;
            default:
                GpsSkyView gpsSkyView = ((RealtimeSatelliteActivity) this.f33781b).G;
                gpsSkyView.f21331u = true;
                gpsSkyView.invalidate();
                break;
        }
    }

    public final void onStopped() {
        switch (this.f33780a) {
            case 0:
                break;
            default:
                GpsSkyView gpsSkyView = ((RealtimeSatelliteActivity) this.f33781b).G;
                gpsSkyView.f21331u = false;
                gpsSkyView.F = 0;
                gpsSkyView.invalidate();
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void a(int i4) {
    }
}
