package V4;

import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public LocationManager f3879a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3880b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3881c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3882d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Object f3883e;

    public d() {
        this.f3883e = Build.VERSION.SDK_INT >= 24 ? new c(this) : new GpsStatus.Listener() { // from class: V4.b
            /* JADX WARN: Type inference failed for: r8v5, types: [V4.a, java.lang.Object] */
            @Override // android.location.GpsStatus.Listener
            public final void onGpsStatusChanged(int i) {
                Iterable<GpsSatellite> satellites;
                d dVar = this.f3877a;
                if (i != 4) {
                    return;
                }
                try {
                    LocationManager locationManager = dVar.f3879a;
                    ArrayList arrayList = dVar.f3882d;
                    Iterator<GpsSatellite> it = null;
                    GpsStatus gpsStatus = locationManager != null ? locationManager.getGpsStatus(null) : null;
                    int i3 = 0;
                    int maxSatellites = gpsStatus != null ? gpsStatus.getMaxSatellites() : 0;
                    if (gpsStatus != null && (satellites = gpsStatus.getSatellites()) != null) {
                        it = satellites.iterator();
                    }
                    arrayList.clear();
                    if (it != null) {
                        while (it.hasNext() && i3 <= maxSatellites) {
                            GpsSatellite next = it.next();
                            l lVar = new l();
                            lVar.f3905a = next.usedInFix();
                            lVar.f3907c = next.getElevation();
                            lVar.f3906b = next.getAzimuth();
                            lVar.f3908d = next.getSnr();
                            lVar.f3910f = Integer.valueOf(next.getPrn());
                            lVar.f3909e = d.a(Integer.valueOf(next.getPrn()));
                            lVar.f3911g = next.hasEphemeris();
                            lVar.f3912h = next.hasAlmanac();
                            arrayList.add(lVar);
                            if (next.usedInFix()) {
                                i3++;
                            }
                        }
                    }
                    ?? r8 = dVar.f3880b;
                    if (r8 != 0) {
                        r8.e(arrayList);
                    }
                } catch (Throwable th) {
                    R2.a.d(th);
                }
            }
        };
    }

    public static int a(Integer num) {
        if (new v5.c(1, 64, 1).a(num.intValue())) {
            return 1;
        }
        if (new v5.c(65, 96, 1).a(num.intValue())) {
            return 3;
        }
        if (new v5.c(193, TTAdConstant.MATE_VALID, 1).a(num.intValue())) {
            return 4;
        }
        if (new v5.c(201, 261, 1).a(num.intValue())) {
            return 5;
        }
        if (new v5.c(301, 336, 1).a(num.intValue())) {
            return 6;
        }
        return new v5.c(901, 924, 1).a(num.intValue()) ? 7 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [V4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [V4.a, java.lang.Object] */
    public final void b(Context context) {
        d dVar;
        Location lastKnownLocation;
        ?? r02;
        if (this.f3881c) {
            return;
        }
        if (this.f3879a == null) {
            Object systemService = context.getSystemService("location");
            q5.i.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            this.f3879a = (LocationManager) systemService;
        }
        LocationManager locationManager = this.f3879a;
        if (!(locationManager == null ? false : locationManager.getAllProviders().contains("gps"))) {
            ?? r8 = this.f3880b;
            if (r8 != 0) {
                r8.b();
                return;
            }
            return;
        }
        LocationManager locationManager2 = this.f3879a;
        if (locationManager2 != null) {
            dVar = this;
            locationManager2.requestLocationUpdates("gps", 1000L, 0.0f, dVar, Looper.getMainLooper());
        } else {
            dVar = this;
        }
        LocationManager locationManager3 = dVar.f3879a;
        if (locationManager3 != null && (lastKnownLocation = locationManager3.getLastKnownLocation("passive")) != null && (r02 = dVar.f3880b) != 0) {
            r02.i(lastKnownLocation);
        }
        int i = Build.VERSION.SDK_INT;
        Object obj = dVar.f3883e;
        if (i >= 24) {
            LocationManager locationManager4 = dVar.f3879a;
            if (locationManager4 != null) {
                q5.i.c(obj, "null cannot be cast to non-null type android.location.GnssStatus.Callback");
                locationManager4.registerGnssStatusCallback(A0.a.d(obj), new Handler(Looper.getMainLooper()));
            }
        } else {
            LocationManager locationManager5 = dVar.f3879a;
            if (locationManager5 != null) {
                q5.i.c(obj, "null cannot be cast to non-null type android.location.GpsStatus.Listener");
                locationManager5.addGpsStatusListener((GpsStatus.Listener) obj);
            }
        }
        dVar.f3881c = true;
    }

    public final void c() {
        if (this.f3881c) {
            LocationManager locationManager = this.f3879a;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
            int i = Build.VERSION.SDK_INT;
            Object obj = this.f3883e;
            if (i >= 24) {
                LocationManager locationManager2 = this.f3879a;
                if (locationManager2 != null) {
                    q5.i.c(obj, "null cannot be cast to non-null type android.location.GnssStatus.Callback");
                    locationManager2.unregisterGnssStatusCallback(A0.a.d(obj));
                }
            } else {
                LocationManager locationManager3 = this.f3879a;
                if (locationManager3 != null) {
                    q5.i.c(obj, "null cannot be cast to non-null type android.location.GpsStatus.Listener");
                    locationManager3.removeGpsStatusListener((GpsStatus.Listener) obj);
                }
            }
            this.f3881c = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [V4.a, java.lang.Object] */
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        q5.i.e(location, "p0");
        ?? r02 = this.f3880b;
        if (r02 != 0) {
            r02.i(location);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V4.a, java.lang.Object] */
    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        q5.i.e(str, "provider");
        ?? r22 = this.f3880b;
        if (r22 != 0) {
            r22.h(false);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V4.a, java.lang.Object] */
    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        q5.i.e(str, "provider");
        ?? r22 = this.f3880b;
        if (r22 != 0) {
            r22.h(true);
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
