package com.yandex.mobile.ads.impl;

import A9.C0583j;
import A9.InterfaceC0581i;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class jo1 implements io1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29249a;

    /* renamed from: b, reason: collision with root package name */
    private final bq1<mx> f29250b;

    /* renamed from: c, reason: collision with root package name */
    private final ey f29251c;

    /* renamed from: d, reason: collision with root package name */
    private final bl0 f29252d;

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.data.remote.RemoteDataSourceImpl", f = "RemoteDataSourceImpl.kt", l = {47}, m = "getRemoteData-IoAF18A")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29253b;

        /* renamed from: d, reason: collision with root package name */
        int f29255d;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f29253b = obj;
            this.f29255d |= RecyclerView.UNDEFINED_DURATION;
            Object objA = jo1.this.a(this);
            return objA == g9.a.COROUTINE_SUSPENDED ? objA : new b9.m(objA);
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.l<mx, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581i<b9.m<mx>> f29256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0583j c0583j) {
            super(1);
            this.f29256b = c0583j;
        }

        @Override // p9.l
        public final C1992A invoke(mx mxVar) {
            mx response = mxVar;
            kotlin.jvm.internal.l.f(response, "response");
            this.f29256b.resumeWith(new b9.m(response));
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements p9.l<fi2, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581i<b9.m<mx>> f29257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0583j c0583j) {
            super(1);
            this.f29257b = c0583j;
        }

        @Override // p9.l
        public final C1992A invoke(fi2 fi2Var) throws fi2 {
            fi2 error = fi2Var;
            kotlin.jvm.internal.l.f(error, "error");
            if (error.getCause() instanceof M9.i) {
                throw error;
            }
            this.f29257b.resumeWith(new b9.m(b9.n.a(error)));
            return C1992A.f18074a;
        }
    }

    public jo1(Context context, bq1<mx> requestPolicy, ey urlConfigurator, bl0 responseListenerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        kotlin.jvm.internal.l.f(urlConfigurator, "urlConfigurator");
        kotlin.jvm.internal.l.f(responseListenerCreator, "responseListenerCreator");
        this.f29249a = context;
        this.f29250b = requestPolicy;
        this.f29251c = urlConfigurator;
        this.f29252d = responseListenerCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.yandex.mobile.ads.impl.io1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(f9.InterfaceC4347e<? super b9.m<com.yandex.mobile.ads.impl.mx>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.yandex.mobile.ads.impl.jo1.a
            if (r0 == 0) goto L13
            r0 = r11
            com.yandex.mobile.ads.impl.jo1$a r0 = (com.yandex.mobile.ads.impl.jo1.a) r0
            int r1 = r0.f29255d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29255d = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.jo1$a r0 = new com.yandex.mobile.ads.impl.jo1$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f29253b
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f29255d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r11)
            goto L84
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            b9.n.b(r11)
            r0.f29255d = r3
            A9.j r11 = new A9.j
            f9.e r0 = com.google.gson.internal.c.r(r0)
            r11.<init>(r3, r0)
            r11.s()
            com.yandex.mobile.ads.impl.bl0 r0 = r10.f29252d
            com.yandex.mobile.ads.impl.jo1$b r2 = new com.yandex.mobile.ads.impl.jo1$b
            r2.<init>(r11)
            com.yandex.mobile.ads.impl.jo1$c r3 = new com.yandex.mobile.ads.impl.jo1$c
            r3.<init>(r11)
            r0.getClass()
            com.yandex.mobile.ads.impl.al0 r9 = new com.yandex.mobile.ads.impl.al0
            r9.<init>(r2, r3)
            com.yandex.mobile.ads.impl.po0 r4 = new com.yandex.mobile.ads.impl.po0
            android.content.Context r5 = r10.f29249a
            com.yandex.mobile.ads.impl.ey r0 = r10.f29251c
            java.lang.String r6 = r0.b()
            com.yandex.mobile.ads.impl.bq1<com.yandex.mobile.ads.impl.mx> r7 = r10.f29250b
            com.yandex.mobile.ads.impl.ey r0 = r10.f29251c
            java.util.Map r8 = r0.a()
            r4.<init>(r5, r6, r7, r8, r9)
            com.yandex.mobile.ads.impl.aq1 r2 = com.yandex.mobile.ads.impl.aq1.a.a()
            android.content.Context r0 = r10.f29249a
            monitor-enter(r2)
            java.lang.String r3 = "context"
            kotlin.jvm.internal.l.f(r0, r3)     // Catch: java.lang.Throwable -> L89
            com.yandex.mobile.ads.impl.cq1 r0 = com.yandex.mobile.ads.impl.xc1.a(r0)     // Catch: java.lang.Throwable -> L89
            r0.a(r4)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r2)
            java.lang.Object r11 = r11.r()
            if (r11 != r1) goto L84
            return r1
        L84:
            b9.m r11 = (b9.m) r11
            java.lang.Object r11 = r11.f18085b
            return r11
        L89:
            r0 = move-exception
            r11 = r0
            monitor-exit(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jo1.a(f9.e):java.lang.Object");
    }
}
