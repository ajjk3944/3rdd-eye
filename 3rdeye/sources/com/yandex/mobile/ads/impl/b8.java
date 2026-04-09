package com.yandex.mobile.ads.impl;

import c9.C2097r;
import c9.C2101v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b8 {
    public static C4075b a(Map headers) {
        Set setL0;
        Long lValueOf;
        kotlin.jvm.internal.l.f(headers, "headers");
        String strA = hf0.a(headers, gh0.f27734r);
        String strOptString = "";
        if (strA == null) {
            strA = "";
        }
        String strA2 = hf0.a(headers, gh0.f27708V);
        if (strA2 == null) {
            setL0 = C2101v.f18583b;
        } else {
            try {
                strOptString = new JSONObject(strA2).optString("test_ids", "");
            } catch (Throwable unused) {
                fp0.d(new Object[0]);
            }
            kotlin.jvm.internal.l.c(strOptString);
            List listR0 = y9.q.r0(strOptString, new String[]{";"});
            ArrayList arrayList = new ArrayList();
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                try {
                    lValueOf = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            setL0 = C2097r.L0(arrayList);
        }
        return new C4075b(strA, setL0);
    }
}
