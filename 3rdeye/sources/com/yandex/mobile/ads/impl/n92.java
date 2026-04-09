package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class n92 implements xp1<m92> {

    /* renamed from: a, reason: collision with root package name */
    private final u92 f30811a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f30812b;

    /* renamed from: c, reason: collision with root package name */
    private final xp1<m92> f30813c;

    /* renamed from: d, reason: collision with root package name */
    private final ld2 f30814d;

    public n92(Context context, C4072a3 adConfiguration, u92 vastRequestConfiguration, v92 requestConfigurationParametersProvider, C4198s4 adLoadingPhasesManager, k92 reportParametersProvider, xp1 requestListener, ld2 responseHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(vastRequestConfiguration, "vastRequestConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        kotlin.jvm.internal.l.f(responseHandler, "responseHandler");
        this.f30811a = vastRequestConfiguration;
        this.f30812b = adLoadingPhasesManager;
        this.f30813c = requestListener;
        this.f30814d = responseHandler;
    }

    public static final void a(n92 n92Var, fb2 fb2Var) {
        n92Var.getClass();
        n92Var.f30812b.a(EnumC4191r4.f32471u, new s92(com.vungle.ads.internal.presenter.g.ERROR, fb2Var), n92Var.f30811a);
    }

    public final class a implements xp1<List<? extends za2>> {

        /* renamed from: a, reason: collision with root package name */
        private final m92 f30815a;

        /* renamed from: b, reason: collision with root package name */
        private final xp1<m92> f30816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n92 f30817c;

        public a(n92 n92Var, m92 vastData, xp1<m92> requestListener) {
            kotlin.jvm.internal.l.f(vastData, "vastData");
            kotlin.jvm.internal.l.f(requestListener, "requestListener");
            this.f30817c = n92Var;
            this.f30815a = vastData;
            this.f30816b = requestListener;
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(fb2 error) {
            kotlin.jvm.internal.l.f(error, "error");
            n92.a(this.f30817c, error);
            this.f30816b.a(error);
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(List<? extends za2> list) {
            List<? extends za2> result = list;
            kotlin.jvm.internal.l.f(result, "result");
            n92.a(this.f30817c);
            this.f30816b.a((xp1<m92>) new m92(new h92(this.f30815a.b().a(), result), this.f30815a.a()));
        }
    }

    public static final void a(n92 n92Var) {
        n92Var.getClass();
        n92Var.f30812b.a(EnumC4191r4.f32471u, new s92("success", null), n92Var.f30811a);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f30812b.a(EnumC4191r4.f32471u, new s92(com.vungle.ads.internal.presenter.g.ERROR, error), this.f30811a);
        this.f30813c.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(m92 m92Var) {
        m92 result = m92Var;
        kotlin.jvm.internal.l.f(result, "result");
        this.f30814d.a(result.b().b(), new a(this, result, this.f30813c));
    }
}
