package G4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final K4.b f1908a;

    public f(AppMeasurementSdk appMeasurementSdk, K4.b bVar) {
        this.f1908a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new e(this));
    }
}
