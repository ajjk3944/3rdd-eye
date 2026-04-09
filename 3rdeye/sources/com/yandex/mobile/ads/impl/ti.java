package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.vy1;

/* loaded from: classes3.dex */
public final class ti extends eo1 implements hj {

    /* renamed from: C, reason: collision with root package name */
    private final ap0 f33613C;

    /* renamed from: D, reason: collision with root package name */
    private final si f33614D;

    /* renamed from: E, reason: collision with root package name */
    private final de2 f33615E;

    /* renamed from: F, reason: collision with root package name */
    private final vi f33616F;

    /* renamed from: G, reason: collision with root package name */
    private final ui f33617G;

    /* renamed from: H, reason: collision with root package name */
    private final dg0 f33618H;

    /* renamed from: I, reason: collision with root package name */
    private xi f33619I;

    /* renamed from: J, reason: collision with root package name */
    private xi f33620J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(Context context, ap0 adView, si bannerAdListener, C4198s4 adLoadingPhasesManager, de2 videoEventController, vi bannerAdSizeValidator, ui adResponseControllerFactoryCreator, dg0 htmlAdResponseReportManager) {
        super(context, adView, adLoadingPhasesManager);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adView, "adView");
        kotlin.jvm.internal.l.f(bannerAdListener, "bannerAdListener");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(bannerAdSizeValidator, "bannerAdSizeValidator");
        kotlin.jvm.internal.l.f(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.f33613C = adView;
        this.f33614D = bannerAdListener;
        this.f33615E = videoEventController;
        this.f33616F = bannerAdSizeValidator;
        this.f33617G = adResponseControllerFactoryCreator;
        this.f33618H = htmlAdResponseReportManager;
        a(adView);
        bannerAdListener.a(htmlAdResponseReportManager);
    }

    private static void a(ap0 ap0Var) {
        ap0Var.setHorizontalScrollBarEnabled(false);
        ap0Var.setVerticalScrollBarEnabled(false);
        ap0Var.setVisibility(8);
        ap0Var.setBackgroundColor(0);
    }

    public final void A() {
        this.f33614D.a();
    }

    public final String B() {
        xi xiVar = this.f33620J;
        if (xiVar != null) {
            return xiVar.getAdInfo();
        }
        return null;
    }

    public final ap0 C() {
        return this.f33613C;
    }

    public final de2 D() {
        return this.f33615E;
    }

    @Override // com.yandex.mobile.ads.impl.eo1, com.yandex.mobile.ads.impl.vj
    public final void d() {
        super.d();
        this.f33614D.a((ss) null);
        mg2.a(this.f33613C, true);
        this.f33613C.setVisibility(8);
        jh2.a((ViewGroup) this.f33613C);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void e() {
        xi[] xiVarArr = {this.f33619I, this.f33620J};
        for (int i = 0; i < 2; i++) {
            xi xiVar = xiVarArr[i];
            if (xiVar != null) {
                xiVar.a(l());
            }
        }
        super.e();
    }

    @Override // com.yandex.mobile.ads.impl.hj
    public final void onLeftApplication() {
        this.f33614D.b();
    }

    @Override // com.yandex.mobile.ads.impl.hj
    public final void onReturnedToApplication() {
        this.f33614D.c();
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void u() {
        super.u();
        xi xiVar = this.f33619I;
        if (xiVar != this.f33620J) {
            xi xiVar2 = new xi[]{xiVar}[0];
            if (xiVar2 != null) {
                xiVar2.a(l());
            }
            this.f33619I = this.f33620J;
        }
        vy1 vy1VarR = f().r();
        if (vy1.a.f34739d != (vy1VarR != null ? vy1VarR.a() : null) || this.f33613C.getLayoutParams() == null) {
            return;
        }
        this.f33613C.getLayoutParams().height = -2;
    }

    public final boolean z() {
        a8<String> a8VarK = k();
        vy1 vy1VarM = a8VarK != null ? a8VarK.M() : null;
        if (vy1VarM == null) {
            return false;
        }
        vy1 vy1VarR = f().r();
        a8<String> a8VarK2 = k();
        return (a8VarK2 == null || vy1VarR == null || !xy1.a(l(), a8VarK2, vy1VarM, this.f33616F, vy1VarR)) ? false : true;
    }

    @Override // com.yandex.mobile.ads.impl.hj
    public final void a(C4108f4 c4108f4) {
        this.f33614D.a(c4108f4);
    }

    @Override // com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.rq1.b
    public final void a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        super.a((a8) adResponse);
        this.f33618H.a(adResponse);
        this.f33618H.a(f());
        xi xiVarA = this.f33617G.a(adResponse).a(this);
        this.f33620J = xiVarA;
        xiVarA.a(l(), adResponse);
    }

    public final void a(ss ssVar) {
        a(this.f33614D);
        this.f33614D.a(ssVar);
    }
}
