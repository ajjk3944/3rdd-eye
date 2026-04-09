package c2;

import android.webkit.WebViewClient;
import b2.g;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderBoundaryInterface f4702a;

    public z(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f4702a = webViewProviderBoundaryInterface;
    }

    public r a(String str, String[] strArr) {
        return r.a(this.f4702a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, g.a aVar) {
        this.f4702a.addWebMessageListener(str, strArr, da.a.c(new u(aVar)));
    }

    public WebViewClient c() {
        return this.f4702a.getWebViewClient();
    }

    public void d(String str) {
        this.f4702a.removeWebMessageListener(str);
    }

    public void e(boolean z10) {
        this.f4702a.setAudioMuted(z10);
    }

    public void f(String str) {
        this.f4702a.setProfile(str);
    }
}
