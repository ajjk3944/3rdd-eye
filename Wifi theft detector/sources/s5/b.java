package s5;

import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o5.d;
import o5.f;
import org.json.JSONObject;
import q5.g;
import q5.h;
import t5.c;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    public WebView f24298g;

    /* renamed from: h, reason: collision with root package name */
    public Long f24299h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f24300i;

    /* renamed from: j, reason: collision with root package name */
    public final String f24301j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.w() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.c(null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: s5.b$b, reason: collision with other inner class name */
    public class RunnableC0479b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WebView f24303a;

        public RunnableC0479b() {
            this.f24303a = b.this.f24298g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24303a.destroy();
        }
    }

    public b(String str, Map map, String str2) {
        super(str);
        this.f24299h = null;
        this.f24300i = map;
        this.f24301j = str2;
    }

    public void A() {
        WebView webView = new WebView(g.c().a());
        this.f24298g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f24298g.getSettings().setAllowContentAccess(false);
        this.f24298g.getSettings().setAllowFileAccess(false);
        this.f24298g.setWebViewClient(new a());
        c(this.f24298g);
        h.a().p(this.f24298g, this.f24301j);
        for (String str : this.f24300i.keySet()) {
            h.a().q(this.f24298g, ((f) this.f24300i.get(str)).c().toExternalForm(), str);
        }
        this.f24299h = Long.valueOf(t5.f.b());
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void k(o5.g gVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapF = dVar.f();
        for (String str : mapF.keySet()) {
            c.h(jSONObject, str, ((f) mapF.get(str)).f());
        }
        l(gVar, dVar, jSONObject);
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void o() {
        super.o();
        new Handler().postDelayed(new RunnableC0479b(), Math.max(4000 - (this.f24299h == null ? 4000L : TimeUnit.MILLISECONDS.convert(t5.f.b() - this.f24299h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f24298g = null;
    }

    @Override // com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher
    public void y() {
        super.y();
        A();
    }
}
