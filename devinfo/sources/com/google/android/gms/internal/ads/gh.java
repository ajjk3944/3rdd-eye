package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f11516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch f11517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f11518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11519d;

    public /* synthetic */ gh(d1 d1Var, ch chVar, WebView webView, boolean z3) {
        this.f11516a = d1Var;
        this.f11517b = chVar;
        this.f11518c = webView;
        this.f11519d = z3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        hh hhVar = (hh) this.f11516a.f10287d;
        ch chVar = this.f11517b;
        WebView webView = this.f11518c;
        String str = (String) obj;
        boolean z3 = this.f11519d;
        hhVar.getClass();
        synchronized (chVar.g) {
            chVar.f10128m--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (hhVar.f11875n || TextUtils.isEmpty(webView.getTitle())) {
                    chVar.b(strOptString, z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(strOptString);
                    chVar.b(sb2.toString(), z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (chVar.a()) {
                hhVar.f11867d.m(chVar);
            }
        } catch (JSONException unused) {
            za.i.c("Json string may be malformed.");
        } catch (Throwable th2) {
            za.i.d("Failed to get webview content.", th2);
            ua.j.C.f35265h.f("ContentFetchTask.processWebViewContent", th2);
        }
    }
}
