package c2;

import android.os.Looper;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class j {
    public static ClassLoader a() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper b(WebView webView) {
        return webView.getWebViewLooper();
    }
}
