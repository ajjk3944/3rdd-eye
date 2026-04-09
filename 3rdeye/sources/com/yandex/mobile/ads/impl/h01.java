package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class h01 {

    /* renamed from: a, reason: collision with root package name */
    private static final ew1 f28061a = ew1.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile g01 f28062b;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<e92> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g92 f28063b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g92 g92Var, Context context) {
            super(0);
            this.f28063b = g92Var;
            this.f28064c = context;
        }

        @Override // p9.InterfaceC5480a
        public final e92 invoke() {
            return this.f28063b.a(this.f28064c);
        }
    }

    public static final g01 a(Context context, g92 varioqubAdapterProvider, zd appAdAnalyticsActivator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(varioqubAdapterProvider, "varioqubAdapterProvider");
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        if (f28062b == null) {
            synchronized (g01.f27500e) {
                try {
                    if (f28062b == null) {
                        Context contextA = es.a(context);
                        f28062b = a(contextA, varioqubAdapterProvider, f28061a.a(contextA), appAdAnalyticsActivator);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g01 g01Var = f28062b;
        if (g01Var != null) {
            return g01Var;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.g01 a(android.content.Context r3, com.yandex.mobile.ads.impl.g92 r4, com.yandex.mobile.ads.impl.du1 r5, com.yandex.mobile.ads.impl.zd r6) {
        /*
            com.yandex.mobile.ads.impl.af r0 = new com.yandex.mobile.ads.impl.af
            r0.<init>()
            com.yandex.mobile.ads.impl.bf r1 = new com.yandex.mobile.ads.impl.bf
            com.yandex.mobile.ads.impl.gf r2 = com.yandex.mobile.ads.impl.me.a()
            r1.<init>(r6, r2)
            com.yandex.mobile.ads.impl.mp1 r6 = r1.a(r3)
            com.yandex.mobile.ads.impl.h01$a r1 = new com.yandex.mobile.ads.impl.h01$a
            r1.<init>(r4, r3)
            b9.p r3 = b9.C2001h.b(r1)
            if (r5 == 0) goto L25
            boolean r4 = r5.w()
            r5 = 1
            if (r4 != r5) goto L25
            goto L26
        L25:
            r5 = 0
        L26:
            com.yandex.mobile.ads.impl.g01 r4 = new com.yandex.mobile.ads.impl.g01
            com.yandex.mobile.ads.impl.zr0 r1 = com.yandex.mobile.ads.impl.zr0.a.a()
            java.util.concurrent.Executor r1 = r1.c()
            r4.<init>(r6, r3, r5, r1)
            com.yandex.mobile.ads.impl.eu1 r3 = new com.yandex.mobile.ads.impl.eu1
            com.yandex.mobile.ads.impl.fu1 r5 = new com.yandex.mobile.ads.impl.fu1
            r5.<init>(r0)
            com.yandex.mobile.ads.impl.ju1 r6 = com.yandex.mobile.ads.impl.ju1.a.a()
            r3.<init>(r0, r5, r6)
            r3.a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.h01.a(android.content.Context, com.yandex.mobile.ads.impl.g92, com.yandex.mobile.ads.impl.du1, com.yandex.mobile.ads.impl.zd):com.yandex.mobile.ads.impl.g01");
    }
}
