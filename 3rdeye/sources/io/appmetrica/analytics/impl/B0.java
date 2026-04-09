package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes3.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f39134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39135b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39136c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39137d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39138e;

    /* renamed from: f, reason: collision with root package name */
    public final C0 f39139f;

    public B0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, C0 c02) {
        this.f39134a = nativeCrashSource;
        this.f39135b = str;
        this.f39136c = str2;
        this.f39137d = str3;
        this.f39138e = j4;
        this.f39139f = c02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return this.f39134a == b02.f39134a && kotlin.jvm.internal.l.b(this.f39135b, b02.f39135b) && kotlin.jvm.internal.l.b(this.f39136c, b02.f39136c) && kotlin.jvm.internal.l.b(this.f39137d, b02.f39137d) && this.f39138e == b02.f39138e && kotlin.jvm.internal.l.b(this.f39139f, b02.f39139f);
    }

    public final int hashCode() {
        int iN = B4.g.n(B4.g.n(B4.g.n(this.f39134a.hashCode() * 31, 31, this.f39135b), 31, this.f39136c), 31, this.f39137d);
        long j4 = this.f39138e;
        return this.f39139f.hashCode() + ((((int) (j4 ^ (j4 >>> 32))) + iN) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f39134a + ", handlerVersion=" + this.f39135b + ", uuid=" + this.f39136c + ", dumpFile=" + this.f39137d + ", creationTime=" + this.f39138e + ", metadata=" + this.f39139f + ')';
    }
}
