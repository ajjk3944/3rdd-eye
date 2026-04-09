package com.yandex.mobile.ads.impl;

import N7.C1418x4;
import java.util.List;

/* loaded from: classes3.dex */
public final class d20 {
    public static C1418x4 a(N7.S2 divBase, String extensionId) {
        kotlin.jvm.internal.l.f(divBase, "divBase");
        kotlin.jvm.internal.l.f(extensionId, "extensionId");
        List<C1418x4> extensions = divBase.getExtensions();
        if (extensions == null) {
            return null;
        }
        for (C1418x4 c1418x4 : extensions) {
            if (extensionId.equals(c1418x4.f9755a)) {
                return c1418x4;
            }
        }
        return null;
    }
}
