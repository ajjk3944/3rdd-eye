package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes3.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39216b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f39217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39218d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39219e;

    /* renamed from: f, reason: collision with root package name */
    public final String f39220f;

    public C0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f39215a = str;
        this.f39216b = str2;
        this.f39217c = counterConfigurationReporterType;
        this.f39218d = i;
        this.f39219e = str3;
        this.f39220f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return kotlin.jvm.internal.l.b(this.f39215a, c02.f39215a) && kotlin.jvm.internal.l.b(this.f39216b, c02.f39216b) && this.f39217c == c02.f39217c && this.f39218d == c02.f39218d && kotlin.jvm.internal.l.b(this.f39219e, c02.f39219e) && kotlin.jvm.internal.l.b(this.f39220f, c02.f39220f);
    }

    public final int hashCode() {
        int iN = B4.g.n((this.f39218d + ((this.f39217c.hashCode() + B4.g.n(this.f39215a.hashCode() * 31, 31, this.f39216b)) * 31)) * 31, 31, this.f39219e);
        String str = this.f39220f;
        return iN + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb.append(this.f39215a);
        sb.append(", packageName=");
        sb.append(this.f39216b);
        sb.append(", reporterType=");
        sb.append(this.f39217c);
        sb.append(", processID=");
        sb.append(this.f39218d);
        sb.append(", processSessionID=");
        sb.append(this.f39219e);
        sb.append(", errorEnvironment=");
        return N7.B8.j(sb, this.f39220f, ')');
    }
}
