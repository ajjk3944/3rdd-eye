package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f40453a;

    /* renamed from: b, reason: collision with root package name */
    public final J2 f40454b;

    /* renamed from: c, reason: collision with root package name */
    public final List f40455c;

    public Z1(List list, J2 j22, List list2) {
        this.f40453a = list;
        this.f40454b = j22;
        this.f40455c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f40453a + ", mBackgroundRestrictionsState=" + this.f40454b + ", mAvailableProviders=" + this.f40455c + '}';
    }
}
