package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import b9.C1992A;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f42268e;

    /* renamed from: f, reason: collision with root package name */
    public final long f42269f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f42268e = looper;
        this.f42269f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final C1992A a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f42278d, rVar.f42269f, 0.0f, rVar.f42277c, rVar.f42268e);
        return C1992A.f18074a;
    }

    public static final C1992A b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f42277c);
        return C1992A.f18074a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f42276b.hasNecessaryPermissions(this.f42275a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f42275a, "location", B4.f.c(new StringBuilder("request location updates for "), this.f42278d, " provider"), "location manager", new B8.b(this, 4));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f42275a, "location", "stop location updates for passive provider", "location manager", new B.f(this, 9));
    }
}
