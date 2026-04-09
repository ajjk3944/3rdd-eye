package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class ua1 {

    /* renamed from: a, reason: collision with root package name */
    private final d00 f33991a;

    /* renamed from: b, reason: collision with root package name */
    private final db0 f33992b;

    /* renamed from: c, reason: collision with root package name */
    private final n41 f33993c;

    @h9.e(c = "com.monetization.ads.nativeads.video.cache.NativeVideoLoadController", f = "NativeVideoLoadController.kt", l = {38, 44}, m = "loadVideo")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        Object f33994b;

        /* renamed from: c, reason: collision with root package name */
        Context f33995c;

        /* renamed from: d, reason: collision with root package name */
        yv f33996d;

        /* renamed from: e, reason: collision with root package name */
        boolean f33997e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f33998f;

        /* renamed from: h, reason: collision with root package name */
        int f34000h;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f33998f = obj;
            this.f34000h |= RecyclerView.UNDEFINED_DURATION;
            return ua1.this.a(false, null, null, null, this);
        }
    }

    public /* synthetic */ ua1(C4072a3 c4072a3, Context context, C4198s4 c4198s4) {
        this(c4072a3, context, c4198s4, new d00(context, c4198s4), new db0(context, c4198s4), new n41(context, c4072a3));
    }

    public final void a() {
        this.f33991a.a();
        this.f33992b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r7, android.content.Context r8, com.yandex.mobile.ads.impl.j41 r9, com.yandex.mobile.ads.impl.yv r10, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.j41> r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.yandex.mobile.ads.impl.ua1.a
            if (r0 == 0) goto L13
            r0 = r11
            com.yandex.mobile.ads.impl.ua1$a r0 = (com.yandex.mobile.ads.impl.ua1.a) r0
            int r1 = r0.f34000h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34000h = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.ua1$a r0 = new com.yandex.mobile.ads.impl.ua1$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f33998f
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f34000h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.f33994b
            com.yandex.mobile.ads.impl.j41 r7 = (com.yandex.mobile.ads.impl.j41) r7
            b9.n.b(r11)
            return r7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            boolean r7 = r0.f33997e
            com.yandex.mobile.ads.impl.yv r10 = r0.f33996d
            android.content.Context r8 = r0.f33995c
            java.lang.Object r9 = r0.f33994b
            com.yandex.mobile.ads.impl.ua1 r9 = (com.yandex.mobile.ads.impl.ua1) r9
            b9.n.b(r11)
            goto L5b
        L44:
            b9.n.b(r11)
            com.yandex.mobile.ads.impl.n41 r11 = r6.f33993c
            r0.f33994b = r6
            r0.f33995c = r8
            r0.f33996d = r10
            r0.f33997e = r7
            r0.f34000h = r4
            java.lang.Object r11 = r11.a(r8, r9, r0)
            if (r11 != r1) goto L5a
            goto Lb8
        L5a:
            r9 = r6
        L5b:
            com.yandex.mobile.ads.impl.j41 r11 = (com.yandex.mobile.ads.impl.j41) r11
            r2 = 0
            if (r11 != 0) goto L61
            return r2
        L61:
            if (r7 != 0) goto L64
            goto Lb9
        L64:
            com.yandex.mobile.ads.impl.a8 r7 = r11.b()
            boolean r5 = r7.R()
            if (r5 == 0) goto Lb9
            r0.f33994b = r11
            r0.f33995c = r2
            r0.f33996d = r2
            r0.f34000h = r3
            r9.getClass()
            A9.j r2 = new A9.j
            f9.e r0 = com.google.gson.internal.c.r(r0)
            r2.<init>(r4, r0)
            r2.s()
            com.yandex.mobile.ads.impl.va1 r0 = new com.yandex.mobile.ads.impl.va1
            r0.<init>(r2)
            com.yandex.mobile.ads.impl.r80 r3 = com.yandex.mobile.ads.impl.r80.f32549c
            boolean r8 = com.yandex.mobile.ads.impl.s80.a(r8, r3)
            com.yandex.mobile.ads.impl.cb1 r3 = com.yandex.mobile.ads.impl.cb1.f25589c
            java.lang.String r3 = r3.a()
            java.lang.String r7 = r7.F()
            boolean r7 = kotlin.jvm.internal.l.b(r3, r7)
            if (r7 == 0) goto La8
            if (r8 == 0) goto La8
            com.yandex.mobile.ads.impl.db0 r7 = r9.f33992b
            r7.a(r11, r0, r10)
            goto Lad
        La8:
            com.yandex.mobile.ads.impl.d00 r7 = r9.f33991a
            r7.a(r11, r0, r10)
        Lad:
            java.lang.Object r7 = r2.r()
            if (r7 != r1) goto Lb4
            goto Lb6
        Lb4:
            b9.A r7 = b9.C1992A.f18074a
        Lb6:
            if (r7 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ua1.a(boolean, android.content.Context, com.yandex.mobile.ads.impl.j41, com.yandex.mobile.ads.impl.yv, f9.e):java.lang.Object");
    }

    public ua1(C4072a3 adConfiguration, Context context, C4198s4 adLoadingPhasesManager, d00 defaultNativeVideoLoader, db0 firstNativeVideoLoader, n41 nativeAdBlockVideoWrapperLoader) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(defaultNativeVideoLoader, "defaultNativeVideoLoader");
        kotlin.jvm.internal.l.f(firstNativeVideoLoader, "firstNativeVideoLoader");
        kotlin.jvm.internal.l.f(nativeAdBlockVideoWrapperLoader, "nativeAdBlockVideoWrapperLoader");
        this.f33991a = defaultNativeVideoLoader;
        this.f33992b = firstNativeVideoLoader;
        this.f33993c = nativeAdBlockVideoWrapperLoader;
    }

    public final void a(Context context, mb2<ab1> videoAdInfo, a8<?> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        boolean zA = s80.a(context, r80.f32549c);
        if (kotlin.jvm.internal.l.b(cb1.f25589c.a(), adResponse.F()) && zA) {
            this.f33992b.a(videoAdInfo.e());
        }
    }
}
