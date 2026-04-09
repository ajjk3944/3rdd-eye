package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f42288a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42289b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f42288a == locationFilter.f42288a && this.f42289b == locationFilter.f42289b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f42289b;
    }

    public final long getUpdateTimeInterval() {
        return this.f42288a;
    }

    public int hashCode() {
        long j4 = this.f42288a;
        return Float.floatToIntBits(this.f42289b) + (((int) (j4 ^ (j4 >>> 32))) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f42288a + ", updateDistanceInterval=" + this.f42289b + ')';
    }

    public LocationFilter(long j4, float f10) {
        this.f42288a = j4;
        this.f42289b = f10;
    }

    public /* synthetic */ LocationFilter(long j4, float f10, int i, g gVar) {
        this((i & 1) != 0 ? 5000L : j4, (i & 2) != 0 ? 10.0f : f10);
    }
}
