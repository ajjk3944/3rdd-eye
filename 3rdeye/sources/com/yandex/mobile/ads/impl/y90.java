package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import c9.C2099t;
import com.yandex.mobile.ads.impl.tk1;
import f9.InterfaceC4347e;
import java.util.List;

/* loaded from: classes3.dex */
public final class y90 {

    /* renamed from: a, reason: collision with root package name */
    private final h7 f35664a;

    /* renamed from: b, reason: collision with root package name */
    private final s90 f35665b;

    /* renamed from: c, reason: collision with root package name */
    private final w90 f35666c;

    /* renamed from: d, reason: collision with root package name */
    private final t90 f35667d;

    /* renamed from: e, reason: collision with root package name */
    private final D9.y<List<i90>> f35668e;

    /* renamed from: f, reason: collision with root package name */
    private final D9.y f35669f;

    @h9.e(c = "com.monetization.ads.feed.data.FeedItemsRepository", f = "FeedItemsRepository.kt", l = {34, 37}, m = "loadNewFeedItem")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        y90 f35670b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35671c;

        /* renamed from: e, reason: collision with root package name */
        int f35673e;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f35671c = obj;
            this.f35673e |= RecyclerView.UNDEFINED_DURATION;
            return y90.this.a(this);
        }
    }

    public y90(h7 adRequestData, s90 loadDataSource, w90 preloadDataSource, t90 loadEnoughMemoryValidator) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(loadDataSource, "loadDataSource");
        kotlin.jvm.internal.l.f(preloadDataSource, "preloadDataSource");
        kotlin.jvm.internal.l.f(loadEnoughMemoryValidator, "loadEnoughMemoryValidator");
        this.f35664a = adRequestData;
        this.f35665b = loadDataSource;
        this.f35666c = preloadDataSource;
        this.f35667d = loadEnoughMemoryValidator;
        D9.J jC = D9.E.c(C2099t.f18581b);
        this.f35668e = jC;
        this.f35669f = jC;
    }

    public final Object b(InterfaceC4347e<? super tk1> interfaceC4347e) {
        return this.f35667d.a() ? a(interfaceC4347e) : new tk1.a(i7.o());
    }

    public final D9.y a() {
        return this.f35669f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:0: B:27:0x0074->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.tk1> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.y90.a
            if (r0 == 0) goto L13
            r0 = r7
            com.yandex.mobile.ads.impl.y90$a r0 = (com.yandex.mobile.ads.impl.y90.a) r0
            int r1 = r0.f35673e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35673e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.y90$a r0 = new com.yandex.mobile.ads.impl.y90$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35671c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f35673e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.yandex.mobile.ads.impl.y90 r0 = r0.f35670b
            b9.n.b(r7)
            goto L6f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.yandex.mobile.ads.impl.y90 r2 = r0.f35670b
            b9.n.b(r7)
            goto L55
        L3a:
            b9.n.b(r7)
            com.yandex.mobile.ads.impl.s90 r7 = r6.f35665b
            com.yandex.mobile.ads.impl.h7 r2 = r6.f35664a
            D9.y r5 = r6.f35669f
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            r0.f35670b = r6
            r0.f35673e = r4
            java.lang.Object r7 = r7.a(r2, r5, r0)
            if (r7 != r1) goto L54
            goto L6d
        L54:
            r2 = r6
        L55:
            com.yandex.mobile.ads.impl.v90 r7 = (com.yandex.mobile.ads.impl.v90) r7
            boolean r4 = r7 instanceof com.yandex.mobile.ads.impl.v90.b
            if (r4 == 0) goto L93
            com.yandex.mobile.ads.impl.w90 r4 = r2.f35666c
            com.yandex.mobile.ads.impl.v90$b r7 = (com.yandex.mobile.ads.impl.v90.b) r7
            com.yandex.mobile.ads.impl.tr0 r7 = r7.a()
            r0.f35670b = r2
            r0.f35673e = r3
            java.lang.Object r7 = r4.a(r7, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r0 = r2
        L6f:
            r1 = r7
            com.yandex.mobile.ads.impl.i90 r1 = (com.yandex.mobile.ads.impl.i90) r1
            D9.y<java.util.List<com.yandex.mobile.ads.impl.i90>> r2 = r0.f35668e
        L74:
            java.lang.Object r7 = r2.getValue()
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            D9.y<java.util.List<com.yandex.mobile.ads.impl.i90>> r3 = r0.f35668e
            java.lang.Object r3 = r3.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.ArrayList r3 = c9.C2097r.z0(r3, r1)
            boolean r7 = r2.a(r7, r3)
            if (r7 == 0) goto L74
            com.yandex.mobile.ads.impl.tk1$b r7 = new com.yandex.mobile.ads.impl.tk1$b
            r7.<init>(r1)
            return r7
        L93:
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.v90.a
            if (r0 == 0) goto La3
            com.yandex.mobile.ads.impl.tk1$a r0 = new com.yandex.mobile.ads.impl.tk1$a
            com.yandex.mobile.ads.impl.v90$a r7 = (com.yandex.mobile.ads.impl.v90.a) r7
            com.yandex.mobile.ads.impl.i3 r7 = r7.a()
            r0.<init>(r7)
            return r0
        La3:
            b9.j r7 = new b9.j
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y90.a(f9.e):java.lang.Object");
    }
}
