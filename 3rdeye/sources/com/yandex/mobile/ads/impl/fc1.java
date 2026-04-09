package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fc1 {

    /* renamed from: a, reason: collision with root package name */
    private final qb2<ab1> f27280a;

    /* renamed from: b, reason: collision with root package name */
    private final od2 f27281b;

    public /* synthetic */ fc1(Context context, C4072a3 c4072a3) {
        this(context, c4072a3, new qb2(context, new bb1()), new od2(context, c4072a3, new oa1(c4072a3), new kf1()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.yandex.mobile.ads.impl.fc1 r5, java.util.List r6, f9.InterfaceC4347e r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.dc1
            if (r0 == 0) goto L16
            r0 = r7
            com.yandex.mobile.ads.impl.dc1 r0 = (com.yandex.mobile.ads.impl.dc1) r0
            int r1 = r0.f26129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f26129e = r1
            goto L1b
        L16:
            com.yandex.mobile.ads.impl.dc1 r0 = new com.yandex.mobile.ads.impl.dc1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f26127c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f26129e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.yandex.mobile.ads.impl.fc1 r5 = r0.f26126b
            b9.n.b(r7)
            goto L67
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            b9.n.b(r7)
            com.yandex.mobile.ads.impl.od2 r7 = r5.f27281b
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = c9.C2092m.T(r6, r4)
            r2.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L48:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r6.next()
            com.yandex.mobile.ads.impl.mb2 r4 = (com.yandex.mobile.ads.impl.mb2) r4
            com.yandex.mobile.ads.impl.za2 r4 = r4.g()
            r2.add(r4)
            goto L48
        L5c:
            r0.f26126b = r5
            r0.f26129e = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            com.yandex.mobile.ads.impl.md2 r7 = (com.yandex.mobile.ads.impl.md2) r7
            boolean r6 = r7 instanceof com.yandex.mobile.ads.impl.md2.a
            if (r6 == 0) goto L70
            c9.t r5 = c9.C2099t.f18581b
            return r5
        L70:
            boolean r6 = r7 instanceof com.yandex.mobile.ads.impl.md2.b
            if (r6 == 0) goto L81
            com.yandex.mobile.ads.impl.qb2<com.yandex.mobile.ads.impl.ab1> r5 = r5.f27280a
            com.yandex.mobile.ads.impl.md2$b r7 = (com.yandex.mobile.ads.impl.md2.b) r7
            java.util.List r6 = r7.a()
            java.util.ArrayList r5 = r5.a(r6)
            return r5
        L81:
            b9.j r5 = new b9.j
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fc1.a(com.yandex.mobile.ads.impl.fc1, java.util.List, f9.e):java.lang.Object");
    }

    public fc1(Context context, C4072a3 adConfiguration, qb2<ab1> videoAdInfoListCreator, od2 videoAdsResponseHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(videoAdInfoListCreator, "videoAdInfoListCreator");
        kotlin.jvm.internal.l.f(videoAdsResponseHandler, "videoAdsResponseHandler");
        this.f27280a = videoAdInfoListCreator;
        this.f27281b = videoAdsResponseHandler;
    }
}
