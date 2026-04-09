package K5;

import G5.k;
import G5.l;
import I5.g;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends K5.a {

    /* renamed from: f, reason: collision with root package name */
    public WebView f3159f;

    /* renamed from: g, reason: collision with root package name */
    public Long f3160g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<String, k> f3161h;
    public final String i;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final WebView f3162b;

        public a(d dVar) {
            this.f3162b = dVar.f3159f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3162b.destroy();
        }
    }

    public d(String str, Map<String, k> map, String str2) {
        super(str);
        this.f3160g = null;
        this.f3161h = map;
        this.i = str2;
    }

    @Override // K5.a
    public final void a(l lVar, G5.d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(dVar.f1917d);
        for (String str : mapUnmodifiableMap.keySet()) {
            k kVar = (k) mapUnmodifiableMap.get(str);
            kVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            L5.a.b(jSONObject2, "vendorKey", kVar.f1920a);
            L5.a.b(jSONObject2, "resourceUrl", kVar.f1921b.toString());
            L5.a.b(jSONObject2, "verificationParameters", kVar.f1922c);
            L5.a.b(jSONObject, str, jSONObject2);
        }
        b(lVar, dVar, jSONObject);
    }

    @Override // K5.a
    public final void e() {
        super.e();
        new Handler().postDelayed(new a(this), Math.max(4000 - (this.f3160g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f3160g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f3159f = null;
    }

    @Override // K5.a
    public final void g() {
        WebView webView = new WebView(g.f2503b.f2504a);
        this.f3159f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3159f.getSettings().setAllowContentAccess(false);
        this.f3159f.getSettings().setAllowFileAccess(false);
        this.f3159f.setWebViewClient(new c(this));
        this.f3150b = new O5.b(this.f3159f);
        WebView webView2 = this.f3159f;
        if (webView2 != null) {
            String str = this.i;
            if (!TextUtils.isEmpty(str)) {
                try {
                    webView2.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    webView2.loadUrl("javascript: " + str);
                }
            }
        }
        Map<String, k> map = this.f3161h;
        for (String str2 : map.keySet()) {
            String externalForm = map.get(str2).f1921b.toExternalForm();
            WebView webView3 = this.f3159f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String strReplace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(strReplace)) {
                    try {
                        webView3.evaluateJavascript(strReplace, null);
                    } catch (IllegalStateException unused2) {
                        webView3.loadUrl("javascript: " + strReplace);
                    }
                }
            }
        }
        this.f3160g = Long.valueOf(System.nanoTime());
    }
}
