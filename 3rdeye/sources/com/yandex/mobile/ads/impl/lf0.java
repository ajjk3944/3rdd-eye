package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kf0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class lf0 {

    /* renamed from: a, reason: collision with root package name */
    private final ia.g f29988a;

    /* renamed from: b, reason: collision with root package name */
    private long f29989b;

    public lf0(ia.g source) {
        kotlin.jvm.internal.l.f(source, "source");
        this.f29988a = source;
        this.f29989b = 262144L;
    }

    public final kf0 a() throws IOException {
        kf0.a aVar = new kf0.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.a();
            }
            int iF0 = y9.q.f0(strB, ':', 1, 4);
            if (iF0 != -1) {
                String strSubstring = strB.substring(0, iF0);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                String strSubstring2 = strB.substring(iF0 + 1);
                kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
                aVar.a(strSubstring, strSubstring2);
            } else if (strB.charAt(0) == ':') {
                String strSubstring3 = strB.substring(1);
                kotlin.jvm.internal.l.e(strSubstring3, "substring(...)");
                aVar.a("", strSubstring3);
            } else {
                aVar.a("", strB);
            }
        }
    }

    public final String b() throws IOException {
        String strS = this.f29988a.S(this.f29989b);
        this.f29989b -= strS.length();
        return strS;
    }
}
