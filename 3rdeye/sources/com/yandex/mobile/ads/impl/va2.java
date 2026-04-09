package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;

/* loaded from: classes3.dex */
public final class va2 {
    public static ua2 a(String versionNameStr) {
        Integer numQ;
        kotlin.jvm.internal.l.f(versionNameStr, "versionNameStr");
        int length = versionNameStr.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (versionNameStr.charAt(i) == '-') {
                    versionNameStr = versionNameStr.substring(0, i);
                    kotlin.jvm.internal.l.e(versionNameStr, "substring(...)");
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        List listQ0 = y9.q.q0(versionNameStr, new char[]{'.'});
        String str = (String) C2097r.r0(0, listQ0);
        if (str == null || (numQ = y9.m.Q(str)) == null) {
            return null;
        }
        int iIntValue = numQ.intValue();
        int iV = C2092m.V(listQ0);
        Object obj = CommonUrlParts.Values.FALSE_INTEGER;
        Integer numQ2 = y9.m.Q((String) (1 <= iV ? listQ0.get(1) : CommonUrlParts.Values.FALSE_INTEGER));
        if (numQ2 == null) {
            return null;
        }
        int iIntValue2 = numQ2.intValue();
        if (2 <= C2092m.V(listQ0)) {
            obj = listQ0.get(2);
        }
        Integer numQ3 = y9.m.Q((String) obj);
        if (numQ3 != null) {
            return new ua2(iIntValue, iIntValue2, numQ3.intValue());
        }
        return null;
    }
}
