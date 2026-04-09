package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class ge0 {

    /* renamed from: a, reason: collision with root package name */
    private final qx f27635a;

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetDebugPanelFeedDataUseCase", f = "GetDebugPanelFeedDataUseCase.kt", l = {15}, m = "invoke")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        ge0 f27636b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27637c;

        /* renamed from: e, reason: collision with root package name */
        int f27639e;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f27637c = obj;
            this.f27639e |= RecyclerView.UNDEFINED_DURATION;
            return ge0.this.a(false, this);
        }
    }

    public ge0(qx repo) {
        kotlin.jvm.internal.l.f(repo, "repo");
        this.f27635a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r9, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.dx> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.ge0.a
            if (r0 == 0) goto L13
            r0 = r10
            com.yandex.mobile.ads.impl.ge0$a r0 = (com.yandex.mobile.ads.impl.ge0.a) r0
            int r1 = r0.f27639e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27639e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.ge0$a r0 = new com.yandex.mobile.ads.impl.ge0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27637c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f27639e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.yandex.mobile.ads.impl.ge0 r9 = r0.f27636b
            b9.n.b(r10)
            goto L42
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            b9.n.b(r10)
            com.yandex.mobile.ads.impl.qx r10 = r8.f27635a
            r0.f27636b = r8
            r0.f27639e = r3
            java.lang.Object r10 = r10.a(r9, r0)
            if (r10 != r1) goto L41
            return r1
        L41:
            r9 = r8
        L42:
            com.yandex.mobile.ads.impl.ww r10 = (com.yandex.mobile.ads.impl.ww) r10
            com.yandex.mobile.ads.impl.dx r0 = new com.yandex.mobile.ads.impl.dx
            java.util.List r1 = r10.c()
            com.yandex.mobile.ads.impl.sw r2 = r10.d()
            com.yandex.mobile.ads.impl.tx r3 = r10.h()
            r9.getClass()
            boolean r9 = r3.d()
            if (r9 == 0) goto L6b
            java.util.List r9 = r3.b()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L68
            com.yandex.mobile.ads.impl.vx$a r9 = com.yandex.mobile.ads.impl.vx.a.f34731b
            goto L6d
        L68:
            com.yandex.mobile.ads.impl.vx$a r9 = com.yandex.mobile.ads.impl.vx.a.f34732c
            goto L6d
        L6b:
            com.yandex.mobile.ads.impl.vx$a r9 = com.yandex.mobile.ads.impl.vx.a.f34733d
        L6d:
            com.yandex.mobile.ads.impl.vx r4 = new com.yandex.mobile.ads.impl.vx
            java.util.List r5 = r3.b()
            r4.<init>(r9, r5)
            r9 = r3
            com.yandex.mobile.ads.impl.ux r3 = new com.yandex.mobile.ads.impl.ux
            java.lang.String r9 = r9.c()
            r3.<init>(r9, r4)
            com.yandex.mobile.ads.impl.bw r4 = r10.g()
            com.yandex.mobile.ads.impl.ow r5 = r10.b()
            com.yandex.mobile.ads.impl.vw r6 = r10.e()
            com.yandex.mobile.ads.impl.cx r7 = r10.f()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ge0.a(boolean, f9.e):java.lang.Object");
    }
}
