package sh;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.widget.TextView;
import com.google.android.gms.internal.ads.s9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y implements GpsStatus.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f33789a;

    public y(a0 a0Var) {
        this.f33789a = a0Var;
    }

    @Override // android.location.GpsStatus.Listener
    public final void onGpsStatusChanged(int i4) {
        GpsStatus gpsStatus;
        a0 a0Var = this.f33789a;
        if (a0Var.c0()) {
            return;
        }
        j1.q qVar = a0Var.f33628k0;
        if (qVar != null) {
            ((TextView) ((qg.d) qVar.f27058a).f32343n).setText(a0Var.f33631n0);
        }
        GpsStatus gpsStatus2 = a0Var.Z.getGpsStatus(a0Var.f33620c0);
        a0Var.f33620c0 = gpsStatus2;
        HashMap map = a0Var.f33626i0;
        if (gpsStatus2 != null) {
            Iterable<GpsSatellite> satellites = gpsStatus2.getSatellites();
            for (List list : map.values()) {
                if (list != null) {
                    list.clear();
                }
            }
            for (GpsSatellite gpsSatellite : satellites) {
                s9 s9Var = new s9();
                gpsSatellite.getAzimuth();
                gpsSatellite.getSnr();
                gpsSatellite.getElevation();
                s9Var.f15910b = com.bumptech.glide.d.p(gpsSatellite.getPrn());
                gpsSatellite.getPrn();
                List arrayList = (List) map.get(Integer.valueOf(s9Var.f15910b));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(s9Var.f15910b), arrayList);
                }
                arrayList.add(s9Var);
            }
        }
        a0.h0(a0Var);
        if (i4 == 3 && (gpsStatus = a0Var.f33620c0) != null) {
            a0.i0(a0Var, gpsStatus.getTimeToFirstFix());
        }
    }
}
