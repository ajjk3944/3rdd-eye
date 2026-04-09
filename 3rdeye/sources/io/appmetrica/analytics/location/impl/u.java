package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* loaded from: classes3.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f42275a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f42276b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f42277c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42278d;

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f42275a = context;
        this.f42276b = permissionResolutionStrategy;
        this.f42277c = locationListener;
        this.f42278d = str;
    }

    public final Context a() {
        return this.f42275a;
    }

    public final LocationListener b() {
        return this.f42277c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f42276b;
    }

    public final String d() {
        return this.f42278d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f42276b.hasNecessaryPermissions(this.f42275a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f42275a, "location", "getting last known location for provider " + this.f42278d, "location manager", new M8.a(this, 0));
            if (location != null) {
                this.f42277c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f42278d);
    }
}
