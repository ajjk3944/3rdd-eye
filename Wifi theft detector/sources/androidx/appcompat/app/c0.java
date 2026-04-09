package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static c0 f536d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f537a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f538b;

    /* renamed from: c, reason: collision with root package name */
    public final a f539c = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f540a;

        /* renamed from: b, reason: collision with root package name */
        public long f541b;
    }

    public c0(Context context, LocationManager locationManager) {
        this.f537a = context;
        this.f538b = locationManager;
    }

    public static c0 a(Context context) {
        if (f536d == null) {
            Context applicationContext = context.getApplicationContext();
            f536d = new c0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f536d;
    }

    public final Location b() {
        Location locationC = PermissionChecker.b(this.f537a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = PermissionChecker.b(this.f537a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.f538b.isProviderEnabled(str)) {
                return this.f538b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f539c;
        if (e()) {
            return aVar.f540a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f540a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f539c.f541b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j10;
        a aVar = this.f539c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        b0 b0VarB = b0.b();
        b0VarB.a(jCurrentTimeMillis - SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        b0VarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b0VarB.f535c == 1;
        long j11 = b0VarB.f534b;
        long j12 = b0VarB.f533a;
        b0VarB.a(jCurrentTimeMillis + SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        long j13 = b0VarB.f534b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        aVar.f540a = z10;
        aVar.f541b = j10;
    }
}
