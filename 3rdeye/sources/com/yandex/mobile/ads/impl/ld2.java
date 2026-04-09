package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ld2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29975a;

    /* renamed from: b, reason: collision with root package name */
    private final fk2 f29976b;

    /* renamed from: c, reason: collision with root package name */
    private final kd2 f29977c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f29978d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ld2(Context context, C4072a3 c4072a3, ad2 ad2Var, v92 v92Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, ad2Var, v92Var, applicationContext, new fk2(applicationContext, c4072a3, v92Var, ad2Var), new kd2());
    }

    public final void a(List<za2> videoAds, xp1<List<za2>> listener) {
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f29977c.getClass();
        jd2 jd2VarA = kd2.a(videoAds);
        this.f29978d.addAll(jd2VarA.a());
        this.f29976b.a(this.f29975a, jd2VarA.b(), new a(this, listener));
    }

    public ld2(Context context, C4072a3 adConfiguration, ad2 reportParametersProvider, v92 requestConfigurationParametersProvider, Context applicationContext, fk2 wrapperAdsLoadManager, kd2 videoAdsResponseFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(wrapperAdsLoadManager, "wrapperAdsLoadManager");
        kotlin.jvm.internal.l.f(videoAdsResponseFactory, "videoAdsResponseFactory");
        this.f29975a = applicationContext;
        this.f29976b = wrapperAdsLoadManager;
        this.f29977c = videoAdsResponseFactory;
        this.f29978d = new ArrayList();
    }

    public final class a implements xp1<List<? extends za2>> {

        /* renamed from: a, reason: collision with root package name */
        private final xp1<List<za2>> f29979a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld2 f29980b;

        public a(ld2 ld2Var, xp1<List<za2>> requestListener) {
            kotlin.jvm.internal.l.f(requestListener, "requestListener");
            this.f29980b = ld2Var;
            this.f29979a = requestListener;
        }

        private final void a() {
            if (!this.f29980b.f29978d.isEmpty()) {
                this.f29979a.a((xp1<List<za2>>) this.f29980b.f29978d);
                return;
            }
            b50 b50Var = new b50();
            xp1<List<za2>> xp1Var = this.f29979a;
            String message = b50Var.getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            xp1Var.a(new fb2(3, message));
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(fb2 error) {
            kotlin.jvm.internal.l.f(error, "error");
            a();
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(List<? extends za2> list) {
            List<? extends za2> result = list;
            kotlin.jvm.internal.l.f(result, "result");
            this.f29980b.f29977c.getClass();
            jd2 jd2VarA = kd2.a(result);
            this.f29980b.f29978d.addAll(jd2VarA.a());
            List<za2> listB = jd2VarA.b();
            if (!listB.isEmpty()) {
                this.f29980b.f29976b.a(this.f29980b.f29975a, listB, this);
            } else {
                a();
            }
        }
    }
}
