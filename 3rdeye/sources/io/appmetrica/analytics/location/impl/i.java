package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LocationFilter f42239a;

    /* renamed from: b, reason: collision with root package name */
    public final CacheArguments f42240b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f42239a = locationFilter;
        this.f42240b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.b(this.f42239a, iVar.f42239a) && kotlin.jvm.internal.l.b(this.f42240b, iVar.f42240b);
    }

    public final int hashCode() {
        return this.f42240b.hashCode() + (this.f42239a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f42239a + ", cacheArguments=" + this.f42240b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
