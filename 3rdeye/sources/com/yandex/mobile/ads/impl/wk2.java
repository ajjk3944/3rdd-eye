package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;

/* loaded from: classes3.dex */
public final class wk2 {
    public static AdInfo a(ms coreAdInfo) {
        kotlin.jvm.internal.l.f(coreAdInfo, "coreAdInfo");
        t8 t8VarA = coreAdInfo.a();
        return new AdInfo(coreAdInfo.b(), t8VarA != null ? new AdSize(t8VarA.b(), t8VarA.a()) : null, coreAdInfo.c());
    }
}
