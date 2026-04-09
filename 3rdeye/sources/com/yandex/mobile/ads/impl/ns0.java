package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;

/* loaded from: classes3.dex */
public final class ns0 {

    /* renamed from: a, reason: collision with root package name */
    private final js0 f30997a = new js0();

    public final Location a(List<? extends Location> locations) {
        kotlin.jvm.internal.l.f(locations, "locations");
        Location location = null;
        for (Location location2 : locations) {
            this.f30997a.getClass();
            if (js0.a(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
