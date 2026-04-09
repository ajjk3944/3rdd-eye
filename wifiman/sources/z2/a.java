package Z2;

import Z2.c;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public h f25084a;

    public h a() {
        h hVar = this.f25084a;
        if (hVar != null) {
            return hVar;
        }
        AbstractC6492s.v("state");
        return null;
    }

    public void b(h hVar) {
        AbstractC6492s.i(hVar, "<set-?>");
        this.f25084a = hVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int i10) {
        AbstractC6492s.i(view, "view");
        super.onProgressChanged(view, i10);
        if (a().d() instanceof c.a) {
            return;
        }
        a().j(new c.C0962c(i10 / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView view, Bitmap bitmap) {
        AbstractC6492s.i(view, "view");
        super.onReceivedIcon(view, bitmap);
        a().k(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String str) {
        AbstractC6492s.i(view, "view");
        super.onReceivedTitle(view, str);
        a().l(str);
    }
}
