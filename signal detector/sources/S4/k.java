package S4;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.Q;
import com.lefan.signal.ui.noise.NoiseActivity;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class k implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NoiseActivity f3540a;

    public k(NoiseActivity noiseActivity) {
        this.f3540a = noiseActivity;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        q5.i.e(location, "location");
        NoiseActivity noiseActivity = this.f3540a;
        AbstractC3046w.l(Q.f(noiseActivity), null, new j(noiseActivity, location, null), 3);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        q5.i.e(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        q5.i.e(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
