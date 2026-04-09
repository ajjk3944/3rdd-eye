package io.appmetrica.analytics.remotepermissions.impl;

import c9.C2101v;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e implements PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public Set f42480a = C2101v.f18583b;

    public final synchronized void a(Set<String> set) {
        this.f42480a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f42480a.contains(str);
    }
}
