package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class l8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4446a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4447b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f4448c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4449d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f4450e = DesugarCollections.synchronizedSet(new HashSet());

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends t4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f4451a;

        public a(boolean z3) {
            this.f4451a = z3;
        }

        @Override // com.applovin.impl.t4
        public Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f4451a) {
                com.applovin.impl.sdk.o unused = l8.this.f4447b;
                if (com.applovin.impl.sdk.o.a()) {
                    l8.this.f4447b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                l8.this.f4449d = true;
            }
        }

        @Override // com.applovin.impl.t4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == l8.this.f4448c) {
                AppLovinSdkUtils.runOnUiThread(new v9(0, this));
            } else {
                l8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            l8.this.f4448c.destroy();
            l8.this.f4448c = null;
        }
    }

    public l8(com.applovin.impl.sdk.k kVar) {
        this.f4446a = kVar;
        this.f4447b = kVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        WebView webViewA = a(str);
        if (webViewA != null) {
            this.f4450e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new w8(10, this, webViewA), ((Integer) this.f4446a.a(x4.K2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f4447b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new v9(12, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f4448c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f4447b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f4446a.a(x4.f6057i3)).booleanValue());
        if (this.f4448c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f4448c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4447b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f4449d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4447b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f4446a.D().d(d2.f3874b1, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String strT = d.h.t("al_firePostback('", strAppendQueryParameters, "')");
        if (((Boolean) this.f4446a.a(x4.Q2)).booleanValue()) {
            o8.a(this.f4448c, strT, this.f4446a).a(this.f4446a.q0().a("evaluateJavascriptPromise"), new ah.d(this, appLovinPostbackListener, strAppendQueryParameters, 1));
        } else {
            o8.a(this.f4448c, strT);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new b5.e(this, eVar, appLovinPostbackListener, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z3, String str2, String str3) {
        if (z3) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f4446a.D().d(d2.f3874b1, map);
    }

    private boolean c() {
        return ((Boolean) this.f4446a.a(x4.P2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z3) {
        n7.b();
        WebView webViewB = n7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z3 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(WebView webView) {
        if (webView == null || !this.f4450e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new u9(webView, 0));
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4447b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4447b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new w8(11, this, str));
        }
    }
}
