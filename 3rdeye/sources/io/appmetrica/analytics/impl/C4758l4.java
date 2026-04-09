package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4758l4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41166b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f41167c;

    /* renamed from: d, reason: collision with root package name */
    public final String f41168d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f41169e;

    public C4758l4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f41165a = str;
        this.f41166b = str2;
        this.f41167c = num;
        this.f41168d = str3;
        this.f41169e = counterConfigurationReporterType;
    }

    public static C4758l4 a(C4552d4 c4552d4) {
        return new C4758l4(c4552d4.f40684b.getApiKey(), c4552d4.f40683a.f39902a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c4552d4.f40683a.f39902a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c4552d4.f40683a.f39902a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c4552d4.f40684b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4758l4.class == obj.getClass()) {
            C4758l4 c4758l4 = (C4758l4) obj;
            String str = this.f41165a;
            if (str == null ? c4758l4.f41165a != null : !str.equals(c4758l4.f41165a)) {
                return false;
            }
            if (!this.f41166b.equals(c4758l4.f41166b)) {
                return false;
            }
            Integer num = this.f41167c;
            if (num == null ? c4758l4.f41167c != null : !num.equals(c4758l4.f41167c)) {
                return false;
            }
            String str2 = this.f41168d;
            if (str2 == null ? c4758l4.f41168d != null : !str2.equals(c4758l4.f41168d)) {
                return false;
            }
            if (this.f41169e == c4758l4.f41169e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f41165a;
        int iN = B4.g.n((str != null ? str.hashCode() : 0) * 31, 31, this.f41166b);
        Integer num = this.f41167c;
        int iHashCode = (iN + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f41168d;
        return this.f41169e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f41165a + "', mPackageName='" + this.f41166b + "', mProcessID=" + this.f41167c + ", mProcessSessionID='" + this.f41168d + "', mReporterType=" + this.f41169e + '}';
    }
}
