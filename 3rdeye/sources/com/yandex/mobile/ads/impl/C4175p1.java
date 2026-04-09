package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.mobile.ads.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4175p1 {

    /* renamed from: a, reason: collision with root package name */
    private final zl f31559a;

    /* renamed from: com.yandex.mobile.ads.impl.p1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicLong f31560a = new AtomicLong(SystemClock.elapsedRealtime() - 2000);

        public static boolean a() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = jElapsedRealtime - f31560a.getAndSet(jElapsedRealtime);
            return !(0 <= andSet && andSet < 1001);
        }
    }

    public /* synthetic */ C4175p1(vu1 vu1Var) {
        this(vu1Var, new zl(vu1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r17, com.yandex.mobile.ads.impl.C4072a3 r18, com.yandex.mobile.ads.impl.a8<?> r19, com.yandex.mobile.ads.impl.np1 r20, java.lang.String r21, com.yandex.mobile.ads.impl.f8 r22, boolean r23) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r7 = r20
            r6 = r21
            r4 = r22
            r1 = 1
            java.lang.String r3 = "adConfiguration"
            r5 = r18
            kotlin.jvm.internal.l.f(r5, r3)
            java.lang.String r3 = "adResponse"
            r8 = r19
            kotlin.jvm.internal.l.f(r8, r3)
            java.lang.String r3 = "reporter"
            kotlin.jvm.internal.l.f(r7, r3)
            java.lang.String r3 = "url"
            kotlin.jvm.internal.l.f(r6, r3)
            java.lang.String r3 = "receiver"
            kotlin.jvm.internal.l.f(r4, r3)
            if (r2 == 0) goto Lcf
            boolean r3 = com.yandex.mobile.ads.impl.C4175p1.a.a()
            if (r3 == 0) goto Lcf
            com.yandex.mobile.ads.impl.ew1 r3 = com.yandex.mobile.ads.impl.ew1.a.a()
            com.yandex.mobile.ads.impl.du1 r3 = r3.a(r2)
            r9 = 0
            r10 = 0
            if (r3 != 0) goto L3d
            goto L5f
        L3d:
            java.lang.String r3 = r3.p()
            if (r3 == 0) goto L5f
            com.yandex.mobile.ads.impl.so$a r11 = com.yandex.mobile.ads.impl.so.f33147c
            r11.getClass()
            com.yandex.mobile.ads.impl.so[] r11 = com.yandex.mobile.ads.impl.so.values()
            int r12 = r11.length
            r13 = r9
        L4e:
            if (r13 >= r12) goto L5f
            r14 = r11[r13]
            java.lang.String r15 = r14.a()
            boolean r15 = kotlin.jvm.internal.l.b(r15, r3)
            if (r15 == 0) goto L5d
            goto L60
        L5d:
            int r13 = r13 + r1
            goto L4e
        L5f:
            r14 = r10
        L60:
            if (r23 == 0) goto L64
            if (r14 == 0) goto L68
        L64:
            com.yandex.mobile.ads.impl.so r3 = com.yandex.mobile.ads.impl.so.f33148d
            if (r3 != r14) goto L7b
        L68:
            com.yandex.mobile.ads.impl.j82$a r3 = com.yandex.mobile.ads.impl.j82.f29019a
            r3.getClass()
            boolean r3 = com.yandex.mobile.ads.impl.j82.a.b(r6)
            if (r3 == 0) goto L7b
            com.yandex.mobile.ads.impl.zl r1 = r0.f31559a
            r3 = r8
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            goto La2
        L7b:
            com.yandex.mobile.ads.impl.l82 r3 = new com.yandex.mobile.ads.impl.l82
            com.yandex.mobile.ads.impl.k82 r5 = new com.yandex.mobile.ads.impl.k82
            r5.<init>()
            r3.<init>(r5)
            boolean r3 = r3.a(r2, r6)
            if (r3 == 0) goto L90
            r2 = 7
            r4.a(r2, r10)
            goto La2
        L90:
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r6)
            if (r1 == 0) goto La1
            com.yandex.mobile.ads.impl.zl r1 = r0.f31559a
            r5 = r18
            r3 = r19
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            goto La2
        La1:
            r1 = r9
        La2:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = "click_type"
            java.lang.String r5 = "default"
            r2.put(r3, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "click_handled"
            r2.put(r3, r1)
            com.yandex.mobile.ads.impl.i82 r1 = com.yandex.mobile.ads.impl.i82.f28590a
            r1.getClass()
            java.lang.String r1 = com.yandex.mobile.ads.impl.i82.a(r21)
            java.lang.String r3 = "click_url"
            r2.put(r3, r1)
            com.yandex.mobile.ads.impl.ip1$b r1 = com.yandex.mobile.ads.impl.ip1.b.f28803c
            r7.a(r2)
            r1 = 9
            r4.a(r1, r10)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4175p1.a(android.content.Context, com.yandex.mobile.ads.impl.a3, com.yandex.mobile.ads.impl.a8, com.yandex.mobile.ads.impl.np1, java.lang.String, com.yandex.mobile.ads.impl.f8, boolean):void");
    }

    public C4175p1(vu1 sdkEnvironmentModule, zl browserAdActivityLauncher) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(browserAdActivityLauncher, "browserAdActivityLauncher");
        this.f31559a = browserAdActivityLauncher;
    }
}
