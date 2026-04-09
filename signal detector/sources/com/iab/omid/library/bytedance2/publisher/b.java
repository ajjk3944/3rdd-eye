package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f18697g;

    /* renamed from: h, reason: collision with root package name */
    private Long f18698h;
    private final Map<String, VerificationScriptResource> i;

    /* renamed from: j, reason: collision with root package name */
    private final String f18699j;

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

    /* renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0108b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f18701a;

        public RunnableC0108b() {
            this.f18701a = b.this.f18697g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18701a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f18698h = null;
        this.i = map;
        this.f18699j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0108b(), Math.max(4000 - (this.f18698h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f18698h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f18697g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f18697g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f18697g.getSettings().setAllowContentAccess(false);
        this.f18697g.getSettings().setAllowFileAccess(false);
        this.f18697g.setWebViewClient(new a());
        a(this.f18697g);
        h.a().c(this.f18697g, this.f18699j);
        for (String str : this.i.keySet()) {
            h.a().c(this.f18697g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f18698h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
