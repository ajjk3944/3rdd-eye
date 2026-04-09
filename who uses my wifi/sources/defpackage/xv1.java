package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class xv1 implements ValueCallback {
    public final /* synthetic */ gi a;
    public final /* synthetic */ uv1 b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ xv1(gi giVar, uv1 uv1Var, WebView webView, boolean z) {
        this.a = giVar;
        this.b = uv1Var;
        this.c = webView;
        this.d = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        yv1 yv1Var = (yv1) this.a.i;
        uv1 uv1Var = this.b;
        WebView webView = this.c;
        String str = (String) obj;
        boolean z = this.d;
        yv1Var.getClass();
        synchronized (uv1Var.g) {
            uv1Var.m--;
        }
        try {
            boolean z2 = true;
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (yv1Var.s || TextUtils.isEmpty(webView.getTitle())) {
                    uv1Var.a(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    uv1Var.a(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (uv1Var.g) {
                if (uv1Var.m != 0) {
                    z2 = false;
                }
            }
            if (z2) {
                yv1Var.i.s(uv1Var);
            }
        } catch (JSONException unused) {
            gi2.U("Json string may be malformed.");
        } catch (Throwable th) {
            gi2.q0(3);
            hg4.C.h.d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
