package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bly.lh;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends com.bytedance.sdk.component.bly.le implements lh.InterfaceC0071lh {

    /* renamed from: cf, reason: collision with root package name */
    protected boolean f8056cf;

    /* renamed from: jg, reason: collision with root package name */
    private jqy f8057jg;
    private lh ko;
    AtomicBoolean mwh;
    private vt qbp;
    private com.bytedance.sdk.openadsdk.core.model.vpp rn;
    AtomicBoolean ryl;

    /* renamed from: th, reason: collision with root package name */
    private List<String> f8058th;
    protected boolean tlj;
    private int vm;
    private long vpp;
    private String zih;
    private int zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends le.ouw {
        public static final Set<String> ouw = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.ouw.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        lh.InterfaceC0071lh vt;

        public ouw(lh.InterfaceC0071lh interfaceC0071lh) {
            this.vt = interfaceC0071lh;
        }

        private void ouw(String str) {
            int iLastIndexOf;
            lh.InterfaceC0071lh interfaceC0071lh;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!ouw.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0071lh = this.vt) == null) {
                    return;
                }
                interfaceC0071lh.vt(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            lh.InterfaceC0071lh interfaceC0071lh = this.vt;
            if (interfaceC0071lh != null) {
                interfaceC0071lh.ouw();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                webResourceRequest.getUrl();
                ouw(webResourceResponse.getStatusCode());
            }
            ouw(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.vt.ouw(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            ouw(webResourceRequest.getUrl().toString());
        }

        private void ouw(int i4) {
            lh.InterfaceC0071lh interfaceC0071lh = this.vt;
            if (interfaceC0071lh != null) {
                interfaceC0071lh.ouw(106, i4);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void m_();

        void n_();

        View ouw();

        void ouw(int i4);
    }

    public fkw(Context context) {
        super(context, le.lh.DSP);
        this.tlj = false;
        this.f8056cf = false;
        this.ryl = new AtomicBoolean(false);
        this.mwh = new AtomicBoolean(false);
        this.vm = 0;
    }

    @Override // com.bytedance.sdk.component.bly.le
    public final void bly() {
        this.ko.ouw();
        super.bly();
    }

    public final void cf() {
        this.ryl.set(false);
        String str = this.rn.swm;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strOuw = com.bytedance.sdk.openadsdk.core.ryl.fkw.ouw(str);
        String str2 = TextUtils.isEmpty(strOuw) ? str : strOuw;
        this.vm = 0;
        ouw((String) null, str2, "text/html", "UTF-8", (String) null);
        this.vpp = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.bly.le, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.tlj) {
            this.ko.ouw(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.bly.le, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.ko.ouw();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.zin / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.rn, this.zih, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        boolean z3 = i4 == 0;
        this.f8056cf = z3;
        this.ko.ouw(z3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0071lh
    public final void vt(String str) {
        if (this.f8058th == null) {
            this.f8058th = new ArrayList();
        }
        this.f8058th.add(str);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, vt vtVar, String str) {
        this.qbp = vtVar;
        this.rn = vppVar;
        this.zih = str;
        this.ko = new lh();
        this.f8057jg = new jqy(getContext());
        setWebViewClient(new ouw(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.1
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i4) {
                fkw.this.zin = i4;
                super.onProgressChanged(webView, i4);
                if (i4 >= 100) {
                    fkw.this.ouw();
                }
            }
        });
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public final void run() {
                WebView webView = fkw.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.2.1
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            fkw.this.f8057jg.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public final void ouw(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.ko.ouw(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0071lh
    public final void ouw(String str) {
        String str2;
        boolean zOuw;
        com.bytedance.sdk.openadsdk.core.model.cf cfVarOuw;
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar;
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar2;
        if (TextUtils.isEmpty(str) || this.rn == null || !this.f8057jg.ouw.ouw) {
            return;
        }
        int iOuw = uoy.ouw(this.zih);
        View viewOuw = null;
        if (!com.bytedance.sdk.component.utils.vm.ouw(str) && ((rylVar2 = this.rn.kn) == null || TextUtils.isEmpty(rylVar2.ouw))) {
            com.bytedance.sdk.openadsdk.core.model.ryl rylVar3 = new com.bytedance.sdk.openadsdk.core.model.ryl();
            rylVar3.ouw = str;
            this.rn.kn = rylVar3;
            str = null;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.rn;
        vppVar.mq = true;
        if (vppVar == null || (rylVar = vppVar.kn) == null || TextUtils.isEmpty(rylVar.ouw)) {
            str2 = str;
            zOuw = false;
        } else {
            zOuw = com.bytedance.sdk.openadsdk.core.uoy.ouw(getContext(), this.rn, this.zih, null);
            if (zOuw || TextUtils.isEmpty(this.rn.kn.vt)) {
                str2 = str;
            } else {
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.rn;
                String str3 = vppVar2.kn.vt;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar2, this.zih, "open_fallback_url", (Map<String, Object>) null);
                str2 = str3;
            }
        }
        if (!zOuw) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.core.uoy.ouw(getContext(), this.rn, iOuw, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.yu.ouw) null, this.zih, true, str2);
            }
        }
        if (this.f8057jg != null) {
            vt vtVar = this.qbp;
            if (vtVar != null) {
                viewOuw = vtVar.ouw();
                this.qbp.m_();
            }
            jqy jqyVar = this.f8057jg;
            Context context = getContext();
            if (jqyVar.vt == null) {
                cfVarOuw = new cf.ouw().ouw();
            } else {
                cf.ouw ouwVar = new cf.ouw();
                com.bytedance.sdk.openadsdk.core.lh.le leVar = jqyVar.vt;
                ouwVar.f8216le = leVar.ouw;
                ouwVar.fkw = leVar.vt;
                ouwVar.yu = leVar.f8197lh;
                ouwVar.f8217lh = leVar.yu;
                ouwVar.vt = leVar.fkw;
                ouwVar.ouw = leVar.f8196le;
                ouwVar.ra = osn.ouw(viewOuw);
                ouwVar.pno = osn.lh(viewOuw);
                com.bytedance.sdk.openadsdk.core.lh.le leVar2 = jqyVar.vt;
                ouwVar.bly = leVar2.ra;
                ouwVar.tlj = leVar2.pno;
                ouwVar.f8214cf = leVar2.bly;
                ouwVar.ryl = leVar2.ryl;
                ouwVar.mwh = com.bytedance.sdk.openadsdk.core.bly.ouw().tlj ? 1 : 2;
                ouwVar.zih = "vessel";
                ouwVar.f8215jg = osn.bly(context);
                ouwVar.ko = osn.cf(context);
                ouwVar.rn = osn.tlj(context);
                cfVarOuw = ouwVar.ouw();
            }
            com.bytedance.sdk.openadsdk.core.model.cf cfVar = cfVarOuw;
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", this.rn, cfVar, this.zih, true, (Map<String, Object>) map, this.f8057jg.ouw.ouw ? 1 : 2);
        }
        jqy jqyVar2 = this.f8057jg;
        if (jqyVar2 != null) {
            jqyVar2.ouw.ouw = false;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh {
        protected int ouw = 0;
        private com.bytedance.sdk.openadsdk.core.ryl.le vt = new com.bytedance.sdk.openadsdk.core.ryl.le();

        public final void ouw(final WebView webView) {
            if (webView != null && this.ouw == 0) {
                if (this.vt == null) {
                    this.vt = new com.bytedance.sdk.openadsdk.core.ryl.le();
                }
                final com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.vt;
                if (leVar.vt == null) {
                    if (a.o()) {
                        leVar.ouw(webView);
                    } else {
                        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                le.this.ouw(webView);
                            }
                        });
                    }
                }
                final com.bytedance.sdk.openadsdk.core.ryl.le leVar2 = this.vt;
                if (a.o()) {
                    leVar2.ouw();
                } else {
                    com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ryl.le.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            le.this.ouw();
                        }
                    });
                }
                this.ouw = 1;
            }
        }

        public final void ouw(boolean z3) {
            com.bytedance.sdk.openadsdk.core.ryl.le leVar;
            if (this.ouw == 1 && z3 && (leVar = this.vt) != null) {
                leVar.vt();
                this.ouw = 3;
            }
        }

        public final void ouw(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.vt;
            if (leVar != null) {
                leVar.ouw(view, friendlyObstructionPurpose);
            }
        }

        public final void ouw() {
            com.bytedance.sdk.openadsdk.core.ryl.le leVar;
            int i4 = this.ouw;
            if (i4 != 0 && i4 != 4 && (leVar = this.vt) != null) {
                leVar.yu();
            }
            this.ouw = 4;
            this.vt = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0071lh
    public final void ouw(int i4, int i10) {
        vt vtVar = this.qbp;
        if (vtVar != null) {
            vtVar.ouw(i4);
        }
        this.vm = i10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i10);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.vpp);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(this.rn, this.zih, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.lh.InterfaceC0071lh
    public final void ouw() {
        if (this.ryl.compareAndSet(false, true)) {
            this.tlj = true;
            this.ko.ouw(getWebView());
            this.ko.ouw(this.f8056cf);
            vt vtVar = this.qbp;
            if (vtVar != null) {
                vtVar.n_();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.vpp);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.vt(this.rn, this.zih, "render_html_success", jSONObject);
            if (this.f8058th == null) {
                com.bytedance.sdk.openadsdk.yu.lh.vt(this.rn, this.zih, "dsp_html_success_url", (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.bly.fkw.3
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        try {
                            if (fkw.this.f8058th != null && fkw.this.mwh.compareAndSet(false, true)) {
                                JSONObject jSONObject2 = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                Iterator it = fkw.this.f8058th.iterator();
                                while (it.hasNext()) {
                                    jSONArray.put((String) it.next());
                                }
                                jSONObject2.put("url", jSONArray);
                                com.bytedance.sdk.openadsdk.yu.lh.vt(fkw.this.rn, fkw.this.zih, "dsp_html_error_url", jSONObject2);
                                fkw.this.f8058th = null;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        }
    }
}
