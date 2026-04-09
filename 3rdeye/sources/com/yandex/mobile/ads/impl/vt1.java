package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.xt1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vt1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34667a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f34668b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f34669c;

    /* renamed from: d, reason: collision with root package name */
    private final a8<String> f34670d;

    /* renamed from: e, reason: collision with root package name */
    private final ap0 f34671e;

    /* renamed from: f, reason: collision with root package name */
    private final hj f34672f;

    /* renamed from: g, reason: collision with root package name */
    private final vi f34673g;

    /* renamed from: h, reason: collision with root package name */
    private final b21 f34674h;
    private final kg0 i;

    /* renamed from: j, reason: collision with root package name */
    private final kj f34675j;

    /* renamed from: k, reason: collision with root package name */
    private final ri f34676k;

    /* renamed from: l, reason: collision with root package name */
    private a f34677l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qi f34678a;

        /* renamed from: b, reason: collision with root package name */
        private final ig0 f34679b;

        /* renamed from: c, reason: collision with root package name */
        private final b f34680c;

        public a(qi contentController, ig0 htmlWebViewAdapter, b webViewListener) {
            kotlin.jvm.internal.l.f(contentController, "contentController");
            kotlin.jvm.internal.l.f(htmlWebViewAdapter, "htmlWebViewAdapter");
            kotlin.jvm.internal.l.f(webViewListener, "webViewListener");
            this.f34678a = contentController;
            this.f34679b = htmlWebViewAdapter;
            this.f34680c = webViewListener;
        }

        public final qi a() {
            return this.f34678a;
        }

        public final ig0 b() {
            return this.f34679b;
        }

        public final b c() {
            return this.f34680c;
        }
    }

    public static final class b implements og0 {

        /* renamed from: a, reason: collision with root package name */
        private final Context f34681a;

        /* renamed from: b, reason: collision with root package name */
        private final vu1 f34682b;

        /* renamed from: c, reason: collision with root package name */
        private final C4072a3 f34683c;

        /* renamed from: d, reason: collision with root package name */
        private final a8<String> f34684d;

        /* renamed from: e, reason: collision with root package name */
        private final vt1 f34685e;

        /* renamed from: f, reason: collision with root package name */
        private final qi f34686f;

        /* renamed from: g, reason: collision with root package name */
        private ev1<vt1> f34687g;

        /* renamed from: h, reason: collision with root package name */
        private final fg0 f34688h;
        private final du1 i;

        /* renamed from: j, reason: collision with root package name */
        private WebView f34689j;

        /* renamed from: k, reason: collision with root package name */
        private Map<String, String> f34690k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f34691l;

        public b(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, a8<String> adResponse, vt1 bannerHtmlAd, qi contentController, ev1<vt1> creationListener, fg0 htmlClickHandler, du1 du1Var) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
            kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            kotlin.jvm.internal.l.f(bannerHtmlAd, "bannerHtmlAd");
            kotlin.jvm.internal.l.f(contentController, "contentController");
            kotlin.jvm.internal.l.f(creationListener, "creationListener");
            kotlin.jvm.internal.l.f(htmlClickHandler, "htmlClickHandler");
            this.f34681a = context;
            this.f34682b = sdkEnvironmentModule;
            this.f34683c = adConfiguration;
            this.f34684d = adResponse;
            this.f34685e = bannerHtmlAd;
            this.f34686f = contentController;
            this.f34687g = creationListener;
            this.f34688h = htmlClickHandler;
            this.i = du1Var;
        }

        @Override // com.yandex.mobile.ads.impl.og0
        public final void a(boolean z10) {
        }

        public final Map<String, String> b() {
            return this.f34690k;
        }

        public final WebView c() {
            return this.f34689j;
        }

        @Override // com.yandex.mobile.ads.impl.og0
        public final void a(C4128i3 adFetchRequestError) {
            kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
            this.f34687g.a(adFetchRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.og0
        public final void a(sf1 webView, Map trackingParameters) {
            kotlin.jvm.internal.l.f(webView, "webView");
            kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
            this.f34689j = webView;
            this.f34690k = trackingParameters;
            this.f34687g.a((ev1<vt1>) this.f34685e);
        }

        @Override // com.yandex.mobile.ads.impl.og0
        public final void a(String clickUrl) {
            kotlin.jvm.internal.l.f(clickUrl, "clickUrl");
            du1 du1Var = this.i;
            if (du1Var == null || !du1Var.Y() || this.f34691l) {
                Context context = this.f34681a;
                vu1 vu1Var = this.f34682b;
                this.f34688h.a(clickUrl, this.f34684d, new C4182q1(context, this.f34684d, this.f34686f.i(), vu1Var, this.f34683c));
                this.f34691l = false;
            }
        }

        @Override // com.yandex.mobile.ads.impl.og0
        public final void a() {
            this.f34691l = true;
        }
    }

    public vt1(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, a8 adResponse, ap0 adView, ti bannerShowEventListener, vi sizeValidator, b21 mraidCompatibilityDetector, kg0 htmlWebViewAdapterFactoryProvider, kj bannerWebViewFactory, ri bannerAdContentControllerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adView, "adView");
        kotlin.jvm.internal.l.f(bannerShowEventListener, "bannerShowEventListener");
        kotlin.jvm.internal.l.f(sizeValidator, "sizeValidator");
        kotlin.jvm.internal.l.f(mraidCompatibilityDetector, "mraidCompatibilityDetector");
        kotlin.jvm.internal.l.f(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        kotlin.jvm.internal.l.f(bannerWebViewFactory, "bannerWebViewFactory");
        kotlin.jvm.internal.l.f(bannerAdContentControllerFactory, "bannerAdContentControllerFactory");
        this.f34667a = context;
        this.f34668b = sdkEnvironmentModule;
        this.f34669c = adConfiguration;
        this.f34670d = adResponse;
        this.f34671e = adView;
        this.f34672f = bannerShowEventListener;
        this.f34673g = sizeValidator;
        this.f34674h = mraidCompatibilityDetector;
        this.i = htmlWebViewAdapterFactoryProvider;
        this.f34675j = bannerWebViewFactory;
        this.f34676k = bannerAdContentControllerFactory;
    }

    public final void a(vy1 configurationSizeInfo, String htmlResponse, de2 videoEventController, ev1<vt1> creationListener) throws gj2 {
        kotlin.jvm.internal.l.f(configurationSizeInfo, "configurationSizeInfo");
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(creationListener, "creationListener");
        jj jjVarA = this.f34675j.a(this.f34670d, configurationSizeInfo);
        this.f34674h.getClass();
        boolean zA = b21.a(htmlResponse);
        ri riVar = this.f34676k;
        Context context = this.f34667a;
        a8<String> adResponse = this.f34670d;
        C4072a3 adConfiguration = this.f34669c;
        ap0 adView = this.f34671e;
        hj bannerShowEventListener = this.f34672f;
        riVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adView, "adView");
        kotlin.jvm.internal.l.f(bannerShowEventListener, "bannerShowEventListener");
        qi qiVar = new qi(context, adResponse, adConfiguration, adView, bannerShowEventListener, new ws0());
        ck0 ck0VarJ = qiVar.j();
        Context context2 = this.f34667a;
        vu1 vu1Var = this.f34668b;
        C4072a3 c4072a3 = this.f34669c;
        b bVar = new b(context2, vu1Var, c4072a3, this.f34670d, this, qiVar, creationListener, new fg0(context2, c4072a3), ew1.a.a().a(context2));
        this.i.getClass();
        ig0 ig0VarA = (zA ? new g21() : new gk()).a(jjVarA, bVar, videoEventController, ck0VarJ);
        this.f34677l = new a(qiVar, ig0VarA, bVar);
        ig0VarA.a(htmlResponse);
    }

    public final void a() {
        a aVar = this.f34677l;
        if (aVar != null) {
            aVar.b().invalidate();
            aVar.a().c();
        }
        this.f34677l = null;
    }

    public final void a(st1 showEventListener) {
        kotlin.jvm.internal.l.f(showEventListener, "showEventListener");
        a aVar = this.f34677l;
        if (aVar == null) {
            showEventListener.a(i7.i());
            return;
        }
        qi qiVarA = aVar.a();
        WebView contentView = aVar.c().c();
        Map<String, String> mapB = aVar.c().b();
        if (contentView instanceof jj) {
            jj jjVar = (jj) contentView;
            vy1 vy1VarO = jjVar.o();
            vy1 vy1VarR = this.f34669c.r();
            if (vy1VarO != null && vy1VarR != null && xy1.a(this.f34667a, this.f34670d, vy1VarO, this.f34673g, vy1VarR)) {
                this.f34671e.setVisibility(0);
                ap0 ap0Var = this.f34671e;
                xt1 xt1Var = new xt1(ap0Var, qiVarA, new ws0(), new xt1.a(ap0Var));
                Context context = this.f34667a;
                ap0 ap0Var2 = this.f34671e;
                vy1 vy1VarO2 = jjVar.o();
                int i = mg2.f30375b;
                kotlin.jvm.internal.l.f(context, "context");
                kotlin.jvm.internal.l.f(contentView, "contentView");
                if (ap0Var2 != null && ap0Var2.indexOfChild(contentView) == -1) {
                    RelativeLayout.LayoutParams layoutParamsA = y7.a(context, vy1VarO2);
                    ap0Var2.setVisibility(0);
                    contentView.setVisibility(0);
                    ap0Var2.addView(contentView, layoutParamsA);
                    jh2.a(contentView, xt1Var);
                }
                qiVarA.a(mapB);
                showEventListener.a();
                return;
            }
        }
        showEventListener.a(i7.b());
    }
}
