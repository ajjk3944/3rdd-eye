package com.applovin.impl;

import N7.C1154e9;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class y7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21853a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21854b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f21855c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21856d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f21857e = Collections.synchronizedSet(new HashSet());

    public class a extends h4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f21858a;

        public a(boolean z10) {
            this.f21858a = z10;
        }

        @Override // com.applovin.impl.h4
        public Map a() {
            return CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f21858a) {
                com.applovin.impl.sdk.o unused = y7.this.f21854b;
                if (com.applovin.impl.sdk.o.a()) {
                    y7.this.f21854b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                y7.this.f21856d = true;
            }
        }

        @Override // com.applovin.impl.h4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == y7.this.f21855c) {
                AppLovinSdkUtils.runOnUiThread(new L0(this, 1));
            } else {
                y7.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            y7.this.f21855c.destroy();
            y7.this.f21855c = null;
        }
    }

    public y7(com.applovin.impl.sdk.k kVar) {
        this.f21853a = kVar;
        this.f21854b = kVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        WebView webViewA = a(str);
        if (webViewA != null) {
            this.f21857e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new B.c(26, this, webViewA), ((Integer) this.f21853a.a(l4.f19728E2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21854b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new B.b(this, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f21855c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f21854b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f21853a.a(l4.f19883a3)).booleanValue());
        if (this.f21855c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f21855c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21854b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f21856d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21854b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put(ImagesContract.URL, strAppendQueryParameters);
            this.f21853a.E().d(y1.F0, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        b8.a(this.f21855c, C1154e9.i("al_firePostback('", strAppendQueryParameters, "')"));
        appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Z.e(this, eVar, appLovinPostbackListener, 6));
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        a7.b();
        WebView webViewB = a7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", Constants.ENCODING);
        return webViewB;
    }

    private boolean c() {
        return ((Boolean) this.f21853a.a(l4.f19767J2)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(WebView webView) {
        if (webView == null || !this.f21857e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new L0(webView, 9));
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21854b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21854b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new H0(8, this, str));
        }
    }
}
