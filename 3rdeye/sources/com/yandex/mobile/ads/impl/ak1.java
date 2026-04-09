package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class ak1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f24712a;

    @h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationDataLoader", f = "PrefetchedMediationDataLoader.kt", l = {19}, m = "loadPrefetchedMediationData")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24713b;

        /* renamed from: d, reason: collision with root package name */
        int f24715d;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f24713b = obj;
            this.f24715d |= RecyclerView.UNDEFINED_DURATION;
            return ak1.this.a(null, null, this);
        }
    }

    public ak1(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f24712a = adConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r12, com.yandex.mobile.ads.impl.zk r13, f9.InterfaceC4347e<? super java.lang.String> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.yandex.mobile.ads.impl.ak1.a
            if (r0 == 0) goto L13
            r0 = r14
            com.yandex.mobile.ads.impl.ak1$a r0 = (com.yandex.mobile.ads.impl.ak1.a) r0
            int r1 = r0.f24715d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24715d = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.ak1$a r0 = new com.yandex.mobile.ads.impl.ak1$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24713b
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f24715d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r14)
            goto L5c
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            b9.n.b(r14)
            com.yandex.mobile.ads.impl.e50 r4 = new com.yandex.mobile.ads.impl.e50
            com.yandex.mobile.ads.impl.a3 r5 = r11.f24712a
            com.yandex.mobile.ads.impl.q9 r7 = new com.yandex.mobile.ads.impl.q9
            r7.<init>(r13)
            com.yandex.mobile.ads.impl.ux0 r8 = new com.yandex.mobile.ads.impl.ux0
            r14 = 0
            r8.<init>(r5, r14)
            com.yandex.mobile.ads.impl.lk1 r9 = new com.yandex.mobile.ads.impl.lk1
            r9.<init>(r8)
            com.yandex.mobile.ads.impl.iq0 r14 = com.yandex.mobile.ads.impl.iq0.f28836a
            r14.getClass()
            R9.a r10 = com.yandex.mobile.ads.impl.iq0.a()
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f24715d = r3
            java.lang.Object r14 = r4.a(r12, r0)
            if (r14 != r1) goto L5c
            return r1
        L5c:
            java.lang.String r14 = (java.lang.String) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ak1.a(android.content.Context, com.yandex.mobile.ads.impl.zk, f9.e):java.lang.Object");
    }
}
