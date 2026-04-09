package com.yandex.mobile.ads.impl;

import N7.G8;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class hg0 extends sf1 implements pg0 {

    /* renamed from: k, reason: collision with root package name */
    private final a8<?> f28206k;

    /* renamed from: l, reason: collision with root package name */
    private final ag1 f28207l;

    /* renamed from: m, reason: collision with root package name */
    private og0 f28208m;

    /* renamed from: n, reason: collision with root package name */
    private final LinkedHashMap f28209n;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ag1 f28210a;

        public a(Context context, ag1 partnerCodeAdRenderer) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(partnerCodeAdRenderer, "partnerCodeAdRenderer");
            this.f28210a = partnerCodeAdRenderer;
            new WeakReference(context);
        }

        @JavascriptInterface
        public final String getBannerInfo() {
            return "{\"isDelicate\": false}";
        }

        @JavascriptInterface
        public final void onAdRender(int i, String str) {
            this.f28210a.a(i, str);
        }
    }

    public /* synthetic */ hg0(Context context, a8 a8Var, C4072a3 c4072a3) {
        this(context, a8Var, c4072a3, new bg1());
    }

    @Override // com.yandex.mobile.ads.impl.pg0
    public final void a(int i, String str) {
        fp0.d(new Object[0]);
        b(i, str);
        super.a();
    }

    @SuppressLint({"AddJavascriptInterface"})
    public abstract void a(Context context, C4072a3 c4072a3);

    public final a b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return new a(context, this.f28207l);
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.pk
    public String c() {
        String strC = super.c();
        String strB = ej2.b();
        if (!"partner-code".equals(this.f28206k.k())) {
            strB = null;
        }
        if (strB == null) {
            strB = "";
        }
        return G8.s(strC, strB);
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.pk
    public final void d() {
        this.f28207l.a();
        super.d();
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final og0 j() {
        return this.f28208m;
    }

    public final a8<?> k() {
        return this.f28206k;
    }

    public final LinkedHashMap l() {
        return this.f28209n;
    }

    public final boolean m() {
        return "partner-code".equals(this.f28206k.k());
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.l.f(newConfig, "newConfig");
        newConfig.toString();
        fp0.d(new Object[0]);
        Object obj = this.f31799a.get("AdPerformActionsJSI");
        if (obj != null && (obj instanceof a)) {
            fp0.d(new Object[0]);
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public void setHtmlWebViewListener(og0 og0Var) {
        this.f28207l.a(og0Var);
        this.f28208m = og0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg0(Context context, a8<?> adResponse, C4072a3 adConfiguration, bg1 partnerCodeAdRendererFactory) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(partnerCodeAdRendererFactory, "partnerCodeAdRendererFactory");
        this.f28206k = adResponse;
        this.f28207l = bg1.a(this);
        this.f28209n = new LinkedHashMap();
        a(context, adConfiguration);
    }

    public void b(int i, String str) {
        if (str == null || str.length() == 0 || str.equals("undefined")) {
            return;
        }
        this.f28209n.put("test-tag", str);
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.mg0
    public final void a() {
        if ("partner-code".equals(this.f28206k.k())) {
            this.f28207l.b();
        } else {
            super.a();
        }
    }
}
