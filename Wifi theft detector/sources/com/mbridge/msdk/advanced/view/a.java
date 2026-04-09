package com.mbridge.msdk.advanced.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.advanced.middle.c;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public class a extends b {

    /* renamed from: c, reason: collision with root package name */
    private final String f12890c = "NativeAdvancedWebViewClient";

    /* renamed from: d, reason: collision with root package name */
    private final String f12891d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12892e;

    /* renamed from: f, reason: collision with root package name */
    String f12893f;

    /* renamed from: g, reason: collision with root package name */
    com.mbridge.msdk.advanced.middle.a f12894g;

    /* renamed from: h, reason: collision with root package name */
    private c f12895h;

    /* renamed from: com.mbridge.msdk.advanced.view.a$a, reason: collision with other inner class name */
    public class C0237a implements ValueCallback<String> {
        public C0237a() {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public a(String str, com.mbridge.msdk.advanced.middle.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.directory.c cVar2 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC;
        this.f12891d = e.b(cVar2) != null ? e.b(cVar2) : k0.a("YkRXhr5AWBPfNgzuH7JQ+2Ha");
        this.f12892e = k0.a("Y+xgWkl2");
        this.f12893f = str;
        this.f12894g = aVar;
        this.f12895h = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f12895h != null) {
            try {
                String strA = "";
                if (str.startsWith("file") && str.startsWith(this.f12891d)) {
                    strA = str.replace(q7.a.FILE_SCHEME, "");
                }
                if (a(str)) {
                    strA = this.f12895h.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                if (!TextUtils.isEmpty(strA) && a(strA, this.f12891d)) {
                    q0.a("NativeAdvancedWebViewClient", "replace url : " + strA);
                    if (!strA.contains("127.0.0.1") && !strA.startsWith("http")) {
                        HashMap map = new HashMap();
                        map.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
                        WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypes.VIDEO_MP4, "utf-8", new FileInputStream(strA));
                        webResourceResponse.setResponseHeaders(map);
                        return webResourceResponse;
                    }
                    return null;
                }
            } catch (Throwable th) {
                q0.b("NativeAdvancedWebViewClient", th.getMessage());
            }
        }
        return null;
    }

    public void b() {
        if (this.f12895h != null) {
            this.f12895h = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new C0237a());
        } catch (Throwable th) {
            q0.b("NativeAdvancedWebViewClient", "onPageStarted", th);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f13078d) {
                    if (com.mbridge.msdk.click.utils.a.a(((com.mbridge.msdk.advanced.signal.b) windVaneWebView.getObject()).a().get(0), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f13076b)) {
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b("NativeAdvancedWebViewClient", e10.getMessage());
            }
            q0.b("NativeAdvancedWebViewClient", "Use html to open url.");
            com.mbridge.msdk.advanced.middle.a aVar = this.f12894g;
            if (aVar == null) {
                return true;
            }
            aVar.a(false, str);
            return true;
        } catch (Throwable th) {
            q0.b("NativeAdvancedWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri uri;
        String scheme;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (scheme = uri.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f12892e) || scheme.equals("mb-h5");
    }
}
