package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.pp1;
import com.yandex.mobile.ads.impl.sp1;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ae1 {
    public final pp1 a(op1<?> request, Map<String, String> additionalHeaders) throws IOException, th {
        f01 f01Var;
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(additionalHeaders, "additionalHeaders");
        URL urlA = wc1.a(request, null);
        Map<String, String> mapE = request.e();
        kotlin.jvm.internal.l.e(mapE, "getHeaders(...)");
        LinkedHashMap linkedHashMapU = C2078B.u(C2078B.q(additionalHeaders, mapE));
        if (!linkedHashMapU.containsKey("Content-Type")) {
            linkedHashMapU.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        }
        kf0 kf0VarA = kf0.b.a(linkedHashMapU);
        f01.f27149c.getClass();
        if (request.f() == -1) {
            f01Var = f01.f27150d;
        } else {
            switch (request.f()) {
                case 0:
                    f01Var = f01.f27150d;
                    break;
                case 1:
                    f01Var = f01.f27151e;
                    break;
                case 2:
                    f01Var = f01.f27152f;
                    break;
                case 3:
                    f01Var = f01.f27153g;
                    break;
                case 4:
                    f01Var = f01.f27154h;
                    break;
                case 5:
                    f01Var = f01.i;
                    break;
                case 6:
                    f01Var = f01.f27155j;
                    break;
                case 7:
                    f01Var = f01.f27156k;
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
        }
        byte[] bArrB = request.b();
        return new pp1.a().a(urlA).a(kf0VarA).a(f01Var.a(), bArrB != null ? sp1.a.a(bArrB) : null).a();
    }
}
