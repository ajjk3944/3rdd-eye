package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class js0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f29268a = TimeUnit.MINUTES.toMillis(2);

    public static boolean a(Location updatedLocation, Location location) {
        kotlin.jvm.internal.l.f(updatedLocation, "updatedLocation");
        if (location != null) {
            long time = updatedLocation.getTime() - location.getTime();
            long j4 = f29268a;
            boolean z10 = time > j4;
            boolean z11 = time < (-j4);
            boolean z12 = time > 0;
            int accuracy = (int) (updatedLocation.getAccuracy() - location.getAccuracy());
            boolean z13 = accuracy > 0;
            boolean z14 = accuracy < 0;
            boolean z15 = ((long) accuracy) > 200;
            boolean zB = kotlin.jvm.internal.l.b(updatedLocation.getProvider(), location.getProvider());
            if (!z10 && (z11 || (!z14 && ((!z12 || z13) && (!z12 || z15 || !zB))))) {
                return false;
            }
        }
        return true;
    }
}
