package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ka2;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class ne1 {
    public static ra2 a(ja2 verification) throws ka2, IllegalArgumentException {
        kotlin.jvm.internal.l.f(verification, "verification");
        bq0 bq0VarB = verification.b();
        if (bq0VarB == null || !kotlin.jvm.internal.l.b(bq0VarB.c(), "omid")) {
            throw new ka2(verification, ka2.a.f29575c);
        }
        try {
            URL url = new URL(bq0VarB.d());
            String strD = verification.d();
            String strC = verification.c();
            if (strC == null || strC.length() == 0) {
                ra2 ra2VarA = ra2.a(url);
                kotlin.jvm.internal.l.c(ra2VarA);
                return ra2VarA;
            }
            ra2 ra2VarA2 = ra2.a(strD, url, strC);
            kotlin.jvm.internal.l.c(ra2VarA2);
            return ra2VarA2;
        } catch (MalformedURLException unused) {
            throw new ka2(verification, ka2.a.f29576d);
        }
    }
}
