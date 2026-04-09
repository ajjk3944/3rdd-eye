package Z2;

import Z2.c;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public h f25085a;

    /* renamed from: b, reason: collision with root package name */
    public g f25086b;

    public g a() {
        g gVar = this.f25086b;
        if (gVar != null) {
            return gVar;
        }
        AbstractC6492s.v("navigator");
        return null;
    }

    public h b() {
        h hVar = this.f25085a;
        if (hVar != null) {
            return hVar;
        }
        AbstractC6492s.v("state");
        return null;
    }

    public void c(g gVar) {
        AbstractC6492s.i(gVar, "<set-?>");
        this.f25086b = gVar;
    }

    public void d(h hVar) {
        AbstractC6492s.i(hVar, "<set-?>");
        this.f25085a = hVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String str, boolean z10) {
        AbstractC6492s.i(view, "view");
        super.doUpdateVisitedHistory(view, str, z10);
        a().d(view.canGoBack());
        a().e(view.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        AbstractC6492s.i(view, "view");
        super.onPageFinished(view, str);
        b().j(c.a.f25087a);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String str, Bitmap bitmap) {
        AbstractC6492s.i(view, "view");
        super.onPageStarted(view, str, bitmap);
        b().j(new c.C0962c(0.0f));
        b().b().clear();
        b().l(null);
        b().k(null);
        b().i(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC6492s.i(view, "view");
        super.onReceivedError(view, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            b().b().add(new e(webResourceRequest, webResourceError));
        }
    }
}
