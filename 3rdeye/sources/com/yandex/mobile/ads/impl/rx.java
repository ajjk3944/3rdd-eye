package com.yandex.mobile.ads.impl;

import b9.C1992A;
import f9.InterfaceC4347e;

@h9.e(c = "com.yandex.mobile.ads.features.debugpanel.data.repo.DebugPanelRepositoryImpl$getAllData$2", f = "DebugPanelRepositoryImpl.kt", l = {46, 25}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class rx extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super ww>, Object> {

    /* renamed from: b, reason: collision with root package name */
    K9.a f32788b;

    /* renamed from: c, reason: collision with root package name */
    sx f32789c;

    /* renamed from: d, reason: collision with root package name */
    sx f32790d;

    /* renamed from: e, reason: collision with root package name */
    boolean f32791e;

    /* renamed from: f, reason: collision with root package name */
    int f32792f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ sx f32793g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f32794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(sx sxVar, boolean z10, InterfaceC4347e<? super rx> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f32793g = sxVar;
        this.f32794h = z10;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new rx(this.f32793g, this.f32794h, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super ww> interfaceC4347e) {
        return new rx(this.f32793g, this.f32794h, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r6.f32792f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            com.yandex.mobile.ads.impl.sx r0 = r6.f32790d
            com.yandex.mobile.ads.impl.sx r1 = r6.f32789c
            K9.a r2 = r6.f32788b
            b9.n.b(r7)     // Catch: java.lang.Throwable -> L1b
            b9.m r7 = (b9.m) r7     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r7 = r7.f18085b     // Catch: java.lang.Throwable -> L1b
            goto L71
        L1b:
            r7 = move-exception
            goto L96
        L1e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L26:
            boolean r1 = r6.f32791e
            com.yandex.mobile.ads.impl.sx r3 = r6.f32789c
            K9.a r5 = r6.f32788b
            b9.n.b(r7)
            r7 = r5
            r5 = r1
            r1 = r3
            goto L4f
        L33:
            b9.n.b(r7)
            com.yandex.mobile.ads.impl.sx r7 = r6.f32793g
            K9.a r7 = com.yandex.mobile.ads.impl.sx.d(r7)
            com.yandex.mobile.ads.impl.sx r1 = r6.f32793g
            boolean r5 = r6.f32794h
            r6.f32788b = r7
            r6.f32789c = r1
            r6.f32791e = r5
            r6.f32792f = r3
            java.lang.Object r3 = r7.a(r6)
            if (r3 != r0) goto L4f
            goto L6c
        L4f:
            com.yandex.mobile.ads.impl.mx r3 = com.yandex.mobile.ads.impl.sx.b(r1)     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L5a
            if (r5 == 0) goto L58
            goto L5a
        L58:
            r2 = r7
            goto L7b
        L5a:
            com.yandex.mobile.ads.impl.io1 r3 = com.yandex.mobile.ads.impl.sx.e(r1)     // Catch: java.lang.Throwable -> L93
            r6.f32788b = r7     // Catch: java.lang.Throwable -> L93
            r6.f32789c = r1     // Catch: java.lang.Throwable -> L93
            r6.f32790d = r1     // Catch: java.lang.Throwable -> L93
            r6.f32792f = r2     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r3.a(r6)     // Catch: java.lang.Throwable -> L93
            if (r2 != r0) goto L6d
        L6c:
            return r0
        L6d:
            r0 = r2
            r2 = r7
            r7 = r0
            r0 = r1
        L71:
            boolean r3 = r7 instanceof b9.m.a     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L76
            r7 = r4
        L76:
            com.yandex.mobile.ads.impl.mx r7 = (com.yandex.mobile.ads.impl.mx) r7     // Catch: java.lang.Throwable -> L1b
            com.yandex.mobile.ads.impl.sx.a(r0, r7)     // Catch: java.lang.Throwable -> L1b
        L7b:
            com.yandex.mobile.ads.impl.as0 r7 = com.yandex.mobile.ads.impl.sx.c(r1)     // Catch: java.lang.Throwable -> L1b
            com.yandex.mobile.ads.impl.ix r7 = r7.a()     // Catch: java.lang.Throwable -> L1b
            com.yandex.mobile.ads.impl.xw r0 = com.yandex.mobile.ads.impl.sx.a(r1)     // Catch: java.lang.Throwable -> L1b
            com.yandex.mobile.ads.impl.mx r1 = com.yandex.mobile.ads.impl.sx.b(r1)     // Catch: java.lang.Throwable -> L1b
            com.yandex.mobile.ads.impl.ww r7 = r0.a(r7, r1)     // Catch: java.lang.Throwable -> L1b
            r2.c(r4)
            return r7
        L93:
            r0 = move-exception
            r2 = r7
            r7 = r0
        L96:
            r2.c(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
