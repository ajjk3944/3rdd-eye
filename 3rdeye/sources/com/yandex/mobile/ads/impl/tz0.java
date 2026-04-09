package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.List;

/* loaded from: classes3.dex */
public final class tz0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f33831a;

    /* renamed from: b, reason: collision with root package name */
    private final List<uz0> f33832b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33833c;

    public tz0(long j4, String adUnitId, List networks) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.l.f(networks, "networks");
        this.f33831a = adUnitId;
        this.f33832b = networks;
        this.f33833c = j4;
    }

    public final long a() {
        return this.f33833c;
    }

    public final List<uz0> b() {
        return this.f33832b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz0)) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        return kotlin.jvm.internal.l.b(this.f33831a, tz0Var.f33831a) && kotlin.jvm.internal.l.b(this.f33832b, tz0Var.f33832b) && this.f33833c == tz0Var.f33833c;
    }

    public final int hashCode() {
        int iA = m9.a(this.f33832b, this.f33831a.hashCode() * 31, 31);
        long j4 = this.f33833c;
        return ((int) (j4 ^ (j4 >>> 32))) + iA;
    }

    public final String toString() {
        String str = this.f33831a;
        List<uz0> list = this.f33832b;
        long j4 = this.f33833c;
        StringBuilder sb = new StringBuilder("MediationPrefetchAdUnitSettings(adUnitId=");
        sb.append(str);
        sb.append(", networks=");
        sb.append(list);
        sb.append(", loadTimeoutMillis=");
        return C1094a9.f(sb, j4, ")");
    }
}
