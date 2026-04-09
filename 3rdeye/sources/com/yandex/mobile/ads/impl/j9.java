package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j9 {
    public static String a(i9 adTuneInfo) {
        kotlin.jvm.internal.l.f(adTuneInfo, "adTuneInfo");
        ArrayList arrayList = new ArrayList();
        if (!y9.q.i0(adTuneInfo.a())) {
            arrayList.add(adTuneInfo.a());
        }
        if (!y9.q.i0(adTuneInfo.c())) {
            arrayList.add("erid: " + adTuneInfo.c());
        }
        return C2097r.u0(arrayList, " · ", null, null, null, 62);
    }
}
