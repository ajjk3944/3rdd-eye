package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import c9.C2077A;
import c9.C2091l;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class j71 implements MediatedNativeAdapterListener {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f28992o = {fa.a(j71.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final a8<p61> f28993a;

    /* renamed from: b, reason: collision with root package name */
    private final fx0<MediatedNativeAdapter, MediatedNativeAdapterListener> f28994b;

    /* renamed from: c, reason: collision with root package name */
    private final kx0 f28995c;

    /* renamed from: d, reason: collision with root package name */
    private final cy0 f28996d;

    /* renamed from: e, reason: collision with root package name */
    private final bk0 f28997e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f28998f;

    /* renamed from: g, reason: collision with root package name */
    private final ao1 f28999g;

    /* renamed from: h, reason: collision with root package name */
    private final LinkedHashMap f29000h;
    private final LinkedHashMap i;

    /* renamed from: j, reason: collision with root package name */
    private final wi0 f29001j;

    /* renamed from: k, reason: collision with root package name */
    private final by0 f29002k;

    /* renamed from: l, reason: collision with root package name */
    private final ox0 f29003l;

    /* renamed from: m, reason: collision with root package name */
    private final ly0 f29004m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f29005n;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediatedNativeAd f29007c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ar1 f29008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MediatedNativeAd mediatedNativeAd, ar1 ar1Var) {
            super(0);
            this.f29007c = mediatedNativeAd;
            this.f29008d = ar1Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            j71.this.a(this.f29007c, this.f29008d);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.l<String, C1992A> {
        public b() {
            super(1);
        }

        public final void a(String errorDescription) {
            kotlin.jvm.internal.l.f(errorDescription, "errorDescription");
            j71.this.onAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  ".concat(errorDescription)));
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ C1992A invoke(String str) {
            a(str);
            return C1992A.f18074a;
        }
    }

    public /* synthetic */ j71(a8 a8Var, x51 x51Var, fx0 fx0Var) {
        this(a8Var, x51Var, fx0Var, new kx0(), new cy0(), new bk0(fx0Var));
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClicked() {
        x6 x6VarJ;
        x51 x51Var = (x51) this.f28999g.getValue(this, f28992o[0]);
        if (x51Var != null && (x6VarJ = x51Var.j()) != null) {
            x6VarJ.a();
        }
        fx0<MediatedNativeAdapter, MediatedNativeAdapterListener> fx0Var = this.f28994b;
        Context applicationContext = this.f28998f;
        kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
        fx0Var.a(applicationContext, this.f29000h);
        Context applicationContext2 = this.f28998f;
        kotlin.jvm.internal.l.e(applicationContext2, "applicationContext");
        ip1.b bVar = ip1.b.f28777C;
        jp1 jp1Var = new jp1(this.f29000h, 2);
        jp1Var.b(bVar.a(), "event_type");
        jp1Var.b(this.i, "ad_info");
        jp1Var.a(this.f28993a.b());
        Map<String, Object> mapS = this.f28993a.s();
        if (mapS != null) {
            jp1Var.a((Map<String, ? extends Object>) mapS);
        }
        this.f28994b.d(applicationContext2, jp1Var.b());
        this.f28995c.a();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClosed() {
        x6 x6VarJ;
        this.f28995c.b();
        x51 x51Var = (x51) this.f28999g.getValue(this, f28992o[0]);
        if (x51Var == null || (x6VarJ = x51Var.j()) == null) {
            return;
        }
        x6VarJ.b();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdFailedToLoad(MediatedAdRequestError error) {
        kotlin.jvm.internal.l.f(error, "error");
        x51 x51Var = (x51) this.f28999g.getValue(this, f28992o[0]);
        if (x51Var != null) {
            this.f28994b.b(x51Var.l(), new C4128i3(error.getCode(), error.getDescription(), error.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdImpression() {
        if (this.f29005n) {
            return;
        }
        this.f29005n = true;
        fx0<MediatedNativeAdapter, MediatedNativeAdapterListener> fx0Var = this.f28994b;
        Context applicationContext = this.f28998f;
        kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
        fx0Var.b(applicationContext, this.f29000h);
        Context applicationContext2 = this.f28998f;
        kotlin.jvm.internal.l.e(applicationContext2, "applicationContext");
        ip1.b bVar = ip1.b.f28826y;
        jp1 jp1Var = new jp1(this.f29000h, 2);
        jp1Var.b(bVar.a(), "event_type");
        jp1Var.b(this.i, "ad_info");
        jp1Var.a(this.f28993a.b());
        Map<String, Object> mapS = this.f28993a.s();
        if (mapS != null) {
            jp1Var.a((Map<String, ? extends Object>) mapS);
        }
        this.f28994b.d(applicationContext2, jp1Var.b());
        this.f28995c.a(this.f28997e.a());
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdLeftApplication() {
        this.f28995c.c();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdOpened() {
        this.f28995c.d();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd) {
        kotlin.jvm.internal.l.f(mediatedNativeAd, "mediatedNativeAd");
        b(mediatedNativeAd, ar1.f24800d);
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onContentAdLoaded(MediatedNativeAd mediatedNativeAd) {
        kotlin.jvm.internal.l.f(mediatedNativeAd, "mediatedNativeAd");
        b(mediatedNativeAd, ar1.f24799c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(MediatedNativeAd mediatedNativeAd, ar1 ar1Var) {
        x51 x51Var = (x51) this.f28999g.getValue(this, f28992o[0]);
        if (x51Var != null) {
            this.f29000h.put("native_ad_type", ar1Var.a());
            this.f28994b.c(x51Var.l(), this.f29000h);
            this.i.putAll(C2077A.m(new b9.l(AppIntroBaseFragmentKt.ARG_TITLE, mediatedNativeAd.getMediatedNativeAdAssets().getTitle())));
            this.f28996d.getClass();
            MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
            ArrayList arrayListL = C2091l.l(new MediatedNativeAdImage[]{mediatedNativeAdAssets.getFavicon(), mediatedNativeAdAssets.getIcon(), mediatedNativeAdAssets.getImage()});
            this.f29001j.a(this.f29002k.b(arrayListL));
            this.f29003l.a(mediatedNativeAd, ar1Var, arrayListL, new V7.a(mediatedNativeAd, this, x51Var, 4));
        }
    }

    private final void b(MediatedNativeAd mediatedNativeAd, ar1 ar1Var) {
        hx0 hx0VarA;
        x51 x51Var = (x51) this.f28999g.getValue(this, f28992o[0]);
        if (x51Var != null) {
            ex0<T> ex0VarA = this.f28994b.a();
            MediatedAdObject mediatedAdObjectA = (ex0VarA == 0 || (hx0VarA = ex0VarA.a()) == null) ? null : hx0VarA.a();
            if (mediatedAdObjectA != null) {
                x51Var.a(mediatedAdObjectA.getAd(), mediatedAdObjectA.getInfo(), new a(mediatedNativeAd, ar1Var), new b());
            } else {
                fp0.a(new Object[0]);
                a(mediatedNativeAd, ar1Var);
            }
        }
    }

    public j71(a8<p61> adResponse, x51 nativeAdLoadManager, fx0<MediatedNativeAdapter, MediatedNativeAdapterListener> mediatedAdController, kx0 nativeAdEventObservable, cy0 mediatedImagesExtractor, bk0 impressionDataProvider) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdLoadManager, "nativeAdLoadManager");
        kotlin.jvm.internal.l.f(mediatedAdController, "mediatedAdController");
        kotlin.jvm.internal.l.f(nativeAdEventObservable, "nativeAdEventObservable");
        kotlin.jvm.internal.l.f(mediatedImagesExtractor, "mediatedImagesExtractor");
        kotlin.jvm.internal.l.f(impressionDataProvider, "impressionDataProvider");
        this.f28993a = adResponse;
        this.f28994b = mediatedAdController;
        this.f28995c = nativeAdEventObservable;
        this.f28996d = mediatedImagesExtractor;
        this.f28997e = impressionDataProvider;
        Context applicationContext = nativeAdLoadManager.l().getApplicationContext();
        this.f28998f = applicationContext;
        this.f28999g = bo1.a(nativeAdLoadManager);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f29000h = linkedHashMap;
        this.i = new LinkedHashMap();
        wi0 wi0Var = new wi0(nativeAdLoadManager.l());
        this.f29001j = wi0Var;
        by0 by0Var = new by0(nativeAdLoadManager.l());
        this.f29002k = by0Var;
        this.f29003l = new ox0(nativeAdLoadManager.l(), wi0Var, by0Var);
        kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
        this.f29004m = new ly0(applicationContext, mediatedAdController, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MediatedNativeAd mediatedNativeAd, j71 this$0, x51 x51Var, a8 convertedAdResponse) {
        kotlin.jvm.internal.l.f(mediatedNativeAd, "$mediatedNativeAd");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(convertedAdResponse, "convertedAdResponse");
        sy0 sy0Var = new sy0(mediatedNativeAd, this$0.f29004m, x51Var.j(), new qw1());
        x51Var.a((a8<p61>) convertedAdResponse, new j51(new lx0(this$0.f28993a, this$0.f28994b.a()), new jx0(new U1(this$0, 5)), sy0Var, new fy0(), new ry0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(j71 this$0, g51 controller) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(controller, "controller");
        this$0.f28995c.a(controller);
    }
}
