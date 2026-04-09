package com.monetization.ads.mediation.base.prefetch.model;

import B4.f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedPrefetchAdapterData {

    /* renamed from: a, reason: collision with root package name */
    private final MediatedPrefetchNetworkWinner f23707a;

    /* renamed from: b, reason: collision with root package name */
    private final MediatedPrefetchRevenue f23708b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23709c;

    public MediatedPrefetchAdapterData(MediatedPrefetchNetworkWinner networkWinner, MediatedPrefetchRevenue revenue, String networkAdInfo) {
        l.f(networkWinner, "networkWinner");
        l.f(revenue, "revenue");
        l.f(networkAdInfo, "networkAdInfo");
        this.f23707a = networkWinner;
        this.f23708b = revenue;
        this.f23709c = networkAdInfo;
    }

    public static /* synthetic */ MediatedPrefetchAdapterData copy$default(MediatedPrefetchAdapterData mediatedPrefetchAdapterData, MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, MediatedPrefetchRevenue mediatedPrefetchRevenue, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mediatedPrefetchNetworkWinner = mediatedPrefetchAdapterData.f23707a;
        }
        if ((i & 2) != 0) {
            mediatedPrefetchRevenue = mediatedPrefetchAdapterData.f23708b;
        }
        if ((i & 4) != 0) {
            str = mediatedPrefetchAdapterData.f23709c;
        }
        return mediatedPrefetchAdapterData.copy(mediatedPrefetchNetworkWinner, mediatedPrefetchRevenue, str);
    }

    public final MediatedPrefetchNetworkWinner component1() {
        return this.f23707a;
    }

    public final MediatedPrefetchRevenue component2() {
        return this.f23708b;
    }

    public final String component3() {
        return this.f23709c;
    }

    public final MediatedPrefetchAdapterData copy(MediatedPrefetchNetworkWinner networkWinner, MediatedPrefetchRevenue revenue, String networkAdInfo) {
        l.f(networkWinner, "networkWinner");
        l.f(revenue, "revenue");
        l.f(networkAdInfo, "networkAdInfo");
        return new MediatedPrefetchAdapterData(networkWinner, revenue, networkAdInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchAdapterData)) {
            return false;
        }
        MediatedPrefetchAdapterData mediatedPrefetchAdapterData = (MediatedPrefetchAdapterData) obj;
        return l.b(this.f23707a, mediatedPrefetchAdapterData.f23707a) && l.b(this.f23708b, mediatedPrefetchAdapterData.f23708b) && l.b(this.f23709c, mediatedPrefetchAdapterData.f23709c);
    }

    public final String getNetworkAdInfo() {
        return this.f23709c;
    }

    public final MediatedPrefetchNetworkWinner getNetworkWinner() {
        return this.f23707a;
    }

    public final MediatedPrefetchRevenue getRevenue() {
        return this.f23708b;
    }

    public int hashCode() {
        return this.f23709c.hashCode() + ((this.f23708b.hashCode() + (this.f23707a.hashCode() * 31)) * 31);
    }

    public String toString() {
        MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner = this.f23707a;
        MediatedPrefetchRevenue mediatedPrefetchRevenue = this.f23708b;
        String str = this.f23709c;
        StringBuilder sb = new StringBuilder("MediatedPrefetchAdapterData(networkWinner=");
        sb.append(mediatedPrefetchNetworkWinner);
        sb.append(", revenue=");
        sb.append(mediatedPrefetchRevenue);
        sb.append(", networkAdInfo=");
        return f.c(sb, str, ")");
    }
}
