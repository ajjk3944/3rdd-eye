package com.yandex.mobile.ads.impl;

import A9.C0575f;
import F9.C0663f;
import android.content.Context;
import com.yandex.mobile.ads.impl.x22;
import f9.InterfaceC4350h;

/* loaded from: classes3.dex */
public final class y51 {
    public static x51 a(Context context, vu1 sdkEnvironmentModule, l61 requestData, C4072a3 adConfiguration, g61 nativeAdOnLoadListener, C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(requestData, "requestData");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(nativeAdOnLoadListener, "nativeAdOnLoadListener");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        C0663f c0663fA = A9.F.a(InterfaceC4350h.a.C0456a.d(C0575f.a(), A9.U.f212b));
        return new x51(context, sdkEnvironmentModule, requestData, adConfiguration, nativeAdOnLoadListener, adLoadingPhasesManager, c0663fA, new r61(sdkEnvironmentModule, adConfiguration), new u61(adConfiguration), x22.a.a(), new z41(context, sdkEnvironmentModule, adConfiguration, adLoadingPhasesManager, c0663fA));
    }
}
