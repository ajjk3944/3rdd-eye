package G4;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgv;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
/* loaded from: classes2.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1904a;

    public c(d dVar) {
        this.f1904a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j4) {
        d dVar = this.f1904a;
        if (dVar.f1905a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = b.f1898a;
            String strZza = zzgv.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            dVar.f1906b.i(2, bundle2);
        }
    }
}
