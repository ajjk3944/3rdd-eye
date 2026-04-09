package com.bytedance.sdk.openadsdk.component.reward.emc;

import U4.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.tp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aa implements com.bytedance.sdk.openadsdk.sz.msw {
    private boolean bw;
    private ImageView dg;
    private final Activity emc;
    private volatile boolean msw;
    private int ru;
    private final AtomicBoolean uym = new AtomicBoolean(false);
    private com.bytedance.sdk.component.zz.ycc xq;
    private com.bytedance.sdk.openadsdk.core.xq.uym ycc;
    private final rie ypw;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc zz;

    public aa(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.zz = emcVar;
        this.ypw = emcVar.ypw;
        this.emc = emcVar.mxo;
    }

    private void dg() {
        this.xq.bw();
        emc(this.xq);
        this.xq.setDisplayZoomControls(false);
        this.xq.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.aa.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    aa.this.xq();
                }
            }
        });
        this.xq.setWebViewClient(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.aa.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                aa.this.xq();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    aa.this.emc(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (aa.this.emc(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() {
        emc(Integer.MAX_VALUE, (String) null);
    }

    public void ypw() {
        DeviceUtils.AudioInfoReceiver.ypw(this);
        com.bytedance.sdk.component.zz.ycc yccVar = this.xq;
        if (yccVar != null) {
            tp.emc(yccVar.getWebView());
        }
    }

    public void emc() {
        DeviceUtils.AudioInfoReceiver.emc(this);
        this.ru = DeviceUtils.uym();
        if (this.ypw.qio() != null) {
            this.ycc = new com.bytedance.sdk.openadsdk.core.xq.uym("VAST_END_CARD", this.ypw.qio()) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.aa.1
            };
            com.bytedance.sdk.openadsdk.core.sup.xq xqVarXq = this.ypw.qio().xq();
            if (xqVarXq != null) {
                String strBw = xqVarXq.bw();
                if (!TextUtils.isEmpty(strBw)) {
                    this.bw = true;
                    this.dg = (ImageView) this.zz.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ru);
                    emc(xqVarXq.ypw(), xqVarXq.xq());
                    com.bytedance.sdk.openadsdk.ru.dg.emc(strBw).emc(xqVarXq.ypw()).ypw(xqVarXq.xq()).bw(vw.bw(com.bytedance.sdk.openadsdk.core.aa.emc())).dg(vw.xq(com.bytedance.sdk.openadsdk.core.aa.emc())).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(this.ypw, strBw, new emc(this.dg, strBw, this, this.uym)));
                    return;
                }
                com.bytedance.sdk.component.zz.ycc yccVar = (com.bytedance.sdk.component.zz.ycc) this.zz.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.gbl);
                this.xq = yccVar;
                if (yccVar == null) {
                    return;
                }
                dg();
                String strDg = xqVarXq.dg();
                if (strDg != null) {
                    this.bw = true;
                    if (strDg.startsWith("http")) {
                        this.xq.a_(strDg);
                        return;
                    }
                    String strEmc = com.bytedance.sdk.openadsdk.core.sup.bw.emc(strDg);
                    String str = TextUtils.isEmpty(strEmc) ? strDg : strEmc;
                    this.xq.setDefaultTextEncodingName("UTF -8");
                    this.xq.emc(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sz.msw
    public void ypw(int i) {
        int i3 = this.ru;
        if (i3 == 0 && i > 0) {
            this.ypw.qio().emc().zz(this.zz.ylm.sup());
        } else if (i3 > 0 && i == 0) {
            this.ypw.qio().emc().msw(this.zz.ylm.sup());
        }
        this.ru = i;
    }

    public static class emc implements com.bytedance.sdk.component.bw.vk {
        private final AtomicBoolean dg;
        private final WeakReference<ImageView> emc;
        private final WeakReference<aa> xq;
        private final String ypw;

        public emc(ImageView imageView, String str, aa aaVar, AtomicBoolean atomicBoolean) {
            this.emc = new WeakReference<>(imageView);
            this.ypw = str;
            this.xq = new WeakReference<>(aaVar);
            this.dg = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            aa aaVar;
            ImageView imageView = this.emc.get();
            if (imageView == null || (aaVar = this.xq.get()) == null || gblVar == null) {
                return;
            }
            Object objYpw = gblVar.ypw();
            if (objYpw == null) {
                aaVar.emc(-1, this.ypw);
                return;
            }
            if (objYpw instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objYpw);
            } else if (objYpw instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && e.t(objYpw)) {
                    a.j(objYpw).start();
                }
                imageView.setImageDrawable((Drawable) objYpw);
            }
            this.dg.set(true);
            aaVar.xq();
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i, String str, Throwable th) {
            aa aaVar;
            ImageView imageView = this.emc.get();
            if (imageView == null || (aaVar = this.xq.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            aaVar.emc(-2, this.ypw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final int i, final String str) {
        if (this.msw) {
            return;
        }
        this.msw = true;
        if (i == Integer.MAX_VALUE) {
            rie rieVar = this.ypw;
            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, rieVar.bw(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.dg.xq.emc(new com.bytedance.sdk.component.msw.msw("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.aa.2
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.dg.xq.ypw(aa.this.ypw, aa.this.ypw.bw(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void emc(com.bytedance.sdk.component.zz.ycc yccVar) {
        yccVar.setVerticalScrollBarEnabled(false);
        yccVar.setHorizontalScrollBarEnabled(false);
        yccVar.setMixedContentMode(0);
        yccVar.setJavaScriptEnabled(true);
        yccVar.setJavaScriptCanOpenWindowsAutomatically(true);
        yccVar.setDomStorageEnabled(true);
        yccVar.setDatabaseEnabled(true);
        yccVar.setCacheMode(-1);
        yccVar.setAllowFileAccess(false);
        yccVar.setSupportZoom(true);
        yccVar.setBuiltInZoomControls(true);
        yccVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        yccVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(String str) {
        rie rieVar;
        if (str == null || (rieVar = this.ypw) == null || rieVar.qio() == null || this.ycc == null) {
            return false;
        }
        this.ypw.qio().ycc(str);
        this.ycc.onClick(this.xq);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void emc(int i, int i3) {
        if (i == 0 || i3 == 0 || this.dg == null) {
            return;
        }
        int iXq = vw.xq((Context) this.emc);
        int iBw = vw.bw(this.emc);
        if (i / i3 <= iXq / iBw) {
            iXq = (int) Math.ceil(r5 * r4);
        } else {
            iBw = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.dg.getLayoutParams();
        layoutParams.width = iXq;
        layoutParams.height = iBw;
        layoutParams.gravity = 17;
        this.dg.setLayoutParams(layoutParams);
        this.dg.setOnClickListener(this.ycc);
        this.dg.setOnTouchListener(this.ycc);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean emc(cf cfVar) {
        com.bytedance.sdk.openadsdk.core.sup.xq xqVarXq;
        if (!this.bw) {
            return false;
        }
        if (this.dg != null && this.uym.get()) {
            this.dg.setVisibility(0);
        } else {
            com.bytedance.sdk.component.zz.ycc yccVar = this.xq;
            if (yccVar != null) {
                yccVar.setVisibility(0);
                if (this.xq.getWebView() != null) {
                    this.xq.getWebView().setOnTouchListener(this.ycc);
                }
            }
        }
        rie rieVar = this.ypw;
        if (rieVar == null || rieVar.qio() == null || (xqVarXq = this.ypw.qio().xq()) == null) {
            return true;
        }
        xqVarXq.ypw(cfVar != null ? cfVar.sup() : -1L);
        return true;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.bw bwVar) {
        com.bytedance.sdk.openadsdk.core.xq.uym uymVar = this.ycc;
        if (uymVar != null) {
            uymVar.emc(bwVar);
        }
    }
}
