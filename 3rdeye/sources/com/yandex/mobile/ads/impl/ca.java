package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ca {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(android.content.Context r7, com.yandex.mobile.ads.impl.vy1 r8, com.yandex.mobile.ads.impl.vy1 r9) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l.f(r7, r0)
            java.lang.String r0 = "sizeInfo"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = "containerSizeInfo"
            kotlin.jvm.internal.l.f(r9, r0)
            int r0 = r9.c(r7)
            int r1 = r9.a(r7)
            int r2 = r8.c(r7)
            int r3 = r8.a(r7)
            com.yandex.mobile.ads.impl.vy1$a r9 = r9.a()
            int r9 = r9.ordinal()
            r4 = 0
            r5 = 1
            if (r9 == 0) goto L43
            if (r9 == r5) goto L3a
            r6 = 2
            if (r9 == r6) goto L49
            r6 = 3
            if (r9 != r6) goto L34
            goto L3a
        L34:
            b9.j r7 = new b9.j
            r7.<init>()
            throw r7
        L3a:
            if (r2 > r0) goto L4b
            if (r0 <= 0) goto L4b
            if (r3 <= r1) goto L49
            if (r1 != 0) goto L4b
            goto L49
        L43:
            if (r2 > r0) goto L4b
            if (r0 <= 0) goto L4b
            if (r3 > r1) goto L4b
        L49:
            r9 = r5
            goto L4c
        L4b:
            r9 = r4
        L4c:
            boolean r7 = b(r7, r8)
            if (r9 == 0) goto L55
            if (r7 == 0) goto L55
            return r5
        L55:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ca.a(android.content.Context, com.yandex.mobile.ads.impl.vy1, com.yandex.mobile.ads.impl.vy1):boolean");
    }

    public static final boolean b(Context context, vy1 adSize) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adSize, "adSize");
        return adSize.c(context) <= jh2.d(context) && adSize.a(context) <= jh2.b(context);
    }

    public static final boolean a(Context context, vy1 adSize) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adSize, "adSize");
        return adSize.c(context) <= jh2.b(context) && adSize.a(context) <= jh2.d(context);
    }
}
