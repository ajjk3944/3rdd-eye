package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.common.th;
import com.bytedance.sdk.openadsdk.common.zin;
import com.bytedance.sdk.openadsdk.component.reward.ouw.bly;
import com.bytedance.sdk.openadsdk.component.reward.ouw.rn;
import com.bytedance.sdk.openadsdk.component.reward.ouw.tlj;
import com.bytedance.sdk.openadsdk.component.reward.ouw.zih;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cf;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import java.util.List;
import je.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class vt extends com.bytedance.sdk.openadsdk.component.reward.vt.ouw {

    /* renamed from: cf, reason: collision with root package name */
    protected String f8040cf;

    /* renamed from: jg, reason: collision with root package name */
    public LinearLayout f8041jg;
    public com.bytedance.sdk.openadsdk.core.widget.vt mwh;
    protected com.bytedance.sdk.openadsdk.core.lh.fkw ryl;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(boolean z3);
    }

    public vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    public final View bly() {
        View viewCreatePAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw.jvy);
        lhVar.setId(rn.amr);
        View viewVt = com.bytedance.sdk.openadsdk.core.widget.le.vt(this.ouw.jvy);
        viewVt.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = osn.ouw(this.ouw.jvy, 20.0f);
        layoutParams.rightMargin = osn.ouw(this.ouw.jvy, 16.0f);
        viewVt.setLayoutParams(layoutParams);
        viewVt.setContentDescription(vpp.ouw(this.ouw.jvy, "tt_ad_close_text"));
        viewVt.setVisibility(8);
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.ouw.f7959gh;
        if (pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ouwVar.jvy, ouwVar.vt);
            viewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, osn.ouw(this.ouw.jvy, 14.0f));
            layoutParams2.gravity = 8388691;
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            viewCreatePAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(this.ouw.jvy);
        yuVar.setId(rn.lk);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(osn.ouw(this.ouw.jvy, 32.0f), osn.ouw(this.ouw.jvy, 14.0f));
        layoutParams3.gravity = 8388693;
        yuVar.setLayoutParams(layoutParams3);
        yuVar.setPadding(osn.ouw(this.ouw.jvy, 9.0f), 0, osn.ouw(this.ouw.jvy, 9.0f), 0);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (viewCreatePAGLogoViewByMaterial != null) {
            lhVar.addView(viewCreatePAGLogoViewByMaterial);
        }
        lhVar.addView(yuVar);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
        if (!ouwVar2.vt.tpk || !ouwVar2.euf || ouwVar2.ouw != 1) {
            View lhVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.lh(this.ouw.jvy);
            lhVar2.setId(rn.uz);
            lhVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lhVar.addView(lhVar2);
        }
        lhVar.addView(viewVt);
        return lhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void cf() {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.cf():void");
    }

    public abstract boolean fkw();

    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (!ouwVar.ra && ouwVar.vt()) {
            this.ouw.uoy.yu();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.euf && (ouwVar2.f7959gh instanceof com.bytedance.sdk.openadsdk.activity.ouw)) {
                return;
            }
            ouwVar2.ey.le(0);
        }
    }

    public final void jqy() {
        com.bytedance.sdk.openadsdk.core.lh.ra raVar;
        com.bytedance.sdk.component.bly.le leVar;
        lh();
        if (!this.ouw.vt.cd() && !this.ouw.jvy.isFinishing()) {
            this.ouw.bs.yu();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            String str = ouwVar.yu ? "reward_endcard" : "fullscreen_endcard";
            ouwVar.bs.ouw(str, ouwVar.fqk);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.odc) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = ouwVar2.ksc;
                boolean z3 = ouwVar2.f7958cj;
                bly blyVar = pnoVar.ouw;
                if (blyVar != null) {
                    blyVar.vt(z3);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.ouw;
            final com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = ouwVar3.bs;
            final com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = ouwVar3.fqk;
            final rn.yu yuVar = new rn.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.5
                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu
                public final void ouw() {
                    if (rn.this.uq.jvy.isFinishing()) {
                        return;
                    }
                    rn.this.ryl.get();
                }

                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.rn.yu
                public final void ouw(WebView webView, int i4) {
                    com.bytedance.sdk.openadsdk.common.jg jgVar;
                    try {
                        rn rnVar2 = rn.this;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = rnVar2.uq;
                        if (!ouwVar4.ra || (jgVar = ouwVar4.f7963ng) == null) {
                            return;
                        }
                        le.ouw ouwVar5 = rnVar2.wp;
                        zin zinVar = jgVar.yu;
                        if (zinVar != null) {
                            if (i4 == 100) {
                                zinVar.fkw.setVisibility(8);
                            } else {
                                zinVar.fkw.setVisibility(0);
                                zinVar.fkw.setProgress(i4);
                            }
                        }
                        th thVar = jgVar.fkw;
                        if (thVar != null) {
                            thVar.ouw(webView, ouwVar5);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            final com.bytedance.sdk.openadsdk.core.model.vpp vppVar = rnVar.uq.vt;
            com.bytedance.sdk.component.bly.le leVar2 = rnVar.f7979le;
            if (leVar2 != null && leVar2.getWebView() != null) {
                mwh mwhVar = new mwh(vppVar, rnVar.f7979le.getWebView(), new ryl() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.11
                    @Override // com.bytedance.sdk.openadsdk.yu.ryl
                    public final void ouw(int i4) {
                        if (TextUtils.isEmpty(rn.this.hun)) {
                            return;
                        }
                        rn rnVar2 = rn.this;
                        lh.ouw.ouw(rnVar2.jvy, rnVar2.rrs, rn.this.f7984ub, rn.this.lso - rn.this.f7984ub, vppVar, "landingpage_endcard", i4);
                    }
                }, rnVar.fqk);
                mwhVar.jae = true;
                rnVar.tlj = mwhVar;
                rnVar.wp = mwhVar.ryl;
                mwhVar.ouw(rnVar.ra() ? "landingpage_endcard" : str);
                mwh mwhVar2 = rnVar.tlj;
                String str2 = rnVar.ouw;
                if (!TextUtils.isEmpty(str2)) {
                    mwhVar2.ey = str2;
                }
                rnVar.tlj.f8809cd = true;
                int i4 = Build.VERSION.SDK_INT;
                rnVar.f7979le.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.12
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                        com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = rn.this.tlj;
                        if (mwhVar3 != null) {
                            mwhVar3.ouw(i11);
                        }
                    }
                });
                if (rnVar.uq.ksc != null) {
                    rnVar.tlj.f8812jg = com.bytedance.sdk.openadsdk.component.reward.ouw.pno.ouw();
                }
                com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(vppVar, rnVar.f7979le, rnVar.uq.jvy);
                rnVar.kn = fkwVarOuw;
                if (fkwVarOuw != null) {
                    if (rnVar.ra()) {
                        str = "landingpage_endcard";
                    }
                    fkwVarOuw.ouw(str);
                }
                if (rnVar.ra()) {
                    uoy.ouw(vppVar, rnVar.f7979le);
                }
                final Context contextOuw = zih.ouw();
                final bs bsVar = rnVar.ra;
                final String str3 = vppVar.pv;
                final com.bytedance.sdk.openadsdk.common.fkw fkwVar = rnVar.kn;
                final mwh mwhVar3 = rnVar.tlj;
                final boolean zVm = vppVar.vm();
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(contextOuw, bsVar, str3, fkwVar, mwhVar3, zVm) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str4) {
                        super.onPageFinished(webView, str4);
                        rn rnVar2 = rn.this;
                        rnVar2.f7985vh = false;
                        rnVar2.mwh = true;
                        rnVar2.ouw(100, rnVar2.uq.fqk);
                        if (rn.this.uq.bs.cf()) {
                            View viewTlj = rn.this.uq.ey.tlj();
                            if (viewTlj instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                                ((com.bytedance.sdk.openadsdk.core.le.yu) viewTlj).setImageResource(vpp.yu(rn.this.uq.hun, "tt_skip_btn"));
                            }
                        }
                        DeviceUtils.AudioInfoReceiver.ouw(rn.this);
                        rn.this.yhj = DeviceUtils.ra();
                        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar3 = rn.this.rn;
                        if (fkwVar3 != null) {
                            fkwVar3.le();
                        }
                        yu yuVar2 = yuVar;
                        if (yuVar2 != null) {
                            yuVar2.ouw();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onPageStarted(WebView webView, String str4, Bitmap bitmap) {
                        super.onPageStarted(webView, str4, bitmap);
                        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar3 = rn.this.rn;
                        if (fkwVar3 != null) {
                            fkwVar3.fkw();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView, int i10, String str4, String str5) {
                        super.onReceivedError(webView, i10, str4, str5);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(21)
                    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                        webResourceRequest.isForMainFrame();
                        webResourceRequest.getUrl();
                        webResourceResponse.getStatusCode();
                        if (webResourceRequest.getUrl() != null) {
                            Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                        }
                        if (webResourceRequest.isForMainFrame()) {
                            rn.this.ryl.set(false);
                            rn rnVar2 = rn.this;
                            rnVar2.f7985vh = false;
                            rnVar2.f7978jg = webResourceResponse.getStatusCode();
                            rn rnVar3 = rn.this;
                            rnVar3.ko = "onReceivedHttpError";
                            rnVar3.ouw(rnVar3.f7978jg, rnVar3.uq.fqk);
                        }
                        if (rn.this.rn != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                                rn.this.rn.ouw(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str4) {
                        try {
                            if (TextUtils.isEmpty(rn.this.hun)) {
                                return super.shouldInterceptRequest(webView, str4);
                            }
                            rn.this.lso++;
                            com.bytedance.sdk.openadsdk.ra.vt.ouw();
                            rn rnVar2 = rn.this;
                            WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(rnVar2.ux, rnVar2.hun, str4);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                rn.this.f7984ub++;
                                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "GeckoLog: hit++");
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                rn.this.rrs++;
                            }
                            return super.shouldInterceptRequest(webView, str4);
                        } catch (Throwable th2) {
                            qbp.ouw("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str4);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(23)
                    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                            Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                        }
                        if (webResourceRequest == null || webResourceRequest.getUrl() == null || !rn.ouw(rn.this, webResourceRequest.getUrl().toString())) {
                            if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                                webResourceError.getErrorCode();
                                String.valueOf(webResourceError.getDescription());
                                String.valueOf(webResourceRequest.getUrl());
                            }
                            if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                                rn.this.ryl.set(false);
                                rn rnVar2 = rn.this;
                                rnVar2.f7985vh = false;
                                rnVar2.ouw(webResourceError != null ? webResourceError.getErrorCode() : -1, rn.this.uq.fqk);
                            }
                            if (rn.this.rn != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (webResourceError != null) {
                                        jSONObject.put("code", webResourceError.getErrorCode());
                                        jSONObject.put("msg", webResourceError.getDescription());
                                    }
                                    rn.this.rn.ouw(jSONObject);
                                } catch (JSONException unused) {
                                }
                            }
                            if (webResourceError != null) {
                                rn.this.f7978jg = webResourceError.getErrorCode();
                                rn.this.ko = String.valueOf(webResourceError.getDescription());
                            }
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    @TargetApi(21)
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                        try {
                            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                        } catch (Throwable th2) {
                            qbp.ouw("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                    }
                };
                rnVar.f7982pd = fkwVar2;
                rnVar.f7979le.setWebViewClient(fkwVar2);
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar3 = rnVar.f7982pd;
                fkwVar3.ko = vppVar;
                fkwVar3.tlj = rnVar.f7980lh ? "rewarded_video" : "fullscreen_interstitial_ad";
                if (vppVar.vm() && (leVar = rnVar.f7979le) != null && leVar.getWebView() != null) {
                    rnVar.f7979le.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.3

                        /* renamed from: lh, reason: collision with root package name */
                        private final int f7986lh = com.bytedance.sdk.openadsdk.core.zih.vt();

                        /* JADX WARN: Removed duplicated region for block: B:51:0x00f9 A[Catch: all -> 0x005b, TryCatch #3 {all -> 0x005b, blocks: (B:9:0x0017, B:75:0x019d, B:77:0x01c7, B:79:0x01d3, B:81:0x01db, B:83:0x01ee, B:84:0x01f3, B:86:0x01f9, B:88:0x01ff, B:90:0x020d, B:92:0x0213, B:94:0x021b, B:96:0x0221, B:97:0x025b, B:102:0x026b, B:104:0x0273, B:106:0x0281, B:108:0x029b, B:110:0x02a1, B:111:0x02cc, B:113:0x02d2, B:114:0x0300, B:118:0x032c, B:122:0x033e, B:124:0x034d, B:125:0x034f, B:127:0x0353, B:130:0x035c, B:133:0x0364, B:135:0x0373, B:134:0x036c, B:107:0x028e, B:18:0x0031, B:20:0x0049, B:26:0x0062, B:28:0x009b, B:30:0x00a1, B:34:0x00aa, B:36:0x00ae, B:38:0x00b8, B:49:0x00f5, B:51:0x00f9, B:53:0x00ff, B:55:0x010a, B:62:0x0141, B:64:0x0145, B:25:0x005e, B:68:0x0153, B:69:0x0178, B:71:0x0184, B:73:0x018c, B:74:0x0193), top: B:152:0x0017 }] */
                        @Override // android.view.View.OnTouchListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final boolean onTouch(android.view.View r27, android.view.MotionEvent r28) {
                            /*
                                Method dump skipped, instructions count: 897
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.AnonymousClass3.onTouch(android.view.View, android.view.MotionEvent):boolean");
                        }
                    });
                }
                com.bytedance.sdk.component.bly.le leVar3 = rnVar.f7979le;
                if (leVar3 != null) {
                    final bs bsVar2 = rnVar.ra;
                    final mwh mwhVar4 = rnVar.tlj;
                    final com.bytedance.sdk.openadsdk.common.fkw fkwVar4 = rnVar.kn;
                    leVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(bsVar2, mwhVar4, fkwVar4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.4
                        @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                        public final void onProgressChanged(WebView webView, int i10) {
                            super.onProgressChanged(webView, i10);
                            yu yuVar2 = yuVar;
                            if (yuVar2 != null) {
                                yuVar2.ouw(webView, i10);
                            }
                        }
                    });
                }
                com.bytedance.sdk.component.bly.le leVar4 = rnVar.f7979le;
                if (leVar4 != null) {
                    com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(rnVar.uq.jvy);
                    lhVarOuw.vt = false;
                    lhVarOuw.ouw = false;
                    lhVarOuw.ouw(leVar4.getWebView());
                    leVar4.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar4.getWebView()));
                    leVar4.setMixedContentMode(0);
                }
                if (i4 >= 24) {
                    rnVar.f7979le.setLayerType(1, null);
                }
                rnVar.f7979le.setBackgroundColor(-1);
                rnVar.f7979le.setDisplayZoomControls(false);
            }
            DownloadListener downloadListener = new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.6
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str4, String str5, String str6, String str7, long j) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.yu yuVar2 = rn.this.uq.tc;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = yuVar2.f7993lh;
                    if (lhVar != null) {
                        lhVar.ouw(yuVar2.ouw);
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = vtVar;
                    if (vtVar2 != null) {
                        vtVar2.kn();
                    }
                }
            };
            com.bytedance.sdk.component.bly.le leVar5 = rnVar.f7979le;
            if (leVar5 != null) {
                leVar5.setDownloadListener(downloadListener);
            }
            this.ouw.bs.ouw();
        }
        final com.bytedance.sdk.openadsdk.component.reward.ouw.zih zihVar = this.ouw.osn.ouw.yu;
        if (zihVar != null) {
            DeviceUtils.AudioInfoReceiver.ouw(zihVar);
            zihVar.bly = DeviceUtils.ra();
            if (zihVar.vt.cu != null) {
                final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar4 = zihVar.vt.cu;
                final String str4 = "VAST_END_CARD";
                zihVar.f7994le = new com.bytedance.sdk.openadsdk.core.lh.ra(str4, ouwVar4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.1
                };
                com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = zihVar.vt.cu.f8411lh;
                if (lhVar != null) {
                    String strFkw = lhVar.fkw();
                    if (TextUtils.isEmpty(strFkw)) {
                        com.bytedance.sdk.component.bly.le leVar6 = (com.bytedance.sdk.component.bly.le) zihVar.pno.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.bly);
                        zihVar.f7995lh = leVar6;
                        if (leVar6 != null) {
                            leVar6.o_();
                            com.bytedance.sdk.component.bly.le leVar7 = zihVar.f7995lh;
                            leVar7.setVerticalScrollBarEnabled(false);
                            leVar7.setHorizontalScrollBarEnabled(false);
                            leVar7.setMixedContentMode(0);
                            leVar7.setJavaScriptEnabled(true);
                            leVar7.setJavaScriptCanOpenWindowsAutomatically(true);
                            leVar7.setDomStorageEnabled(true);
                            leVar7.setDatabaseEnabled(true);
                            leVar7.setCacheMode(-1);
                            leVar7.setAllowFileAccess(false);
                            leVar7.setSupportZoom(true);
                            leVar7.setBuiltInZoomControls(true);
                            leVar7.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                            leVar7.setUseWideViewPort(true);
                            zihVar.f7995lh.setDisplayZoomControls(false);
                            zihVar.f7995lh.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.3
                                @Override // android.webkit.WebChromeClient
                                public final void onProgressChanged(WebView webView, int i10) {
                                    super.onProgressChanged(webView, i10);
                                    if (i10 == 100) {
                                        zih.this.ouw(Integer.MAX_VALUE, null);
                                    }
                                }
                            });
                            zihVar.f7995lh.setWebViewClient(new le.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.4
                                @Override // android.webkit.WebViewClient
                                public final void onPageFinished(WebView webView, String str5) {
                                    super.onPageFinished(webView, str5);
                                    zih.this.ouw(Integer.MAX_VALUE, null);
                                }

                                @Override // android.webkit.WebViewClient
                                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                                    if (webResourceRequest.isForMainFrame()) {
                                        zih.this.ouw(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                                    }
                                }

                                @Override // android.webkit.WebViewClient
                                public final boolean shouldOverrideUrlLoading(WebView webView, String str5) {
                                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2;
                                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5;
                                    com.bytedance.sdk.openadsdk.core.lh.ra raVar2;
                                    zih zihVar2 = zih.this;
                                    if (str5 == null || (vppVar2 = zihVar2.vt) == null || (ouwVar5 = vppVar2.cu) == null || (raVar2 = zihVar2.f7994le) == null) {
                                        return super.shouldOverrideUrlLoading(webView, str5);
                                    }
                                    ouwVar5.ryl = str5;
                                    raVar2.onClick(zihVar2.f7995lh);
                                    return true;
                                }
                            });
                            String strYu = lhVar.yu();
                            if (strYu != null) {
                                zihVar.fkw = true;
                                if (strYu.startsWith("http")) {
                                    zihVar.f7995lh.a_(strYu);
                                } else {
                                    String strOuw = com.bytedance.sdk.openadsdk.core.ryl.fkw.ouw(strYu);
                                    String str5 = TextUtils.isEmpty(strOuw) ? strYu : strOuw;
                                    zihVar.f7995lh.setDefaultTextEncodingName("UTF -8");
                                    zihVar.f7995lh.ouw((String) null, str5, "text/html", "UTF-8", (String) null);
                                }
                            }
                        }
                    } else {
                        zihVar.fkw = true;
                        zihVar.yu = (ImageView) zihVar.pno.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.pno);
                        int iVt = lhVar.vt();
                        int iLh = lhVar.lh();
                        if (iVt != 0 && iLh != 0 && zihVar.yu != null) {
                            int iYu = osn.yu((Context) zihVar.ouw);
                            int iLe = osn.le(zihVar.ouw);
                            if (iVt / iLh <= iYu / iLe) {
                                iYu = (int) Math.ceil(r7 * r2);
                            } else {
                                iLe = (int) Math.ceil(r7 / r2);
                            }
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zihVar.yu.getLayoutParams();
                            layoutParams.width = iYu;
                            layoutParams.height = iLe;
                            layoutParams.gravity = 17;
                            zihVar.yu.setLayoutParams(layoutParams);
                            zihVar.yu.setOnClickListener(zihVar.f7994le);
                            zihVar.yu.setOnTouchListener(zihVar.f7994le);
                        }
                        yu.ouw.ouw(yu.ouw.vt.ouw(strFkw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).ouw(lhVar.vt()).vt(lhVar.lh()).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(zihVar.vt, strFkw, new zih.ouw(zihVar.yu, strFkw, zihVar, zihVar.ra)));
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.th.yu(this.ouw.vt) || com.bytedance.sdk.openadsdk.core.model.th.ra(this.ouw.vt)) {
            this.tlj.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.ouw;
        ouwVar5.ey.ouw(ouwVar5.f7969vh == 100.0f);
        final tlj tljVar = this.ouw.f7956cd;
        tljVar.f7990lh.ouw(tljVar.ouw.jvy.findViewById(R.id.content));
        com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar2 = tljVar.ouw.tc.f7993lh;
        if (lhVar2 != null) {
            tljVar.f7990lh.ouw(lhVar2);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar2 = tljVar.ouw.ksc;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar5 = tljVar.f7990lh;
        bly blyVar2 = pnoVar2.ouw;
        if (blyVar2 != null) {
            blyVar2.ouw(fkwVar5);
        }
        tljVar.f7990lh.ouw(new ouw.InterfaceC0087ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.3
            public AnonymousClass3() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0087ouw
            public final long getVideoProgress() {
                return tlj.this.ouw.ex.fkw();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = tljVar.ouw.ey;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar6 = tljVar.f7990lh;
        rylVar.ouw(fkwVar6, fkwVar6, tljVar.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.fkw fkwVar7 = tljVar.ouw.osn;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar8 = tljVar.f7990lh;
        final com.bytedance.sdk.openadsdk.component.reward.view.pno pnoVar3 = fkwVar7.ouw;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = pnoVar3.vt;
        if (rFEndCardBackUpLayout != null) {
            osn.ouw(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.pno.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
            com.bytedance.sdk.openadsdk.component.reward.ouw.zih zihVar2 = pnoVar3.yu;
            if (zihVar2 != null && (raVar = zihVar2.f7994le) != null) {
                raVar.vt = fkwVar8;
            }
        }
        this.ryl = tljVar.f7990lh;
        ra();
    }

    public final void ko() {
        jae jaeVar = this.tlj;
        if (jaeVar != null) {
            jaeVar.removeMessages(300);
        }
    }

    public abstract boolean le();

    public final void mwh() {
        com.bytedance.sdk.openadsdk.core.widget.vt vtVar = this.mwh;
        if (vtVar == null || !vtVar.isShowing()) {
            return;
        }
        this.mwh.dismiss();
    }

    public abstract void ouw(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.ouw
    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, jae jaeVar) {
        super.ouw(vtVar, jaeVar);
        if (this.ouw.vt.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (ouwVar.lvd) {
                ouwVar.bs.ouw(false);
            }
        }
    }

    public RFEndCardBackUpLayout pno() {
        return new RFEndCardBackUpLayout(this.ouw.hun);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void qbp() {
        /*
            r11 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r11.ouw
            com.bytedance.sdk.openadsdk.component.reward.ouw.pno r0 = r0.ksc
            com.bytedance.sdk.openadsdk.component.reward.ouw.bly r0 = r0.ouw
            if (r0 == 0) goto L1a
            com.bytedance.sdk.openadsdk.core.widget.vm r0 = r0.qbp
            if (r0 == 0) goto L1a
            boolean r1 = r0.ouw
            if (r1 != 0) goto L1a
            boolean r1 = r0.tlj()
            if (r1 == 0) goto L1a
            r0.vt()
            return
        L1a:
            com.bytedance.sdk.openadsdk.core.zih.yu()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r11.ouw
            int r0 = r0.f7961le
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = com.bytedance.sdk.openadsdk.core.settings.cf.rn(r0)
            r1 = 1
            if (r0 != r1) goto Lc1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r11.ouw
            com.bytedance.sdk.openadsdk.core.model.vpp r2 = r0.vt
            boolean r2 = com.bytedance.sdk.openadsdk.core.model.od.lh(r2)
            if (r2 == 0) goto L3d
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            int r0 = r0.njr()
            goto L4e
        L3d:
            boolean r2 = r0.yu
            if (r2 == 0) goto L48
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            int r0 = r0.ng()
            goto L4e
        L48:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            int r0 = r0.myk()
        L4e:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r11.ouw
            com.bytedance.sdk.openadsdk.component.reward.view.ryl r2 = r2.ey
            if (r2 == 0) goto L70
            boolean r2 = r2.bly()
            if (r2 == 0) goto L70
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r11.ouw
            com.bytedance.sdk.openadsdk.component.reward.view.ryl r1 = r0.ey
            if (r1 == 0) goto Lc1
            android.view.View r1 = r1.tlj()
            if (r1 == 0) goto Lc1
            com.bytedance.sdk.openadsdk.component.reward.view.ryl r0 = r0.ey
            android.view.View r0 = r0.tlj()
            r0.performClick()
            return
        L70:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r11.ouw
            r3 = -1
            r4 = 0
            if (r0 == r3) goto Lb5
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.tlj
            boolean r3 = r3.get()
            if (r3 == 0) goto L89
            com.bytedance.sdk.openadsdk.core.model.vpp r3 = r2.vt
            boolean r3 = com.bytedance.sdk.openadsdk.core.model.od.lh(r3)
            if (r3 == 0) goto L87
            goto L89
        L87:
            r3 = r4
            goto L8a
        L89:
            r3 = r1
        L8a:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r5 = r2.ex
            if (r5 == 0) goto L9a
            long r5 = r5.pno
            long r7 = (long) r0
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L9a
            r0 = r1
            goto L9b
        L9a:
            r0 = r4
        L9b:
            com.bytedance.sdk.openadsdk.component.reward.ouw.pno r2 = r2.ksc
            if (r2 == 0) goto Lad
            com.bytedance.sdk.openadsdk.component.reward.ouw.bly r2 = r2.ouw
            if (r2 == 0) goto La8
            boolean r2 = r2.bly()
            goto La9
        La8:
            r2 = r4
        La9:
            if (r2 == 0) goto Lad
            r2 = r1
            goto Lae
        Lad:
            r2 = r4
        Lae:
            if (r3 == 0) goto Lb5
            if (r0 != 0) goto Lb6
            if (r2 == 0) goto Lb5
            goto Lb6
        Lb5:
            r1 = r4
        Lb6:
            if (r1 == 0) goto Lc1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r11.ouw
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            if (r0 == 0) goto Lc1
            r0.lh()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.qbp():void");
    }

    public abstract void ra();

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rn() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            com.bytedance.sdk.openadsdk.activity.pno r0 = r0.f7959gh
            if (r0 != 0) goto L2a
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.od.vt(r0)
            if (r0 != 0) goto L16
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.od.lh(r0)
            if (r0 == 0) goto L2a
        L16:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.od.pno(r0)
            if (r0 == 0) goto L80
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn r0 = r0.bs
            boolean r1 = r0.yib
            if (r1 == 0) goto L80
            boolean r0 = r0.bs
            if (r0 != 0) goto L80
        L2a:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.tlj
            boolean r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto L5f
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            boolean r2 = r0.ra
            if (r2 != 0) goto L5f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zin
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L5f
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            int r0 = r0.pno
            if (r0 >= 0) goto L4c
            r2 = -1
            if (r0 != r2) goto L5f
        L4c:
            android.os.Message r0 = android.os.Message.obtain()
            r2 = 700(0x2bc, float:9.81E-43)
            r0.what = r2
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r4.ouw
            int r3 = r2.pno
            r0.arg1 = r3
            com.bytedance.sdk.component.utils.jae r2 = r2.ux
            r2.sendMessage(r0)
        L5f:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            int r2 = r0.bly
            if (r2 <= 0) goto L80
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.vpp
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L80
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 900(0x384, float:1.261E-42)
            r0.what = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.ouw
            int r2 = r1.bly
            r0.arg1 = r2
            com.bytedance.sdk.component.utils.jae r1 = r1.ux
            r1.sendMessage(r0)
        L80:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            if (r0 != 0) goto L85
            return
        L85:
            com.bytedance.sdk.openadsdk.utils.jg r0 = r0.f7966sd
            if (r0 == 0) goto L8c
            r0.ouw()
        L8c:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.ouw
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.kfa = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.rn():void");
    }

    public final void th() {
        vt(false);
    }

    public final View tlj() {
        com.bytedance.sdk.openadsdk.core.le.ra raVar;
        if (this.vt.zih() != 5) {
            raVar = new com.bytedance.sdk.openadsdk.core.le.ra(this.ouw.jvy);
            raVar.setId(com.bytedance.sdk.openadsdk.utils.rn.f8731uj);
        } else {
            raVar = null;
        }
        ko.vt("TTAD.RFAdType", "getLoadingFrameView".concat(String.valueOf(raVar)));
        return raVar;
    }

    public final void vm() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = ouwVar.ey;
        if (rylVar != null) {
            rylVar.rn();
        }
        ko.vt("TTAD.RFAdType", "onStop mIsMute=" + this.ouw.f7958cj + " mLast=" + this.ouw.fvf.vt + " mVolume=" + DeviceUtils.ra());
        this.ouw.bs.pno();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
        if (ouwVar2.f7958cj) {
            ouwVar2.jvy.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    com.bytedance.sdk.openadsdk.mwh.bly blyVar = vt.this.ouw.fvf;
                    int iPno = blyVar.vt;
                    if (iPno <= 0 || blyVar.ouw == null) {
                        return;
                    }
                    if (iPno == 0) {
                        iPno = DeviceUtils.pno() / 15;
                        i4 = 1;
                    } else if (iPno == -1) {
                        return;
                    } else {
                        i4 = 0;
                    }
                    StringBuilder sbW = u.w(iPno, "not mute set volume to ", " mLastVolume=");
                    sbW.append(blyVar.vt);
                    ko.vt("VolumeChangeObserver", sbW.toString());
                    blyVar.vt = -1;
                    try {
                        blyVar.ouw.setStreamVolume(3, iPno, i4);
                    } catch (Throwable unused) {
                    }
                    blyVar.f8597lh = true;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void vpp() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.vpp():void");
    }

    public final void vt(boolean z3) {
        try {
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.ouw.jae;
            if (tljVar != null && !z3) {
                tljVar.vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = this.ouw.ey;
            if (rylVar != null) {
                rylVar.jg();
            }
            this.ouw.ex.vm();
            if (!fkw()) {
                this.ouw.tlj.get();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.bs;
            if (rnVar != null) {
                rnVar.fkw();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.pno pnoVar = this.ouw.ksc;
            if (pnoVar != null) {
                pnoVar.vt(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.vt);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = this.ouw.ey;
            if (rylVar2 != null) {
                rylVar2.ryl();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.fkw fkwVar = this.ouw.osn;
            if (fkwVar != null) {
                fkwVar.ouw();
            }
            jg jgVar = this.ouw.f7966sd;
            if (jgVar != null) {
                jgVar.lh();
            }
        } catch (Throwable unused) {
        }
    }

    public ouw yu() {
        return null;
    }

    public final void zih() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null) {
            return;
        }
        try {
            ouwVar.pv = false;
            ko.vt("TTAD.RFAdType", "onPause mIsActivityShow=" + this.ouw.pv + " mIsMute=" + this.ouw.f7958cj);
            if (!this.ouw.f7957cf.get()) {
                this.ouw.ex.ra();
            }
            ko();
            com.bytedance.sdk.openadsdk.component.reward.ouw.rn rnVar = this.ouw.bs;
            com.bytedance.sdk.component.bly.le leVar = rnVar.f7979le;
            if (leVar != null) {
                leVar.pno();
            }
            if (rnVar.osn > 0) {
                rnVar.ey = (SystemClock.elapsedRealtime() - rnVar.osn) + rnVar.ey;
                rnVar.osn = 0L;
            }
            bs bsVar = rnVar.ra;
            if (bsVar != null) {
                bsVar.vm = false;
                com.bytedance.sdk.openadsdk.component.reward.ouw.rn.ouw(bsVar, false);
                rnVar.ouw(rnVar.ra, true, false);
            }
            this.ouw.ksc.le();
            this.ouw.vpp.set(true);
            if (this.ouw.tlj.get()) {
                this.ouw.zin.set(true);
            }
            jg jgVar = this.ouw.f7966sd;
            if (jgVar != null) {
                jgVar.vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.kfa <= 0) {
                ouwVar2.kfa = SystemClock.elapsedRealtime();
            }
            ouwVar2.yw = (SystemClock.elapsedRealtime() - ouwVar2.kfa) + ouwVar2.yw;
        } catch (Throwable unused) {
        }
    }

    public final void zin() {
        this.ouw.uoy.vt();
        this.ouw.uoy.fkw(true);
    }

    public void ouw(com.bytedance.sdk.openadsdk.component.reward.view.bly blyVar) {
        ouw(blyVar, this.ouw);
    }

    public final void ouw(boolean z3, boolean z10, boolean z11, int i4) {
        this.ouw.osn.ouw(z3, z10, z11, this, i4);
    }

    private void ouw(int i4) {
        this.fkw.tlj();
        ouw(false, true, false, i4);
        if (this.ouw.yu) {
            this.bly.jvy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.vt.vt.ouw(android.os.Message):void");
    }

    public void ryl() {
    }

    public static void ouw(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        final com.bytedance.sdk.openadsdk.core.le.yu yuVar;
        Context context = frameLayout.getContext();
        if (ouwVar.lvd) {
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            lhVar.setId(com.bytedance.sdk.openadsdk.utils.rn.tlj);
            frameLayout.addView(lhVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutOuw = ouw(context);
            String str = "";
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(ouwVar.vt)) {
                c cVar = ouwVar.vt.f8309sd;
                if (cVar != null) {
                    str = cVar.f6578f;
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.zih> list = ouwVar.vt.tc;
                if (list != null && !list.isEmpty()) {
                    str = list.get(0).ouw;
                }
            }
            if (TextUtils.isEmpty(str)) {
                yuVar = null;
            } else {
                yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
                int i4 = com.bytedance.sdk.openadsdk.utils.rn.bu;
                yuVar.setId(i4);
                yuVar.setTag(i4, str);
                yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutOuw.addView(yuVar);
            }
            lhVar.addView(frameLayoutOuw);
            lhVar.addView(new cf(context), new FrameLayout.LayoutParams(-1, -1));
            View fkwVar = new com.bytedance.sdk.openadsdk.component.reward.view.fkw(context);
            fkwVar.setId(com.bytedance.sdk.openadsdk.utils.rn.ryl);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(fkwVar, layoutParams);
            fkwVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.vt.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = ouwVar.rrs.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = ouwVar.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.lk);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = ouwVar.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.elx);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = yuVar;
                    if (yuVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = yuVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            yuVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
            fkwVar2.setId(com.bytedance.sdk.openadsdk.utils.rn.mwh);
            fkwVar2.setOrientation(1);
            fkwVar2.setVisibility(8);
            frameLayout.addView(fkwVar2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (ouwVar.lso) {
            View leVar = new com.bytedance.sdk.component.bly.le(context, true, le.lh.ENDCARD);
            leVar.setId(com.bytedance.sdk.openadsdk.utils.rn.f8718jg);
            leVar.setLayerType(2, null);
            leVar.setVisibility(4);
            if (!ouwVar.npr && com.bytedance.sdk.openadsdk.core.model.th.le(ouwVar.vt)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = osn.ouw(ouwVar.hun, 58.0f);
                frameLayout.addView(leVar, layoutParams2);
            } else {
                frameLayout.addView(leVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(com.bytedance.sdk.openadsdk.utils.rn.ko);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (od.vt(ouwVar.vt)) {
                View lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
                lhVar2.setId(com.bytedance.sdk.openadsdk.utils.rn.ybr);
                lhVar2.setVisibility(4);
                frameLayout.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout ouw(Context context) {
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        lhVar.setId(com.bytedance.sdk.openadsdk.utils.rn.f8714cf);
        lhVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lhVar.setLayoutParams(layoutParams);
        return lhVar;
    }
}
