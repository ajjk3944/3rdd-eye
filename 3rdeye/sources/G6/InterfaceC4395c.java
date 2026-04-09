package g6;

import R9.z;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import c6.InterfaceC2072e;

/* compiled from: WebViewAPI.kt */
/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4395c {

    /* compiled from: WebViewAPI.kt */
    /* renamed from: g6.c$a */
    public interface a {
        boolean processCommand(String str, z zVar);
    }

    /* compiled from: WebViewAPI.kt */
    /* renamed from: g6.c$b */
    public interface b {
        void onReceivedError(String str, boolean z10);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView webView, Boolean bool);
    }

    void notifyPropertiesChange(boolean z10);

    void setAdVisibility(boolean z10);

    void setConsentStatus(boolean z10, String str, String str2, String str3, String str4);

    void setErrorHandler(b bVar);

    void setMraidDelegate(a aVar);

    void setWebViewObserver(InterfaceC2072e interfaceC2072e);
}
