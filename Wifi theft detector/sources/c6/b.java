package c6;

import a6.g;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.z;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import y5.d;
import y5.f;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: f, reason: collision with root package name */
    public WebView f4746f;

    /* renamed from: g, reason: collision with root package name */
    public Long f4747g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f4748h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4749i;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.r() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.c(null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: c6.b$b, reason: collision with other inner class name */
    public class RunnableC0063b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WebView f4751a;

        public RunnableC0063b() {
            this.f4751a = b.this.f4746f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4751a.destroy();
        }
    }

    public b(String str, Map map, String str2) {
        super(str);
        this.f4747g = null;
        this.f4748h = map;
        this.f4749i = str2;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void i(f fVar, d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapF = dVar.f();
        Iterator it = mapF.keySet().iterator();
        if (it.hasNext()) {
            z.a(mapF.get((String) it.next()));
            throw null;
        }
        j(fVar, dVar, jSONObject);
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void l() {
        super.l();
        new Handler().postDelayed(new RunnableC0063b(), Math.max(4000 - (this.f4747g == null ? 4000L : TimeUnit.MILLISECONDS.convert(d6.f.b() - this.f4747g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f4746f = null;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void t() {
        super.t();
        v();
    }

    public void v() {
        WebView webView = new WebView(a6.f.c().a());
        this.f4746f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f4746f.getSettings().setAllowContentAccess(false);
        this.f4746f.getSettings().setAllowFileAccess(false);
        this.f4746f.setWebViewClient(new a());
        c(this.f4746f);
        g.a().n(this.f4746f, this.f4749i);
        Iterator it = this.f4748h.keySet().iterator();
        if (!it.hasNext()) {
            this.f4747g = Long.valueOf(d6.f.b());
        } else {
            z.a(this.f4748h.get((String) it.next()));
            throw null;
        }
    }
}
