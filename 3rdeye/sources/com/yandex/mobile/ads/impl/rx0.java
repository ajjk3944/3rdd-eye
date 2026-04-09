package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rx0 {
    public static Map a(hx0 mediatedAdData) {
        kotlin.jvm.internal.l.f(mediatedAdData, "mediatedAdData");
        MediatedAdapterInfo mediatedAdapterInfoB = mediatedAdData.b();
        String adapterVersion = mediatedAdapterInfoB.getAdapterVersion();
        if (adapterVersion == null) {
            adapterVersion = "null";
        }
        b9.l lVar = new b9.l("mediation_adapter_version", adapterVersion);
        String networkName = mediatedAdapterInfoB.getNetworkName();
        if (networkName == null) {
            networkName = "null";
        }
        b9.l lVar2 = new b9.l("mediation_network_name", networkName);
        String networkSdkVersion = mediatedAdapterInfoB.getNetworkSdkVersion();
        return C2078B.o(lVar, lVar2, new b9.l("mediation_network_sdk_version", networkSdkVersion != null ? networkSdkVersion : "null"));
    }
}
