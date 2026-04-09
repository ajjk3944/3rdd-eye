package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ye {
    public static boolean a(ue appMetricaIdentifiers) {
        kotlin.jvm.internal.l.f(appMetricaIdentifiers, "appMetricaIdentifiers");
        String strA = appMetricaIdentifiers.a();
        String strB = appMetricaIdentifiers.b();
        String strC = appMetricaIdentifiers.c();
        if (!(strC == null || strC.length() == 0)) {
            if (!(strA == null || strA.length() == 0)) {
                if (!(strB == null || strB.length() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
