package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import d9.C4284b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qq0 implements ls0 {

    /* renamed from: a, reason: collision with root package name */
    private final ns0 f32314a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f32315b;

    /* renamed from: c, reason: collision with root package name */
    private final p32 f32316c;

    public qq0(Context context, ns0 locationSelector) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(locationSelector, "locationSelector");
        this.f32314a = locationSelector;
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.f32315b = locationManager;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f32316c = new p32(applicationContext, locationManager);
    }

    @Override // com.yandex.mobile.ads.impl.ls0
    public final Location a() {
        LocationManager locationManager;
        try {
            locationManager = this.f32315b;
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
        List<String> allProviders = locationManager != null ? locationManager.getAllProviders() : null;
        if (allProviders == null) {
            return null;
        }
        C4284b c4284bU = E.u.u();
        Iterator<String> it = allProviders.iterator();
        while (it.hasNext()) {
            Location locationA = this.f32316c.a(it.next());
            if (locationA != null) {
                c4284bU.add(locationA);
            }
        }
        return this.f32314a.a(E.u.m(c4284bU));
    }
}
