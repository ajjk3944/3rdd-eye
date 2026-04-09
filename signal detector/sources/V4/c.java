package V4;

import android.location.GnssStatus;
import android.location.GnssStatus$Callback;
import android.os.Build;

/* loaded from: classes.dex */
public final class c extends GnssStatus$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3878a;

    public c(d dVar) {
        this.f3878a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [V4.a, java.lang.Object] */
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        q5.i.e(gnssStatus, "status");
        super.onSatelliteStatusChanged(gnssStatus);
        this.f3878a.f3882d.clear();
        int satelliteCount = gnssStatus.getSatelliteCount();
        for (int i = 0; i < satelliteCount; i++) {
            l lVar = new l();
            lVar.f3905a = gnssStatus.usedInFix(i);
            lVar.f3906b = gnssStatus.getAzimuthDegrees(i);
            lVar.f3908d = gnssStatus.getCn0DbHz(i);
            lVar.f3909e = gnssStatus.getConstellationType(i);
            lVar.f3907c = gnssStatus.getElevationDegrees(i);
            lVar.f3910f = Integer.valueOf(gnssStatus.getSvid(i));
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && gnssStatus.hasBasebandCn0DbHz(i)) {
                gnssStatus.getBasebandCn0DbHz(i);
            }
            lVar.f3912h = gnssStatus.hasAlmanacData(i);
            if (i3 >= 26 && gnssStatus.hasCarrierFrequencyHz(i)) {
                lVar.i = Float.valueOf(gnssStatus.getCarrierFrequencyHz(i));
            }
            this.f3878a.f3882d.add(lVar);
        }
        d dVar = this.f3878a;
        ?? r02 = dVar.f3880b;
        if (r02 != 0) {
            r02.e(dVar.f3882d);
        }
    }
}
