package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class jt3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ sa4 g;

    public /* synthetic */ jt3(sa4 sa4Var, int i) {
        this.f = i;
        this.g = sa4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                sa4 sa4Var = this.g;
                WebView webView = sa4Var.a;
                try {
                    lf4 lf4Var = hg4.C.c;
                    WebViewClient webViewClient = webView.getWebViewClient();
                    if (webViewClient != sa4Var) {
                        if (webViewClient != null) {
                            sa4Var.d = webViewClient;
                        }
                        webView.setWebViewClient(sa4Var);
                        sa4Var.x();
                        break;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
            default:
                sa4 sa4Var2 = this.g;
                sa4Var2.c.execute(new jt3(sa4Var2, 0));
                break;
        }
    }
}
