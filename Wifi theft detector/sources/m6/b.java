package m6;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import i6.d;
import i6.g;
import i6.h;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import n6.c;
import n6.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: f, reason: collision with root package name */
    public WebView f23444f;

    /* renamed from: g, reason: collision with root package name */
    public Long f23445g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f23446h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23447i;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.s() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.c(null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: m6.b$b, reason: collision with other inner class name */
    public class RunnableC0437b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WebView f23449a;

        public RunnableC0437b() {
            this.f23449a = b.this.f23444f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23449a.destroy();
        }
    }

    public b(String str, Map map, String str2) {
        super(str);
        this.f23445g = null;
        this.f23446h = map;
        this.f23447i = str2;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void f(h hVar, d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapG = dVar.g();
        for (String str : mapG.keySet()) {
            c.h(jSONObject, str, ((g) mapG.get(str)).e());
        }
        g(hVar, dVar, jSONObject);
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void l() {
        super.l();
        new Handler().postDelayed(new RunnableC0437b(), Math.max(4000 - (this.f23445g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f23445g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23444f = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void u() {
        super.u();
        w();
    }

    public void w() {
        WebView webView = new WebView(k6.g.c().a());
        this.f23444f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23444f.getSettings().setAllowContentAccess(false);
        this.f23444f.getSettings().setAllowFileAccess(false);
        this.f23444f.setWebViewClient(new a());
        c(this.f23444f);
        k6.h.a().o(this.f23444f, this.f23447i);
        for (String str : this.f23446h.keySet()) {
            k6.h.a().p(this.f23444f, ((g) this.f23446h.get(str)).b().toExternalForm(), str);
        }
        this.f23445g = Long.valueOf(f.b());
    }
}
