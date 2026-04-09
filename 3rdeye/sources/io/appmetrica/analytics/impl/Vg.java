package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes3.dex */
public final class Vg implements RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f40288a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40289b;

    public Vg(long j4, long j10) {
        this.f40288a = j4;
        this.f40289b = j10;
    }

    public final Vg a(long j4, long j10) {
        return new Vg(j4, j10);
    }

    public final long b() {
        return this.f40289b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vg)) {
            return false;
        }
        Vg vg = (Vg) obj;
        return this.f40288a == vg.f40288a && this.f40289b == vg.f40289b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f40288a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f40289b;
    }

    public final int hashCode() {
        long j4 = this.f40288a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        long j10 = this.f40289b;
        return ((int) ((j10 >>> 32) ^ j10)) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb.append(this.f40288a);
        sb.append(", lastUpdateTime=");
        return androidx.work.s.f(sb, this.f40289b, ')');
    }

    public final long a() {
        return this.f40288a;
    }

    public static Vg a(Vg vg, long j4, long j10, int i, Object obj) {
        if ((i & 1) != 0) {
            j4 = vg.f40288a;
        }
        if ((i & 2) != 0) {
            j10 = vg.f40289b;
        }
        vg.getClass();
        return new Vg(j4, j10);
    }
}
