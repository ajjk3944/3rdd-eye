package io.appmetrica.analytics.locationapi.internal;

import android.location.Location;

/* loaded from: classes3.dex */
public interface LocationProvider {
    Location getSystemLocation();

    Location getUserLocation();
}
