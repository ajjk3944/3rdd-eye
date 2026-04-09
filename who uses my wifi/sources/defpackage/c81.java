package defpackage;

import android.net.Uri;
import android.webkit.WebView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class c81 {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static of3 a(WebView webView) {
        return new of3(7, g81.a.createWebView(webView));
    }

    public static String b() {
        if (f81.e.b()) {
            return g81.a.getStatics().getVariationsHeader();
        }
        throw f81.a();
    }
}
