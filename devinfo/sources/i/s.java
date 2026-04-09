package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25346c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f25347d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f25348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, yb.e eVar) {
        super(vVar);
        this.f25347d = vVar;
        this.f25348e = eVar;
    }

    @Override // androidx.recyclerview.widget.d0
    public final IntentFilter d() {
        switch (this.f25346c) {
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

    @Override // androidx.recyclerview.widget.d0
    public final int f() {
        Location location;
        boolean z3;
        long j;
        switch (this.f25346c) {
            case 0:
                return o.a((PowerManager) this.f25348e) ? 2 : 1;
            default:
                yb.e eVar = (yb.e) this.f25348e;
                f0 f0Var = (f0) eVar.f37511d;
                LocationManager locationManager = (LocationManager) eVar.f37510c;
                if (f0Var.f25290b > System.currentTimeMillis()) {
                    z3 = f0Var.f25289a;
                } else {
                    Context context = (Context) eVar.f37509b;
                    Location lastKnownLocation = null;
                    if (a.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (a.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (e0.f25283e == null) {
                            e0.f25283e = new e0();
                        }
                        e0 e0Var = e0.f25283e;
                        e0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        e0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z3 = e0Var.f25285b == 1;
                        long j8 = e0Var.f25287d;
                        long j9 = e0Var.f25286c;
                        e0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j10 = e0Var.f25287d;
                        if (j8 == -1 || j9 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j9) {
                                j8 = j10;
                            } else if (jCurrentTimeMillis > j8) {
                                j8 = j9;
                            }
                            j = j8 + 60000;
                        }
                        f0Var.f25289a = z3;
                        f0Var.f25290b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z3 = true;
                        }
                    }
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // androidx.recyclerview.widget.d0
    public final void q() {
        switch (this.f25346c) {
            case 0:
                this.f25347d.n(true, true);
                break;
            default:
                this.f25347d.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Context context) {
        super(vVar);
        this.f25347d = vVar;
        this.f25348e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
