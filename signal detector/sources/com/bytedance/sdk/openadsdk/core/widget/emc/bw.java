package com.bytedance.sdk.openadsdk.core.widget.emc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.ypw;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sup;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.dg.sz;
import com.bytedance.sdk.openadsdk.dg.ypw;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.yzg;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends ycc.emc {
    private static final HashSet<String> ylm;
    private TTCeilingLandingPageActivity.emc aa;
    protected final String bw;
    private final Stack<String> cf;
    protected final Context dg;
    private final boolean emc;
    private Map<String, Object> gbl;
    protected boolean msw;
    private String qh;
    private sup ru;
    private com.bytedance.sdk.openadsdk.core.sz.dg.ypw sba;
    private boolean sup;
    private com.bytedance.sdk.openadsdk.common.bw sz;
    private rie ul;
    protected boolean uym;
    private boolean vk;
    protected final rtt xq;
    protected sz ycc;
    private String ypw;
    private JSONObject yzg;
    protected boolean zz;

    static {
        HashSet<String> hashSet = new HashSet<>();
        ylm = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public bw(Context context, rtt rttVar, String str, com.bytedance.sdk.openadsdk.common.bw bwVar, sz szVar, boolean z6, boolean z7, TTCeilingLandingPageActivity.emc emcVar) {
        this(context, rttVar, str, bwVar, szVar, z6);
        this.vk = z7;
        this.aa = emcVar;
    }

    private boolean bw(String str) {
        if (ul.ru(this.ul)) {
            return TextUtils.equals(this.ul.qwr(), str);
        }
        return false;
    }

    public static String dg(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !ylm.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        sz szVar = this.ycc;
        if (szVar != null) {
            szVar.emc(webView, str, this.emc);
        }
        com.bytedance.sdk.openadsdk.common.bw bwVar = this.sz;
        if (bwVar != null) {
            bwVar.ypw(webView, str, this.emc);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        rie rieVar;
        super.onPageStarted(webView, str, bitmap);
        rie rieVar2 = this.ul;
        int iEmc = (rieVar2 != null && rieVar2.oug() && com.bytedance.sdk.openadsdk.sra.emc.emc("opt_web_index", false)) ? tp.emc(webView) : -1;
        sz szVar = this.ycc;
        if (szVar != null) {
            webView2 = webView;
            str2 = str;
            szVar.emc(webView2, str2, bitmap, this.emc, iEmc);
        } else {
            webView2 = webView;
            str2 = str;
        }
        com.bytedance.sdk.openadsdk.common.bw bwVar = this.sz;
        if (bwVar != null) {
            bwVar.xq(webView2, str2, this.emc);
        }
        if (this.emc && (rieVar = this.ul) != null && rieVar.oug() && this.ul.ee().ypw() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.qh)) {
                if (this.cf.contains(str2)) {
                    while (!str2.equals(this.cf.peek())) {
                        this.cf.pop();
                    }
                } else {
                    this.cf.push(str2);
                }
            }
            this.qh = str2;
        }
        if (!this.msw || this.zz) {
            return;
        }
        this.zz = true;
        xq.emc(this.dg).emc(true).ypw(webView2.getSettings().getBuiltInZoomControls()).emc(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.ycc == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.ycc.emc(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.ycc != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.ycc.emc(webView, primaryError, strConcat, str, dg(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.zz.ycc.emc, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.bw.bw.emc().ypw();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        bw bwVar;
        String str2;
        rtt rttVar;
        Uri uri;
        final String lowerCase;
        Intent uri2;
        sz szVar = this.ycc;
        if (szVar != null) {
            szVar.emc(str, this.emc);
        }
        com.bytedance.sdk.openadsdk.common.bw bwVar2 = this.sz;
        if (bwVar2 != null) {
            bwVar2.emc(webView, str, this.emc);
        }
        if (emc(webView, str)) {
            return true;
        }
        rie rieVar = this.ul;
        if (rieVar != null && rieVar.sba() == 1 && ((com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.emc(str, this.ul) || com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.emc(this.ul, str)) && com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.ypw(this.ul, this.dg, true))) {
            return true;
        }
        try {
            uri = Uri.parse(str);
            lowerCase = uri.getScheme().toLowerCase();
        } catch (Throwable unused) {
            bwVar = this;
            str2 = str;
            rttVar = bwVar.xq;
            if (rttVar != null && rttVar.bw()) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str2);
        }
        if ("bytedance".equals(lowerCase)) {
            yzg.emc(uri, this.xq);
            return true;
        }
        if (xq(str)) {
            return true;
        }
        if (sba.emc(str)) {
            str2 = str;
            return super.shouldOverrideUrlLoading(webView, str2);
        }
        if (ul.ru(this.ul)) {
            emc(lowerCase, str);
            return true;
        }
        try {
            if (str.startsWith("intent:")) {
                uri2 = Intent.parseUri(str, 1);
            } else if (str.startsWith("android-app:")) {
                uri2 = Intent.parseUri(str, 2);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                uri2 = intent;
            }
            uri2.addFlags(268435456);
            com.bytedance.sdk.component.utils.ypw.emc(this.dg, uri2, new ypw.InterfaceC0037ypw() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.bw.1
                @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0037ypw
                public void emc() {
                    bw.this.emc(lowerCase, true, 0, "", str);
                }

                @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0037ypw
                public void emc(Throwable th) {
                    bw.this.emc(lowerCase, false, 2, th.getMessage(), str);
                }
            });
            bwVar = this;
            str2 = str;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("WebChromeClient", "parseUri", th);
            bwVar = this;
            str2 = str;
            try {
                bwVar.emc(lowerCase, false, 1, th.getMessage(), str2);
            } catch (Throwable unused2) {
                rttVar = bwVar.xq;
                if (rttVar != null) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str2);
            }
        }
        com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = bwVar.sba;
        if (ypwVar != null) {
            ypwVar.fu();
        }
        return true;
    }

    public void xq() {
        if (TextUtils.isEmpty(this.ypw) || !ul.zz(this.ul) || this.sup) {
            return;
        }
        sup supVar = this.ru;
        if (supVar != null) {
            com.bytedance.sdk.openadsdk.dg.xq.emc("click", this.ul, supVar, this.ypw, true, this.gbl, 1);
            this.sup = true;
            return;
        }
        JSONObject jSONObject = this.yzg;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(this.ul, this.ypw, "click", jSONObject);
            this.sup = true;
        }
    }

    public sz ypw() {
        return this.ycc;
    }

    public void emc(sup supVar) {
        this.ru = supVar;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.ycc == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.ycc.emc(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        sz szVar = this.ycc;
        if (szVar != null) {
            szVar.ypw(webView, str, this.emc);
        }
        com.bytedance.sdk.openadsdk.common.bw bwVar = this.sz;
        if (bwVar != null) {
            bwVar.emc(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public boolean ypw(String str) {
        String strXq;
        String strEmc;
        if (this.dg == null) {
            return false;
        }
        rie rieVar = this.ul;
        if (rieVar == null || rieVar.mjd() == null) {
            strXq = "";
            strEmc = "";
        } else {
            strXq = this.ul.mjd().xq();
            strEmc = this.ul.mjd().emc();
        }
        Context context = this.dg;
        rie rieVar2 = this.ul;
        return com.bytedance.sdk.openadsdk.ul.emc.emc.emc.emc(context, str, rieVar2, tp.ypw(rieVar2), null, true) || com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.emc(this.ul, strXq, this.dg, this.ypw, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.emc(this.dg, strEmc, strXq, this.ypw, this.ul);
    }

    public void emc(Map<String, Object> map) {
        this.gbl = map;
    }

    public bw(Context context, rtt rttVar, String str, com.bytedance.sdk.openadsdk.common.bw bwVar, sz szVar, boolean z6) {
        this(context, rttVar, str, szVar, z6);
        this.sz = bwVar;
    }

    public void emc(JSONObject jSONObject) {
        this.yzg = jSONObject;
    }

    public void emc(String str) {
        this.ypw = str;
    }

    public bw(Context context, rtt rttVar, String str, sz szVar, boolean z6) {
        this.uym = true;
        this.msw = true;
        this.zz = false;
        this.dg = context;
        this.xq = rttVar;
        this.bw = str;
        this.ycc = szVar;
        this.emc = z6;
        this.cf = new Stack<>();
    }

    public void emc(rie rieVar) {
        this.ul = rieVar;
    }

    private void emc(String str, String str2) {
        if ((bw(str) || "market".equals(str)) && ((this.ru != null || this.yzg != null) && ypw(str2))) {
            xq();
        }
        this.ru = null;
        this.yzg = null;
    }

    public boolean xq(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (ul.ru(this.ul) && this.yzg == null && this.ru == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.dg instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.dg.startActivity(intent);
                xq();
                this.yzg = null;
                this.ru = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean emc(WebView webView, String str) {
        if (!tp.dg(this.ul) || this.ul.ee() == null || webView == null) {
            return false;
        }
        int iYpw = this.ul.ee().ypw();
        int size = this.cf.size();
        if (this.vk) {
            size++;
        }
        if (size + 1 != iYpw) {
            return false;
        }
        com.bytedance.sdk.openadsdk.utils.rie.emc(this.dg, str, this.ul, ypw.emc.dg);
        TTCeilingLandingPageActivity.emc emcVar = this.aa;
        if (emcVar != null) {
            emcVar.emc();
        }
        return true;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        this.sba = ypwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final String str, final boolean z6, final int i, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), this.ul, this.ypw, "lp_not_http_open", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.widget.emc.bw.2
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z6);
                    jSONObject.put("error_type", i);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
