package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: com.yandex.mobile.ads.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4210u2 implements InterfaceC4217v2 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f33866a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f33867b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f33868c;

    /* renamed from: d, reason: collision with root package name */
    private final g51 f33869d;

    /* renamed from: e, reason: collision with root package name */
    private final u32 f33870e;

    /* renamed from: f, reason: collision with root package name */
    private final h9 f33871f;

    /* renamed from: g, reason: collision with root package name */
    private final p41 f33872g;

    /* renamed from: h, reason: collision with root package name */
    private final l62 f33873h;
    private final C4171o4 i;

    /* renamed from: j, reason: collision with root package name */
    private o71 f33874j;

    public /* synthetic */ C4210u2(Context context, vu1 vu1Var, a8 a8Var, C4072a3 c4072a3, g51 g51Var, u32 u32Var) {
        h9 h9Var = new h9(context, c4072a3);
        this(context, vu1Var, a8Var, c4072a3, g51Var, u32Var, h9Var, new p41(context, c4072a3, a8Var), new l62(h9Var), new C4171o4(g51Var));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4217v2
    public final af0 a(View view, ag<?> asset, ir0 link, x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(link, "link");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f33869d.a(link);
        Context context = view.getContext();
        f8 f8VarA = this.i.a();
        yo yoVarA = this.f33872g.a(asset.b(), ImagesContract.URL);
        u32 u32Var = this.f33870e;
        kotlin.jvm.internal.l.c(context);
        h91 h91Var = new h91(this.f33871f, u32Var.a(context, this.f33866a, this.f33868c, this.f33867b, f8VarA));
        g91 g91VarA = h91Var.a(yoVarA);
        C4072a3 c4072a3 = this.f33868c;
        a8<?> a8Var = this.f33867b;
        g51 g51Var = this.f33869d;
        af0 af0VarA = new C4076b0(c4072a3, a8Var, yoVarA, h91Var, nativeAdViewAdapter, g51Var, new C4221w(c4072a3, a8Var, yoVarA, h91Var, nativeAdViewAdapter, g51Var, this.f33874j)).a(view, link.a());
        this.f33873h.a(link.d());
        String strE = link.e();
        if (strE != null && strE.length() > 0) {
            g91VarA.a(strE);
        }
        return af0VarA;
    }

    public C4210u2(Context context, vu1 sdkEnvironmentModule, a8<?> adResponse, C4072a3 adConfiguration, g51 nativeAdEventController, u32 targetUrlHandlerProvider, h9 adTracker, p41 clickReporterCreator, l62 trackingUrlHandler, C4171o4 adLinksHandlerReceiver) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(targetUrlHandlerProvider, "targetUrlHandlerProvider");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(clickReporterCreator, "clickReporterCreator");
        kotlin.jvm.internal.l.f(trackingUrlHandler, "trackingUrlHandler");
        kotlin.jvm.internal.l.f(adLinksHandlerReceiver, "adLinksHandlerReceiver");
        this.f33866a = sdkEnvironmentModule;
        this.f33867b = adResponse;
        this.f33868c = adConfiguration;
        this.f33869d = nativeAdEventController;
        this.f33870e = targetUrlHandlerProvider;
        this.f33871f = adTracker;
        this.f33872g = clickReporterCreator;
        this.f33873h = trackingUrlHandler;
        this.i = adLinksHandlerReceiver;
    }

    public final void a(o71 o71Var) {
        this.f33874j = o71Var;
        this.f33872g.a(o71Var);
    }
}
