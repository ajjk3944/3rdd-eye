package A2;

import a.AbstractC0241a;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import t2.C2911G;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f173b;

    public /* synthetic */ I(J j6, int i) {
        this.f172a = i;
        this.f173b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        WebViewClient webViewClientE;
        switch (this.f172a) {
            case 0:
                J j6 = this.f173b;
                WebView webView = j6.f174a;
                try {
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    if (Build.VERSION.SDK_INT < 26) {
                        if (AbstractC0241a.k("GET_WEB_VIEW_CLIENT")) {
                            try {
                                webViewClientE = T0.f.e(webView);
                            } catch (RuntimeException e6) {
                                p2.j.f22785C.f22795h.f("AdUtil.getWebViewClient", e6);
                            }
                        }
                        throw new IllegalStateException("getWebViewClient not supported");
                    }
                    webViewClientE = webView.getWebViewClient();
                    if (webViewClientE == j6) {
                        return;
                    }
                    if (webViewClientE != null) {
                        j6.f177d = webViewClientE;
                    }
                    webView.setWebViewClient(j6);
                    j6.x();
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                J j7 = this.f173b;
                j7.f176c.execute(new I(j7, 0));
                return;
        }
    }
}
