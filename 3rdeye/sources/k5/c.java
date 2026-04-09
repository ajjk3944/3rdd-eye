package K5;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3158a;

    public c(d dVar) {
        this.f3158a = dVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
        d dVar = this.f3158a;
        if (dVar.f() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            dVar.f3150b = new O5.b(null);
        }
        webView.destroy();
        return true;
    }
}
