package com.yandex.mobile.ads.impl;

import c9.C2100u;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q21 implements og0 {

    /* renamed from: a, reason: collision with root package name */
    private final m21 f31999a;

    /* renamed from: b, reason: collision with root package name */
    private final d21 f32000b;

    /* renamed from: c, reason: collision with root package name */
    private final de2 f32001c;

    /* renamed from: d, reason: collision with root package name */
    private final ij2 f32002d;

    /* renamed from: e, reason: collision with root package name */
    private final b21 f32003e;

    /* renamed from: f, reason: collision with root package name */
    private final kg0 f32004f;

    /* renamed from: g, reason: collision with root package name */
    private final du1 f32005g;

    /* renamed from: h, reason: collision with root package name */
    private to f32006h;
    private boolean i;

    public /* synthetic */ q21(m21 m21Var, d21 d21Var) {
        this(m21Var, d21Var, new de2(), new ij2(m21Var), new b21(), new kg0(), ew1.a.a().a(m21Var.i()));
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(boolean z10) {
    }

    public final void b(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        this.f32003e.getClass();
        boolean zA = b21.a(htmlResponse);
        this.f32004f.getClass();
        jg0 g21Var = zA ? new g21() : new gk();
        m21 m21Var = this.f31999a;
        de2 de2Var = this.f32001c;
        d21 d21Var = this.f32000b;
        g21Var.a(m21Var, this, de2Var, d21Var, d21Var, d21Var).a(htmlResponse);
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(C4128i3 adFetchRequestError) {
        kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(sf1 webView, Map trackingParameters) {
        kotlin.jvm.internal.l.f(webView, "webView");
        kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(String customUrl) {
        kotlin.jvm.internal.l.f(customUrl, "customUrl");
        du1 du1Var = this.f32005g;
        if (du1Var == null || !du1Var.Y() || this.i) {
            to toVar = this.f32006h;
            if (toVar != null) {
                toVar.a(this.f31999a, customUrl);
            }
            this.i = false;
        }
    }

    public q21(m21 mraidWebView, d21 mraidEventsObservable, de2 videoEventController, ij2 webViewLoadingNotifier, b21 mraidCompatibilityDetector, kg0 htmlWebViewAdapterFactoryProvider, du1 du1Var) {
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
        kotlin.jvm.internal.l.f(mraidEventsObservable, "mraidEventsObservable");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(webViewLoadingNotifier, "webViewLoadingNotifier");
        kotlin.jvm.internal.l.f(mraidCompatibilityDetector, "mraidCompatibilityDetector");
        kotlin.jvm.internal.l.f(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        this.f31999a = mraidWebView;
        this.f32000b = mraidEventsObservable;
        this.f32001c = videoEventController;
        this.f32002d = webViewLoadingNotifier;
        this.f32003e = mraidCompatibilityDetector;
        this.f32004f = htmlWebViewAdapterFactoryProvider;
        this.f32005g = du1Var;
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a() {
        this.i = true;
    }

    public final void a(to toVar) {
        this.f32006h = toVar;
    }

    public final void b() {
        this.f32002d.a(C2100u.f18582b);
    }
}
