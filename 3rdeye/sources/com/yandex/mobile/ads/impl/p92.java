package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p92 {

    /* renamed from: a, reason: collision with root package name */
    private final ii2 f31686a;

    /* renamed from: b, reason: collision with root package name */
    private final ha2 f31687b;

    public /* synthetic */ p92(Context context, mp1 mp1Var) {
        this(context, mp1Var, mc1.a(), new ha2(context, mp1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.m92 a(com.yandex.mobile.ads.impl.nc1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "networkResponse"
            kotlin.jvm.internal.l.f(r6, r0)
            com.yandex.mobile.ads.impl.ii2 r0 = r5.f31686a
            java.lang.String r0 = r0.a(r6)
            com.yandex.mobile.ads.impl.pj r1 = new com.yandex.mobile.ads.impl.pj
            java.util.Map<java.lang.String, java.lang.String> r2 = r6.f30837c
            if (r2 != 0) goto L13
            c9.u r2 = c9.C2100u.f18582b
        L13:
            r1.<init>(r2)
            r2 = 0
            if (r0 == 0) goto L4a
            int r3 = r0.length()
            if (r3 != 0) goto L20
            goto L4a
        L20:
            com.yandex.mobile.ads.impl.ha2 r3 = r5.f31687b     // Catch: java.lang.Exception -> L4a
            com.yandex.mobile.ads.impl.h92 r1 = r3.a(r0, r1)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L4a
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f30837c     // Catch: java.lang.Exception -> L4a
            if (r6 == 0) goto L43
            com.yandex.mobile.ads.impl.gh0 r3 = com.yandex.mobile.ads.impl.gh0.f27695I     // Catch: java.lang.Exception -> L4a
            int r4 = com.yandex.mobile.ads.impl.hf0.f28193b     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = "httpHeader"
            kotlin.jvm.internal.l.f(r3, r4)     // Catch: java.lang.Exception -> L4a
            java.lang.String r6 = com.yandex.mobile.ads.impl.hf0.a(r6, r3)     // Catch: java.lang.Exception -> L4a
            if (r6 != 0) goto L3c
            goto L43
        L3c:
            boolean r6 = java.lang.Boolean.parseBoolean(r6)     // Catch: java.lang.Exception -> L4a
            if (r6 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            com.yandex.mobile.ads.impl.m92 r6 = new com.yandex.mobile.ads.impl.m92     // Catch: java.lang.Exception -> L4a
            r6.<init>(r1, r0)     // Catch: java.lang.Exception -> L4a
            return r6
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p92.a(com.yandex.mobile.ads.impl.nc1):com.yandex.mobile.ads.impl.m92");
    }

    public p92(Context context, mp1 reporter, ii2 volleyNetworkResponseDecoder, ha2 vastXmlParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        kotlin.jvm.internal.l.f(vastXmlParser, "vastXmlParser");
        this.f31686a = volleyNetworkResponseDecoder;
        this.f31687b = vastXmlParser;
    }
}
