package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s extends B3.u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20365c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f20366d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, V2.e eVar) {
        super(vVar);
        this.f20366d = vVar;
        this.f20367e = eVar;
    }

    @Override // B3.u
    public final IntentFilter g() {
        switch (this.f20365c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // B3.u
    public final int h() {
        Location location;
        boolean z6;
        long j6;
        switch (this.f20365c) {
            case 0:
                return o.a((PowerManager) this.f20367e) ? 2 : 1;
            default:
                V2.e eVar = (V2.e) this.f20367e;
                E e6 = (E) eVar.f3870d;
                LocationManager locationManager = (LocationManager) eVar.f3869c;
                if (e6.f20272b > System.currentTimeMillis()) {
                    z6 = e6.f20271a;
                } else {
                    Context context = (Context) eVar.f3868b;
                    Location lastKnownLocation = null;
                    if (a4.t.f(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (a4.t.f(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (D.f20267d == null) {
                            D.f20267d = new D();
                        }
                        D d6 = D.f20267d;
                        d6.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        d6.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z6 = d6.f20270c == 1;
                        long j7 = d6.f20269b;
                        long j8 = d6.f20268a;
                        d6.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j9 = d6.f20269b;
                        if (j7 == -1 || j8 == -1) {
                            j6 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j8) {
                                j7 = j9;
                            } else if (jCurrentTimeMillis > j7) {
                                j7 = j8;
                            }
                            j6 = j7 + 60000;
                        }
                        e6.f20271a = z6;
                        e6.f20272b = j6;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z6 = true;
                        }
                    }
                }
                return z6 ? 2 : 1;
        }
    }

    @Override // B3.u
    public final void s() {
        switch (this.f20365c) {
            case 0:
                this.f20366d.s(true, true);
                break;
            default:
                this.f20366d.s(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f20366d = vVar;
        this.f20367e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
