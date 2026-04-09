package c6;

import android.webkit.WebView;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;

/* loaded from: classes3.dex */
public class a extends AdSessionStatePublisher {
    public a(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        c(webView);
    }
}
