package sh;

import android.hardware.GeomagneticField;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33762b;

    public /* synthetic */ u(int i4, Object obj) {
        this.f33761a = i4;
        this.f33762b = obj;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        switch (this.f33761a) {
            case 0:
                Objects.toString(location);
                a0 a0Var = (a0) this.f33762b;
                if (!a0Var.c0()) {
                    a0Var.f33629l0 = location;
                    j1.q qVar = a0Var.f33628k0;
                    if (qVar != null) {
                        qVar.a(location);
                        j1.q qVar2 = a0Var.f33628k0;
                        ((TextView) ((qg.d) qVar2.f27058a).f32343n).setText(a0Var.f33631n0);
                        break;
                    }
                }
                break;
            default:
                RealtimeSatelliteActivity realtimeSatelliteActivity = (RealtimeSatelliteActivity) this.f33762b;
                realtimeSatelliteActivity.I = location;
                realtimeSatelliteActivity.getClass();
                realtimeSatelliteActivity.R = new GeomagneticField((float) realtimeSatelliteActivity.I.getLatitude(), (float) realtimeSatelliteActivity.I.getLongitude(), (float) realtimeSatelliteActivity.I.getAltitude(), realtimeSatelliteActivity.I.getTime());
                break;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        int i4 = this.f33761a;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        int i4 = this.f33761a;
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i4, Bundle bundle) {
        switch (this.f33761a) {
            case 0:
                Objects.toString(bundle);
                break;
        }
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str, int i4, Bundle bundle) {
    }
}
