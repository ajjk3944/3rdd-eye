package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class fe0 {

    /* renamed from: a, reason: collision with root package name */
    private final qx f27289a;

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetAdUnitsDataUseCase", f = "GetAdUnitsDataUseCase.kt", l = {12}, m = "invoke")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27290b;

        /* renamed from: d, reason: collision with root package name */
        int f27292d;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f27290b = obj;
            this.f27292d |= RecyclerView.UNDEFINED_DURATION;
            return fe0.this.a(false, this);
        }
    }

    public fe0(qx repo) {
        kotlin.jvm.internal.l.f(repo, "repo");
        this.f27289a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r5, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.kw> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.yandex.mobile.ads.impl.fe0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.yandex.mobile.ads.impl.fe0$a r0 = (com.yandex.mobile.ads.impl.fe0.a) r0
            int r1 = r0.f27292d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27292d = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.fe0$a r0 = new com.yandex.mobile.ads.impl.fe0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27290b
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f27292d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            b9.n.b(r6)
            com.yandex.mobile.ads.impl.qx r6 = r4.f27289a
            r0.f27292d = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.yandex.mobile.ads.impl.ww r6 = (com.yandex.mobile.ads.impl.ww) r6
            java.util.List r5 = r6.a()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = c9.C2092m.T(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r5.next()
            com.yandex.mobile.ads.impl.cw r0 = (com.yandex.mobile.ads.impl.cw) r0
            com.yandex.mobile.ads.impl.ew r1 = new com.yandex.mobile.ads.impl.ew
            java.lang.String r2 = r0.d()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = r0.a()
            r1.<init>(r2, r3, r0)
            r6.add(r1)
            goto L52
        L73:
            com.yandex.mobile.ads.impl.kw r5 = new com.yandex.mobile.ads.impl.kw
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fe0.a(boolean, f9.e):java.lang.Object");
    }
}
