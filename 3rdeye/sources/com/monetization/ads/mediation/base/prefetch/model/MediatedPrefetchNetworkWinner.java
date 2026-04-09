package com.monetization.ads.mediation.base.prefetch.model;

import io.appmetrica.analytics.impl.Oo;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedPrefetchNetworkWinner {

    /* renamed from: a, reason: collision with root package name */
    private final String f23710a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23711b;

    public MediatedPrefetchNetworkWinner(String networkName, String networkAdUnit) {
        l.f(networkName, "networkName");
        l.f(networkAdUnit, "networkAdUnit");
        this.f23710a = networkName;
        this.f23711b = networkAdUnit;
    }

    public static /* synthetic */ MediatedPrefetchNetworkWinner copy$default(MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediatedPrefetchNetworkWinner.f23710a;
        }
        if ((i & 2) != 0) {
            str2 = mediatedPrefetchNetworkWinner.f23711b;
        }
        return mediatedPrefetchNetworkWinner.copy(str, str2);
    }

    public final String component1() {
        return this.f23710a;
    }

    public final String component2() {
        return this.f23711b;
    }

    public final MediatedPrefetchNetworkWinner copy(String networkName, String networkAdUnit) {
        l.f(networkName, "networkName");
        l.f(networkAdUnit, "networkAdUnit");
        return new MediatedPrefetchNetworkWinner(networkName, networkAdUnit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchNetworkWinner)) {
            return false;
        }
        MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner = (MediatedPrefetchNetworkWinner) obj;
        return l.b(this.f23710a, mediatedPrefetchNetworkWinner.f23710a) && l.b(this.f23711b, mediatedPrefetchNetworkWinner.f23711b);
    }

    public final String getNetworkAdUnit() {
        return this.f23711b;
    }

    public final String getNetworkName() {
        return this.f23710a;
    }

    public int hashCode() {
        return this.f23711b.hashCode() + (this.f23710a.hashCode() * 31);
    }

    public String toString() {
        return Oo.h("MediatedPrefetchNetworkWinner(networkName=", this.f23710a, ", networkAdUnit=", this.f23711b, ")");
    }
}
