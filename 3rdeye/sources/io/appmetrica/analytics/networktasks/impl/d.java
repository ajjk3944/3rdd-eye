package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f42379a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42380b;

    public d(NetworkTask networkTask) {
        this.f42379a = networkTask;
        this.f42380b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f42380b.equals(((d) obj).f42380b);
    }

    public final int hashCode() {
        return this.f42380b.hashCode();
    }
}
