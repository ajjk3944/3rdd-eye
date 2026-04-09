package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ac1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f24609a;

    /* renamed from: b, reason: collision with root package name */
    private final iw0 f24610b;

    /* renamed from: c, reason: collision with root package name */
    private final s21 f24611c;

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeWebViewLoader", f = "NativeWebViewLoader.kt", l = {28}, m = "loadWebViews")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        ac1 f24612b;

        /* renamed from: c, reason: collision with root package name */
        Context f24613c;

        /* renamed from: d, reason: collision with root package name */
        C4198s4 f24614d;

        /* renamed from: e, reason: collision with root package name */
        EnumC4191r4 f24615e;

        /* renamed from: f, reason: collision with root package name */
        Iterator f24616f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f24617g;
        int i;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f24617g = obj;
            this.i |= RecyclerView.UNDEFINED_DURATION;
            return ac1.this.a(null, null, this);
        }
    }

    public ac1(C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f24609a = adLoadingPhasesManager;
        this.f24610b = new iw0();
        this.f24611c = new s21();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r8, com.yandex.mobile.ads.impl.j41 r9, f9.InterfaceC4347e<? super b9.C1992A> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.ac1.a
            if (r0 == 0) goto L13
            r0 = r10
            com.yandex.mobile.ads.impl.ac1$a r0 = (com.yandex.mobile.ads.impl.ac1.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.ac1$a r0 = new com.yandex.mobile.ads.impl.ac1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f24617g
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r8 = r0.f24616f
            com.yandex.mobile.ads.impl.r4 r9 = r0.f24615e
            com.yandex.mobile.ads.impl.s4 r2 = r0.f24614d
            android.content.Context r4 = r0.f24613c
            com.yandex.mobile.ads.impl.ac1 r5 = r0.f24612b
            b9.n.b(r10)
            r10 = r2
            r2 = r9
            r9 = r4
            goto L76
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            b9.n.b(r10)
            com.yandex.mobile.ads.impl.iw0 r10 = r7.f24610b
            java.util.Set r9 = r10.a(r9)
            com.yandex.mobile.ads.impl.ew1 r10 = com.yandex.mobile.ads.impl.ew1.a.a()
            com.yandex.mobile.ads.impl.du1 r10 = r10.a(r8)
            if (r10 == 0) goto L54
            int r10 = r10.G()
            goto L55
        L54:
            r10 = 0
        L55:
            boolean r2 = com.yandex.mobile.ads.impl.aa.a(r8)
            if (r2 == 0) goto L9d
            if (r10 == 0) goto L9d
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L64
            goto L9d
        L64:
            com.yandex.mobile.ads.impl.s4 r10 = r7.f24609a
            com.yandex.mobile.ads.impl.r4 r2 = com.yandex.mobile.ads.impl.EnumC4191r4.f32468r
            java.lang.String r4 = "adLoadingPhaseType"
            r5 = 0
            com.yandex.mobile.ads.impl.uj.a(r10, r2, r4, r2, r5)
            java.util.Iterator r9 = r9.iterator()
            r5 = r9
            r9 = r8
            r8 = r5
            r5 = r7
        L76:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r8.next()
            com.yandex.mobile.ads.impl.ku0 r4 = (com.yandex.mobile.ads.impl.ku0) r4
            com.yandex.mobile.ads.impl.s21 r6 = r5.f24611c
            r0.f24612b = r5
            r0.f24613c = r9
            r0.f24614d = r10
            r0.f24615e = r2
            r0.f24616f = r8
            r0.i = r3
            java.lang.Object r4 = r6.a(r9, r4, r0)
            if (r4 != r1) goto L76
            return r1
        L97:
            b9.A r8 = b9.C1992A.f18074a
            r10.a(r2)
            return r8
        L9d:
            b9.A r8 = b9.C1992A.f18074a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ac1.a(android.content.Context, com.yandex.mobile.ads.impl.j41, f9.e):java.lang.Object");
    }
}
