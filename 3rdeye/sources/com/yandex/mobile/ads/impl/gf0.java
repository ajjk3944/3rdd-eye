package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class gf0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f27673a;

    @h9.e(c = "com.monetization.ads.base.mediation.bidding.HeaderBiddingDataLoader", f = "HeaderBiddingDataLoader.kt", l = {18}, m = "loadHeaderBiddingData")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27674b;

        /* renamed from: d, reason: collision with root package name */
        int f27676d;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f27674b = obj;
            this.f27676d |= RecyclerView.UNDEFINED_DURATION;
            return gf0.this.a(null, null, this);
        }
    }

    public gf0(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f27673a = adConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r12, com.yandex.mobile.ads.impl.zk r13, f9.InterfaceC4347e<? super java.lang.String> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.yandex.mobile.ads.impl.gf0.a
            if (r0 == 0) goto L13
            r0 = r14
            com.yandex.mobile.ads.impl.gf0$a r0 = (com.yandex.mobile.ads.impl.gf0.a) r0
            int r1 = r0.f27676d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27676d = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.gf0$a r0 = new com.yandex.mobile.ads.impl.gf0$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f27674b
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f27676d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r14)
            goto L58
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            b9.n.b(r14)
            com.yandex.mobile.ads.impl.d50 r4 = new com.yandex.mobile.ads.impl.d50
            com.yandex.mobile.ads.impl.a3 r5 = r11.f27673a
            com.yandex.mobile.ads.impl.nj r7 = new com.yandex.mobile.ads.impl.nj
            r7.<init>()
            com.yandex.mobile.ads.impl.p9 r8 = new com.yandex.mobile.ads.impl.p9
            r8.<init>(r13)
            com.yandex.mobile.ads.impl.ux0 r9 = new com.yandex.mobile.ads.impl.ux0
            r14 = 0
            r9.<init>(r5, r14)
            com.yandex.mobile.ads.impl.bd1 r10 = new com.yandex.mobile.ads.impl.bd1
            r10.<init>(r9)
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f27676d = r3
            java.lang.Object r14 = r4.a(r12, r0)
            if (r14 != r1) goto L58
            return r1
        L58:
            java.lang.String r14 = (java.lang.String) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gf0.a(android.content.Context, com.yandex.mobile.ads.impl.zk, f9.e):java.lang.Object");
    }
}
