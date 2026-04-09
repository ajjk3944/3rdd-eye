package G4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1905a;

    /* renamed from: b, reason: collision with root package name */
    public final K4.b f1906b;

    public d(AppMeasurementSdk appMeasurementSdk, K4.b bVar) {
        this.f1906b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new c(this));
        this.f1905a = new HashSet();
    }
}
