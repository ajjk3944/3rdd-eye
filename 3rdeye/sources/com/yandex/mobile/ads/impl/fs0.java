package com.yandex.mobile.ads.impl;

import c9.C2097r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class fs0 {
    public static final List a(cs0 cs0Var, String key) {
        kotlin.jvm.internal.l.f(cs0Var, "<this>");
        kotlin.jvm.internal.l.f(key, "key");
        String strD = cs0Var.d(key);
        if (strD != null) {
            return y9.q.r0(strD, new String[]{StringUtils.COMMA});
        }
        return null;
    }

    public static final void a(cs0 cs0Var, String key, List<String> list) {
        kotlin.jvm.internal.l.f(cs0Var, "<this>");
        kotlin.jvm.internal.l.f(key, "key");
        String strU0 = null;
        if (list != null) {
            List<String> list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                strU0 = C2097r.u0(list2, StringUtils.COMMA, null, null, null, 62);
            }
        }
        cs0Var.a(key, strU0);
    }
}
