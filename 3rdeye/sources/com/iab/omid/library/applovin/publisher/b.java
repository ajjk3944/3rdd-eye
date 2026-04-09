package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f23594g;

    /* renamed from: h, reason: collision with root package name */
    private Long f23595h;
    private final Map<String, VerificationScriptResource> i;

    /* renamed from: j, reason: collision with root package name */
    private final String f23596j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0359b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f23598a;

        public RunnableC0359b() {
            this.f23598a = b.this.f23594g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23598a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f23595h = null;
        this.i = map;
        this.f23596j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0359b(), Math.max(4000 - (this.f23595h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f23595h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23594g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f23594g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23594g.getSettings().setAllowContentAccess(false);
        this.f23594g.getSettings().setAllowFileAccess(false);
        this.f23594g.setWebViewClient(new a());
        a(this.f23594g);
        h.a().c(this.f23594g, this.f23596j);
        for (String str : this.i.keySet()) {
            h.a().d(this.f23594g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23595h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
