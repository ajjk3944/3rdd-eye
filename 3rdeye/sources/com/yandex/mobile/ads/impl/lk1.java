package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class lk1 {

    /* renamed from: a, reason: collision with root package name */
    private final qx0<com.monetization.ads.mediation.base.a> f30021a;

    /* renamed from: b, reason: collision with root package name */
    private final dk1 f30022b;

    /* renamed from: c, reason: collision with root package name */
    private final ek1 f30023c;

    /* renamed from: d, reason: collision with root package name */
    private final ck1 f30024d;

    public /* synthetic */ lk1(ux0 ux0Var) {
        this(ux0Var, new qx0(ux0Var), new dk1(), new ek1(), new ck1());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r0 == r10) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r13, android.content.Context r15, com.yandex.mobile.ads.impl.vy1 r16, com.yandex.mobile.ads.impl.lk1 r17, java.util.List r18, f9.InterfaceC4347e r19) throws java.lang.Throwable {
        /*
            r0 = r19
            r17.getClass()
            boolean r1 = r0 instanceof com.yandex.mobile.ads.impl.ik1
            if (r1 == 0) goto L1a
            r1 = r0
            com.yandex.mobile.ads.impl.ik1 r1 = (com.yandex.mobile.ads.impl.ik1) r1
            int r2 = r1.f28727d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f28727d = r2
            r7 = r17
            goto L21
        L1a:
            com.yandex.mobile.ads.impl.ik1 r1 = new com.yandex.mobile.ads.impl.ik1
            r7 = r17
            r1.<init>(r7, r0)
        L21:
            java.lang.Object r0 = r1.f28725b
            g9.a r10 = g9.a.COROUTINE_SUSPENDED
            int r2 = r1.f28727d
            r11 = 2
            r12 = 1
            if (r2 == 0) goto L3f
            if (r2 == r12) goto L3b
            if (r2 != r11) goto L33
            b9.n.b(r0)
            goto L6a
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            b9.n.b(r0)
            goto L57
        L3f:
            b9.n.b(r0)
            com.yandex.mobile.ads.impl.jk1 r2 = new com.yandex.mobile.ads.impl.jk1
            r9 = 0
            r3 = r13
            r5 = r15
            r6 = r16
            r8 = r18
            r2.<init>(r3, r5, r6, r7, r8, r9)
            r1.f28727d = r12
            java.lang.Object r0 = A9.F.c(r2, r1)
            if (r0 != r10) goto L57
            goto L69
        L57:
            java.util.List r0 = (java.util.List) r0
            I9.b r13 = A9.U.f212b
            com.yandex.mobile.ads.impl.kk1 r14 = new com.yandex.mobile.ads.impl.kk1
            r15 = 0
            r14.<init>(r0, r15)
            r1.f28727d = r11
            java.lang.Object r0 = A9.C0575f.h(r13, r14, r1)
            if (r0 != r10) goto L6a
        L69:
            return r10
        L6a:
            java.util.List r0 = (java.util.List) r0
            com.yandex.mobile.ads.impl.zj1 r13 = new com.yandex.mobile.ads.impl.zj1
            r13.<init>(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lk1.a(long, android.content.Context, com.yandex.mobile.ads.impl.vy1, com.yandex.mobile.ads.impl.lk1, java.util.List, f9.e):java.lang.Object");
    }

    public lk1(ux0 mediatedAdapterReporter, qx0<com.monetization.ads.mediation.base.a> mediatedAdapterCreator, dk1 prefetchedMediationNetworkDataLoader, ek1 prefetchedMediationNetworkMapper, ck1 prefetchedMediationInfoFactory) {
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediatedAdapterCreator, "mediatedAdapterCreator");
        kotlin.jvm.internal.l.f(prefetchedMediationNetworkDataLoader, "prefetchedMediationNetworkDataLoader");
        kotlin.jvm.internal.l.f(prefetchedMediationNetworkMapper, "prefetchedMediationNetworkMapper");
        kotlin.jvm.internal.l.f(prefetchedMediationInfoFactory, "prefetchedMediationInfoFactory");
        this.f30021a = mediatedAdapterCreator;
        this.f30022b = prefetchedMediationNetworkDataLoader;
        this.f30023c = prefetchedMediationNetworkMapper;
        this.f30024d = prefetchedMediationInfoFactory;
    }
}
