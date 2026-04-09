package P6;

import android.content.ContentResolver;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f18087a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f18088b;

    m(ContentResolver contentResolver, LocationManager locationManager) {
        this.f18087a = contentResolver;
        this.f18088b = locationManager;
    }

    private boolean b() {
        return this.f18088b.isProviderEnabled("network") || this.f18088b.isProviderEnabled("gps");
    }

    private boolean c() {
        try {
            return Settings.Secure.getInt(this.f18087a, "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e10) {
            I6.q.r(e10, "Could not use LOCATION_MODE check. Falling back to a legacy/heuristic function.", new Object[0]);
            return b();
        }
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 28 ? this.f18088b.isLocationEnabled() : c();
    }
}
