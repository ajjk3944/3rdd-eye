package com.yandex.mobile.ads.impl;

import c9.C2100u;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hi2 {
    public static qq1 a(nc1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        int i = response.f30835a;
        uq1 uq1Var = new uq1(response.f30836b);
        Map map = response.f30837c;
        if (map == null) {
            map = C2100u.f18582b;
        }
        return new qq1(i, uq1Var, map);
    }
}
