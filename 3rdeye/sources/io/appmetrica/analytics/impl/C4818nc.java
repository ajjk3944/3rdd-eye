package io.appmetrica.analytics.impl;

import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4818nc implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final C4792mc f41306b = new C4792mc();

    /* renamed from: c, reason: collision with root package name */
    public static final List f41307c = C2092m.W("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f41308a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f41307c.contains(str)) {
            return !this.f41308a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f41308a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f41308a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f41308a + ", locationPermissions=" + f41307c + ')';
    }
}
