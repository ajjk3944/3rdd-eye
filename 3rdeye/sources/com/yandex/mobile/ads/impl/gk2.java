package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class gk2 {

    /* renamed from: a, reason: collision with root package name */
    private final ck2 f27799a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f27800b;

    /* renamed from: c, reason: collision with root package name */
    private xp1<List<za2>> f27801c;

    /* renamed from: d, reason: collision with root package name */
    private int f27802d;

    public gk2(Context context, C4072a3 adConfiguration, ad2 reportParametersProvider, v92 requestConfigurationParametersProvider, ck2 loader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(loader, "loader");
        this.f27799a = loader;
        this.f27800b = new ArrayList();
    }

    public final class a implements xp1<List<? extends za2>> {
        public a() {
        }

        private final void a() {
            xp1 xp1Var = gk2.this.f27801c;
            if (gk2.this.f27802d != 0 || xp1Var == null) {
                return;
            }
            xp1Var.a((xp1) gk2.this.f27800b);
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(fb2 error) {
            kotlin.jvm.internal.l.f(error, "error");
            gk2 gk2Var = gk2.this;
            gk2Var.f27802d--;
            a();
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(List<? extends za2> list) {
            List<? extends za2> wrapperAds = list;
            kotlin.jvm.internal.l.f(wrapperAds, "wrapperAds");
            gk2 gk2Var = gk2.this;
            gk2Var.f27802d--;
            gk2.this.f27800b.addAll(wrapperAds);
            a();
        }
    }

    public final void a(Context context, List<za2> wrapperAds, xp1<List<za2>> listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(wrapperAds, "wrapperAds");
        kotlin.jvm.internal.l.f(listener, "listener");
        if (wrapperAds.isEmpty()) {
            listener.a((xp1<List<za2>>) this.f27800b);
            return;
        }
        this.f27801c = listener;
        for (za2 za2Var : wrapperAds) {
            this.f27802d++;
            this.f27799a.a(context, za2Var, new a());
        }
    }
}
