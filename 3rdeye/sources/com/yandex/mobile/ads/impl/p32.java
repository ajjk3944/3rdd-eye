package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import c9.C2092m;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class p32 {

    /* renamed from: c, reason: collision with root package name */
    private static final HashSet f31581c = new HashSet(E.u.G("gps"));

    /* renamed from: d, reason: collision with root package name */
    private static final HashSet f31582d = new HashSet(C2092m.W("gps", "passive"));

    /* renamed from: a, reason: collision with root package name */
    private final LocationManager f31583a;

    /* renamed from: b, reason: collision with root package name */
    private final ng1 f31584b;

    public /* synthetic */ p32(Context context, LocationManager locationManager) {
        this(context, locationManager, new ng1(context));
    }

    public final Location a(String locationProvider) {
        kotlin.jvm.internal.l.f(locationProvider, "locationProvider");
        boolean zA = this.f31584b.a();
        boolean zB = this.f31584b.b();
        boolean zContains = f31581c.contains(locationProvider);
        if (!f31582d.contains(locationProvider) ? !(zContains || !zA) : !(zContains || !zA || !zB)) {
            try {
                LocationManager locationManager = this.f31583a;
                if (locationManager != null) {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);
                    fp0.a(locationProvider, lastKnownLocation);
                    return lastKnownLocation;
                }
            } catch (Throwable unused) {
                fp0.b(new Object[0]);
            }
        }
        return null;
    }

    public p32(Context context, LocationManager locationManager, ng1 permissionExtractor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(permissionExtractor, "permissionExtractor");
        this.f31583a = locationManager;
        this.f31584b = permissionExtractor;
    }
}
