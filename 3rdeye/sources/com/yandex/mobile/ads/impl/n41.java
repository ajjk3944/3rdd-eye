package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.ew1;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class n41 {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f30757a;

    /* renamed from: b, reason: collision with root package name */
    private final fc1 f30758b;

    /* renamed from: c, reason: collision with root package name */
    private final bc1 f30759c;

    @h9.e(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader", f = "NativeAdBlockVideoWrapperLoader.kt", l = {30}, m = "updateNativeAdBlockWithWrapperVideo")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        j41 f30760b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30761c;

        /* renamed from: e, reason: collision with root package name */
        int f30763e;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f30761c = obj;
            this.f30763e |= RecyclerView.UNDEFINED_DURATION;
            return n41.this.a((Context) null, (j41) null, this);
        }
    }

    public /* synthetic */ n41(Context context, C4072a3 c4072a3) {
        this(context, c4072a3, ew1.a.a(), new fc1(context, c4072a3), new bc1());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.yandex.mobile.ads.impl.n41 r6, com.yandex.mobile.ads.impl.ag r7, f9.InterfaceC4347e r8) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.yandex.mobile.ads.impl.m41
            if (r0 == 0) goto L16
            r0 = r8
            com.yandex.mobile.ads.impl.m41 r0 = (com.yandex.mobile.ads.impl.m41) r0
            int r1 = r0.f30203e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f30203e = r1
            goto L1b
        L16:
            com.yandex.mobile.ads.impl.m41 r0 = new com.yandex.mobile.ads.impl.m41
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f30201c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f30203e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.yandex.mobile.ads.impl.ag r6 = r0.f30200b
            b9.n.b(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            b9.n.b(r8)
            java.lang.Object r8 = r7.d()
            boolean r8 = r8 instanceof com.yandex.mobile.ads.impl.sw0
            if (r8 == 0) goto L42
            r8 = r7
            goto L43
        L42:
            r8 = r4
        L43:
            if (r8 != 0) goto L46
            return r7
        L46:
            com.yandex.mobile.ads.impl.fc1 r6 = r6.f30758b
            java.lang.Object r7 = r8.d()
            com.yandex.mobile.ads.impl.sw0 r7 = (com.yandex.mobile.ads.impl.sw0) r7
            com.yandex.mobile.ads.impl.ya2 r7 = r7.c()
            r0.f30200b = r8
            r0.f30203e = r3
            r6.getClass()
            I9.b r2 = A9.U.f212b
            com.yandex.mobile.ads.impl.cc1 r3 = new com.yandex.mobile.ads.impl.cc1
            r3.<init>(r7, r6, r4)
            java.lang.Object r6 = A9.C0575f.h(r2, r3, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            r5 = r8
            r8 = r6
            r6 = r5
        L6a:
            com.yandex.mobile.ads.impl.ya2 r8 = (com.yandex.mobile.ads.impl.ya2) r8
            if (r8 != 0) goto L87
            java.lang.Object r7 = r6.d()
            com.yandex.mobile.ads.impl.sw0 r7 = (com.yandex.mobile.ads.impl.sw0) r7
            java.util.List r7 = r7.a()
            if (r7 != 0) goto L87
            java.lang.Object r7 = r6.d()
            com.yandex.mobile.ads.impl.sw0 r7 = (com.yandex.mobile.ads.impl.sw0) r7
            com.yandex.mobile.ads.impl.ku0 r7 = r7.b()
            if (r7 != 0) goto L87
            return r4
        L87:
            java.lang.Object r7 = r6.d()
            com.yandex.mobile.ads.impl.sw0 r7 = (com.yandex.mobile.ads.impl.sw0) r7
            com.yandex.mobile.ads.impl.sw0 r7 = com.yandex.mobile.ads.impl.sw0.a(r7, r8)
            com.yandex.mobile.ads.impl.ag r6 = com.yandex.mobile.ads.impl.ag.a(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n41.a(com.yandex.mobile.ads.impl.n41, com.yandex.mobile.ads.impl.ag, f9.e):java.lang.Object");
    }

    public n41(Context context, C4072a3 adConfiguration, ew1 sdkSettings, fc1 nativeWrapperVideoLoader, bc1 nativeWrapperVideoAssetChecker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(nativeWrapperVideoLoader, "nativeWrapperVideoLoader");
        kotlin.jvm.internal.l.f(nativeWrapperVideoAssetChecker, "nativeWrapperVideoAssetChecker");
        this.f30757a = sdkSettings;
        this.f30758b = nativeWrapperVideoLoader;
        this.f30759c = nativeWrapperVideoAssetChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, com.yandex.mobile.ads.impl.j41 r7, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.j41> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.yandex.mobile.ads.impl.n41.a
            if (r0 == 0) goto L13
            r0 = r8
            com.yandex.mobile.ads.impl.n41$a r0 = (com.yandex.mobile.ads.impl.n41.a) r0
            int r1 = r0.f30763e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30763e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.n41$a r0 = new com.yandex.mobile.ads.impl.n41$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f30761c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f30763e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.yandex.mobile.ads.impl.j41 r7 = r0.f30760b
            b9.n.b(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            b9.n.b(r8)
            com.yandex.mobile.ads.impl.ew1 r8 = r5.f30757a
            com.yandex.mobile.ads.impl.du1 r6 = r8.a(r6)
            if (r6 == 0) goto L6f
            boolean r6 = r6.J()
            if (r6 != r4) goto L6f
            com.yandex.mobile.ads.impl.p61 r6 = r7.c()
            java.util.List r6 = r6.e()
            r0.f30760b = r7
            r0.f30763e = r4
            I9.b r8 = A9.U.f212b
            com.yandex.mobile.ads.impl.o41 r2 = new com.yandex.mobile.ads.impl.o41
            r2.<init>(r6, r5, r3)
            java.lang.Object r8 = A9.C0575f.h(r8, r2, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L62
            return r3
        L62:
            com.yandex.mobile.ads.impl.p61 r6 = r7.c()
            com.yandex.mobile.ads.impl.p61 r6 = com.yandex.mobile.ads.impl.p61.a(r6, r8)
            com.yandex.mobile.ads.impl.j41 r6 = com.yandex.mobile.ads.impl.j41.a(r7, r6)
            return r6
        L6f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n41.a(android.content.Context, com.yandex.mobile.ads.impl.j41, f9.e):java.lang.Object");
    }
}
