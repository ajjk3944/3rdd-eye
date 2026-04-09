package com.bytedance.sdk.openadsdk.ylm.emc;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.emc.cf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.widget.emc.bw;
import com.bytedance.sdk.openadsdk.core.widget.ru;
import com.bytedance.sdk.openadsdk.core.widget.zz;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.yzg;
import com.bytedance.sdk.openadsdk.ylm.msw;
import com.bytedance.sdk.openadsdk.ylm.uym;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private AtomicBoolean aa;
    private final FrameLayout bw;
    private int cf;
    private InterfaceC0103emc db;
    private final int dg;
    private StringBuilder ee;
    protected ycc emc;
    private com.bytedance.sdk.openadsdk.sz.ycc gbl;
    private long hxp;
    private String msw;
    private volatile boolean qh;
    private int rie;
    private msw ru;
    private zz sba;
    private int sra;
    private boolean sup;
    private volatile boolean sz;
    private ypw ul;
    private rtt uym;
    private AtomicBoolean vk;
    private final rie xq;
    private ru ycc;
    private boolean ylm;
    private final Context ypw;
    private com.bytedance.sdk.openadsdk.core.xq.emc yzg;
    private final String zz;

    /* renamed from: com.bytedance.sdk.openadsdk.ylm.emc.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0103emc {
        void emc(int i);
    }

    public interface ypw {
        void emc();
    }

    public emc(Context context, rie rieVar, int i, boolean z6, FrameLayout frameLayout) {
        this(context, rieVar, i, z6, frameLayout, false);
    }

    public emc(Context context, rie rieVar, int i, boolean z6, FrameLayout frameLayout, boolean z7) {
        this(context, rieVar, i, z6, frameLayout, z7, 0);
    }

    private void msw() {
        this.emc.setWebViewClient(new bw(aa.emc(), this.uym, this.xq.ye(), null, true) { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) throws JSONException {
                super.onPageFinished(webView, str);
                if (emc.this.ru != null) {
                    emc.this.ru.zz(str);
                }
                if (emc.this.sup) {
                    emc.this.emc(0, 0);
                    com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), emc.this.xq, emc.this.msw, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                emc.this.sup = false;
                if (emc.this.ru != null) {
                    emc.this.ru.ycc(com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emc.this.xq));
                    emc.this.ru.emc(i, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    emc.this.sup = false;
                    if (emc.this.ru != null) {
                        emc.this.ru.ycc(com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emc.this.xq));
                        emc.this.ru.emc(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (emc.this.xq.iat() != null && !TextUtils.isEmpty(emc.this.xq.iat().i)) {
                        if (emc.this.ru != null) {
                            emc.this.ru.ru(str);
                        }
                        String strSup = dr.sup(emc.this.xq);
                        WebResourceResponse webResourceResponseEmc = com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emc.this.xq.iat().i, strSup, str);
                        if (webResourceResponseEmc == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (emc.this.ru != null) {
                            emc.this.ru.gbl(str);
                        }
                        return webResourceResponseEmc;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    emc.this.sup = false;
                    if (emc.this.ru == null || webResourceError == null) {
                        return;
                    }
                    emc.this.ru.ycc(com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(emc.this.xq));
                    emc.this.ru.emc(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.emc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(this.uym) { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (emc.this.ycc == null || emc.this.ycc.getVisibility() != 0) {
                    return;
                }
                emc.this.ycc.setProgress(i);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(this.ypw).emc(false).ypw(false).emc(this.emc.getWebView());
        ycc yccVar = this.emc;
        yccVar.setUserAgentString(yzg.emc(yccVar.getWebView(), BuildConfig.VERSION_CODE));
        this.emc.setMixedContentMode(0);
    }

    private void xq(boolean z6) {
        cf cfVarYpw;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.xq.ye());
            jSONObject.put("log_extra", this.xq.wdp());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.zz.ypw().aa()) {
            uym.emc(new uym.emc() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.1
            });
        }
        msw mswVarEmc = msw.emc(aa.emc(), this.emc.getWebView(), new com.bytedance.sdk.openadsdk.ylm.xq() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.2
            @Override // com.bytedance.sdk.openadsdk.ylm.xq
            public void emc(String str, JSONObject jSONObject2) {
                if (emc.this.uym != null) {
                    emc.this.uym.emc(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.ylm.emc() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.3
            @Override // com.bytedance.sdk.openadsdk.ylm.emc
            public com.bytedance.sdk.openadsdk.ylm.dg emc() {
                String strYcc = com.bytedance.sdk.openadsdk.common.xq.ycc();
                strYcc.getClass();
                switch (strYcc) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.ylm.dg.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.ylm.dg.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.ylm.dg.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.ylm.dg.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.ylm.dg.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.ylm.dg.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ylm.emc
            public void xq() {
                if (emc.this.uym.qh() != null) {
                    emc.this.uym.qh().emc(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ylm.emc
            public void ypw() {
                emc.this.uym.ypw(true);
                if (emc.this.gbl != null) {
                    emc.this.gbl.emc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ylm.emc
            public void emc(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), emc.this.xq, emc.this.msw, "playable_track", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.3.1
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() throws JSONException {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!emc.this.xq.wf()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e6) {
                            ul.xq("PlayableManager", e6.getMessage());
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject xq() {
                        return jSONObject2;
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.ylm.emc
            public void emc(int i, String str) throws JSONException {
                emc.this.sup = false;
                if (i == 2 || i == 3 || i == 4) {
                    emc.this.emc(2, i);
                } else if (i == 5) {
                    emc.this.emc(3, i);
                } else {
                    emc.this.emc(1, 0);
                }
            }
        });
        this.ru = mswVarEmc;
        mswVarEmc.uym(this.zz).bw(com.bytedance.sdk.openadsdk.common.xq.emc(aa.emc())).ypw(com.bytedance.sdk.openadsdk.common.xq.bw()).emc(com.bytedance.sdk.openadsdk.common.xq.emc()).dg(com.bytedance.sdk.openadsdk.common.xq.dg()).xq(jSONObject).xq(dr.ru(this.xq)).dg(true).emc(z6).xq(false).emc(dr.aa(this.xq)).ypw(dr.aa(this.xq)).emc("sdkEdition", com.bytedance.sdk.openadsdk.common.xq.xq()).bw(dr.ycc(this.xq)).ycc(this.msw);
        this.ru.emc(com.bytedance.sdk.openadsdk.ylm.bw.ypw(this.ypw));
        Set<String> setGbl = this.ru.gbl();
        final WeakReference weakReference = new WeakReference(this.ru);
        for (String str : setGbl) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (cfVarYpw = this.uym.ypw()) != null) {
                cfVarYpw.emc(str, new com.bytedance.sdk.component.emc.dg<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.4
                    @Override // com.bytedance.sdk.component.emc.dg
                    public JSONObject emc(String str2, JSONObject jSONObject2, com.bytedance.sdk.component.emc.bw bwVar) {
                        try {
                            msw mswVar = (msw) weakReference.get();
                            if (mswVar == null) {
                                return null;
                            }
                            return mswVar.dg(emc(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public boolean bw() {
        return this.sz;
    }

    public void dg() {
        msw mswVar = this.ru;
        if (mswVar != null) {
            mswVar.iyl();
        }
        ycc yccVar = this.emc;
        if (yccVar != null) {
            yccVar.vk();
        }
        rtt rttVar = this.uym;
        if (rttVar != null) {
            rttVar.sup();
        }
        this.hxp = System.currentTimeMillis();
        this.ee = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb = this.ee;
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        } catch (Throwable th) {
            ul.emc("PlayableManager", "onDestroy() error", th);
        }
        this.emc = null;
    }

    public rtt uym() {
        return this.uym;
    }

    public boolean ycc() {
        rtt rttVar = this.uym;
        if (rttVar != null) {
            return rttVar.ycc();
        }
        return false;
    }

    public void ypw() {
        msw mswVar;
        if (!this.vk.get() || (mswVar = this.ru) == null) {
            return;
        }
        mswVar.xq(true);
    }

    public emc(Context context, rie rieVar, int i, boolean z6, FrameLayout frameLayout, boolean z7, int i3) throws JSONException {
        this.sup = true;
        this.vk = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.rie = 0;
        this.hxp = 0L;
        this.ypw = context;
        this.xq = rieVar;
        this.sra = i3;
        if (rieVar != null && rieVar.dg() != null && rieVar.dg().dg() != null) {
            this.rie = rieVar.dg().dg().size();
        }
        this.dg = i;
        String strXq = tp.xq(rieVar.vaf().getDurationSlotType());
        this.msw = strXq;
        int iEmc = tp.emc(strXq);
        this.ylm = z7;
        if (z7) {
            this.msw = tp.ypw(iEmc);
        }
        this.zz = dr.sup(rieVar);
        this.bw = frameLayout;
        emc(frameLayout);
        emc(iEmc);
        xq(z6);
        msw();
    }

    public void emc(InterfaceC0103emc interfaceC0103emc) {
        this.db = interfaceC0103emc;
    }

    private void emc(FrameLayout frameLayout) {
        ycc yccVar = new ycc(this.ypw, true, ycc.xq.PLAYABLE);
        this.emc = yccVar;
        yccVar.bw();
        this.emc.setLayerType(2, null);
        this.emc.setVisibility(4);
        this.emc.setBackgroundColor(-16777216);
        this.emc.setEnabled(true);
        this.emc.setTag(this.msw);
        this.emc.setMaterialMeta(this.xq.wg());
        this.emc.setLandingPage(true);
        frameLayout.addView(this.emc, new FrameLayout.LayoutParams(-1, -1));
        zz zzVar = new zz(this.ypw);
        this.sba = zzVar;
        zzVar.emc(this.xq, this.msw, this.yzg, this.ylm);
        frameLayout.addView(this.sba, new FrameLayout.LayoutParams(-1, -1));
        if (this.xq.gf()) {
            ru ruVar = new ru(this.ypw);
            this.ycc = ruVar;
            ruVar.ypw();
            frameLayout.addView(this.ycc, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void ypw(boolean z6) {
        msw mswVar = this.ru;
        if (mswVar != null) {
            mswVar.bw(z6);
        }
    }

    private void emc(int i) throws JSONException {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.uym = new rtt(this.ypw);
        String strDrx = this.xq.drx();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.xq.wpn());
            jSONObject.put("currentIndex", this.sra);
            jSONObject.put("totalAdCount", this.rie);
        } catch (JSONException unused) {
        }
        this.uym.ypw(this.emc).emc(this.xq).emc(com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(this.xq, true, jSONObject)).xq(this.xq.ye()).dg(this.xq.wdp()).ypw(i).bw(strDrx).emc(this.emc).ypw(this.msw).emc(map).emc(new com.bytedance.sdk.openadsdk.dg.yzg(3, this.msw, this.xq));
    }

    public void xq() {
        msw mswVar;
        if (!this.vk.get() || (mswVar = this.ru) == null) {
            return;
        }
        mswVar.xq(false);
    }

    public void emc(boolean z6, com.bytedance.sdk.openadsdk.sz.ycc yccVar) {
        this.gbl = yccVar;
        this.ru.ypw(z6);
        com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().ypw(this.xq);
        this.emc.a_(this.zz);
        msw mswVar = this.ru;
        if (mswVar != null) {
            mswVar.ycc(com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(this.xq));
            this.ru.msw(this.zz);
        }
    }

    public void emc() throws JSONException {
        ru ruVar;
        final boolean z6 = true;
        if (this.vk.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.bw;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.qh && (ruVar = this.ycc) != null) {
            ruVar.ypw(this.xq, this.dg);
            msw mswVar = this.ru;
            if (mswVar != null) {
                mswVar.xmt();
            }
        } else {
            this.ru.xq(true);
            rtt rttVar = this.uym;
            if (rttVar != null && rttVar.qh() != null) {
                this.uym.qh().bw();
            }
            InterfaceC0103emc interfaceC0103emc = this.db;
            if (interfaceC0103emc != null) {
                interfaceC0103emc.emc(this.cf);
            }
            z6 = false;
        }
        if (this.ru != null) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), this.xq, this.msw, "playable_track", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.7
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject emc() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", emc.this.ru.vw());
                        jSONObject.put("has_loading", z6);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject xq() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
            this.ru.ycc(com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().emc(this.xq));
        }
        ycc yccVar = this.emc;
        if (yccVar != null) {
            yccVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.vk.xq.emc("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.8
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (emc.this.ee != null) {
                        jSONObject.put("destroy_stack_trace", emc.this.ee.toString());
                    }
                    jSONObject.put("destroy_ts", emc.this.hxp);
                    return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("plb_npe_crash").ypw(jSONObject.toString());
                }
            });
        }
    }

    public void emc(final int i, final int i3) throws JSONException {
        InterfaceC0103emc interfaceC0103emc;
        msw mswVar;
        ypw ypwVar;
        if (this.qh) {
            return;
        }
        this.qh = true;
        this.cf = i;
        if (i == 2) {
            this.sz = true;
            this.ru.emc(3);
        } else if (i == 1) {
            this.sz = true;
            this.ru.emc(2);
        } else if (i == 3) {
            this.sz = true;
            this.ru.emc(4);
        } else if (i == 0) {
            this.ru.emc(1);
        }
        if (this.sz && (ypwVar = this.ul) != null) {
            ypwVar.emc();
        }
        if (this.vk.get() && (mswVar = this.ru) != null) {
            mswVar.xq(true);
        }
        rtt rttVar = this.uym;
        if (rttVar != null && rttVar.qh() != null) {
            this.uym.qh().bw();
        }
        if (!this.sz && (interfaceC0103emc = this.db) != null) {
            interfaceC0103emc.emc(i);
        }
        ru ruVar = this.ycc;
        if (ruVar != null) {
            ruVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.9
                @Override // java.lang.Runnable
                public void run() {
                    if (emc.this.sz) {
                        emc.this.sba.setVisibility(0);
                        if (emc.this.db != null) {
                            emc.this.db.emc(i);
                        }
                        emc.this.emc(true);
                    }
                    emc.this.ru.uym(emc.this.sz);
                    emc.this.ycc.xq();
                    if (emc.this.vk.get()) {
                        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), emc.this.xq, emc.this.msw, "playable_track", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.emc.9.1
                            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                            public JSONObject emc() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i);
                                    jSONObject.put("remove_loading_page_reason", i3);
                                    jSONObject.put("playable_url", emc.this.zz);
                                    jSONObject.put("duration", emc.this.ycc.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                            public JSONObject xq() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }
                        });
                    }
                }
            });
        }
    }

    public void emc(boolean z6) {
        msw mswVar = this.ru;
        if (mswVar != null) {
            mswVar.emc(z6);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        this.yzg = emcVar;
        ru ruVar = this.ycc;
        if (ruVar != null && ruVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.ycc.msw downloadButton = this.ycc.getDownloadButton();
            downloadButton.setOnClickListener(emcVar);
            downloadButton.setOnTouchListener(emcVar);
        }
        zz zzVar = this.sba;
        if (zzVar != null) {
            zzVar.setClickListener(emcVar);
        }
    }

    public void emc(ypw ypwVar) {
        this.ul = ypwVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        rtt rttVar = this.uym;
        if (rttVar != null) {
            rttVar.emc(ypwVar);
        }
    }
}
