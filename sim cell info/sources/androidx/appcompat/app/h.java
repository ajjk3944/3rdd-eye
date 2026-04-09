package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class h {

    /* renamed from: d, reason: collision with root package name */
    private static h f455d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f456a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f457b;

    /* renamed from: c, reason: collision with root package name */
    private final a f458c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f459a;

        /* renamed from: b, reason: collision with root package name */
        long f460b;

        /* renamed from: c, reason: collision with root package name */
        long f461c;

        /* renamed from: d, reason: collision with root package name */
        long f462d;

        /* renamed from: e, reason: collision with root package name */
        long f463e;

        /* renamed from: f, reason: collision with root package name */
        long f464f;

        a() {
        }
    }

    h(Context context, LocationManager locationManager) {
        this.f456a = context;
        this.f457b = locationManager;
    }

    static h a(Context context) {
        if (f455d == null) {
            Context applicationContext = context.getApplicationContext();
            f455d = new h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f455d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = r.b.b(this.f456a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = r.b.b(this.f456a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f457b.isProviderEnabled(str)) {
                return this.f457b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f458c.f464f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.f458c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVarB = g.b();
        gVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = gVarB.f452a;
        gVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = gVarB.f454c == 1;
        long j4 = gVarB.f453b;
        long j5 = gVarB.f452a;
        boolean z3 = z2;
        gVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = gVarB.f453b;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + jCurrentTimeMillis;
        } else {
            j2 = (jCurrentTimeMillis > j5 ? 0 + j6 : jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.f459a = z3;
        aVar.f460b = j3;
        aVar.f461c = j4;
        aVar.f462d = j5;
        aVar.f463e = j6;
        aVar.f464f = j2;
    }

    boolean d() {
        a aVar = this.f458c;
        if (e()) {
            return aVar.f459a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f459a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
