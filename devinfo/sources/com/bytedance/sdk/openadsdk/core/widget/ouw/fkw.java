package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jg;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.ouw.ouw;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.bly;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw extends le.ouw {
    private static final HashSet<String> zin;
    protected boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    public cf f8479cf;
    protected final String fkw;

    /* renamed from: jg, reason: collision with root package name */
    public JSONObject f8480jg;
    public vpp ko;

    /* renamed from: le, reason: collision with root package name */
    protected mwh f8481le;

    /* renamed from: lh, reason: collision with root package name */
    protected final bs f8482lh;
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt mwh;
    private final boolean ouw;
    protected boolean pno;
    private TTCeilingLandingPageActivity.ouw qbp;
    protected boolean ra;
    private com.bytedance.sdk.openadsdk.common.fkw rn;
    public Map<String, Object> ryl;

    /* renamed from: th, reason: collision with root package name */
    private boolean f8483th;
    public String tlj;
    private final Stack<String> vm;
    private boolean vt;
    protected final Context yu;
    private String zih;

    static {
        HashSet<String> hashSet = new HashSet<>();
        zin = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public fkw(Context context, bs bsVar, String str, com.bytedance.sdk.openadsdk.common.fkw fkwVar, mwh mwhVar, TTCeilingLandingPageActivity.ouw ouwVar) {
        this(context, bsVar, str, fkwVar, mwhVar, true);
        this.f8483th = true;
        this.qbp = ouwVar;
    }

    public final void lh() {
        if (TextUtils.isEmpty(this.tlj) || !th.bly(this.ko) || this.vt) {
            return;
        }
        cf cfVar = this.f8479cf;
        if (cfVar != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", this.ko, cfVar, this.tlj, true, this.ryl, 1);
            this.vt = true;
            return;
        }
        JSONObject jSONObject = this.f8480jg;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.ko, this.tlj, "click", jSONObject);
            this.vt = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (ko.ouw()) {
            ko.ouw("WebChromeClient", "onPageFinished ".concat(String.valueOf(str)));
        }
        mwh mwhVar = this.f8481le;
        if (mwhVar != null) {
            boolean z3 = this.ouw;
            mwhVar.ouw(false, SystemClock.elapsedRealtime());
            le leVar = mwhVar.f8810cf;
            if (leVar != null && z3) {
                int i4 = leVar.tlj;
                if (!leVar.lh() && !leVar.jqy.contains(Integer.valueOf(i4))) {
                    leVar.jqy.add(Integer.valueOf(i4));
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Long l10 = leVar.vpp.get(Integer.valueOf(i4));
                    long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new ouw.C0111ouw().ouw(leVar.bly).ouw(leVar.tlj).ouw;
                    ouwVar.rn = jElapsedRealtime - jLongValue;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(leVar.vt, ouwVar, leVar.f8491lh);
                }
            }
            com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = mwhVar.f8815od;
            if (fkwVar != null) {
                fkwVar.le();
            }
            bly blyVar = mwhVar.ko;
            if (blyVar != null && z3 && blyVar.ouw(false)) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str, SystemClock.elapsedRealtime() - blyVar.f8754le);
            }
            if (webView != null && !mwhVar.tc && mwhVar.jae) {
                mwhVar.tc = true;
                jg.ouw(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
            }
            if (mwhVar.f8813le.compareAndSet(false, true)) {
                if (mwhVar.yu != 3) {
                    mwhVar.yu = 2;
                }
                mwhVar.zin = System.currentTimeMillis();
                boolean z10 = mwhVar.yu == 2;
                int iRa = mwhVar.ra();
                if (z10) {
                    long j = mwhVar.ex - mwhVar.jqy;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", mwhVar.ra);
                        jSONObject.put("error_msg", mwhVar.bly);
                        jSONObject.put("error_url", mwhVar.tlj);
                        int i10 = mwhVar.fak;
                        if (i10 >= 0) {
                            jSONObject.put("preload_status", i10);
                        }
                        jSONObject.put("first_page", iRa);
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                        jSONObject.put("url", mwhVar.f8817th.osn);
                        jSONObject.put("preload_h5_type", mwhVar.f8817th.gls);
                    } catch (Exception unused) {
                    }
                    mwhVar.ouw(z3, "0");
                    long jMin = Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME);
                    mwhVar.ouw("load_finish", jSONObject, jMin);
                    if (mwhVar.yu()) {
                        mwhVar.osn = SystemClock.elapsedRealtime();
                        mwhVar.lh();
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f8817th, mwhVar.ey, mwhVar.osn - mwhVar.uoy);
                    }
                    mwhVar.ouw(str, "load_finish", jMin);
                    ryl rylVar = mwhVar.uq;
                    if (rylVar != null) {
                        rylVar.ouw(iRa);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", mwhVar.ra);
                        jSONObject2.put("error_msg", mwhVar.bly);
                        jSONObject2.put("error_url", mwhVar.tlj);
                        jSONObject2.put("first_page", iRa);
                        int i11 = mwhVar.fak;
                        if (i11 >= 0) {
                            jSONObject2.put("preload_status", i11);
                        }
                        jSONObject2.putOpt("render_type", "h5");
                        jSONObject2.putOpt("render_type_2", 0);
                        jSONObject2.put("url", mwhVar.f8817th.osn);
                        jSONObject2.put("preload_h5_type", mwhVar.f8817th.gls);
                    } catch (Exception unused2) {
                    }
                    mwhVar.ouw(z3, "2");
                    mwhVar.ouw("load_fail", jSONObject2);
                    if (mwhVar.yu()) {
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f8817th, mwhVar.ey, SystemClock.elapsedRealtime() - mwhVar.uoy, mwhVar.ra, mwhVar.bly, mwhVar.tlj);
                    }
                    if (mwhVar.pno) {
                        jSONObject2.remove("render_type");
                        jSONObject2.remove("render_type_2");
                        mwhVar.ouw("load_fail_main", jSONObject2);
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = this.rn;
        if (fkwVar2 != null && this.ouw && fkwVar2.vt != null) {
            ko.vt("arbitrage_style", "trigger onPageFinished");
            fkwVar2.ouw(1);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        vpp vppVar;
        super.onPageStarted(webView, str, bitmap);
        vpp vppVar2 = this.ko;
        int iOuw = (vppVar2 != null && vppVar2.zin() && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("opt_web_index", false)) ? uoy.ouw(webView) : -1;
        ko.ouw("TTWebViewClient", "currentUrlIndex is:", Integer.valueOf(iOuw));
        mwh mwhVar = this.f8481le;
        if (mwhVar != null) {
            boolean z3 = this.ouw;
            mwhVar.mwh = z3;
            mwhVar.vm++;
            le leVar = mwhVar.f8810cf;
            if (leVar != null && z3) {
                leVar.bly = str;
                leVar.yu();
                leVar.qbp.put(Integer.valueOf(leVar.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                leVar.vpp.put(Integer.valueOf(leVar.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                leVar.jae = leVar.ouw();
                final le leVar2 = mwhVar.f8810cf;
                leVar2.yu.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.3
                    public AnonymousClass3() {
                    }

                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z10) {
                        ko.ouw("_arbitrage_", "trigger onWindowFocusChanged: ", Boolean.valueOf(z10));
                        if (!z10) {
                            le leVar3 = le.this;
                            if (!leVar3.pno) {
                                leVar3.vt();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                le leVar4 = le.this;
                                if (jElapsedRealtime - leVar4.ksc >= 50) {
                                    leVar4.ouw(3, leVar4.bly, leVar4.tlj);
                                    le.this.ksc = jElapsedRealtime;
                                    return;
                                }
                                return;
                            }
                            leVar3.pno = false;
                        }
                        if (z10) {
                            le.this.yu();
                            le leVar5 = le.this;
                            leVar5.qbp.put(Integer.valueOf(leVar5.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                        }
                    }
                });
            }
            bly blyVar = mwhVar.ko;
            if (blyVar != null && z3) {
                if (blyVar.f8755lh) {
                    iOuw++;
                }
                if (blyVar.ouw(true)) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str, iOuw);
                    blyVar.vt.put(Integer.valueOf(blyVar.yu), str);
                    blyVar.f8754le = SystemClock.elapsedRealtime();
                }
            }
            WeakReference<WebView> weakReference = mwhVar.ksc;
            WebView webView2 = weakReference != null ? weakReference.get() : null;
            if (webView2 != null) {
                try {
                    WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                    if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > mwhVar.bs) {
                        mwhVar.fvf.incrementAndGet();
                    }
                    mwhVar.bs = webBackForwardListCopyBackForwardList.getCurrentIndex();
                } catch (Exception e2) {
                    qbp.ouw("LandingPageLog", "copyBackForwardList exception", e2);
                }
            }
            if (mwhVar.f8816pd == 0) {
                mwhVar.f8816pd = SystemClock.elapsedRealtime();
            }
            com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = mwhVar.f8815od;
            if (fkwVar != null) {
                fkwVar.fkw();
            }
            if (mwhVar.fkw.compareAndSet(false, true)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    int i4 = mwhVar.fak;
                    if (i4 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i4));
                    }
                } catch (Exception unused) {
                }
                mwhVar.ouw("load_start", jSONObject);
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = this.rn;
        if (fkwVar2 != null) {
            boolean z10 = this.ouw;
            fkwVar2.tlj.clear();
            fkwVar2.bly = z10;
            if (z10) {
                fkwVar2.ra = true;
            }
            fkwVar2.f7827cf = fkwVar2.yu();
        }
        if (this.ouw && (vppVar = this.ko) != null && vppVar.zin() && this.ko.our.ouw() >= 2) {
            if (!TextUtils.isEmpty(str) && !str.equals(this.zih)) {
                if (this.vm.contains(str)) {
                    while (!str.equals(this.vm.peek())) {
                        this.vm.pop();
                    }
                } else {
                    this.vm.push(str);
                }
            }
            this.zih = str;
        }
        ko.ouw("TTWebViewClient-onPageStarted", "mNeedHardwareAcceleration:", Boolean.valueOf(this.pno), "hasSetHardwareAccelerate", Boolean.valueOf(this.bly));
        if (!this.pno || this.bly) {
            return;
        }
        ko.vt("TTWebViewClient-onPageStarted", "use hardware acceleration");
        this.bly = true;
        lh lhVarOuw = lh.ouw(this.yu);
        lhVarOuw.vt = true;
        lhVarOuw.ouw = webView.getSettings().getBuiltInZoomControls();
        lhVarOuw.ouw(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i4, String str, String str2) {
        super.onReceivedError(webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f8481le == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.f8481le.ouw(webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f8481le != null) {
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
            this.f8481le.ouw(primaryError, strConcat, str, ouw(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().vt();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d6 A[Catch: all -> 0x0161, TryCatch #0 {all -> 0x0161, blocks: (B:74:0x0147, B:76:0x015b, B:80:0x0164, B:83:0x016b, B:85:0x0171, B:87:0x0179, B:93:0x018e, B:117:0x01d9, B:95:0x0196, B:97:0x019a, B:99:0x019e, B:101:0x01a2, B:103:0x01a6, B:105:0x01aa, B:107:0x01b0, B:109:0x01b9, B:111:0x01c5, B:116:0x01d6, B:90:0x0183, B:131:0x0226, B:133:0x022a, B:130:0x0215, B:119:0x01de, B:121:0x01e6, B:128:0x0205, B:124:0x01ed, B:126:0x01f5, B:127:0x01fa), top: B:149:0x0147, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r14, final java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final mwh vt() {
        return this.f8481le;
    }

    public static String ouw(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !zin.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    private boolean vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (th.tlj(this.ko) && this.f8480jg == null && this.f8479cf == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.yu instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.yu.startActivity(intent);
                lh();
                this.f8480jg = null;
                this.f8479cf = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f8481le == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.f8481le.ouw(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.yu.mwh r0 = r8.f8481le
            if (r0 == 0) goto L3d
            boolean r1 = r8.ouw
            com.bytedance.sdk.openadsdk.yu.bly r0 = r0.ko
            if (r0 == 0) goto L3d
            if (r1 == 0) goto L3d
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r0.ouw
            if (r1 == 0) goto L3d
            com.bytedance.sdk.openadsdk.core.model.pno r1 = r1.our
            java.util.List<java.lang.String> r1 = r1.fkw
            boolean r1 = com.bytedance.sdk.component.bly.vt.ouw(r1, r10)
            if (r1 == 0) goto L3d
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r0.vt
            int r2 = r0.yu
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L30
            java.lang.String r1 = ""
        L30:
            r5 = r1
            com.bytedance.sdk.openadsdk.core.model.vpp r2 = r0.ouw
            java.lang.String r3 = r0.fkw
            int r4 = r0.yu
            r7 = 2
            r6 = r10
            com.bytedance.sdk.openadsdk.yu.lh.ouw(r2, r3, r4, r5, r6, r7)
            goto L3e
        L3d:
            r6 = r10
        L3e:
            com.bytedance.sdk.openadsdk.common.fkw r10 = r8.rn
            if (r10 == 0) goto L69
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r10.ouw
            if (r0 == 0) goto L69
            com.bytedance.sdk.openadsdk.core.model.pno r0 = r0.our
            java.util.List<java.lang.String> r0 = r0.fkw
            boolean r0 = com.bytedance.sdk.component.bly.vt.ouw(r0, r6)
            if (r0 == 0) goto L69
            int r0 = r10.f7829le
            int r0 = r0 + 1
            r10.f7829le = r0
            java.lang.String r0 = "arbitrage_style"
            java.lang.String r1 = "trigger shouldInterceptRequest->1"
            com.bytedance.sdk.component.utils.ko.lh(r0, r1)
            android.os.Handler r0 = com.bytedance.sdk.component.utils.bly.vt()
            com.bytedance.sdk.openadsdk.common.fkw$1 r1 = new com.bytedance.sdk.openadsdk.common.fkw$1
            r1.<init>()
            r0.post(r1)
        L69:
            android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    public fkw(Context context, bs bsVar, String str, com.bytedance.sdk.openadsdk.common.fkw fkwVar, mwh mwhVar, boolean z3) {
        this(context, bsVar, str, mwhVar, z3);
        this.rn = fkwVar;
    }

    public fkw(Context context, bs bsVar, String str, mwh mwhVar, boolean z3) {
        this.ra = true;
        this.pno = true;
        this.bly = false;
        this.yu = context;
        this.f8482lh = bsVar;
        this.fkw = str;
        this.f8481le = mwhVar;
        this.ouw = z3;
        this.vm = new Stack<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final String str, final boolean z3, final int i4, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.ko, this.tlj, "lp_not_http_open", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.2
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z3);
                    jSONObject.put("error_type", i4);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
