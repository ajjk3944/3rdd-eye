package ec;

import ac.f;
import bc.j;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import dd.r;

/* loaded from: classes.dex */
public final class d extends f {
    public static final bm.e j = new bm.e("ClientNotification.API", new ad.b(2), new ee.f(1));
    public static final bm.e k = new bm.e("ClientTelemetry.API", new ad.b(3), new ee.f(1));

    public r d(TelemetryData telemetryData) {
        j jVar = new j(0);
        jVar.f2611c = 0;
        jVar.f2613e = new Feature[]{mc.c.f16673a};
        jVar.f2610b = false;
        jVar.f2612d = new b9.e(17, telemetryData);
        return c(2, jVar.d());
    }
}
