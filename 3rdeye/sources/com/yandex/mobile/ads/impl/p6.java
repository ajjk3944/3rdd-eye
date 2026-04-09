package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31600a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31601b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31602c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<AdQualityVerifiableNetwork, y6> f31603d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<String> f31604e;

    public p6(int i, boolean z10, boolean z11, LinkedHashMap adNetworksCustomParameters, Set enabledAdUnits) {
        kotlin.jvm.internal.l.f(adNetworksCustomParameters, "adNetworksCustomParameters");
        kotlin.jvm.internal.l.f(enabledAdUnits, "enabledAdUnits");
        this.f31600a = i;
        this.f31601b = z10;
        this.f31602c = z11;
        this.f31603d = adNetworksCustomParameters;
        this.f31604e = enabledAdUnits;
    }

    public final Map<AdQualityVerifiableNetwork, y6> a() {
        return this.f31603d;
    }

    public final boolean b() {
        return this.f31602c;
    }

    public final boolean c() {
        return this.f31601b;
    }

    public final Set<String> d() {
        return this.f31604e;
    }

    public final int e() {
        return this.f31600a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.f31600a == p6Var.f31600a && this.f31601b == p6Var.f31601b && this.f31602c == p6Var.f31602c && kotlin.jvm.internal.l.b(this.f31603d, p6Var.f31603d) && kotlin.jvm.internal.l.b(this.f31604e, p6Var.f31604e);
    }

    public final int hashCode() {
        return this.f31604e.hashCode() + ((this.f31603d.hashCode() + m6.a(this.f31602c, m6.a(this.f31601b, this.f31600a * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.f31600a + ", enabled=" + this.f31601b + ", blockAdOnInternalError=" + this.f31602c + ", adNetworksCustomParameters=" + this.f31603d + ", enabledAdUnits=" + this.f31604e + ")";
    }
}
