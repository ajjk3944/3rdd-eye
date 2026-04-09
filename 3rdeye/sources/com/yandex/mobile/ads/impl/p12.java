package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p12 {

    /* renamed from: a, reason: collision with root package name */
    private final j9 f31566a = new j9();

    public final String a(String sponsoredText, i9 adTuneInfo) {
        kotlin.jvm.internal.l.f(sponsoredText, "sponsoredText");
        kotlin.jvm.internal.l.f(adTuneInfo, "adTuneInfo");
        ArrayList arrayListX = C2092m.X(sponsoredText);
        this.f31566a.getClass();
        String strA = j9.a(adTuneInfo);
        if (!y9.q.i0(strA)) {
            arrayListX.add(strA);
        }
        return C2097r.u0(arrayListX, " · ", null, null, null, 62);
    }
}
