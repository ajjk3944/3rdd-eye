package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xj1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4104f0 f35334a;

    /* renamed from: b, reason: collision with root package name */
    private final uj1 f35335b;

    /* renamed from: c, reason: collision with root package name */
    private final C4154m1 f35336c;

    public /* synthetic */ xj1(C4072a3 c4072a3, a8 a8Var) {
        this(c4072a3, a8Var, new C4104f0(), new uj1(), new C4154m1(c4072a3, a8Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0012 A[PHI: r1
  0x0012: PHI (r1v15 android.app.Activity) = (r1v2 android.app.Activity), (r1v7 android.app.Activity) binds: [B:3:0x0010, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Context r7, java.util.List<com.yandex.mobile.ads.impl.tj1> r8) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "context"
            kotlin.jvm.internal.l.f(r7, r1)
            java.lang.String r1 = "preferredPackages"
            kotlin.jvm.internal.l.f(r8, r1)
            android.app.Activity r1 = com.yandex.mobile.ads.impl.C4146l0.a()
            r2 = 0
            if (r1 == 0) goto L14
        L12:
            r7 = r1
            goto L38
        L14:
            com.yandex.mobile.ads.impl.f0 r1 = r6.f35334a
            r1.getClass()
            r1 = r7
            r3 = r2
        L1b:
            boolean r4 = r1 instanceof android.content.ContextWrapper
            if (r4 == 0) goto L34
            int r4 = r3 + 1
            r5 = 10
            if (r3 >= r5) goto L34
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L2c
            android.app.Activity r1 = (android.app.Activity) r1
            goto L35
        L2c:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            r3 = r4
            goto L1b
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L38
            goto L12
        L38:
            java.util.Iterator r8 = r8.iterator()
        L3c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r8.next()
            com.yandex.mobile.ads.impl.tj1 r1 = (com.yandex.mobile.ads.impl.tj1) r1
            com.yandex.mobile.ads.impl.uj1 r3 = r6.f35335b     // Catch: java.lang.Exception -> L63
            r3.getClass()     // Catch: java.lang.Exception -> L63
            android.content.Intent r3 = com.yandex.mobile.ads.impl.uj1.a(r7, r1)     // Catch: java.lang.Exception -> L63
            com.yandex.mobile.ads.impl.sy r4 = r1.c()     // Catch: java.lang.Exception -> L63
            com.yandex.mobile.ads.impl.sy r5 = com.yandex.mobile.ads.impl.sy.f33320d     // Catch: java.lang.Exception -> L63
            if (r4 != r5) goto L5f
            com.yandex.mobile.ads.impl.m1 r4 = r6.f35336c     // Catch: java.lang.Exception -> L63
            r4.a(r7, r3)     // Catch: java.lang.Exception -> L63
            goto L62
        L5f:
            r7.startActivity(r3)     // Catch: java.lang.Exception -> L63
        L62:
            return r0
        L63:
            java.lang.String r1 = r1.d()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r1
            com.yandex.mobile.ads.impl.fp0.b(r3)
            goto L3c
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xj1.a(android.content.Context, java.util.List):boolean");
    }

    public xj1(C4072a3 adConfiguration, a8<?> adResponse, C4104f0 activityContextProvider, uj1 preferredPackageIntentCreator, C4154m1 adActivityResultLauncher) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(activityContextProvider, "activityContextProvider");
        kotlin.jvm.internal.l.f(preferredPackageIntentCreator, "preferredPackageIntentCreator");
        kotlin.jvm.internal.l.f(adActivityResultLauncher, "adActivityResultLauncher");
        this.f35334a = activityContextProvider;
        this.f35335b = preferredPackageIntentCreator;
        this.f35336c = adActivityResultLauncher;
    }
}
