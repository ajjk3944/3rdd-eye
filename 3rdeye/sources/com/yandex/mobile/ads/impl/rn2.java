package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rn2 extends s8 {

    /* renamed from: f, reason: collision with root package name */
    private WebView f32724f;

    /* renamed from: g, reason: collision with root package name */
    private Long f32725g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, ra2> f32726h;
    private final String i;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final WebView f32727b;

        public a(rn2 rn2Var) {
            this.f32727b = rn2Var.f32724f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f32727b.destroy();
        }
    }

    public rn2(String str, Map map) {
        this.f32726h = map;
        this.i = str;
    }

    @Override // com.yandex.mobile.ads.impl.s8
    public final void b() {
        super.b();
        new Handler().postDelayed(new a(this), Math.max(4000 - (this.f32725g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f32725g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f32724f = null;
    }

    @Override // com.yandex.mobile.ads.impl.s8
    public final void a() {
        WebView webView = new WebView(eo2.a().b());
        this.f32724f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f32724f);
        WebView webView2 = this.f32724f;
        String str = this.i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.f32726h.keySet()) {
            String externalForm = this.f32726h.get(str2).a().toExternalForm();
            WebView webView3 = this.f32724f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String strReplace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(strReplace)) {
                    webView3.loadUrl("javascript: " + strReplace);
                }
            }
        }
        this.f32725g = Long.valueOf(System.nanoTime());
    }

    @Override // com.yandex.mobile.ads.impl.s8
    public final void a(in2 in2Var, p8 p8Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, ra2> mapD = p8Var.d();
        for (String str : mapD.keySet()) {
            vn2.a(jSONObject, str, mapD.get(str));
        }
        a(in2Var, p8Var, jSONObject);
    }
}
