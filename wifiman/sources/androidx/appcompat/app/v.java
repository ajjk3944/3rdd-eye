package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import t1.AbstractC8024d;

/* loaded from: classes.dex */
class v {

    /* renamed from: d, reason: collision with root package name */
    private static v f26627d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26628a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f26629b;

    /* renamed from: c, reason: collision with root package name */
    private final a f26630c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f26631a;

        /* renamed from: b, reason: collision with root package name */
        long f26632b;

        a() {
        }
    }

    v(Context context, LocationManager locationManager) {
        this.f26628a = context;
        this.f26629b = locationManager;
    }

    static v a(Context context) {
        if (f26627d == null) {
            Context applicationContext = context.getApplicationContext();
            f26627d = new v(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f26627d;
    }

    private Location b() {
        Location locationC = AbstractC8024d.b(this.f26628a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = AbstractC8024d.b(this.f26628a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f26629b.isProviderEnabled(str)) {
                return this.f26629b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f26630c.f26632b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f26630c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        u uVarB = u.b();
        uVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        uVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = uVarB.f26626c == 1;
        long j11 = uVarB.f26625b;
        long j12 = uVarB.f26624a;
        uVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = uVarB.f26625b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j12) {
                j13 = jCurrentTimeMillis > j11 ? j12 : j11;
            }
            j10 = j13 + 60000;
        }
        aVar.f26631a = z10;
        aVar.f26632b = j10;
    }

    boolean d() {
        a aVar = this.f26630c;
        if (e()) {
            return aVar.f26631a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f26631a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
