package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class V7 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC0912b0 f11954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R7 f11955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f11956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11957d;

    public /* synthetic */ V7(RunnableC0912b0 runnableC0912b0, R7 r7, WebView webView, boolean z6) {
        this.f11954a = runnableC0912b0;
        this.f11955b = r7;
        this.f11956c = webView;
        this.f11957d = z6;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        W7 w7 = (W7) this.f11954a.f13282d;
        R7 r7 = this.f11955b;
        WebView webView = this.f11956c;
        String str = (String) obj;
        boolean z6 = this.f11957d;
        w7.getClass();
        synchronized (r7.f10851g) {
            r7.f10856m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (w7.f12178n || TextUtils.isEmpty(webView.getTitle())) {
                    r7.b(strOptString, z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    r7.b(sb.toString(), z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (r7.a()) {
                w7.f12169d.n(r7);
            }
        } catch (JSONException unused) {
            u2.k.c("Json string may be malformed.");
        } catch (Throwable th) {
            u2.k.d("Failed to get webview content.", th);
            p2.j.f22785C.f22795h.f("ContentFetchTask.processWebViewContent", th);
        }
    }
}
