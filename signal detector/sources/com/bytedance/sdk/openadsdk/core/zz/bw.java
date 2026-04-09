package com.bytedance.sdk.openadsdk.core.zz;

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
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.zz.xq;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends com.bytedance.sdk.component.zz.ycc implements xq.InterfaceC0083xq {
    protected boolean bw;
    private int cf;
    protected boolean dg;
    private String gbl;
    private rie msw;
    private ypw qh;
    private com.bytedance.sdk.openadsdk.core.model.rie ru;
    private int sup;
    private List<String> sz;
    AtomicBoolean uym;
    private long vk;
    AtomicBoolean ycc;
    private xq zz;

    public static class emc extends ycc.emc {
        public static final Set<String> emc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.zz.bw.emc.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        xq.InterfaceC0083xq ypw;

        public emc(xq.InterfaceC0083xq interfaceC0083xq) {
            this.ypw = interfaceC0083xq;
        }

        private void emc(String str) {
            int iLastIndexOf;
            xq.InterfaceC0083xq interfaceC0083xq;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!emc.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0083xq = this.ypw) == null) {
                    return;
                }
                interfaceC0083xq.ypw(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            xq.InterfaceC0083xq interfaceC0083xq = this.ypw;
            if (interfaceC0083xq != null) {
                interfaceC0083xq.emc();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                emc(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            emc(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.ypw.emc(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            emc(webResourceRequest.getUrl().toString());
        }

        private void emc(String str, int i, String str2) {
            xq.InterfaceC0083xq interfaceC0083xq = this.ypw;
            if (interfaceC0083xq != null) {
                interfaceC0083xq.emc(106, i);
            }
        }
    }

    public interface ypw {
        View emc();

        void emc(int i, int i3);

        void emc(View view, int i);

        void ypw();
    }

    public bw(Context context) {
        super(context, ycc.xq.DSP);
        this.dg = false;
        this.bw = false;
        this.ycc = new AtomicBoolean(false);
        this.uym = new AtomicBoolean(false);
        this.sup = 0;
    }

    private void ylm() {
        if (this.sz == null) {
            com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ru, this.gbl, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.dg.xq.emc(new com.bytedance.sdk.component.msw.msw("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.zz.bw.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        if (bw.this.sz != null && bw.this.uym.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = bw.this.sz.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.dg.xq.ypw(bw.this.ru, bw.this.gbl, "dsp_html_error_url", jSONObject);
                            bw.this.sz = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.zz.ycc, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.dg) {
            this.zz.emc(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.zz.ycc, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.zz.emc();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.cf / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ru, this.gbl, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z6 = i == 0;
        this.bw = z6;
        this.zz.emc(z6);
    }

    public void ul() {
        this.ycc.set(false);
        String strAl = this.ru.al();
        if (TextUtils.isEmpty(strAl)) {
            return;
        }
        String strEmc = com.bytedance.sdk.openadsdk.core.sup.bw.emc(strAl);
        String str = TextUtils.isEmpty(strEmc) ? strAl : strEmc;
        this.sup = 0;
        emc(null, str, "text/html", "UTF-8", null);
        this.vk = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.zz.ycc
    public void vk() {
        this.zz.ypw();
        super.vk();
    }

    public void yzg() {
        ypw ypwVar = this.qh;
        if (ypwVar != null) {
            ypwVar.ypw();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.vk);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ru, this.gbl, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.xq.InterfaceC0083xq
    public void ypw(String str) {
        if (this.sz == null) {
            this.sz = new ArrayList();
        }
        this.sz.add(str);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, ypw ypwVar, String str) {
        this.qh = ypwVar;
        this.ru = rieVar;
        this.gbl = str;
        this.zz = new xq();
        this.msw = new rie(getContext());
        setWebViewClient(new emc(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.zz.bw.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                bw.this.cf = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    bw.this.emc();
                }
            }
        });
        com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.bw.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = bw.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.bw.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            bw.this.msw.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class xq {
        protected int emc = 0;
        private com.bytedance.sdk.openadsdk.core.sup.ycc ypw = com.bytedance.sdk.openadsdk.core.sup.ycc.emc();

        public void emc(WebView webView) {
            if (webView != null && this.emc == 0) {
                if (this.ypw == null) {
                    this.ypw = com.bytedance.sdk.openadsdk.core.sup.ycc.emc();
                }
                this.ypw.emc(webView);
                this.ypw.ypw();
                this.emc = 1;
            }
        }

        public void ypw() {
            emc();
        }

        public void emc(boolean z6) {
            com.bytedance.sdk.openadsdk.core.sup.ycc yccVar;
            if (this.emc == 1 && z6 && (yccVar = this.ypw) != null) {
                yccVar.xq();
                this.emc = 3;
            }
        }

        public void emc(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.sup.ycc yccVar = this.ypw;
            if (yccVar != null) {
                yccVar.emc(view, friendlyObstructionPurpose);
            }
        }

        public void emc() {
            com.bytedance.sdk.openadsdk.core.sup.ycc yccVar;
            int i = this.emc;
            if (i != 0 && i != 4 && (yccVar = this.ypw) != null) {
                yccVar.dg();
            }
            this.emc = 4;
            this.ypw = null;
        }
    }

    public void emc(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.zz.emc(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.xq.InterfaceC0083xq
    public void emc(String str) throws JSONException {
        boolean zEmc;
        if (TextUtils.isEmpty(str) || this.ru == null || !this.msw.ypw()) {
            return;
        }
        int iEmc = tp.emc(this.gbl);
        View viewEmc = null;
        if (!com.bytedance.sdk.component.utils.sba.emc(str) && (this.ru.kda() == null || TextUtils.isEmpty(this.ru.kda().emc()))) {
            com.bytedance.sdk.openadsdk.core.model.sz szVar = new com.bytedance.sdk.openadsdk.core.model.sz();
            szVar.emc(str);
            this.ru.emc(szVar);
            str = null;
        }
        this.ru.xq(true);
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.ru;
        if (rieVar == null || rieVar.kda() == null || TextUtils.isEmpty(this.ru.kda().emc())) {
            zEmc = false;
        } else {
            zEmc = iyl.emc(getContext(), this.ru, iEmc, this.gbl, true, (Map<String, Object>) null);
            if (!zEmc && !TextUtils.isEmpty(this.ru.kda().ypw())) {
                str = this.ru.kda().ypw();
                com.bytedance.sdk.openadsdk.dg.xq.emc(this.ru, this.gbl, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zEmc) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                iyl.emc(getContext(), this.ru, iEmc, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.dg.emc) null, this.gbl, true, str2);
            }
        }
        if (this.msw != null) {
            ypw ypwVar = this.qh;
            if (ypwVar != null) {
                viewEmc = ypwVar.emc();
                this.qh.emc(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.sup supVarEmc = this.msw.emc(getContext(), viewEmc);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.dg.xq.emc("click", this.ru, supVarEmc, this.gbl, true, (Map<String, Object>) map, this.msw.ypw() ? 1 : 2);
        }
        rie rieVar2 = this.msw;
        if (rieVar2 != null) {
            rieVar2.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.xq.InterfaceC0083xq
    public void emc(int i, int i3) {
        ypw ypwVar = this.qh;
        if (ypwVar != null) {
            ypwVar.emc(i, i3);
        }
        this.sup = i3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i3);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.vk);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.ru, this.gbl, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.xq.InterfaceC0083xq
    public void emc() {
        if (this.ycc.compareAndSet(false, true)) {
            this.dg = true;
            this.zz.emc(getWebView());
            this.zz.emc(this.bw);
            yzg();
            ylm();
        }
    }
}
