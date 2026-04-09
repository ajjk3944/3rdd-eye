package com.yandex.mobile.ads.impl;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30776a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30777b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30778c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30779d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30780e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30781f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f30782g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, o6> f30783h;

    public n6(boolean z10, boolean z11, String apiKey, long j4, int i, boolean z12, Set<String> enabledAdUnits, Map<String, o6> adNetworksCustomParameters) {
        kotlin.jvm.internal.l.f(apiKey, "apiKey");
        kotlin.jvm.internal.l.f(enabledAdUnits, "enabledAdUnits");
        kotlin.jvm.internal.l.f(adNetworksCustomParameters, "adNetworksCustomParameters");
        this.f30776a = z10;
        this.f30777b = z11;
        this.f30778c = apiKey;
        this.f30779d = j4;
        this.f30780e = i;
        this.f30781f = z12;
        this.f30782g = enabledAdUnits;
        this.f30783h = adNetworksCustomParameters;
    }

    public final Map<String, o6> a() {
        return this.f30783h;
    }

    public final String b() {
        return this.f30778c;
    }

    public final boolean c() {
        return this.f30781f;
    }

    public final boolean d() {
        return this.f30777b;
    }

    public final boolean e() {
        return this.f30776a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.f30776a == n6Var.f30776a && this.f30777b == n6Var.f30777b && kotlin.jvm.internal.l.b(this.f30778c, n6Var.f30778c) && this.f30779d == n6Var.f30779d && this.f30780e == n6Var.f30780e && this.f30781f == n6Var.f30781f && kotlin.jvm.internal.l.b(this.f30782g, n6Var.f30782g) && kotlin.jvm.internal.l.b(this.f30783h, n6Var.f30783h);
    }

    public final Set<String> f() {
        return this.f30782g;
    }

    public final int g() {
        return this.f30780e;
    }

    public final long h() {
        return this.f30779d;
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f30778c, m6.a(this.f30777b, (this.f30776a ? 1231 : 1237) * 31, 31), 31);
        long j4 = this.f30779d;
        return this.f30783h.hashCode() + ((this.f30782g.hashCode() + m6.a(this.f30781f, sx1.a(this.f30780e, (((int) (j4 ^ (j4 >>> 32))) + iA) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f30776a + ", debug=" + this.f30777b + ", apiKey=" + this.f30778c + ", validationTimeoutInSec=" + this.f30779d + ", usagePercent=" + this.f30780e + ", blockAdOnInternalError=" + this.f30781f + ", enabledAdUnits=" + this.f30782g + ", adNetworksCustomParameters=" + this.f30783h + ")";
    }
}
