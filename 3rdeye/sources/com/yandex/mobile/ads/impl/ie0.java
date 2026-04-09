package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class ie0 {

    /* renamed from: a, reason: collision with root package name */
    private final qx f28648a;

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetMediationNetworkDataUseCase", f = "GetMediationNetworkDataUseCase.kt", l = {12}, m = "invoke")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        String f28649b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28650c;

        /* renamed from: e, reason: collision with root package name */
        int f28652e;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f28650c = obj;
            this.f28652e |= RecyclerView.UNDEFINED_DURATION;
            return ie0.this.a(null, false, this);
        }
    }

    public ie0(qx repo) {
        kotlin.jvm.internal.l.f(repo, "repo");
        this.f28648a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, boolean r6, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.mw> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.ie0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.yandex.mobile.ads.impl.ie0$a r0 = (com.yandex.mobile.ads.impl.ie0.a) r0
            int r1 = r0.f28652e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28652e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.ie0$a r0 = new com.yandex.mobile.ads.impl.ie0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28650c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f28652e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f28649b
            b9.n.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            b9.n.b(r7)
            com.yandex.mobile.ads.impl.qx r7 = r4.f28648a
            r0.f28649b = r5
            r0.f28652e = r3
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            com.yandex.mobile.ads.impl.ww r7 = (com.yandex.mobile.ads.impl.ww) r7
            com.yandex.mobile.ads.impl.ow r6 = r7.b()
            java.util.List r6 = r6.a()
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L67
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.yandex.mobile.ads.impl.mw r0 = (com.yandex.mobile.ads.impl.mw) r0
            java.lang.String r0 = r0.e()
            boolean r0 = kotlin.jvm.internal.l.b(r0, r5)
            if (r0 == 0) goto L4f
            return r7
        L67:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ie0.a(java.lang.String, boolean, f9.e):java.lang.Object");
    }
}
